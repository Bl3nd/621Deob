/* us - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class us {
    static int a;
    static int b;
    static la c;
    static int d;
    static int e;
    static int f;

    static synchronized long getCurrentTime(int i) {
        b++;
        long currentTime = System.currentTimeMillis();
        if (i <= 88) {
            return 1L;
        }
        if (jv.t > currentTime) {
            wg.K += jv.t - currentTime;
        }
        jv.t = currentTime;
        return currentTime + wg.K;
    }

    public static void b(int i) {
        if (i != -28376)
            a(-81, (String) null);
        c = null;
    }

    static final void a(int i, long l) {
        System.out.println("us");
        a++;
        tba var_tba = gr.b(-111);
        ((tba) var_tba).loginStream.writeByte(((SpecialOutPacket) hea.m).packetID, (byte) -115);
        ((tba) var_tba).loginStream.writeLong(l, -16719);
        if (i > -105)
            c = null;
        ((tba) var_tba).loginStream.writeByte(cba.languageID, (byte) -121);
        ud.a(var_tba, (byte) -36);
        lr.j = 0;
        tfa.u = 0;
        RSKeyListener.s = -3;
        Class_eb.q = 1;
    }

    static final void a(Interface[] var_kps, int i, boolean bool) {
        d++;
        if (bool == false) {
            for (int i_0_ = 0; i_0_ < var_kps.length; i_0_++) {
                Interface var_kp = var_kps[i_0_];
                if (var_kp != null) {
                    if (((Interface) var_kp).type == 0) {
                        if (((Interface) var_kp).children != null)
                            a(((Interface) var_kp).children, i, false);
                        tt var_tt
                                = (tt) ida.l.a(-32748, (long) ((Interface) var_kp).interfaceID);
                        if (var_tt != null)
                            cea.b(-1630137275, ((tt) var_tt).l, i);
                    }
                    if (i == 0 && ((Interface) var_kp).Gc != null) {
                        ClientScript var_mea = new ClientScript();
                        ((ClientScript) var_mea).objects = ((Interface) var_kp).Gc;
                        ((ClientScript) var_mea).interface_ = var_kp;
                        ClientScriptHandler.activateClientScript(var_mea);
                    }
                    if (i == 1 && ((Interface) var_kp).Kc != null) {
                        if (((Interface) var_kp).itemIndex >= 0) {
                            Interface var_kp_1_
                                    = efa.a(-1018745488, ((Interface) var_kp).interfaceID);
                            if (var_kp_1_ == null || ((Interface) var_kp_1_).children == null
                                    || (((Interface) var_kp).itemIndex
                                    >= ((Interface) var_kp_1_).children.length)
                                    || (var_kp
                                    != ((Interface) var_kp_1_).children[((Interface) var_kp).itemIndex]))
                                continue;
                        }
                        ClientScript var_mea = new ClientScript();
                        ((ClientScript) var_mea).interface_ = var_kp;
                        ((ClientScript) var_mea).objects = ((Interface) var_kp).Kc;
                        ClientScriptHandler.activateClientScript(var_mea);
                    }
                }
            }
        }
    }

    static final int a(int i, String string) {
        f++;
        if (string == null)
            return -1;
        for (int i_2_ = 0; i_2_ < rba.l; i_2_++) {
            if (string.equalsIgnoreCase(lfa.f[i_2_]))
                return i_2_;
        }
        if (i != 1)
            getCurrentTime(54);
        return -1;
    }
}
