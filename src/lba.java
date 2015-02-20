/* lba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class lba extends mca
{
    static int H;
    static int I;
    static int J;
    static int K;
    static int L;
    static int M;
    static int N;
    static int O;
    static int P;
    static boolean Q = false;
    
    static final ao a(int i, int[] is, en var_en, int[] is_0_, int i_1_,
		      byte i_2_) {
	K++;
	if (i_2_ != 37)
	    Q = false;
	if (var_en.a(i_2_ ^ 0x3f, bt.g, NPCDef.hb)) {
	    byte[] is_3_ = new byte[i * i_1_];
	    for (int i_4_ = 0; i > i_4_; i_4_++) {
		int i_5_ = is_0_[i_4_] + i_4_ * i_1_;
		for (int i_6_ = 0; is[i_4_] > i_6_; i_6_++)
		    is_3_[i_5_++] = (byte) -1;
	    }
	    return new ao(var_en, i_1_, i, is_3_);
	}
	int[] is_7_ = new int[i_1_ * i];
	for (int i_8_ = 0; i > i_8_; i_8_++) {
	    int i_9_ = is_0_[i_8_] + i_1_ * i_8_;
	    for (int i_10_ = 0; i_10_ < is[i_8_]; i_10_++)
		is_7_[i_9_++] = -16777216;
	}
	return new ao(var_en, i_1_, i, is_7_);
    }
    
    final int[] a(int i, int j) {
	L++;
	int[] is = ((mca) this).s.a(j, true);
	int i_12_ = -112 % ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int[] is_13_ = this.a(j, false, 0);
	    for (int i_14_ = 0; i_14_ < fr.v; i_14_++)
		is[i_14_] = -is_13_[i_14_] + 4096;
	}
	return is;
    }
    
    final int[][] a(int i, boolean bool) {
	if (bool != true)
	    a(-124, (int) -114);
	J++;
	int[][] is = ((mca) this).B.a(i, -66);
	if (((td) ((mca) this).B).p) {
	    int[][] is_15_ = this.a(0, i, 0);
	    int[] is_16_ = is_15_[0];
	    int[] is_17_ = is_15_[1];
	    int[] is_18_ = is_15_[2];
	    int[] is_19_ = is[0];
	    int[] is_20_ = is[1];
	    int[] is_21_ = is[2];
	    for (int i_22_ = 0; fr.v > i_22_; i_22_++) {
		is_19_[i_22_] = -is_16_[i_22_] + 4096;
		is_20_[i_22_] = -is_17_[i_22_] + 4096;
		is_21_[i_22_] = 4096 - is_18_[i_22_];
	    }
	}
	return is;
    }
    
    static final boolean b(int i, int i_23_) {
	if (i != -18705)
	    return true;
	O++;
	if (i_23_ != 3 && i_23_ != 7 && i_23_ != 10)
	    return false;
	return true;
    }
    
    public lba() {
	super(1, false);
    }
    
    static final int b(int i, int i_24_, int i_25_, int i_26_) {
	M++;
	if (taa.b < 100)
	    return -2;
	int i_27_ = -2;
	int i_28_ = 2147483647;
	int i_29_ = i_26_ - kca.F;
	int i_30_ = i - kca.E;
	if (i_24_ >= -24)
	    Q = false;
	for (Class_vb class_vb = (Class_vb) kca.n.a((int) 118);
	     class_vb != null; class_vb = (Class_vb) kca.n.b((byte) 94)) {
	    if (((Class_vb) class_vb).o == i_25_) {
		int i_31_ = ((Class_vb) class_vb).m;
		int i_32_ = ((Class_vb) class_vb).n;
		int i_33_ = i_31_ + kca.F << 14 | kca.E + i_32_;
		int i_34_ = ((i_29_ - i_31_) * (i_29_ - i_31_)
			     + (i_30_ - i_32_) * (i_30_ - i_32_));
		if (i_27_ < 0 || i_28_ > i_34_) {
		    i_28_ = i_34_;
		    i_27_ = i_33_;
		}
	    }
	}
	return i_27_;
    }
    
    static final byte[] a(int i, byte i_35_) {
	H++;
	if (i_35_ != -97)
	    return null;
	sk var_sk = (sk) wl.d.a((byte) 117, (long) i);
	if (var_sk == null) {
	    byte[] is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_36_ = 0; i_36_ < 255; i_36_++)
		is[i_36_] = (byte) i_36_;
	    for (int i_37_ = 0; i_37_ < 255; i_37_++) {
		int i_38_ = -i_37_ + 255;
		int i_39_ = it.a(random, i_38_, 126);
		byte i_40_ = is[i_39_];
		is[i_39_] = is[i_38_];
		is[i_38_] = is[-i_37_ + 511] = i_40_;
	    }
	    var_sk = new sk(is);
	    wl.d.a(var_sk, false, (long) i);
	}
	return ((sk) var_sk).t;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    P++;
	    if (j == 0)
		((mca) this).m = bytesParser.readUnsignedByte(i - 9269) == 1;
	}
    }
    
    static final void b(int i, boolean bool) {
	if (!bool || kca.c == null)
	    caa.I = -1;
	else
	    caa.I = ((eaa) kca.c).t;
	I++;
	bg.c = null;
	taa.b = 0;
	kca.c = null;
	nr.b = null;
	kca.a();
	kca.n.d(2);
	fw.Jb = null;
	pga.h = null;
	dea.c = null;
	pr.H = -1;
	Class_db.l = null;
	mfa.a = null;
	Class_k.Q = -1;
	sk.s = null;
	hp.F = null;
	al.o = null;
	if (i > 50) {
	    kca.r = null;
	    Class_md.g = null;
	    if (kca.a != null) {
		kca.a.b((byte) 124);
		kca.a.a(64, true, 128);
	    }
	    if (kca.e != null)
		kca.e.a(64, 64, false);
	    if (kca.f != null)
		kca.f.a((int) 55, (int) 64);
	    bw.t.a((int) -125, (int) 64);
	}
    }
}
