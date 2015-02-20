/* bg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bg
{
    static vm a;
    static Object b;
    static Class_ae c;
    static int d;
    static int e = 0;
    static String[] f;
    static int g = 0;
    
    public static void a(int i) {
	b = null;
	a = null;
	f = null;
	if (i > -27)
	    c = null;
	c = null;
    }
    
    static final void a(int i, int i_0_, int i_1_) {
	vf var_vf = ol.p[i][i_0_][i_1_];
	if (var_vf != null) {
	    rba.a(((vf) var_vf).l);
	    rba.a(((vf) var_vf).h);
	    if (((vf) var_vf).l != null)
		((vf) var_vf).l = null;
	    if (((vf) var_vf).h != null)
		((vf) var_vf).h = null;
	}
    }
    
    static final void applyNPCAnim(int[] is, byte i, NPC class_ac, int i_2_) {
	if (((Entity) class_ac).Ab != null) {
	    boolean bool = true;
	    for (int i_3_ = 0; ((Entity) class_ac).Ab.length > i_3_; i_3_++) {
		if (((Entity) class_ac).Ab[i_3_] != is[i_3_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool && ((Entity) class_ac).yb != -1) {
		dr var_dr = Class_ef.J.c(64, ((Entity) class_ac).yb);
		int i_4_ = ((dr) var_dr).g;
		if (i_4_ == 1) {
		    ((Entity) class_ac).W = 1;
		    ((Entity) class_ac).Hb = 0;
		    ((Entity) class_ac).ic = 0;
		    ((Entity) class_ac).oc = i_2_;
		    ((Entity) class_ac).yc = 0;
		    qga.a(((Animable) class_ac).height, var_dr, ((Animable) class_ac).locX,
			  ((Animable) class_ac).locY, 69, ((Entity) class_ac).yc, false);
		}
		if (i_4_ == 2)
		    ((Entity) class_ac).Hb = 0;
	    }
	}
	d++;
	if (i <= -119) {
	    boolean bool = true;
	    for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
		if (is[i_5_] != -1)
		    bool = false;
		if (((Entity) class_ac).Ab == null
		    || ((Entity) class_ac).Ab[i_5_] == -1
		    || (((dr) Class_ef.J.c(64, is[i_5_])).t
			>= (((dr) Class_ef.J.c(64, ((Entity) class_ac).Ab[i_5_]))
			    .t))) {
		    ((Entity) class_ac).Kc = ((Entity) class_ac).Nc;
		    ((Entity) class_ac).Ab = is;
		    ((Entity) class_ac).oc = i_2_;
		}
	    }
	    if (bool) {
		((Entity) class_ac).oc = i_2_;
		((Entity) class_ac).Ab = is;
		((Entity) class_ac).Kc = ((Entity) class_ac).Nc;
	    }
	}
    }
}
