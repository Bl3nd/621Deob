/* fca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fca
{
    static int a;
    static int b;
    static int c;
    private Interactable d = new Interactable();
    static int e;
    static int[] f = new int[2048];
    static int g;
    static int h;
    static int i;
    static int j;
    static int k;
    static int l;
    private Interactable m;
    static int n;
    
    final boolean a(int i) {
	if (i != 17494)
	    return false;
	j++;
	if (((Interactable) d).interactable != d)
	    return false;
	return true;
    }
    
    static final void a(boolean bool, qj var_qj) {
	b++;
	if (Interactable.d == null) {
	    gn var_gn = new gn();
	    byte[] is = var_gn.a((int) 0, 128, 128, 16);
	    Interactable.d = kg.a(-137, is, false);
	}
	if (tp.a == null) {
	    up var_up = new up();
	    byte[] is = var_up.a(12743, 16, 128, 128);
	    tp.a = kg.a(-137, is, false);
	}
	if (bool != false)
	    e(-72);
	gk var_gk = ((qj) var_qj).ie;
	if (var_gk.a((byte) -126) && bg.b == null) {
	    byte[] is = Class_rb.a(0, 8, 16.0F, 16, 0.5F, 0.6F, 4.0F, 128, 128,
				   new vq(419684), 4.0F);
	    bg.b = kg.a(-137, is, false);
	}
    }
    
    static final void a(byte i, double d) {
	if (d != aw.e) {
	    for (int i_0_ = 0; i_0_ < 256; i_0_++) {
		int i_1_ = (int) (255.0 * Math.pow((double) i_0_ / 255.0, d));
		sg.a[i_0_] = i_1_ <= 255 ? i_1_ : 255;
	    }
	    aw.e = d;
	}
	e++;
	if (i != 86)
	    f = null;
    }
    
    final void b(int i) {
	a++;
	if (i != 128)
	    d = null;
	for (;;) {
	    Interactable var_fga = ((Interactable) d).interactable;
	    if (var_fga == d)
		break;
	    var_fga.b(2);
	}
	m = null;
    }
    
    final Interactable a(byte i) {
	n++;
	if (i != -106)
	    a(3, 74, null, true, -8, null);
	Interactable var_fga = m;
	if (d == var_fga) {
	    m = null;
	    return null;
	}
	m = ((Interactable) var_fga).interactable;
	return var_fga;
    }
    
    final void a(Interactable var_fga, int i) {
	k++;
	if (((Interactable) var_fga).interactable_ != null)
	    var_fga.b(2);
	((Interactable) var_fga).interactable = d;
	((Interactable) var_fga).interactable_ = ((Interactable) d).interactable_;
	if (i <= 39)
	    b((byte) 22);
	((Interactable) ((Interactable) var_fga).interactable_).interactable = var_fga;
	((Interactable) ((Interactable) var_fga).interactable).interactable_ = var_fga;
    }
    
    final Interactable b(byte i) {
	l++;
	if (i <= 69)
	    f = null;
	Interactable var_fga = ((Interactable) d).interactable;
	if (d == var_fga) {
	    m = null;
	    return null;
	}
	m = ((Interactable) var_fga).interactable;
	return var_fga;
    }
    
    final Interactable c(int i) {
	if (i < 120)
	    return null;
	h++;
	Interactable var_fga = ((Interactable) d).interactable_;
	if (var_fga == d) {
	    m = null;
	    return null;
	}
	m = ((Interactable) var_fga).interactable_;
	return var_fga;
    }
    
    final int d(int i) {
	c++;
	int i_2_ = i;
	Interactable var_fga = ((Interactable) d).interactable;
	while (var_fga != d) {
	    var_fga = ((Interactable) var_fga).interactable;
	    i_2_++;
	}
	return i_2_;
    }
    
    static final ar a(int i, int i_3_, qj var_qj, boolean bool, int i_4_,
		      int[] is) {
	if (i != 26871)
	    a(false, null);
	fca.i++;
	if (!((qj) var_qj).pg
	    && (!ar.a(i_3_, (byte) 98) || !ar.a(i_4_, (byte) 98))) {
	    if (((qj) var_qj).vf)
		return new ar(var_qj, 34037, i_3_, i_4_, bool, is);
	    return new ar(var_qj, i_3_, i_4_, dfa.a(i_3_, 128),
			  dfa.a(i_4_, 128), is);
	}
	return new ar(var_qj, 3553, i_3_, i_4_, bool, is);
    }
    
    public static void e(int i) {
	if (i == -13197)
	    f = null;
    }
    
    public fca() {
	((Interactable) d).interactable = d;
	((Interactable) d).interactable_ = d;
    }
    
    final Interactable a(boolean bool) {
	if (bool != true)
	    d = null;
	g++;
	Interactable var_fga = ((Interactable) d).interactable;
	if (var_fga == d)
	    return null;
	var_fga.b(2);
	return var_fga;
    }
}
