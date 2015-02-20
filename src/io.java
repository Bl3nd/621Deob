/* io - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class io extends mca
{
    private int[] H;
    private int I;
    static sca J = new sca(8);
    static int K;
    static int L;
    static int M;
    static int N;
    static f P;
    private int Q;
    static float R;
    static int S;
    static int T;
    private int U = -1;
    static f[] V;
    static int W;
    static int X;
    static int[] Y = new int[2];
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	T++;
	if (i_3_ != 29830)
	    i(-68);
	if (((jb) cs.g).I != 0 && i_1_ != 0 && je.i < 50
	    && (i_0_ ^ 0xffffffff) != 0)
	    tn.j[je.i++] = new vt((byte) 1, i_0_, i_1_, i_2_, i, 0);
    }
    
    public static void i(int i) {
	Y = null;
	J = null;
	if (i == -28916) {
	    P = null;
	    V = null;
	}
    }
    
    final int[][] a(int i, boolean bool) {
	L++;
	int[][] is = ((mca) this).B.a(i, -81);
	if (bool != true)
	    b((byte) 56);
	if (((td) ((mca) this).B).p) {
	    int i_4_ = I * (Q != od.pb ? Q * i / od.pb : i);
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    if (I != fr.v) {
		for (int i_8_ = 0; fr.v > i_8_; i_8_++) {
		    int i_9_ = i_8_ * I / fr.v;
		    int i_10_ = H[i_9_ + i_4_];
		    is_7_[i_8_] = uca.a(255, i_10_) << 4;
		    is_6_[i_8_] = uca.a(4080, i_10_ >> 4);
		    is_5_[i_8_] = uca.a(i_10_ >> 12, 4080);
		}
	    } else {
		for (int i_11_ = 0; i_11_ < fr.v; i_11_++) {
		    int i_12_ = H[i_4_++];
		    is_7_[i_11_] = uca.a(4080, i_12_ << 4);
		    is_6_[i_11_] = uca.a(65280, i_12_) >> 4;
		    is_5_[i_11_] = uca.a(4080, i_12_ >> 12);
		}
	    }
	}
	return is;
    }
    
    final int b(byte b) {
	int i_13_ = 41 % ((b - 10) / 46);
	W++;
	return U;
    }
    
    static final void j(int i) {
	if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") == -1) {
	    mca.E[93] = 43;
	    if (Signlink.setFocusTraversalKeysEnabled == null) {
		mca.E[222] = 59;
		mca.E[192] = 58;
	    } else {
		mca.E[222] = 58;
		mca.E[192] = 28;
		mca.E[520] = 59;
	    }
	    mca.E[46] = 72;
	    mca.E[92] = 74;
	    mca.E[47] = 73;
	    mca.E[44] = 71;
	    mca.E[59] = 57;
	    mca.E[45] = 26;
	    mca.E[91] = 42;
	    mca.E[61] = 27;
	} else {
	    mca.E[222] = 59;
	    mca.E[220] = 74;
	    mca.E[191] = 73;
	    mca.E[187] = 27;
	    mca.E[219] = 42;
	    mca.E[190] = 72;
	    mca.E[221] = 43;
	    mca.E[188] = 71;
	    mca.E[223] = 28;
	    mca.E[189] = 26;
	    mca.E[192] = 58;
	    mca.E[186] = 57;
	}
	N++;
	if (i != -15630)
	    a(62, 34, -29, -125, -8);
    }
    
    final void a(int i, byte b, int j) {
	M++;
	super.a(i, (byte) -113, j);
	if (U >= 0 && pfa.b != null) {
	    int i_16_ = ((vca) pfa.b.a(U, (byte) 86)).p ? 64 : 128;
	    H = pfa.b.a(U, 1.0F, false, i_16_, -5969, i_16_);
	    I = i_16_;
	    Q = i_16_;
	}
	int i_17_ = -72 % ((b + 21) / 35);
    }
    
    final void a(int i) {
	if (i <= 42)
	    a(-51, (byte) 53, -34);
	super.a(115);
	S++;
	H = null;
    }
    
    public io() {
	super(0, false);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	K++;
	if (j == 0)
	    U = bytesParser.readShort(i + 13110);
	if (i != 1)
	    Y = null;
    }
    
    static {
	X = 0;
    }
}
