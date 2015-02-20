/* va - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class va extends f implements p
{
    long nativeid;
    
    final native int E();
    
    final native void da(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			 int i_4_);
    
    protected final void finalize() {
	if (((va) this).nativeid != 0L)
	    iba.a(this, (byte) 97);
    }
    
    private final native void wa(float f, float f_5_, float f_6_, float f_7_,
				 float f_8_, float f_9_, ua var_ua, int i,
				 int i_10_);
    
    final native void YA(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			 int i_15_, int i_16_, int i_17_);
    
    final native void V(int i, int i_18_, int i_19_, int i_20_, int i_21_);
    
    private final native void W(l class_l, m var_m, int i, int i_22_,
				int i_23_, int i_24_);
    
    final void a(int i, int i_25_, ua var_ua, int i_26_, int i_27_) {
	M(i, i_25_, var_ua, i_26_, i_27_);
    }
    
    final native void DA(int i, int i_28_, int i_29_, int i_30_, int i_31_,
			 int i_32_, int i_33_);
    
    final native int ca();
    
    private final native void M(int i, int i_34_, ua var_ua, int i_35_,
				int i_36_);
    
    final native int A();
    
    final native void Q(int i, int i_37_, int i_38_, int i_39_);
    
    private final native void FA(l class_l, m var_m, int[] is, int i,
				 int i_40_, int i_41_, int i_42_);
    
    private final native void Z(l class_l, m var_m, int i, int i_43_);
    
    final native void qa(float f, float f_44_, float f_45_, float f_46_,
			 float f_47_, float f_48_, int i, int i_49_, int i_50_,
			 int i_51_);
    
    final void a(float f, float f_52_, float f_53_, float f_54_, float f_55_,
		 float f_56_, int i, ua var_ua, int i_57_, int i_58_) {
	wa(f, f_52_, f_53_, f_54_, f_55_, f_56_, var_ua, i_57_, i_58_);
    }
    
    public final native void UA(boolean bool);
    
    va(l class_l, m var_m, int i, int i_59_) {
	Z(class_l, var_m, i, i_59_);
    }
    
    final void xa(int i, int i_60_, int i_61_) {
	throw new IllegalStateException();
    }
    
    va(l class_l, m var_m, int[] is, int i, int i_62_, int i_63_,
       int i_64_) {
	FA(class_l, var_m, is, i, i_62_, i_63_, i_64_);
    }
    
    va(l class_l, m var_m, int i, int i_65_, int i_66_, int i_67_) {
	W(class_l, var_m, i, i_65_, i_66_, i_67_);
    }
    
    final native int u();
}
