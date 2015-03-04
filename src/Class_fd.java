/* fd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Class_fd extends nc implements ImageProducer {
    static gl r;
    private Image s;
    static int t = 0;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int B;
    static int C;
    static int D;
    static int E;
    static float F;
    private Canvas G;
    static int H;
    static int I;
    private ImageConsumer J;
    static int K;
    static int L = 0;
    private ColorModel N;
    static int demoLogin;

    public static void a(byte i) {
        if (i >= 64)
            r = null;
    }

    private final synchronized void a(boolean bool) {
        if (bool != false)
            J = null;
        D++;
        if (J != null) {
            J.setPixels(0, 0, ((nc) this).p, ((nc) this).q, N, ((nc) this).k,
                    0, ((nc) this).p);
            J.imageComplete(2);
        }
    }

    final void a(int i, int i_0_, int i_1_, Graphics graphics, byte i_2_,
                 int i_3_) {
        u++;
        a(i, i_1_, (byte) -42, i_0_, i_3_);
        Shape shape = graphics.getClip();
        graphics.clipRect(i_0_, i, i_1_, i_3_);
        graphics.drawImage(s, 0, 0, G);
        graphics.setClip(shape);
        int i_4_ = -90 % ((i_2_ + 12) / 40);
    }

    public final void startProduction(ImageConsumer imageconsumer) {
        K++;
        addConsumer(imageconsumer);
    }

    public final synchronized void removeConsumer
            (ImageConsumer imageconsumer) {
        if (J == imageconsumer)
            J = null;
        x++;
    }

    final void a(int i, int i_5_, Graphics graphics, byte i_6_) {
        B++;
        a(false);
        graphics.drawImage(s, i, i_5_, G);
        if (i_6_ != -20)
            a(false);
    }

    final void a(int i, Canvas canvas) {
        E++;
        G = canvas;
        if (i != -244)
            F = 0.22671159F;
        ((nc) this).p = G.getSize().width;
        ((nc) this).q = G.getSize().height;
        ((nc) this).k = new int[((nc) this).q * ((nc) this).p];
        N = new DirectColorModel(32, 16711680, 65280, 255);
        s = G.createImage(this);
        a(false);
        G.prepareImage(s, G);
        a(false);
        G.prepareImage(s, G);
        a(false);
        G.prepareImage(s, G);
    }

    static final boolean a(int i, int i_7_, int i_8_) {
        v++;
        if (i != -29773)
            a(-62, -27, -39);
        if (!kl.a((byte) 46, i_8_, i_7_) && !jv.a(3, i_7_, i_8_))
            return false;
        return true;
    }

    private final synchronized void a(int i, int i_9_, byte i_10_, int i_11_,
                                      int i_12_) {
        C++;
        if (J != null) {
            J.setPixels(i_11_, i, i_9_, i_12_, N, ((nc) this).k,
                    ((nc) this).p * i + i_11_, ((nc) this).p);
            if (i_10_ == -42)
                J.imageComplete(2);
        }
    }

    public final void requestTopDownLeftRightResend
            (ImageConsumer imageconsumer) {
        z++;
    }

    public final synchronized void addConsumer(ImageConsumer imageconsumer) {
        J = imageconsumer;
        w++;
        imageconsumer.setDimensions(((nc) this).p, ((nc) this).q);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(N);
        imageconsumer.setHints(14);
    }

    public static void demoLogin(boolean newLogin, int i, int j) {
        jl.s = j;
        pda.y = i;
        demoLogin++;
        ee.switchWorld(Class_eb.world.worldID, Class_eb.world.lobbyAddress, 55);
        if (!newLogin) {
            qca.a(-106);
            dq.a(false, eo.n, 35, nu.i);
        } else {
            dq.a(false, "", 46, "");
        }
    }

    public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        H++;
        if (imageconsumer != J)
            return false;
        return true;
    }
}
