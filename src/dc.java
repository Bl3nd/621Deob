/* dc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Image;

final class dc {
    static int a;
    static Image b;
    static int c;

    public static void a(boolean bool) {
        b = null;
        if (bool != false)
            b = null;
    }

    static final void a(byte i) {
        int i_0_ = 126 % ((-7 - i) / 55);
        c++;
        if ((Class_vb.u ^ 0xffffffff) != 0) {
            int i_1_ = Class_md.e.d(2000);
            int i_2_ = Class_md.e.b((int) 99);
            ew var_ew = (ew) qt.F.a((int) 115);
            if (var_ew != null) {
                i_1_ = var_ew.a(9);
                i_2_ = var_ew.a(true);
            }
            Player.a((byte) -99, 0, i_1_, 0, ff.width, 0, Class_vb.u, 0, i_2_, eh.height);
            if (nr.b != null)
                jb.a(false, i_2_, i_1_);
        }
    }

    static final void a(int i, LoginStream loginStream) {
        loginStream.writeInt(GameOutPacket.pl.a((int) 6), i ^ ~0xa82);
        a++;
        loginStream.writeInt(ada.pl.a((int) 6), (int) -127);
        loginStream.writeInt(fu.b.a((int) 6), (int) -96);
        loginStream.writeInt(ui.c.a(i ^ 0xaeb), i ^ ~0xa92);
        loginStream.writeInt(jt.e.a(i - 2791), i - 2903);
        loginStream.writeInt(ua.c.a((int) 6), (int) -115);
        loginStream.writeInt(mq.pl.a((int) 6), (int) -124);
        loginStream.writeInt(av.pl1.a((int) 6), i ^ ~0xa8d);
        loginStream.writeInt(sm.a.a((int) 6), (int) -110);
        loginStream.writeInt(ns.u.a(i ^ 0xaeb), (int) -113);
        loginStream.writeInt(nda.c.a((int) 6), (int) -99);
        loginStream.writeInt(ml.i.a((int) 6), i - 2899);
        loginStream.writeInt(Class_nd.n.a((int) 6), (int) -115);
        loginStream.writeInt(cs.i.a((int) 6), (int) -113);
        loginStream.writeInt(sr.S.a((int) 6), (int) -109);
        loginStream.writeInt(ii.b.a((int) 6), i - 2910);
        loginStream.writeInt(id.j.a((int) 6), (int) -102);
        loginStream.writeInt(od.sb.a(i ^ 0xaeb), i ^ ~0xa85);
        if (i != 2797) {
            a((byte) 79);
        }
        loginStream.writeInt(nk.g.a((int) 6), i - 2908);
        loginStream.writeInt(sh.i.a((int) 6), (int) -118);
        loginStream.writeInt(kq.W.a((int) 6), (int) -118);
        loginStream.writeInt(vq.l.a(i - 2791), i - 2918);
        loginStream.writeInt(pga.g.a(i ^ 0xaeb), i - 2903);
        loginStream.writeInt(cf.l.a((int) 6), i - 2897);
        loginStream.writeInt(tn.k.a((int) 6), (int) -109);
        loginStream.writeInt(ufa.b.a(i ^ 0xaeb), (int) -98);
        loginStream.writeInt(ia.s.a((int) 6), (int) -121);
        loginStream.writeInt(Login.pl.a(i - 2791), (int) -124);
        loginStream.writeInt(qu.a.a((int) 6), i ^ ~0xa86);
        loginStream.writeInt(Animable.pl.a((int) 6), i ^ ~0xa8a);
        loginStream.writeInt(wq.m.a((int) 6), i - 2907);
        loginStream.writeInt(Class_nd.p.a((int) 6), (int) -121);
        loginStream.writeInt(bca.a(i - 2797), i ^ ~0xa9c);
        loginStream.writeInt(gf.b(0), i - 2898);
    }
}
