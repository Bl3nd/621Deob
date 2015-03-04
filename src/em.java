/* em - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class em
{
    static Frame a;
    static int b;
    static Class_ae c;
    static int[] d = { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
    static int e;
    
    static final void a(int i, int i_0_, int i_1_) {
	int i_2_ = 101 / ((68 - i_1_) / 40);
	pr.H = i - kca.E;
	Class_k.Q = i_0_ - kca.F;
	b++;
    }
    
    static final void a(int i, int i_3_, int i_4_, int i_5_, wr var_wr) {
	vf var_vf = lh.a(i, i_3_, i_4_);
	if (var_vf != null) {
	    ((Animable) var_wr).locX = (i_3_ << Class_fb.a) + dba.k;
	    ((Animable) var_wr).j = i_5_;
	    ((Animable) var_wr).locY = (i_4_ << Class_fb.a) + dba.k;
	    if (((vf) var_vf).m != null)
		((Animable) var_wr).j -= ((dfa) ((vf) var_vf).m).x;
	    ((vf) var_vf).c = var_wr;
	    int i_6_ = Class_q.b == wr.D ? 1 : 0;
	    if (var_wr.g((byte) 115)) {
		if (var_wr.e((byte) 23))
		    lm.Nh[i_6_][fg.a[i_6_]++] = var_wr;
		else
		    aaa.animables[i_6_][baa.l[i_6_]++] = var_wr;
	    } else
		InputStreamSub_1.d[i_6_][cc.f[i_6_]++] = var_wr;
	}
    }
    
    public static void a(int i) {
	if (i == 5) {
	    d = null;
	    a = null;
	    c = null;
	}
    }
    
    static {
	c = new Class_ae();
	e = 0;
    }
}
