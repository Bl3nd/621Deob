/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class za extends ua implements p
{
    long nativeid;
    
    public final native void UA(boolean bool);
    
    private final native void BA(l class_l, m var_m, int i, int i_0_,
				 int[] is, int[] is_1_);
    
    protected final void finalize() {
	if (((za) this).nativeid != 0L)
	    iba.a(this, (byte) -121);
    }
    
    za(l class_l, m var_m, int i, int i_2_, int[] is, int[] is_3_) {
	BA(class_l, var_m, i, i_2_, is, is_3_);
    }
}
