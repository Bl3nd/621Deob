/* w - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class w extends f implements p
{
    long nativeid;
    
    public final native void UA(boolean bool);
    
    final native void qa(float f, float f_0_, float f_1_, float f_2_,
			 float f_3_, float f_4_, int i, int i_5_, int i_6_,
			 int i_7_);
    
    private final native void aa(float f, float f_8_, float f_9_, float f_10_,
				 float f_11_, float f_12_, ua var_ua, int i,
				 int i_13_);
    
    final void a(int i, int i_14_, ua var_ua, int i_15_, int i_16_) {
	U(i, i_14_, var_ua, i_15_, i_16_);
    }
    
    final void a(float f, float f_17_, float f_18_, float f_19_, float f_20_,
		 float f_21_, int i, ua var_ua, int i_22_, int i_23_) {
	aa(f, f_17_, f_18_, f_19_, f_20_, f_21_, var_ua, i_22_, i_23_);
    }
    
    private final native void U(int i, int i_24_, ua var_ua, int i_25_,
				int i_26_);
    
    final native int ca();
    
    final native void Q(int i, int i_27_, int i_28_, int i_29_);
    
    final native void DA(int i, int i_30_, int i_31_, int i_32_, int i_33_,
			 int i_34_, int i_35_);
    
    final native int E();
    
    final void xa(int i, int i_36_, int i_37_) {
	throw new IllegalStateException();
    }
    
    protected final void finalize() {
	if (((w) this).nativeid != 0L)
	    iba.a(this, (byte) 97);
    }
    
    final native void V(int i, int i_38_, int i_39_, int i_40_, int i_41_);
    
    w(l class_l, m var_m, int[] is, byte[] is_42_, int i, int i_43_,
      int i_44_, int i_45_) {
	da(class_l, var_m, is, is_42_, i, i_43_, i_44_, i_45_);
    }
    
    final native void YA(int i, int i_46_, int i_47_, int i_48_, int i_49_,
			 int i_50_, int i_51_, int i_52_);
    
    final native int A();
    
    private final native void da(l class_l, m var_m, int[] is,
				 byte[] is_53_, int i, int i_54_, int i_55_,
				 int i_56_);
    
    final void da(int i, int i_57_, int i_58_, int i_59_, int i_60_,
		  int i_61_) {
	throw new IllegalStateException();
    }
    
    final native int u();
}
