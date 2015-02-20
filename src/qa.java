/* qa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qa implements p
{
    private v a;
    private v b;
    private v c;
    private v d;
    long nativeid;
    private l e;
    private v f;
    private v g;
    Runnable h;
    private v i;
    private v j;
    private v k;
    private v l;
    
    final native void G(Class_r class_r, int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_);
    
    final native void s(da var_da, int[] is, Class_q class_q);
    
    private final native void DA(Class_r class_r, int i, int i_6_);
    
    final native boolean XA(da var_da, int i, int i_7_, Class_q class_q,
			    boolean bool);
    
    private final native void E();
    
    final native void LA(da var_da, Class_q class_q, int[] is, int i);
    
    final void a() {
	((qa) this).h = Thread.currentThread();
	GA();
    }
    
    private final native void GA();
    
    final native void HA(Class_r class_r, int[] is, int[] is_8_, int[] is_9_,
			 short[] is_10_, int i);
    
    public final native void UA(boolean bool);
    
    final native void ZA(Class_i class_i, int i, int i_11_);
    
    final native void la(Class_i class_i, int i, int i_12_, int i_13_,
			 int i_14_, int i_15_, int i_16_, int i_17_,
			 boolean[][] bools);
    
    final native void J(da var_da, Class_q class_q, int[] is, int i,
			int i_18_);
    
    final da a(v var_v, byte i, int i_19_, boolean bool) {
	v var_v_20_;
	v var_v_21_;
	if (i == 1) {
	    var_v_20_ = f;
	    var_v_21_ = c;
	} else if (i == 2) {
	    var_v_20_ = k;
	    var_v_21_ = b;
	} else if (i == 3) {
	    var_v_20_ = l;
	    var_v_21_ = this.i;
	} else if (i == 4) {
	    var_v_20_ = g;
	    var_v_21_ = a;
	} else if (i == 5) {
	    var_v_20_ = j;
	    var_v_21_ = d;
	} else
	    var_v_21_ = var_v_20_ = new v(e);
	var_v.n(var_v_21_, var_v_20_, i_19_, i != 0, bool);
	((v) var_v_21_).s = ((v) var_v).s;
	((v) var_v_21_).q = ((v) var_v).q;
	return var_v_21_;
    }
    
    final void b() {
	((qa) this).h = null;
	E();
    }
    
    final native void i(da var_da, da var_da_22_, int i, int i_23_, int i_24_,
			boolean bool);
    
    qa(l class_l, int i, int i_25_) {
	e = class_l;
	c = new v(e);
	b = new v(e);
	this.i = new v(e);
	a = new v(e);
	d = new v(e);
	f = new v(e);
	k = new v(e);
	l = new v(e);
	g = new v(e);
	j = new v(e);
	DA(class_l, i, i_25_);
    }
    
    protected final void finalize() {
	if (((qa) this).nativeid != 0L)
	    iba.a(this, (byte) 107);
    }
}
