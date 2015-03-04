/* bca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bca {
    static int a;
    static int showTextures;
    static int c = -1;
    static int d;
    static int e;
    static int f;

    /**
     * Called by the command (textures)
     * @param b
     */
    public static void showTextures(byte b) {
        showTextures++;
        int mask = 0;
        if (cs.g.isLighting(-107, on.performance)) {
            mask |= 0x1;
            mask |= 0x10;
            mask |= 0x20;
            mask |= 0x2;
            mask |= 0x4;
        }
        if (!cs.g.isTextures) {
            mask |= 0x40;
        }
        ps.a((byte) 67, mask);
        ul.k.b((byte) 102, mask);
        laa.itemDefLoader.c(-12209, mask);
        jm.p.a(-111, mask);
        Class_ic.H.c(-12336, mask);
        if (b <= 45) {
            showTextures((byte) 110);
        }
        Class_lc.c(mask, 1);
        ee.a(mask, (byte) 81);
        lh.a(mask, (byte) 31);
        BytesParser.b(mask, (byte) 51);
        ka.rebuildMap((byte) -8);
    }

    static final void a(boolean bool, boolean bool_1_) {
        if (Class_ub.W == null)
            ip.h(-123);
        d++;
        if (bool != true)
            a((byte) -104, null);
        if (bool_1_)
            Class_ub.W.a(111);
    }

    static final Interface a(byte i, Interface var_kp) {
        f++;
        if (var_kp.parentID != -1)
            return efa.a(-1018745488, var_kp.parentID);
        if (i < 119)
            a((byte) 112, null);
        int i_2_ = var_kp.interfaceID >>> 16;
        ufa var_ufa = new ufa(ida.l);
        for (tt var_tt = (tt) var_ufa.a((byte) 75); var_tt != null;
             var_tt = (tt) var_ufa.a(1)) {
            if (var_tt.l == i_2_)
                return efa.a(-1018745488, (int) var_tt.nodeID);
        }
        return null;
    }

    static final int a(int i) {
        int i_3_ = -54 / ((i - 69) / 37);
        e++;
        return cda.d;
    }

    static final void a(int i, int i_4_, int i_5_) {
        a++;
        if (i_5_ != 0)
            a(-27, -117, -85);
        qba var_qba = ofa.a(6, i_4_, (byte) -33);
        var_qba.c((byte) 11);
        var_qba.v = i;
    }
}
