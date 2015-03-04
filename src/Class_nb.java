/* Class_nb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class_nb extends Node
{
    static int k;
    int l;
    int m;
    static int n = -1;
    int o;
    static int p;
    private int q;
    private int r;
    private int s;
    int t;
    static int u;
    private int v;
    static int w;
    static int x;
    private int y;
    static int z;
    static int B;
    static int C;
    
    static final ev a(int i, int i_0_, int i_1_) {
	vf var_vf = ol.p[i][i_0_][i_1_];
	if (var_vf == null)
	    return null;
	return ((vf) var_vf).l;
    }
    
    final boolean a(int i, int i_2_, boolean bool) {
	if (bool != false)
	    return false;
	z++;
	if (i < r || y < i || i_2_ < q || s < i_2_)
	    return false;
	return true;
    }
    
    final void a(int i, int i_3_, int[] is, byte i_4_) {
	C++;
	if (i_4_ > -35)
	    a('Y', true);
	is[1] = r + (i_3_ - ((Class_nb) this).l);
	is[2] = i + q - ((Class_nb) this).m;
	is[0] = v;
    }
    
    static final boolean a(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			   byte i_9_) {
	u++;
	if (i_9_ >= -29)
	    a('\037', true);
	for (int i_10_ = i_5_; i_10_ <= i; i_10_++) {
	    for (int i_11_ = i_6_; i_8_ >= i_11_; i_11_++) {
		if (i_7_ == gi.k[i_10_][i_11_] && GameInPacket.ints[i_10_][i_11_] <= 1)
		    return true;
	    }
	}
	return false;
    }
    
    final void a(int[] is, int i, int i_12_, int i_13_) {
	is[2] = i - (q - ((Class_nb) this).m);
	is[1] = i_12_ + ((Class_nb) this).l - r;
	k++;
	is[i_13_] = 0;
    }
    
    final boolean a(int i, int i_14_, int i_15_, int i_16_) {
	x++;
	if (i_14_ <= 37)
	    a('\uff8e', true);
	if (i_16_ == v && r <= i && y >= i && i_15_ >= q && s >= i_15_)
	    return true;
	return false;
    }
    
    final boolean b(int i, int i_17_, int i_18_) {
	if (i_17_ != 7369)
	    return false;
	B++;
	if (i_18_ < ((Class_nb) this).l || i_18_ > ((Class_nb) this).t
	    || i < ((Class_nb) this).m || i > ((Class_nb) this).o)
	    return false;
	return true;
    }
    
    Class_nb(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
	     int i_24_, int i_25_, int i_26_) {
	((Class_nb) this).t = i_25_;
	q = i_20_;
	y = i_21_;
	((Class_nb) this).m = i_24_;
	s = i_22_;
	v = i;
	((Class_nb) this).o = i_26_;
	((Class_nb) this).l = i_23_;
	r = i_19_;
    }
    
    static final char a(char c, boolean bool) {
	w++;
	if (c == '\u00c6')
	    return 'E';
	if (bool != true)
	    n = 55;
	if (c == '\u00e6')
	    return 'e';
	if (c == '\u00df')
	    return 's';
	if (c == '\u0152')
	    return 'E';
	if (c == '\u0153')
	    return 'e';
	return '\0';
    }
    
    static final ah a(int i, Signlink var_rj, int i_27_, Component component,
		      int i_28_) {
	p++;
	if (gba.samplesPerSec == 0)
	    throw new IllegalStateException();
	if (i_28_ < 0 || i_28_ >= 2)
	    throw new IllegalArgumentException();
	if (i_27_ < 256)
	    i_27_ = 256;
	if (i != 12869)
	    return null;
	try {
	    ah var_ah = (ah) Class.forName("o").newInstance();
	    ((ah) var_ah).A = i_27_;
	    ((ah) var_ah).k = new int[(wq.p ? 2 : 1) * 256];
	    var_ah.getComponent(component);
	    ((ah) var_ah).B = (~0x3ff & i_27_) + 1024;
	    if (((ah) var_ah).B > 16384)
		((ah) var_ah).B = 16384;
	    var_ah.d(((ah) var_ah).B);
	    if (pi.k > 0 && av.m == null) {
		av.m = new cba();
		((cba) av.m).d = var_rj;
		var_rj.a(pi.k, av.m, 0);
	    }
	    if (av.m != null) {
		if (((cba) av.m).g[i_28_] != null)
		    throw new IllegalArgumentException();
		((cba) av.m).g[i_28_] = var_ah;
	    }
	    return var_ah;
	} catch (Throwable throwable) {
	    try {
		be var_be = new be(var_rj, i_28_);
		((ah) var_be).A = i_27_;
		((ah) var_be).k = new int[(wq.p ? 2 : 1) * 256];
		var_be.getComponent(component);
		((ah) var_be).B = 16384;
		var_be.d(((ah) var_be).B);
		if (pi.k > 0 && av.m == null) {
		    av.m = new cba();
		    ((cba) av.m).d = var_rj;
		    var_rj.a(pi.k, av.m, 0);
		}
		if (av.m != null) {
		    if (((cba) av.m).g[i_28_] != null)
			throw new IllegalArgumentException();
		    ((cba) av.m).g[i_28_] = var_be;
		}
		return var_be;
	    } catch (Throwable throwable_29_) {
		return new ah();
	    }
	}
    }
}
