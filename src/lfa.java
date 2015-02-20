/* lfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class lfa
{
    int a;
    int b;
    static int c;
    rd d;
    static int e;
    static String[] f = new String[200];
    int g;
    static int h;
    boolean i;
    boolean j;
    static int k;
    static int l;
    boolean m = false;
    int n;
    Runnable o;
    private nga p;
    static int q;
    static int r;
    int s;
    static int t;
    int[] u;
    int[] v;
    int[] w;
    int[] x;
    rw y;
    int z;
    int[] A;
    int[] B;
    rw C;
    int D;
    rw E;
    rw F;
    rw G;
    int[] H;
    int[] I;
    int[] J;
    rw K;
    int[] L;
    int[] M;
    int[] N;
    int[] O;
    int[] P;
    jea Q;
    rw R;
    int[] S;
    int[] T;
    int[] U;
    rw V;
    int[] W;
    rw X;
    int[] Y;
    rw Z;
    int[] ab;
    int bb;
    int[] cb;
    
    final void a(int i) {
	k++;
	if (i < 51)
	    ((lfa) this).B = null;
	((lfa) this).Q = new jea(p, this);
    }
    
    static final int a(int i, int i_0_, int i_1_) {
	i_0_ = (0x7f & i_1_) * i_0_ >> 7;
	l++;
	if (i_0_ < 2)
	    i_0_ = 2;
	else if (i_0_ > 126)
	    i_0_ = 126;
	int i_2_ = 17 / ((-33 - i) / 54);
	return i_0_ + (0xff80 & i_1_);
    }
    
    public static void a(byte i) {
	f = null;
	if (i <= 1)
	    r = 15;
    }
    
    static final void b(byte i) {
	if (i != -10)
	    c = -127;
	t++;
	int i_3_ = 0;
	if (cs.g != null)
	    i_3_ = cs.g.a(on.performance, (byte) -119);
	if (i_3_ != 2) {
	    if (i_3_ != 1) {
		vh.yLoc = 0;
		ia.xLoc = 0;
		ff.width = rda.width;
		eh.height = Class_jg.height;
	    } else {
		int i_4_ = rda.width > 1024 ? 1024 : rda.width;
		ff.width = i_4_;
		ia.xLoc = (rda.width - i_4_) / 2;
		int i_5_ = Class_jg.height > 768 ? 768 : Class_jg.height;
		eh.height = i_5_;
		vh.yLoc = 0;
	    }
	} else {
	    int i_6_ = rda.width > 800 ? 800 : rda.width;
	    ia.xLoc = (rda.width - i_6_) / 2;
	    int i_7_ = Class_jg.height <= 600 ? Class_jg.height : 600;
	    ff.width = i_6_;
	    vh.yLoc = 0;
	    eh.height = i_7_;
	}
    }
    
    final void a(Runnable runnable, int i) {
	int i_8_ = 20 / ((i + 82) / 44);
	((lfa) this).o = runnable;
	q++;
    }
    
    static final void b(int i) {
	h++;
	faa.loginStream.initBits(8);
	int i_9_ = faa.loginStream.readBits(false, 8);
	if (ps.npcCount > i_9_) {
	    for (int i_10_ = i_9_; ps.npcCount > i_10_; i_10_++)
		ba.b[iq.i++] = gfa.npcIndices[i_10_];
	}
	if (i != -32416)
	    a(42, 94, 110);
	if (i_9_ > ps.npcCount)
	    throw new RuntimeException("gnpov1");
	ps.npcCount = 0;
	for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
	    int i_12_ = gfa.npcIndices[i_11_];
	    NPC class_ac = ((NPCNode) (NPCNode) uo.a.a(-32748, (long) i_12_)).l;
	    int i_13_ = faa.loginStream.readBits(false, 1);
	    if (i_13_ == 0) {
		gfa.npcIndices[ps.npcCount++] = i_12_;
		((Entity) class_ac).U = pm.currentTimedTicks;
	    } else {
		int i_14_ = faa.loginStream.readBits(false, 2);
		if (i_14_ == 0) {
		    gfa.npcIndices[ps.npcCount++] = i_12_;
		    ((Entity) class_ac).U = pm.currentTimedTicks;
		    sk.v[pfa.e++] = i_12_;
		} else if (i_14_ == 1) {
		    gfa.npcIndices[ps.npcCount++] = i_12_;
		    ((Entity) class_ac).U = pm.currentTimedTicks;
		    int i_15_ = faa.loginStream.readBits(false, 3);
		    class_ac.a(i_15_, 1, (byte) -79);
		    int i_16_ = faa.loginStream.readBits(false, 1);
		    if (i_16_ == 1)
			sk.v[pfa.e++] = i_12_;
		} else if (i_14_ == 2) {
		    gfa.npcIndices[ps.npcCount++] = i_12_;
		    ((Entity) class_ac).U = pm.currentTimedTicks;
		    if (faa.loginStream.readBits(false, 1) == 1) {
			int i_17_ = faa.loginStream.readBits(false, 3);
			class_ac.a(i_17_, 2, (byte) -79);
			int i_18_ = faa.loginStream.readBits(false, 3);
			class_ac.a(i_18_, 2, (byte) -79);
		    } else {
			int i_19_ = faa.loginStream.readBits(false, 3);
			class_ac.a(i_19_, 0, (byte) -79);
		    }
		    int i_20_ = faa.loginStream.readBits(false, 1);
		    if (i_20_ == 1)
			sk.v[pfa.e++] = i_12_;
		} else if (i_14_ == 3)
		    ba.b[iq.i++] = i_12_;
	    }
	}
    }
    
    lfa(nga var_nga) {
	((lfa) this).i = true;
	((lfa) this).g = 0;
	((lfa) this).b = 0;
	((lfa) this).n = 0;
	((lfa) this).s = 0;
	((lfa) this).d = new rd();
	((lfa) this).x = new int[10];
	((lfa) this).B = new int[64];
	((lfa) this).w = new int[8];
	((lfa) this).N = new int[rw.jb];
	((lfa) this).L = new int[10];
	((lfa) this).U = new int[64];
	((lfa) this).v = new int[rw.jb];
	((lfa) this).O = new int[10000];
	((lfa) this).J = new int[rw.jb];
	((lfa) this).S = new int[64];
	((lfa) this).u = new int[64];
	((lfa) this).Y = new int[10000];
	((lfa) this).A = new int[10];
	((lfa) this).P = new int[10];
	((lfa) this).I = new int[rw.jb];
	((lfa) this).M = new int[8];
	((lfa) this).ab = new int[8];
	((lfa) this).W = new int[rw.jb];
	((lfa) this).cb = new int[rw.jb];
	((lfa) this).H = new int[rw.jb];
	p = var_nga;
	((lfa) this).a = ((nga) p).W - 255;
	((lfa) this).Q = new jea(var_nga, this);
	((lfa) this).G = new rw(p);
	((lfa) this).Z = new rw(p);
	((lfa) this).E = new rw(p);
	((lfa) this).X = new rw(p);
	((lfa) this).R = new rw(p);
	((lfa) this).C = new rw(p);
	((lfa) this).K = new rw(p);
	((lfa) this).y = new rw(p);
	((lfa) this).F = new rw(p);
	((lfa) this).V = new rw(p);
	((lfa) this).T = new int[rw.L];
	for (int i = 0; i < rw.L; i++)
	    ((lfa) this).T[i] = -1;
    }
}
