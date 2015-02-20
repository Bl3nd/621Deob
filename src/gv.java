/* gv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gv
{
    static int a = 0;
    short b;
    nl c;
    static int d;
    static fh e = new fh(6, 4);
    static wl modeWhat;
    byte g;
    byte h;
    
    static final void a(fa var_fa, Class_r class_r, int i) {
	d++;
	if (kca.c != null) {
	    if (taa.b < 10) {
		if (!kca.i.a(false, ((eaa) kca.c).I)) {
		    taa.b = cf.l.b(((eaa) kca.c).I, 112) / 10;
		    return;
		}
		sba.a(9811);
		taa.b = 10;
	    }
	    if (taa.b == 10) {
		kca.E = ((eaa) kca.c).H >> 6 << 6;
		kca.F = ((eaa) kca.c).s >> 6 << 6;
		kca.N = (((eaa) kca.c).C >> 6 << 6) - kca.E + 64;
		kca.z = (((eaa) kca.c).F >> 6 << 6) + 64 - kca.F;
		int[] is = new int[3];
		int i_0_ = -1;
		int i_1_ = -1;
		if (kca.c.a((((Animable) up.thisPlayer).locX >> 9) + bfa.thisPlayersRegionX,
			    (((Animable) up.thisPlayer).locY >> 9) + BytesParser.thisPlayersRegionY, is, 255,
			    ((Animable) up.thisPlayer).height)) {
		    i_0_ = is[1] - kca.F;
		    i_1_ = is[2] - kca.E;
		}
		if (!ll.w && i_0_ >= 0 && i_0_ < kca.z && i_1_ >= 0
		    && kca.N > i_1_) {
		    i_1_ += (int) (Math.random() * 10.0) - 5;
		    i_0_ += (int) (10.0 * Math.random()) - 5;
		    ut.I = i_0_;
		    cv.d = i_1_;
		} else if ((ofa.O ^ 0xffffffff) == 0 || iea.a == -1) {
		    kca.c.a((0xfffd1fb & ((eaa) kca.c).u) >> 14, (byte) -119,
			    ((eaa) kca.c).u & 0x3fff, is);
		    ut.I = is[1] - kca.F;
		    cv.d = is[2] - kca.E;
		} else {
		    kca.c.a(ofa.O, (byte) -105, iea.a, is);
		    ofa.O = iea.a = -1;
		    if (is != null) {
			cv.d = is[2] - kca.E;
			ut.I = is[1] - kca.F;
		    }
		    ll.w = false;
		}
		if (((eaa) kca.c).w == 37)
		    kca.o = kca.m = 3.0F;
		else if (((eaa) kca.c).w == 50)
		    kca.o = kca.m = 4.0F;
		else if (((eaa) kca.c).w != 75) {
		    if (((eaa) kca.c).w == 100)
			kca.o = kca.m = 8.0F;
		    else if (((eaa) kca.c).w == 200)
			kca.o = kca.m = 16.0F;
		    else
			kca.o = kca.m = 8.0F;
		} else
		    kca.o = kca.m = 6.0F;
		kca.j = (int) kca.m >> 1;
		kca.s = mh.a(false, kca.j);
		jf.c(-2488);
		kca.d();
		bg.c = new Class_ae();
		kca.l += (int) (5.0 * Math.random()) - 2;
		if (kca.l < -8)
		    kca.l = -8;
		kca.k += (int) (Math.random() * 5.0) - 2;
		if (kca.l > 8)
		    kca.l = 8;
		if (kca.k < -16)
		    kca.k = -16;
		if (kca.k > 16)
		    kca.k = 16;
		kca.a(var_fa, kca.l >> 2 << 10, kca.k >> 1);
		kca.a.a(256, true, 1024);
		kca.e.a(256, 256, false);
		kca.f.a((int) 121, 4096);
		bw.t.a(i - 42, 256);
		taa.b = 20;
	    } else if (taa.b == 20) {
		rv.a(-1, true);
		kca.a(class_r, kca.l, kca.k);
		taa.b = 60;
		rv.a(-1, true);
		te.a(true);
	    } else if (taa.b == 60) {
		if (kca.i.a(((eaa) kca.c).I + "_staticelements", true)) {
		    if (!kca.i.a(false, ((eaa) kca.c).I + "_staticelements"))
			return;
		    kca.r = mo.a(kca.i, 512, rba.d,
				 ((eaa) kca.c).I + "_staticelements");
		} else
		    kca.r = new rn(0);
		kca.b();
		taa.b = 70;
		rv.a(-1, true);
		te.a(true);
	    } else if (taa.b == 70) {
		Class_db.l = new oj(class_r, 11, true, ru.canvas);
		taa.b = 73;
		rv.a(i + 73, true);
		te.a(true);
	    } else if ((taa.b ^ 0xffffffff) == i) {
		fw.Jb = new oj(class_r, 12, true, ru.canvas);
		taa.b = 76;
		rv.a(-1, true);
		te.a(true);
	    } else if (taa.b == 76) {
		al.o = new oj(class_r, 14, true, ru.canvas);
		taa.b = 79;
		rv.a(i ^ 0x49, true);
		te.a(true);
	    } else if (taa.b == 79) {
		dea.c = new oj(class_r, 17, true, ru.canvas);
		taa.b = 82;
		rv.a(-1, true);
		te.a(true);
	    } else if (taa.b == 82) {
		mfa.a = new oj(class_r, 19, true, ru.canvas);
		taa.b = 85;
		rv.a(-1, true);
		te.a(true);
	    } else if (taa.b == 85) {
		pga.h = new oj(class_r, 22, true, ru.canvas);
		taa.b = 88;
		rv.a(-1, true);
		te.a(true);
	    } else if (taa.b == 88) {
		sk.s = new oj(class_r, 26, true, ru.canvas);
		taa.b = 91;
		rv.a(-1, true);
		te.a(true);
	    } else {
		hp.F = new oj(class_r, 30, true, ru.canvas);
		taa.b = 100;
		rv.a(-1, true);
		te.a(true);
		System.gc();
	    }
	}
    }
    
    public static void a(int i) {
	e = null;
	if (i == -12191)
	    modeWhat = null;
    }
    
    gv(nl var_nl, int i, int i_2_, int i_3_) {
	((gv) this).b = (short) i;
	((gv) this).g = (byte) i_3_;
	((gv) this).h = (byte) i_2_;
	((gv) this).c = var_nl;
    }
}
