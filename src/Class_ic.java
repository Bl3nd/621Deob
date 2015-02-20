/* Class_ic - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ic extends mca
{
    static bea H;
    private int I;
    static int J;
    private int L = 0;
    static int M;
    static int N;
    static GameInPacket incomingPacket21;
    static int P = -1;
    private int Q;
    static int R;
    static int S;
    
    public Class_ic() {
	super(0, true);
	I = 0;
	Q = 1;
    }
    
    static final void a(int i, Interface var_kp, int i_0_, boolean bool, int i_1_) {
	M++;
	int i_2_ = ((Interface) var_kp).minHScroll;
	if (((Interface) var_kp).f != 0) {
	    if (((Interface) var_kp).f == 1)
		((Interface) var_kp).minHScroll = i_1_ - ((Interface) var_kp).width;
	    else if (((Interface) var_kp).f == 2)
		((Interface) var_kp).minHScroll = i_1_ * ((Interface) var_kp).width >> 14;
	} else
	    ((Interface) var_kp).minHScroll = ((Interface) var_kp).width;
	int i_3_ = ((Interface) var_kp).minVScroll;
	if (((Interface) var_kp).o == 0)
	    ((Interface) var_kp).minVScroll = ((Interface) var_kp).height;
	else if (((Interface) var_kp).o == 1)
	    ((Interface) var_kp).minVScroll = i - ((Interface) var_kp).height;
	else if (((Interface) var_kp).o == 2)
	    ((Interface) var_kp).minVScroll = ((Interface) var_kp).height * i >> 14;
	if (((Interface) var_kp).f == 4)
	    ((Interface) var_kp).minHScroll
		= ((Interface) var_kp).minVScroll * ((Interface) var_kp).Rb / ((Interface) var_kp).Uc;
	if (((Interface) var_kp).o == 4)
	    ((Interface) var_kp).minVScroll
		= ((Interface) var_kp).minHScroll * ((Interface) var_kp).Uc / ((Interface) var_kp).Rb;
	if (lba.Q
	    && (((nm) client.c(var_kp)).l != 0 || ((Interface) var_kp).type == 0)) {
	    if (((Interface) var_kp).minVScroll < 5 && ((Interface) var_kp).minHScroll < 5) {
		((Interface) var_kp).minHScroll = 5;
		((Interface) var_kp).minVScroll = 5;
	    } else {
		if (((Interface) var_kp).minVScroll <= 0)
		    ((Interface) var_kp).minVScroll = 5;
		if (((Interface) var_kp).minHScroll <= 0)
		    ((Interface) var_kp).minHScroll = 5;
	    }
	}
	if (((Interface) var_kp).v == lp.f)
	    tj.h = var_kp;
	if (i_0_ != 23054)
	    P = 71;
	if (bool && ((Interface) var_kp).rd != null
	    && (i_2_ != ((Interface) var_kp).minHScroll || ((Interface) var_kp).minVScroll != i_3_)) {
	    ClientScript var_mea = new ClientScript();
	    ((ClientScript) var_mea).objects = ((Interface) var_kp).rd;
	    ((ClientScript) var_mea).interface_ = var_kp;
	    to.b.b(var_mea, (byte) 93);
	}
    }
    
    final void b(int i) {
	int i_4_ = -67 % ((64 - i) / 60);
	J++;
	lp.d(0);
    }
    
    static final void a(int i, int i_5_, byte[] is, int i_6_, byte[] is_7_,
			int i_8_, int i_9_, int i_10_, int i_11_) {
	R++;
	int i_12_ = -(i >> 2);
	int i_13_ = 88 / ((-11 - i_11_) / 59);
	i = -(i & 0x3);
	for (int i_14_ = -i_9_; i_14_ < 0; i_14_++) {
	    for (int i_15_ = i_12_; i_15_ < 0; i_15_++) {
		is[i_10_++] -= is_7_[i_6_++];
		is[i_10_++] -= is_7_[i_6_++];
		is[i_10_++] -= is_7_[i_6_++];
		is[i_10_++] -= is_7_[i_6_++];
	    }
	    for (int i_16_ = i; i_16_ < 0; i_16_++)
		is[i_10_++] -= is_7_[i_6_++];
	    i_10_ += i_8_;
	    i_6_ += i_5_;
	}
    }
    
    public static void i(int i) {
	if (i != 0)
	    P = 104;
	H = null;
	incomingPacket21 = null;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_18_ = j;
    while_56_:
	do {
	    do {
		if (i_18_ != 0) {
		    if (i_18_ != 1) {
			if (i_18_ == 3)
			    break;
			break while_56_;
		    }
		} else {
		    L = bytesParser.readUnsignedByte(-9268);
		    break while_56_;
		}
		I = bytesParser.readUnsignedByte(-9268);
		break while_56_;
	    } while (false);
	    Q = bytesParser.readUnsignedByte(i ^ ~0x2432);
	} while (false);
	S++;
	if (i != 1)
	    a(17, (BytesParser) null, 78);
    }
    
    final int[] a(int i, int j) {
	N++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int i_20_ = Class_i.i[j];
	    int i_21_ = i_20_ - 2048 >> 1;
	    for (int i_22_ = 0; fr.v > i_22_; i_22_++) {
		int i_23_ = js.p[i_22_];
		int i_24_ = i_23_ - 2048 >> 1;
		int i_25_;
		if (L == 0)
		    i_25_ = (i_23_ - i_20_) * Q;
		else {
		    int i_26_ = i_21_ * i_21_ + i_24_ * i_24_ >> 12;
		    i_25_
			= (int) (Math.sqrt((double) ((float) i_26_ / 4096.0F))
				 * 4096.0);
		    i_25_ = (int) (3.141592653589793 * (double) (Q * i_25_));
		}
		i_25_ -= i_25_ & ~0xfff;
		if (I == 0)
		    i_25_ = vh.d[(i_25_ & 0xff6) >> 4] + 4096 >> 1;
		else if (I == 2) {
		    i_25_ -= 2048;
		    if (i_25_ < 0)
			i_25_ = -i_25_;
		    i_25_ = 2048 - i_25_ << 1;
		}
		is[i_22_] = i_25_;
	    }
	}
	int i_27_ = 47 / ((i - 81) / 36);
	return is;
    }
    
    static {
	incomingPacket21 = new GameInPacket(21, 7);
    }
}
