/* cq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cq extends mca
{
    static int I;
    static int J;
    static int K;
    private Class_pb[] L;
    static int M;
    static int N;
    static int O;
    static int P;
    
    public cq() {
	super(0, true);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (j != 0) {
	    if (j == 1)
		((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	} else {
	    L = new Class_pb[bytesParser.readUnsignedByte(-9268)];
	    int i_1_ = 0;
	while_21_:
	    for (/**/; L.length > i_1_; i_1_++) {
		int i_2_ = bytesParser.readUnsignedByte(i - 9269);
		int i_3_ = i_2_;
	    while_19_:
		do {
		    do {
			if (i_3_ != 0) {
			    if (i_3_ != 1) {
				if (i_3_ != 2) {
				    if (i_3_ != 3)
					continue while_21_;
				} else
				    break;
				break while_19_;
			    }
			} else {
			    L[i_1_] = qh.a(bytesParser, 60);
			    continue while_21_;
			}
			L[i_1_] = vk.a((byte) -58, bytesParser);
			continue while_21_;
		    } while (false);
		    L[i_1_] = wd.a((byte) 1, bytesParser);
		    continue while_21_;
		} while (false);
		L[i_1_] = dq.a(bytesParser, false);
	    }
	}
	if (i == 1)
	    M++;
    }
    
    final int[][] a(int i, boolean bool) {
	K++;
	int[][] is = ((mca) this).B.a(i, -68);
	if (bool != true)
	    a(48, (BytesParser) null, -105);
	if (((td) ((mca) this).B).p) {
	    int i_4_ = fr.v;
	    int i_5_ = od.pb;
	    int[][] is_6_ = new int[i_5_][i_4_];
	    int[][][] is_7_ = ((mca) this).B.a(0);
	    a((byte) -112, is_6_);
	    for (int i_8_ = 0; od.pb > i_8_; i_8_++) {
		int[] is_9_ = is_6_[i_8_];
		int[][] is_10_ = is_7_[i_8_];
		int[] is_11_ = is_10_[0];
		int[] is_12_ = is_10_[1];
		int[] is_13_ = is_10_[2];
		for (int i_14_ = 0; i_14_ < fr.v; i_14_++) {
		    int i_15_ = is_9_[i_14_];
		    is_13_[i_14_] = uca.a(i_15_ << 4, 4080);
		    is_12_[i_14_] = uca.a(65280, i_15_) >> 4;
		    is_11_[i_14_] = uca.a(i_15_, 16711680) >> 12;
		}
	    }
	}
	return is;
    }
    
    final int[] a(int i, int j) {
	int i_17_ = -60 % ((i - 81) / 36);
	J++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o)
	    a((byte) 5, ((mca) this).s.a(false));
	return is;
    }
    
    static final int a(String string, byte i) {
	O++;
	if (i != 2)
	    return 39;
	return string.length() + 1;
    }
    
    private final void a(byte i, int[][] is) {
	I++;
	int i_18_ = fr.v;
	int i_19_ = od.pb;
	lp.a(is, 100);
	int i_20_ = -36 % ((i + 45) / 49);
	pm.a(qf.g, 0, 0, bc.d, 0);
	if (L != null) {
	    for (int i_21_ = 0; i_21_ < L.length; i_21_++) {
		Class_pb class_pb = L[i_21_];
		int i_22_ = ((Class_pb) class_pb).f;
		int i_23_ = ((Class_pb) class_pb).c;
		if (i_22_ >= 0) {
		    if (i_23_ < 0)
			class_pb.a(i_18_, -21716, i_19_);
		    else
			class_pb.a(i_18_, (byte) -34, i_19_);
		} else if (i_23_ >= 0)
		    class_pb.b(i_19_, i_18_, 4);
	    }
	}
    }
    
    static final String getColorForPlayerName(int otherPlayersCombatLevel, boolean bool, int thisPlayersCombatLevel) {
	P++;
	int levelDifference = thisPlayersCombatLevel - otherPlayersCombatLevel;
	if (levelDifference < -9)
	    return "<col=ff0000>";
	if (levelDifference < -6)
	    return "<col=ff3000>";
	if (levelDifference < -3)
	    return "<col=ff7000>";
	if (levelDifference < 0)
	    return "<col=ffb000>";
	if (levelDifference > 9)
	    return "<col=00ff00>";
	if (levelDifference > 6)
	    return "<col=40ff00>";
	if (levelDifference > 3)
	    return "<col=80ff00>";
	if (bool != true)
	    a((String) null, (byte) -118);
	if (levelDifference > 0)
	    return "<col=c0ff00>";
	return "<col=ffff00>";
    }
    
    static final wd a(int i, int i_26_, byte i_27_) {
	if (i_27_ >= -64)
	    return null;
	N++;
	wd var_wd = new wd();
	((wd) var_wd).x = i_26_ + 1 + 5;
	((wd) var_wd).o = -1;
	((wd) var_wd).w = -1;
	((wd) var_wd).j = i + 1 + 5;
	((wd) var_wd).e = new int[((wd) var_wd).x][((wd) var_wd).j];
	var_wd.a(2097152);
	return var_wd;
    }
}
