/* c - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class c extends la implements p
{
    long nativeid;
    
    public final native void UA(boolean bool);
    
    protected final void finalize() {
	if (((c) this).nativeid != 0L)
	    iba.a(this, (byte) -98);
    }
    
    private final native void GA(char c, int i, int i_0_, int i_1_,
				 boolean bool, ua var_ua, int i_2_, int i_3_);
    
    final void a(char c, int i, int i_4_, int i_5_, boolean bool, ua var_ua,
		 int i_6_, int i_7_) {
	GA(c, i, i_4_, i_5_, bool, var_ua, i_6_, i_7_);
    }
    
    private final native void e(l class_l, m var_m, byte[][] is,
				int[] is_8_, int[] is_9_, int[] is_10_,
				int[] is_11_);
    
    c(l class_l, m var_m, sa var_sa, aga[] var_agas, f[] var_fs) {
	super(class_l, var_sa);
	byte[][] is = new byte[var_agas.length][];
	int[] is_12_ = new int[var_agas.length];
	int[] is_13_ = new int[var_agas.length];
	int[] is_14_ = new int[var_agas.length];
	int[] is_15_ = new int[var_agas.length];
	for (int i = 0; i < var_agas.length; i++) {
	    is[i] = ((aga) var_agas[i]).c;
	    is_12_[i] = ((aga) var_agas[i]).b;
	    is_13_[i] = ((aga) var_agas[i]).d;
	    is_14_[i] = ((aga) var_agas[i]).e;
	    is_15_[i] = ((aga) var_agas[i]).g;
	}
	e(class_l, var_m, is, is_12_, is_13_, is_14_, is_15_);
    }
    
    final native void OA(char c, int i, int i_16_, int i_17_, boolean bool);
}
