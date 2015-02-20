/* s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class s extends Class_i implements p
{
    long nativeid;
    private Class_ae m = new Class_ae();
    private l n;
    
    s(l class_l, m var_m, int i, int i_0_, int[][] is, int[][] is_1_,
      int i_2_, int i_3_, int i_4_) {
	super(i, i_0_, i_2_, is);
	n = class_l;
	SA(n, var_m, i, i_0_, ((Class_i) this).f, is_1_, i_2_, i_3_, i_4_);
    }
    
    final native void DA(ha var_ha, int i, int i_5_, int i_6_, int i_7_,
			 boolean bool);
    
    final native void O(int i, int i_8_, int[] is, int[] is_9_, int[] is_10_,
			int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_,
			int[] is_15_, int i_16_, int i_17_, int i_18_,
			boolean bool);
    
    final void a(int i, int i_19_, int[] is, int[] is_20_, int[] is_21_,
		 int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_,
		 int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_,
		 int i_30_, int i_31_, int i_32_, boolean bool) {
	boolean bool_33_ = false;
	if (is_26_ != null) {
	    int[] is_34_ = is_26_;
	    for (int i_35_ = 0; i_35_ < is_34_.length; i_35_++) {
		int i_36_ = is_34_[i_35_];
		if (i_36_ != -1) {
		    bool_33_ = true;
		    break;
		}
	    }
	}
	int i_37_ = is_26_.length;
	int[] is_38_ = new int[i_37_ * 3];
	int[] is_39_ = new int[i_37_ * 3];
	int[] is_40_ = new int[i_37_ * 3];
	int[] is_41_ = new int[i_37_ * 3];
	int[] is_42_ = new int[i_37_ * 3];
	int[] is_43_ = is_27_ != null ? new int[i_37_ * 3] : null;
	int[] is_44_ = is_20_ != null ? new int[i_37_ * 3] : null;
	int[] is_45_ = is_22_ != null ? new int[i_37_ * 3] : null;
	int i_46_ = 0;
	for (int i_47_ = 0; i_47_ < i_37_; i_47_++) {
	    int i_48_ = is_23_[i_47_];
	    int i_49_ = is_24_[i_47_];
	    int i_50_ = is_25_[i_47_];
	    is_38_[i_46_] = is[i_48_];
	    is_39_[i_46_] = is_21_[i_48_];
	    is_40_[i_46_] = is_26_[i_47_];
	    is_41_[i_46_] = is_28_[i_47_];
	    is_42_[i_46_] = is_29_[i_47_];
	    if (is_27_ != null)
		is_43_[i_46_] = is_27_[i_47_];
	    if (is_20_ != null)
		is_44_[i_46_] = is_20_[i_48_];
	    if (is_22_ != null)
		is_45_[i_46_] = is_22_[i_48_];
	    i_46_++;
	    is_38_[i_46_] = is[i_49_];
	    is_39_[i_46_] = is_21_[i_49_];
	    is_40_[i_46_] = is_26_[i_47_];
	    is_41_[i_46_] = is_28_[i_47_];
	    is_42_[i_46_] = is_29_[i_47_];
	    if (is_27_ != null)
		is_43_[i_46_] = is_27_[i_47_];
	    if (is_20_ != null)
		is_44_[i_46_] = is_20_[i_49_];
	    if (is_22_ != null)
		is_45_[i_46_] = is_22_[i_49_];
	    i_46_++;
	    is_38_[i_46_] = is[i_50_];
	    is_39_[i_46_] = is_21_[i_50_];
	    is_40_[i_46_] = is_26_[i_47_];
	    is_41_[i_46_] = is_28_[i_47_];
	    is_42_[i_46_] = is_29_[i_47_];
	    if (is_27_ != null)
		is_43_[i_46_] = is_27_[i_47_];
	    if (is_20_ != null)
		is_44_[i_46_] = is_20_[i_50_];
	    if (is_22_ != null)
		is_45_[i_46_] = is_22_[i_50_];
	    i_46_++;
	}
	if (bool_33_ || is_43_ != null)
	    O(i, i_19_, is_38_, is_44_, is_39_, is_45_, is_40_, is_43_, is_41_,
	      is_42_, i_30_, i_31_, i_32_, bool);
    }
    
    final void a(int i, int i_51_, int i_52_, boolean[][] bools, boolean bool,
		 int i_53_) {
	throw new IllegalStateException();
    }
    
    protected final void finalize() {
	if (((s) this).nativeid != 0L)
	    iba.a(this, (byte) -87);
    }
    
    final void a(int i, int i_54_, int i_55_, boolean[][] bools,
		 boolean bool) {
	int i_56_ = 0;
	float[] fs = new float[m.b((int) -91)];
	for (gga var_gga = (gga) m.a((int) 99); var_gga != null;
	     var_gga = (gga) m.b((byte) 28))
	    fs[i_56_++] = var_gga.b((int) 100);
	YA(fs);
	for (int i_57_ = 0; i_57_ < i_55_ + i_55_; i_57_++) {
	    for (int i_58_ = 0; i_58_ < i_55_ + i_55_; i_58_++) {
		if (bools[i_57_][i_58_]) {
		    int i_59_ = i - i_55_ + i_57_;
		    int i_60_ = i_54_ - i_55_ + i_58_;
		    if (i_59_ >= 0 && i_59_ < ((Class_i) this).k && i_60_ >= 0
			&& i_60_ < ((Class_i) this).j)
			a(i_59_, i_60_);
		}
	    }
	}
    }
    
    private final native void VA(int i, int i_61_, int i_62_, int i_63_,
				 int i_64_, int i_65_, int[] is);
    
    final void a(int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_,
		 int i_71_, boolean[][] bools) {
	n.D().la(this, i, i_66_, i_67_, i_68_, i_69_, i_70_, i_71_, bools);
    }
    
    public final native void UA(boolean bool);
    
    final native void a(int i, int i_72_, int i_73_);
    
    final void a(int i, int i_74_) {
	n.D().ZA(this, i, i_74_);
    }
    
    private final native void YA(float[] fs);
    
    final native void E(ha var_ha, int i, int i_75_, int i_76_, int i_77_,
			boolean bool);
    
    final native ha v(int i, int i_78_, ha var_ha);
    
    final boolean a(ha var_ha, int i, int i_79_, int i_80_, int i_81_,
		    boolean bool) {
	return true;
    }
    
    private final native void SA(l class_l, m var_m, int i, int i_82_,
				 int[][] is, int[][] is_83_, int i_84_,
				 int i_85_, int i_86_);
    
    final native void BA();
    
    final void a(gga var_gga, int[] is) {
	m.b(var_gga, (byte) 93);
	VA(var_gga.hashCode(), var_gga.a(true), var_gga.i(-95),
	   var_gga.b((byte) 119), var_gga.a((byte) -75), var_gga.a((int) 80),
	   is);
    }
}
