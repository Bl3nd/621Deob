/* f - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class f
{
    final void a(int i, int i_0_, int i_1_, int i_2_) {
	YA(i, i_0_, i_1_, i_2_, 1, 0, 1, 1);
    }
    
    final void a(float f, float f_3_, int i, int i_4_, int i_5_, int i_6_,
		 int i_7_) {
	a(f, f_3_, (float) A() / 2.0F, (float) ca() / 2.0F, i, i_4_, i_5_,
	  i_6_, i_7_);
    }
    
    final void a(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
		 int i_13_) {
	YA(i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, 1);
    }
    
    final void a(int i, int i_14_) {
	V(i, i_14_, 1, 0, 1);
    }
    
    final void a(float f, float f_15_, float f_16_, float f_17_, int i,
		 int i_18_, ua var_ua, int i_19_, int i_20_) {
	if (i != 0) {
	    double d = (double) (i_18_ & 0xffff) * 9.587379924285257E-5;
	    float f_21_ = (float) Math.sin(d) * (float) i;
	    float f_22_ = (float) Math.cos(d) * (float) i;
	    float f_23_ = (-f_16_ * f_22_ + -f_17_ * f_21_) / 4096.0F + f;
	    float f_24_ = (f_16_ * f_21_ + -f_17_ * f_22_) / 4096.0F + f_15_;
	    float f_25_
		= ((((float) A() - f_16_) * f_22_ + -f_17_ * f_21_) / 4096.0F
		   + f);
	    float f_26_
		= ((-((float) A() - f_16_) * f_21_ + -f_17_ * f_22_) / 4096.0F
		   + f_15_);
	    float f_27_
		= ((-f_16_ * f_22_ + ((float) ca() - f_17_) * f_21_) / 4096.0F
		   + f);
	    float f_28_
		= ((f_16_ * f_21_ + ((float) ca() - f_17_) * f_22_) / 4096.0F
		   + f_15_);
	    a(f_23_, f_24_, f_25_, f_26_, f_27_, f_28_, var_ua, i_19_, i_20_);
	}
    }
    
    public f() {
	/* empty */
    }
    
    abstract int E();
    
    abstract void qa(float f, float f_29_, float f_30_, float f_31_,
		     float f_32_, float f_33_, int i, int i_34_, int i_35_,
		     int i_36_);
    
    abstract void xa(int i, int i_37_, int i_38_);
    
    final void a(float f, float f_39_, int i, int i_40_, ua var_ua, int i_41_,
		 int i_42_) {
	a(f, f_39_, (float) A() / 2.0F, (float) ca() / 2.0F, i, i_40_, var_ua,
	  i_41_, i_42_);
    }
    
    abstract int A();
    
    private final void a(float f, float f_43_, float f_44_, float f_45_,
			 float f_46_, float f_47_, ua var_ua, int i,
			 int i_48_) {
	a(f, f_43_, f_44_, f_45_, f_46_, f_47_, 1, var_ua, i, i_48_);
    }
    
    private final void a(float f, float f_49_, float f_50_, float f_51_,
			 float f_52_, float f_53_, int i, int i_54_,
			 int i_55_) {
	qa(f, f_49_, f_50_, f_51_, f_52_, f_53_, i, i_54_, i_55_, 1);
    }
    
    abstract void DA(int i, int i_56_, int i_57_, int i_58_, int i_59_,
		     int i_60_, int i_61_);
    
    abstract void YA(int i, int i_62_, int i_63_, int i_64_, int i_65_,
		     int i_66_, int i_67_, int i_68_);
    
    abstract void a(float f, float f_69_, float f_70_, float f_71_,
		    float f_72_, float f_73_, int i, ua var_ua, int i_74_,
		    int i_75_);
    
    final void a(float f, float f_76_, int i, int i_77_) {
	a(f, f_76_, (float) A() / 2.0F, (float) ca() / 2.0F, i, i_77_, 1, 0,
	  1);
    }
    
    abstract void da(int i, int i_78_, int i_79_, int i_80_, int i_81_,
		     int i_82_);
    
    private final void a(float f, float f_83_, float f_84_, float f_85_, int i,
			 int i_86_, int i_87_, int i_88_, int i_89_) {
	if (i != 0) {
	    double d = (double) (i_86_ & 0xffff) * 9.587379924285257E-5;
	    float f_90_ = (float) Math.sin(d) * (float) i;
	    float f_91_ = (float) Math.cos(d) * (float) i;
	    float f_92_ = (-f_84_ * f_91_ + -f_85_ * f_90_) / 4096.0F + f;
	    float f_93_ = (f_84_ * f_90_ + -f_85_ * f_91_) / 4096.0F + f_83_;
	    float f_94_
		= ((((float) A() - f_84_) * f_91_ + -f_85_ * f_90_) / 4096.0F
		   + f);
	    float f_95_
		= ((-((float) A() - f_84_) * f_90_ + -f_85_ * f_91_) / 4096.0F
		   + f_83_);
	    float f_96_
		= ((-f_84_ * f_91_ + ((float) ca() - f_85_) * f_90_) / 4096.0F
		   + f);
	    float f_97_
		= ((f_84_ * f_90_ + ((float) ca() - f_85_) * f_91_) / 4096.0F
		   + f_83_);
	    a(f_92_, f_93_, f_94_, f_95_, f_96_, f_97_, i_87_, i_88_, i_89_);
	}
    }
    
    abstract void a(int i, int i_98_, ua var_ua, int i_99_, int i_100_);
    
    final void b(int i, int i_101_, int i_102_, int i_103_) {
	DA(i, i_101_, i_102_, i_103_, 1, 0, 1);
    }
    
    abstract int u();
    
    abstract void Q(int i, int i_104_, int i_105_, int i_106_);
    
    abstract int ca();
    
    abstract void V(int i, int i_107_, int i_108_, int i_109_, int i_110_);
}
