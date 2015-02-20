/* ar - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ar extends pm
{
    float M;
    int N;
    float O;
    boolean P;
    static int Q;
    static int R;
    static float[] S = new float[4];
    int T;
    static int U;
    
    ar(qj var_qj, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	super(var_qj, 3553, i, i_2_, i_3_);
	((ar) this).P = false;
	((ar) this).T = i_0_;
	((ar) this).O = (float) i_0_ / (float) i_2_;
	((ar) this).M = (float) i_1_ / (float) i_3_;
	((ar) this).N = i_1_;
	this.a(false, (byte) -43, false);
    }
    
    ar(qj var_qj, int i, int i_4_, int i_5_, int i_6_, boolean bool, byte[] is,
       int i_7_) {
	super(var_qj, i, i_4_, i_5_, i_6_, bool, is, i_7_, true);
	((ar) this).T = i_5_;
	((ar) this).N = i_6_;
	if (((rg) this).i != 34037) {
	    ((ar) this).O = ((ar) this).M = 1.0F;
	    ((ar) this).P = true;
	} else {
	    ((ar) this).P = false;
	    ((ar) this).O = (float) i_5_;
	    ((ar) this).M = (float) i_6_;
	}
    }
    
    ar(qj var_qj, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
       boolean bool) {
	super(var_qj, 3553, i, i_8_, i_11_, i_12_);
	((ar) this).T = i_9_;
	((ar) this).N = i_10_;
	((ar) this).M = (float) i_10_ / (float) i_12_;
	((ar) this).P = false;
	((ar) this).O = (float) i_9_ / (float) i_11_;
	this.a(false, (byte) -72, false);
    }
    
    ar(qj var_qj, int i, int i_13_, int i_14_, int i_15_) {
	super(var_qj, i, i_13_, i_14_, i_15_);
	((ar) this).N = i_15_;
	((ar) this).T = i_14_;
	if (((rg) this).i == 34037) {
	    ((ar) this).P = false;
	    ((ar) this).O = (float) i_14_;
	    ((ar) this).M = (float) i_15_;
	} else {
	    ((ar) this).O = ((ar) this).M = 1.0F;
	    ((ar) this).P = true;
	}
    }
    
    ar(qj var_qj, int i, int i_16_, int i_17_, boolean bool, int[] is) {
	super(var_qj, i, 6408, i_16_, i_17_, bool, is, true);
	((ar) this).N = i_17_;
	((ar) this).T = i_16_;
	if (((rg) this).i == 34037) {
	    ((ar) this).O = (float) i_16_;
	    ((ar) this).M = (float) i_17_;
	    ((ar) this).P = false;
	} else {
	    ((ar) this).P = true;
	    ((ar) this).O = ((ar) this).M = 1.0F;
	}
    }
    
    ar(qj var_qj, int i, int i_18_, int i_19_, int i_20_, int i_21_, byte[] is,
       int i_22_) {
	super(var_qj, 3553, i, i_20_, i_21_);
	((ar) this).T = i_18_;
	((ar) this).N = i_19_;
	this.a(0, i_22_, 0, 0, true, i_19_, 3314, 0, is, i_18_);
	((ar) this).O = (float) i_18_ / (float) i_20_;
	((ar) this).P = false;
	((ar) this).M = (float) i_19_ / (float) i_21_;
	this.a(false, (byte) -96, false);
    }
    
    ar(qj var_qj, int i, int i_23_, int i_24_, int i_25_, int i_26_,
       boolean bool) {
	super(var_qj, i, i_23_, i_24_, i_25_, i_26_);
	((ar) this).T = i_25_;
	if (((rg) this).i == 34037) {
	    ((ar) this).P = false;
	    ((ar) this).O = (float) i_25_;
	    ((ar) this).M = (float) i_26_;
	} else {
	    ((ar) this).O = ((ar) this).M = 1.0F;
	    ((ar) this).P = true;
	}
	((ar) this).N = i_26_;
    }
    
    ar(qj var_qj, int i, int i_27_, int i_28_, int i_29_, int[] is) {
	super(var_qj, 3553, 6408, i_28_, i_29_);
	((ar) this).N = i_27_;
	((ar) this).T = i;
	this.a(88, 0, 0, i, true, i_27_, 0, is, 0);
	((ar) this).P = false;
	((ar) this).M = (float) i_27_ / (float) i_29_;
	((ar) this).O = (float) i / (float) i_28_;
	this.a(false, (byte) -31, false);
    }
    
    static final long b(byte i, String string) {
	U++;
	int i_30_ = string.length();
	long l = 0L;
	if (i > -113)
	    b((byte) -80, null);
	for (int i_31_ = 0; i_30_ > i_31_; i_31_++)
	    l = (long) string.charAt(i_31_) + ((l << 5) - l);
	return l;
    }
    
    public static void e(int i) {
	S = null;
	if (i != 0)
	    a(62, (byte) -9);
    }
    
    static final boolean a(int i, byte i_32_) {
	if (i_32_ != 98)
	    a(96, (byte) -98);
	R++;
	if (i != (-i & i))
	    return false;
	return true;
    }
    
    static {
	Q = 0;
    }
}
