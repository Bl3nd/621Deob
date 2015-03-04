/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

import jaggl.OpenGL;

public final class Node_Sub extends Node {

    static int k;
    static GameInPacket incomingPacket113;
    String m;
    static int n = 0;
    static Interface[][] o;

    public static void nullLoader(int i) {
        if (i != 0) {
            a(null, null, 68, (byte) 30, null);
        }
        incomingPacket113 = null;
        o = null;
    }

    public static Class_r a(fa fa, Canvas canvas, int i, byte b, pl pl) {
        if (b > -6) {
            return null;
        }
        k++;
        if (!pu.b(false)) {
            throw new RuntimeException("");
        }
        if (!Class_ue.a("jaggl", -84)) {
            throw new RuntimeException("");
        }
        OpenGL opengl = new OpenGL();
        long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
        if (l == 0L) {
            throw new RuntimeException("");
        }
        lm lm = new lm(opengl, canvas, l, fa, pl, i);
        lm.s((byte) -100);
        return lm;
    }

    public Node_Sub() {
        /* empty */
    }

    public Node_Sub(String string) {
        this.m = string;
    }

    static {
        incomingPacket113 = new GameInPacket(113, 1);
    }
}
