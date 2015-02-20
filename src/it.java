/* it - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class it extends pp
{
    static int s;
    int t;
    static int u;
    static int v;
    int[] w;
    static int x;
    int y;
    il[] z;
    int A;
    int B;
    int[] C;
    qfa D;
    static GameInPacket incomingPacket45 = new GameInPacket(45, 19);
    static int F;
    String[] G;
    static int H;
    String I;
    static int[][] J;
    static int K = -1;
    static int L;
    static GameOutPacket M;
    static int N;
    
    static final void b(byte i) {
	F++;
	kba.o.c((byte) 41);
	if (i != 25)
	    incomingPacket45 = null;
    }
    
    static final int a(int i, int i_0_) {
	if (i != -24420)
	    return 1;
	H++;
	int i_1_ = 0;
	if (i_0_ < 0 || i_0_ >= 65536) {
	    i_0_ >>>= 16;
	    i_1_ += 16;
	}
	if (i_0_ >= 256) {
	    i_1_ += 8;
	    i_0_ >>>= 8;
	}
	if (i_0_ >= 16) {
	    i_0_ >>>= 4;
	    i_1_ += 4;
	}
	if (i_0_ >= 4) {
	    i_1_ += 2;
	    i_0_ >>>= 2;
	}
	if (i_0_ >= 1) {
	    i_0_ >>>= 1;
	    i_1_++;
	}
	return i_0_ + i_1_;
    }
    
    static final void a(byte i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_) {
	li.z = i_6_;
	hp.z = i_2_;
	pm.s = i_5_;
	ItemDefLoader.d = i_4_;
	ko.c = i_3_;
	x++;
	if (li.z >= 100) {
	    int i_7_ = 512 * ko.c + 256;
	    int i_8_ = ItemDefLoader.d * 512 + 256;
	    int i_9_ = Class_u.b(i_7_, vo.clientHeight, -20214, i_8_) - pm.s;
	    int i_10_ = i_7_ - dg.gb;
	    int i_11_ = i_9_ - us.e;
	    int i_12_ = i_8_ - ada.N;
	    int i_13_
		= (int) Math.sqrt((double) (i_10_ * i_10_ + i_12_ * i_12_));
	    mba.e = 0x3fff & (int) (2607.5945876176133
				    * Math.atan2((double) i_11_,
						 (double) i_13_));
	    gn.G = (int) (Math.atan2((double) i_10_, (double) i_12_)
			  * -2607.5945876176133) & 0x3fff;
	    if (mba.e < 1024)
		mba.e = 1024;
	    GPIPlayer.e = 0;
	    if (mba.e > 3072)
		mba.e = 3072;
	}
	ja.Cc = dj.o = -1;
	ll.x = 2;
	int i_14_ = 17 % ((i - 37) / 36);
    }
    
    static final void a(pl var_pl, int i) {
	u++;
	mh.m = var_pl.a("hitmarks", (int) -62);
	vca.k = var_pl.a("hitbar_default", (int) -86);
	ida.k = var_pl.a("timerbar_default", (int) 73);
	bfa.y = var_pl.a("headicons_pk", (int) 95);
	mm.s = var_pl.a("headicons_prayer", (int) -72);
	od.qb = var_pl.a("hint_headicons", (int) -97);
	fs.b = var_pl.a("hint_mapmarkers", (int) -94);
	sp.w = var_pl.a("mapflag", i ^ ~0x52cb);
	ke.G = var_pl.a("cross", i ^ 0x529f);
	dg.Eb = var_pl.a("mapdots", (int) -77);
	ko.h = var_pl.a("scrollbar", (int) 46);
	el.c = var_pl.a("name_icons", (int) 126);
	if (i != -21243)
	    a(true);
	qaa.Q = var_pl.a("floorshadows", (int) 41);
	vu.g = var_pl.a("compass", (int) -65);
	bq.h = var_pl.a("otherlevel", (int) -66);
	mw.H = var_pl.a("hint_mapedge", (int) 82);
    }
    
    static final int a(Random random, int i, int i_15_) {
	s++;
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (ar.a(i, (byte) 98))
	    return (int) ((long) i * (0xffffffffL & (long) random.nextInt())
			  >> 32);
	int i_16_ = -(int) (4294967296L % (long) i) - -2147483648;
	int i_17_;
	do
	    i_17_ = random.nextInt();
	while (i_17_ >= i_16_);
	if (i_15_ < 120)
	    a(23, -94);
	return tg.a(i, 67, i_17_);
    }
    
    public static void a(boolean bool) {
	M = null;
	incomingPacket45 = null;
	J = null;
	if (bool != false)
	    a(null, 38, 80);
    }
    
    public it() {
	/* empty */
    }
    
    static {
	J = new int[128][128];
	L = 1;
	M = new GameOutPacket(76, 4);
	N = -1;
    }
}
