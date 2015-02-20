/* bb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class bb extends la
{
    private en B;
    private nba C;
    private boolean D;
    private ls E;
    
    bb(en var_en, sa var_sa, aga[] var_agas, boolean bool) {
	super(var_en, var_sa);
	B = var_en;
	int i = 0;
	for (int i_0_ = 0; i_0_ < 256; i_0_++) {
	    aga var_aga = var_agas[i_0_];
	    if (((aga) var_aga).d > i)
		i = ((aga) var_aga).d;
	    if (((aga) var_aga).b > i)
		i = ((aga) var_aga).b;
	}
	int i_1_ = i * 16;
	if (bool) {
	    byte[] is = new byte[i_1_ * i_1_];
	    for (int i_2_ = 0; i_2_ < 256; i_2_++) {
		aga var_aga = var_agas[i_2_];
		int i_3_ = ((aga) var_aga).d;
		int i_4_ = ((aga) var_aga).b;
		int i_5_ = i_2_ % 16 * i;
		int i_6_ = i_2_ / 16 * i;
		int i_7_ = i_6_ * i_1_ + i_5_;
		int i_8_ = 0;
		if (((aga) var_aga).f == null) {
		    byte[] is_9_ = ((aga) var_aga).c;
		    for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
			for (int i_11_ = 0; i_11_ < i_4_; i_11_++)
			    is[i_7_++] = (byte) (is_9_[i_8_++] == 0 ? 0 : -1);
			i_7_ += i_1_ - i_4_;
		    }
		} else {
		    byte[] is_12_ = ((aga) var_aga).f;
		    for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
			for (int i_14_ = 0; i_14_ < i_4_; i_14_++)
			    is[i_7_++] = is_12_[i_8_++];
			i_7_ += i_1_ - i_4_;
		    }
		}
	    }
	    if (!var_en.a(79, bt.g, NPCDef.hb)) {
		int[] is_15_ = new int[is.length];
		for (int i_16_ = 0; i_16_ < is.length; i_16_++)
		    is_15_[i_16_] = is[i_16_] << 24;
		E = var_en.a(i_1_, false, i_1_, is_15_, (byte) 119);
	    } else
		E = var_en.a(is, i_1_, i_1_, NPCDef.hb, false, (byte) 73);
	    D = true;
	} else {
	    int[] is = new int[i_1_ * i_1_];
	    for (int i_17_ = 0; i_17_ < 256; i_17_++) {
		aga var_aga = var_agas[i_17_];
		int[] is_18_ = ((aga) var_aga).i;
		byte[] is_19_ = ((aga) var_aga).f;
		byte[] is_20_ = ((aga) var_aga).c;
		int i_21_ = ((aga) var_aga).d;
		int i_22_ = ((aga) var_aga).b;
		int i_23_ = i_17_ % 16 * i;
		int i_24_ = i_17_ / 16 * i;
		int i_25_ = i_24_ * i_1_ + i_23_;
		int i_26_ = 0;
		if (is_19_ != null) {
		    for (int i_27_ = 0; i_27_ < i_21_; i_27_++) {
			for (int i_28_ = 0; i_28_ < i_22_; i_28_++) {
			    is[i_25_++] = (is_19_[i_26_] << 24
					   | is_18_[is_20_[i_26_] & 0xff]);
			    i_26_++;
			}
			i_25_ += i_1_ - i_22_;
		    }
		} else {
		    for (int i_29_ = 0; i_29_ < i_21_; i_29_++) {
			for (int i_30_ = 0; i_30_ < i_22_; i_30_++) {
			    int i_31_;
			    if ((i_31_ = is_20_[i_26_++]) != 0)
				is[i_25_++] = ~0xffffff | is_18_[i_31_ & 0xff];
			    else
				i_25_++;
			}
			i_25_ += i_1_ - i_22_;
		    }
		}
	    }
	    E = var_en.a(i_1_, false, i_1_, is, (byte) 112);
	    D = false;
	}
	E.a(eg.T, 15590);
	C = var_en.a(false, false);
	C.a(-90, 20, 20480);
	for (int i_32_ = 0; i_32_ < 4; i_32_++) {
	    Buffer buffer = C.a(true, 32726);
	    if (buffer != null) {
		Stream stream = B.a(buffer, 110);
		float f = E.a(false, (float) i_1_) / (float) i_1_;
		float f_33_ = E.a((float) i_1_, (byte) -59) / (float) i_1_;
		for (int i_34_ = 0; i_34_ < 256; i_34_++) {
		    aga var_aga = var_agas[i_34_];
		    int i_35_ = ((aga) var_aga).d;
		    int i_36_ = ((aga) var_aga).b;
		    int i_37_ = ((aga) var_aga).g;
		    int i_38_ = ((aga) var_aga).e;
		    float f_39_ = (float) (i_34_ % 16 * i);
		    float f_40_ = (float) (i_34_ / 16 * i);
		    float f_41_ = f_39_ * f;
		    float f_42_ = f_40_ * f_33_;
		    float f_43_ = (f_39_ + (float) i_36_) * f;
		    float f_44_ = (f_40_ + (float) i_35_) * f_33_;
		    if (Stream.a()) {
			stream.a((float) i_38_);
			stream.a((float) i_37_);
			stream.a(0.0F);
			stream.a(f_41_);
			stream.a(f_42_);
			stream.a((float) i_38_);
			stream.a((float) (i_37_ + i_35_));
			stream.a(0.0F);
			stream.a(f_41_);
			stream.a(f_44_);
			stream.a((float) (i_38_ + i_36_));
			stream.a((float) (i_37_ + i_35_));
			stream.a(0.0F);
			stream.a(f_43_);
			stream.a(f_44_);
			stream.a((float) (i_38_ + i_36_));
			stream.a((float) i_37_);
			stream.a(0.0F);
			stream.a(f_43_);
			stream.a(f_42_);
		    } else {
			stream.b((float) i_38_);
			stream.b((float) i_37_);
			stream.b(0.0F);
			stream.b(f_41_);
			stream.b(f_42_);
			stream.b((float) i_38_);
			stream.b((float) (i_37_ + i_35_));
			stream.b(0.0F);
			stream.b(f_41_);
			stream.b(f_44_);
			stream.b((float) (i_38_ + i_36_));
			stream.b((float) (i_37_ + i_35_));
			stream.b(0.0F);
			stream.b(f_43_);
			stream.b(f_44_);
			stream.b((float) (i_38_ + i_36_));
			stream.b((float) i_37_);
			stream.b(0.0F);
			stream.b(f_43_);
			stream.b(f_42_);
		    }
		}
		stream.c();
		if (C.a(115))
		    break;
	    }
	}
    }
    
    final void a(char c, int i, int i_45_, int i_46_, boolean bool, ua var_ua,
		 int i_47_, int i_48_) {
	/* empty */
    }
    
    final void OA(char c, int i, int i_49_, int i_50_, boolean bool) {
	B.j(true);
	B.a(E, 0);
	if (D || bool) {
	    B.a(ku.k, true, Class_rf.e);
	    B.a(0, 1, ik.o);
	    B.c((byte) 48, i_50_);
	} else
	    B.a(ku.k, true, ku.k);
	mga var_mga = B.Y(12083);
	var_mga.NA(i, i_49_, 0);
	B.T(-114);
	B.a((byte) -16, C, 0);
	B.a(true, ((en) B).Yf);
	B.a(mm.x, c * '\004', 2, 28463);
	if (D || bool)
	    B.a(0, 1, mca.l);
    }
}
