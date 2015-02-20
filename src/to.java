/* to - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

final class to
{
    static byte[] a
	= { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6,
	    14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17,
	    94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41,
	    25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3,
	    67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112,
	    33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70,
	    -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24,
	    89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31,
	    97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97,
	    101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56,
	    -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51,
	    -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24,
	    53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42,
	    -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22,
	    26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110,
	    -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41,
	    -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85,
	    -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109,
	    -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87,
	    109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56,
	    -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82,
	    -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27,
	    -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2,
	    98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123,
	    -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86,
	    69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17,
	    -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116,
	    -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50,
	    99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2,
	    -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49,
	    127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
    static Class_ae b = new Class_ae();
    static int c;
    static int d;
    static Applet e;
    static int f;
    static int g;
    static int h = 0;
    
    static final boolean a(int i, int i_0_, byte i_1_) {
	if (i_1_ != -36)
	    a(-117);
	c++;
	if ((0x580 & i) == 0)
	    return false;
	return true;
    }
    
    static final boolean a(qda var_qda, boolean bool) {
	boolean bool_2_ = Class_q.b == wr.D;
	int i = 0;
	short i_3_ = 0;
	byte i_4_ = 0;
	var_qda.h((int) 0);
	if (((qda) var_qda).B < 0 || ((qda) var_qda).x < 0
	    || ((qda) var_qda).I >= sv.T || ((qda) var_qda).y >= nf.H)
	    return false;
	short i_5_ = 0;
	for (int i_6_ = ((qda) var_qda).B; i_6_ <= ((qda) var_qda).I; i_6_++) {
	    for (int i_7_ = ((qda) var_qda).x; i_7_ <= ((qda) var_qda).y;
		 i_7_++) {
		vf var_vf = lh.a(((Animable) var_qda).height, i_6_, i_7_);
		if (var_vf != null) {
		    ida var_ida = vt.a((byte) 97, var_qda);
		    ida var_ida_8_ = ((vf) var_vf).f;
		    if (var_ida_8_ == null)
			((vf) var_vf).f = var_ida;
		    else {
			for (/**/; ((ida) var_ida_8_).d != null;
			     var_ida_8_ = ((ida) var_ida_8_).d) {
			    /* empty */
			}
			((ida) var_ida_8_).d = var_ida;
		    }
		    if (bool_2_ && (of.b[i_6_][i_7_] & ~0xffffff) != 0) {
			i = of.b[i_6_][i_7_];
			i_3_ = uo.c[i_6_][i_7_];
			i_4_ = qh.q[i_6_][i_7_];
		    }
		    if (!bool && ((vf) var_vf).m != null
			&& ((dfa) ((vf) var_vf).m).x > i_5_)
			i_5_ = ((dfa) ((vf) var_vf).m).x;
		}
	    }
	}
	if (bool_2_ && (i & ~0xffffff) != 0) {
	    for (int i_9_ = ((qda) var_qda).B; i_9_ <= ((qda) var_qda).I;
		 i_9_++) {
		for (int i_10_ = ((qda) var_qda).x; i_10_ <= ((qda) var_qda).y;
		     i_10_++) {
		    if ((of.b[i_9_][i_10_] & ~0xffffff) == 0) {
			of.b[i_9_][i_10_] = i;
			uo.c[i_9_][i_10_] = i_3_;
			qh.q[i_9_][i_10_] = i_4_;
		    }
		}
	    }
	}
	if (bool)
	    sw.a[aa.n++] = var_qda;
	else {
	    int i_11_ = Class_q.b == wr.D ? 1 : 0;
	    if (var_qda.g((byte) 115)) {
		if (var_qda.e((byte) 23))
		    lm.Nh[i_11_][fg.a[i_11_]++] = var_qda;
		else
		    aaa.k[i_11_][baa.l[i_11_]++] = var_qda;
	    } else
		cca.d[i_11_][cc.f[i_11_]++] = var_qda;
	}
	if (bool)
	    ((Animable) var_qda).j -= i_5_;
	return true;
    }
    
    static final void a(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			int i_16_, int i_17_) {
	f++;
	on[] var_ons = Class_fb.j;
	if (i_14_ != -14564)
	    h = -1;
	for (int i_18_ = 0; var_ons.length > i_18_; i_18_++) {
	    on var_on = var_ons[i_18_];
	    if (var_on != null && ((on) var_on).a == 2) {
		iaa.a(((on) var_on).n, i >> 1, i_13_, ((on) var_on).i, i_15_,
		      (byte) 46, i_12_ >> 1, ((on) var_on).d * 2,
		      ((on) var_on).p);
		if (lt.h[0] > -1 && pm.currentTimedTicks % 20 < 10)
		    vq.h[((on) var_on).b].a(lt.h[0] + (i_17_ - 12),
					    i_16_ + lt.h[1] - 28);
	    }
	}
    }
    
    public static void a(int i) {
	e = null;
	b = null;
	a = null;
	if (i != 23460)
	    a = null;
    }
    
    static final void a(int i, int i_19_, int i_20_) {
	d++;
	qba var_qba = ofa.a(i, i_20_, (byte) 123);
	var_qba.c((byte) 11);
	((qba) var_qba).v = i_19_;
    }
    
    static {
	g = 0;
    }
}
