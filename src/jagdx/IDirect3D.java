/* IDirect3D - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.Canvas;

import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3D extends IUnknown {

    private am am;

    public final D3DADAPTER_IDENTIFIER a(int i, int j) {
        D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
        int adapterIdentifier = _GetAdapterIdentifier(i, j, d3dadapter_identifier);
        if (qr.a(true, adapterIdentifier)) {
            throw new bs(String.valueOf(adapterIdentifier));
        }
        return d3dadapter_identifier;
    }

    public final native int CheckDeviceFormat(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_);

    private native int _GetDeviceCaps(int i, int i_7_, D3DCAPS d3dcaps);

    private native int _GetAdapterDisplayMode(int i, D3DDISPLAYMODE d3ddisplaymode);

    public final native int CheckDeviceMultiSampleType(int i, int i_8_, int i_9_, boolean bool, int i_10_);

    public final native int CheckDepthStencilMatch(int i, int i_11_, int i_12_, int i_13_, int i_14_);

    private static native int _Direct3DCreate(int i, IDirect3D idirect3d);

    public final native int CheckDeviceType(int i, int i_15_, int i_16_, int i_17_, boolean bool);

    private native int _GetAdapterIdentifier(int i, int i_18_, D3DADAPTER_IDENTIFIER d3dadapter_identifier);

    public final int a(int i, D3DDISPLAYMODE d3ddisplaymode) {
        return _GetAdapterDisplayMode(i, d3ddisplaymode);
    }

    private native int _CreateDevice(int i, int j, Canvas canvas, int k, D3DPRESENT_PARAMETERS d3dpresent_parameters, IDirect3DDevice idirect3ddevice);

    private IDirect3D(am am1) {
        super(am1);
        am = am1;
    }

    public final D3DCAPS b(int i, int i_21_) {
        D3DCAPS d3dcaps = new D3DCAPS();
        int deviceCaps = _GetDeviceCaps(i, i_21_, d3dcaps);
        if (qr.a(true, deviceCaps)) {
            throw new bs(String.valueOf(deviceCaps));
        }
        return d3dcaps;
    }

    public final IDirect3DDevice a(int i, int i_23_, Canvas canvas, int i_24_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
        IDirect3DDevice idirect3ddevice = new IDirect3DDevice(am);
        int device = _CreateDevice(i, i_23_, canvas, i_24_, d3dpresent_parameters, idirect3ddevice);
        if (qr.a(true, device)) {
            throw new bs(String.valueOf(device));
        }
        return idirect3ddevice;
    }

    public static IDirect3D a(int i, am am1) {
        IDirect3D idirect3d = new IDirect3D(am1);
        int create = _Direct3DCreate(i, idirect3d);
        if (qr.a(true, create)) {
            throw new bs(String.valueOf(create));
        }
        return idirect3d;
    }
}
