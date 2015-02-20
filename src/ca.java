/* ca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ca extends la implements p
{
    long nativeid;
    
    final native void OA(char c, int i, int i_0_, int i_1_, boolean bool);
    
    protected final void finalize() {
	if (((ca) this).nativeid != 0L)
	    iba.a(this, (byte) -89);
    }
    
    private final native void l(l class_l, m var_m, byte[][] is,
				int[] is_2_, int[] is_3_, int[] is_4_,
				int[] is_5_, int[] is_6_);
    
    private final native void t(char c, int i, int i_7_, int i_8_,
				boolean bool, ua var_ua, int i_9_, int i_10_);
    
    ca(l class_l, m var_m, sa var_sa, aga[] var_agas, f[] var_fs) {
	super(class_l, var_sa);
	byte[][] is = new byte[var_agas.length][];
	int[] is_11_ = new int[var_agas.length];
	int[] is_12_ = new int[var_agas.length];
	int[] is_13_ = new int[var_agas.length];
	int[] is_14_ = new int[var_agas.length];
	for (int i = 0; i < var_agas.length; i++) {
	    is[i] = ((aga) var_agas[i]).c;
	    is_11_[i] = ((aga) var_agas[i]).b;
	    is_12_[i] = ((aga) var_agas[i]).d;
	    is_13_[i] = ((aga) var_agas[i]).e;
	    is_14_[i] = ((aga) var_agas[i]).g;
	}
	l(class_l, var_m, is, ((aga) var_agas[0]).i, is_11_, is_12_, is_13_,
	  is_14_);
    }
    
    final void a(char c, int i, int i_15_, int i_16_, boolean bool, ua var_ua,
		 int i_17_, int i_18_) {
	t(c, i, i_15_, i_16_, bool, var_ua, i_17_, i_18_);
    }
    
    public final native void UA(boolean bool);
}
