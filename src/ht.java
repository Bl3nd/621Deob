/* ht - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class ht extends cl
{
    static int t;
    private bd u;
    private lm v;
    static int w;
    private ml x;
    static int y;
    static boolean z = false;
    static int B;
    static int C;
    static int D;
    static int E;
    static Animable[] F;
    
    final void a(int i, boolean bool) {
	OpenGL.glBindProgramARB(34336, ((ml) x).b);
	B++;
	OpenGL.glEnable(34336);
	((cl) this).l.a(0, 1, bu.u);
	int i_0_ = -111 % ((52 - i) / 36);
    }
    
    final void d(int i) {
	D++;
	((cl) this).l.a(0, i ^ ~0x4a92, mca.l);
	OpenGL.glBindProgramARB(34336, 0);
	if (i == -19092) {
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	}
    }
    
    ht(lm var_lm, pl var_pl, bd var_bd) {
	super(var_lm);
	v = var_lm;
	u = var_bd;
	if (var_pl == null || !u.a((byte) -92) || !((lm) v).wi)
	    x = null;
	else
	    x = in.a((byte) 100, var_pl.a(69, "gl", "transparent_water"), v,
		     34336);
    }
    
    final void a(boolean bool, boolean bool_1_) {
	y++;
	((cl) this).l.a(ku.k, bool, hn.f);
    }
    
    final boolean a(int i) {
	t++;
	if (i != -16777216)
	    f(-12);
	if (x == null)
	    return false;
	return true;
    }
    
    final void a(int i, int i_2_, hfa var_hfa) {
	if (i_2_ < 47)
	    a(-113, -48, (byte) 92);
	E++;
    }
    
    static final void f(int i) {
	if (i != 0)
	    F = null;
	C++;
	Class_kb.l.a(18385);
    }
    
    public static void g(int i) {
	F = null;
	if (i >= -100)
	    F = null;
    }
    
    static final void a(int i, int i_3_) {
	vf var_vf = ol.p[0][i][i_3_];
	for (int i_4_ = 0; i_4_ < 3; i_4_++) {
	    vf var_vf_5_ = ol.p[i_4_][i][i_3_] = ol.p[i_4_ + 1][i][i_3_];
	    if (var_vf_5_ != null) {
		for (ida var_ida = ((vf) var_vf_5_).f; var_ida != null;
		     var_ida = ((ida) var_ida).d) {
		    qda var_qda = ((ida) var_ida).a;
		    if (((qda) var_qda).B == i && ((qda) var_qda).x == i_3_)
			((Animable) var_qda).height--;
		}
		if (((vf) var_vf_5_).m != null)
		    ((Animable) ((vf) var_vf_5_).m).height--;
		if (((vf) var_vf_5_).l != null)
		    ((Animable) ((vf) var_vf_5_).l).height--;
		if (((vf) var_vf_5_).h != null)
		    ((Animable) ((vf) var_vf_5_).h).height--;
		if (((vf) var_vf_5_).d != null)
		    ((Animable) ((vf) var_vf_5_).d).height--;
		if (((vf) var_vf_5_).p != null)
		    ((Animable) ((vf) var_vf_5_).p).height--;
	    }
	}
	if (ol.p[0][i][i_3_] == null) {
	    ol.p[0][i][i_3_] = new vf(0);
	    ((vf) ol.p[0][i][i_3_]).j = (byte) 1;
	}
	((vf) ol.p[0][i][i_3_]).e = var_vf;
	ol.p[3][i][i_3_] = null;
    }
    
    final void a(int i, int i_6_, byte i_7_) {
	w++;
	if (i_7_ != 65)
	    u = null;
	if (!((bd) u).e) {
	    int i_8_ = 16 * (((en) ((cl) this).l).Me % 4000) / 4000;
	    ((cl) this).l.a(((bd) u).c[i_8_], 0);
	    OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F,
						1.0F);
	} else {
	    float f = (float) (((en) ((cl) this).l).Me % 4000) / 4000.0F;
	    ((cl) this).l.a(((bd) u).b, 0);
	    OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F, 0.0F, 1.0F);
	}
    }
}
