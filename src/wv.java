/* wv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public final class wv {

    private GraphicsDevice graphicsDevice;
    private DisplayMode displayMode;

    public final void enter(Frame frame, int width, int height, int depth, int rate) {
        displayMode = graphicsDevice.getDisplayMode();
        if (displayMode == null) {
            throw new NullPointerException();
        }
        frame.setUndecorated(true);
        frame.enableInputMethods(false);
        a(frame, (byte) 121);
        if (rate == 0) {
            int refreshRate = displayMode.getRefreshRate();
            DisplayMode[] displaymodes = graphicsDevice.getDisplayModes();
            boolean bool = false;
            for (int index = 0; displaymodes.length > index; index++) {
                if (width == displaymodes[index].getWidth() && height == displaymodes[index].getHeight() && depth == displaymodes[index].getBitDepth()) {
                    int displayModeRefreshRate = displaymodes[index].getRefreshRate();
                    if (!bool || Math.abs(displayModeRefreshRate - refreshRate) < Math.abs(rate - refreshRate)) {
                        bool = true;
                        rate = displayModeRefreshRate;
                    }
                }
            }
            if (!bool) {
                rate = refreshRate;
            }
        }
        graphicsDevice.setDisplayMode(new DisplayMode(width, height, depth, rate));
    }

    public final void exit() {
        if (null != displayMode) {
            graphicsDevice.setDisplayMode(displayMode);
            if (!graphicsDevice.getDisplayMode().equals(displayMode)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            displayMode = null;
        }
        a(null, (byte) 121);
    }

    private wv() throws Exception {
        GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        graphicsDevice = graphicsenvironment.getDefaultScreenDevice();
        if (!graphicsDevice.isFullScreenSupported()) {
            GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
            GraphicsDevice[] graphicsdevices1 = graphicsdevices;
            for (int index = 0; graphicsdevices1.length > index; index++) {
                GraphicsDevice graphicsdevice = graphicsdevices1[index];
                if (graphicsdevice != null && graphicsdevice.isFullScreenSupported()) {
                    graphicsDevice = graphicsdevice;
                    return;
                }
            }
            throw new Exception();
        }
    }

    private void a(Frame frame, byte b) {
        boolean bool = false;
        try {
            Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            valid.setAccessible(true);
            boolean isGraphicsDeviceValid = ((Boolean) valid.get(graphicsDevice)).booleanValue();
            if (isGraphicsDeviceValid) {
                valid.set(graphicsDevice, Boolean.FALSE);
                bool = true;
            }
        } catch (Throwable throwable) {
        /* empty */
        }
        if (b != 121) {
            listmodes();
        }
        try {
            graphicsDevice.setFullScreenWindow(frame);
        } catch (Exception object) {
            if (bool) {
                try {
                    Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    valid.set(graphicsDevice, Boolean.TRUE);
                } catch (Throwable throwable) {
		    /* empty */
                }
            }
            //throw object;
        }
        if (bool) {
            try {
                Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                valid.set(graphicsDevice, Boolean.TRUE);
            } catch (Throwable throwable) {
		/* empty */
            }
        }
    }

    public final int[] listmodes() {
        DisplayMode[] displaymodes = graphicsDevice.getDisplayModes();
        int[] modes = new int[displaymodes.length << 2];
        for (int index = 0; index < displaymodes.length; index++) {
            modes[index << 2] = displaymodes[index].getWidth();
            modes[(index << 2) + 1] = displaymodes[index].getHeight();
            modes[(index << 2) + 2] = displaymodes[index].getBitDepth();
            modes[(index << 2) + 3] = displaymodes[index].getRefreshRate();
        }
        return modes;
    }
}
