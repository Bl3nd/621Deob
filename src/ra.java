/* ra - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ra extends Class_q implements p
{
    long nativeid;
    
    private final native void S(int i, int i_0_, int i_1_, int[] is);
    
    final native void oa(int i);
    
    final native void ZA(int i);
    
    final native void AA(int i);
    
    final void a(int i, int i_2_, int i_3_, int[] is) {
	S(i, i_2_, i_3_, is);
    }
    
    final native void w(int i);
    
    private final native void ja();
    
    final native void U(int i, int i_4_, int i_5_);
    
    final Class_q a() {
	ra var_ra_6_ = new ra();
	var_ra_6_.M(this);
	return var_ra_6_;
    }
    
    final native void M(Class_q class_q);
    
    final native void NA(int i, int i_7_, int i_8_);
    
    final native void YA(int[] is);
    
    final native void J(int i);
    
    public final native void UA(boolean bool);
    
    protected final void finalize() {
	if (((ra) this).nativeid != 0L)
	    iba.a(this, (byte) 68);
    }
    
    final native void o(int i);
    
    final native void Y();
    
    final native void wa(int i, int i_9_, int i_10_, int[] is);
    
    ra() {
	ja();
    }
    
    final native void na(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			 int i_15_);
}
