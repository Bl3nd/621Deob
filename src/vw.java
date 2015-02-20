/* vw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vw extends Node
{
    byte[] k;
    il l;
    
    final void a() {
	if (((vw) this).l == null) {
	    ((vw) this).l = new il(16);
	    int[] is = new int[16];
	    int[] is_0_ = new int[16];
	    is[9] = is_0_[9] = 128;
	    si var_si = new si(((vw) this).k);
	    int i = var_si.a();
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		var_si.a(i_1_);
		var_si.b(i_1_);
		var_si.c(i_1_);
	    }
	while_241_:
	    for (;;) {
		int i_2_ = var_si.b();
		int i_3_ = ((si) var_si).d[i_2_];
		while (((si) var_si).d[i_2_] == i_3_) {
		    var_si.a(i_2_);
		    int i_4_ = var_si.e(i_2_);
		    if (i_4_ == 1) {
			var_si.g();
			var_si.c(i_2_);
			if (!var_si.e())
			    break;
			break while_241_;
		    }
		    int i_5_ = i_4_ & 0xf0;
		    if (i_5_ == 176) {
			int i_6_ = i_4_ & 0xf;
			int i_7_ = i_4_ >> 8 & 0x7f;
			int i_8_ = i_4_ >> 16 & 0x7f;
			if (i_7_ == 0)
			    is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
			if (i_7_ == 32)
			    is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
		    }
		    if (i_5_ == 192) {
			int i_9_ = i_4_ & 0xf;
			int i_10_ = i_4_ >> 8 & 0x7f;
			is_0_[i_9_] = is[i_9_] + i_10_;
		    }
		    if (i_5_ == 144) {
			int i_11_ = i_4_ & 0xf;
			int i_12_ = i_4_ >> 8 & 0x7f;
			int i_13_ = i_4_ >> 16 & 0x7f;
			if (i_13_ > 0) {
			    int i_14_ = is_0_[i_11_];
			    Class_kb class_kb
				= ((Class_kb)
				   ((vw) this).l.a(-32748, (long) i_14_));
			    if (class_kb == null) {
				class_kb = new Class_kb(new byte[128]);
				((vw) this).l.a(class_kb, (byte) -97,
						(long) i_14_);
			    }
			    ((Class_kb) class_kb).n[i_12_] = (byte) 1;
			}
		    }
		    var_si.b(i_2_);
		    var_si.c(i_2_);
		}
	    }
	}
    }
    
    static final vw a(pl var_pl, int i, int i_15_) {
	byte[] is = var_pl.b(i_15_, -3, i);
	if (is == null)
	    return null;
	return new vw(new BytesParser(is));
    }
    
    final void b() {
	((vw) this).l = null;
    }
    
    private vw(BytesParser var_es) {
        System.out.println("[vw]");
	((BytesParser) var_es).pos = ((BytesParser) var_es).bytes.length - 3;
	int i = var_es.readUnsignedByte(-9268);
	int i_16_ = var_es.readShort(13111);
	int i_17_ = i * 10 + 14;
	((BytesParser) var_es).pos = 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
	int i_25_ = 0;
    while_239_:
	for (int i_26_ = 0; i_26_ < i; i_26_++) {
	    int i_27_ = -1;
	    for (;;) {
		int i_28_ = var_es.readUnsignedByte(-9268);
		if (i_28_ != i_27_)
		    i_17_++;
		i_27_ = i_28_ & 0xf;
		if (i_28_ == 7)
		    continue while_239_;
		if (i_28_ == 23)
		    i_18_++;
		else if (i_27_ == 0)
		    i_20_++;
		else if (i_27_ == 1)
		    i_21_++;
		else if (i_27_ == 2)
		    i_19_++;
		else if (i_27_ == 3)
		    i_22_++;
		else if (i_27_ == 4)
		    i_23_++;
		else if (i_27_ == 5)
		    i_24_++;
		else {
		    if (i_27_ != 6)
			break;
		    i_25_++;
		}
	    }
	    throw new RuntimeException();
	}
	i_17_ += 5 * i_18_;
	i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_);
	i_17_ += i_23_ + i_25_;
	int i_29_ = ((BytesParser) var_es).pos;
	int i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_
		     + i_25_);
	for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
	    var_es.c(false);
	i_17_ += ((BytesParser) var_es).pos - i_29_;
	int i_32_ = ((BytesParser) var_es).pos;
	int i_33_ = 0;
	int i_34_ = 0;
	int i_35_ = 0;
	int i_36_ = 0;
	int i_37_ = 0;
	int i_38_ = 0;
	int i_39_ = 0;
	int i_40_ = 0;
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
	    i_45_ = i_45_ + var_es.readUnsignedByte(-9268) & 0x7f;
	    if (i_45_ == 0 || i_45_ == 32)
		i_25_++;
	    else if (i_45_ == 1)
		i_33_++;
	    else if (i_45_ == 33)
		i_34_++;
	    else if (i_45_ == 7)
		i_35_++;
	    else if (i_45_ == 39)
		i_36_++;
	    else if (i_45_ == 10)
		i_37_++;
	    else if (i_45_ == 42)
		i_38_++;
	    else if (i_45_ == 99)
		i_39_++;
	    else if (i_45_ == 98)
		i_40_++;
	    else if (i_45_ == 101)
		i_41_++;
	    else if (i_45_ == 100)
		i_42_++;
	    else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121
		     || i_45_ == 123)
		i_43_++;
	    else
		i_44_++;
	}
	int i_47_ = 0;
	int i_48_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_43_;
	int i_49_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_24_;
	int i_50_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_23_;
	int i_51_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_22_;
	int i_52_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_33_;
	int i_53_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_35_;
	int i_54_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_37_;
	int i_55_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_20_ + i_21_ + i_24_;
	int i_56_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_20_;
	int i_57_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_44_;
	int i_58_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_21_;
	int i_59_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_34_;
	int i_60_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_36_;
	int i_61_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_38_;
	int i_62_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_25_;
	int i_63_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_22_;
	int i_64_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_39_;
	int i_65_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_40_;
	int i_66_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_41_;
	int i_67_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_42_;
	int i_68_ = ((BytesParser) var_es).pos;
	((BytesParser) var_es).pos += i_18_ * 3;
	((vw) this).k = new byte[i_17_];
	BytesParser var_es_69_ = new BytesParser(((vw) this).k);
	var_es_69_.writeInt(1297377380, (int) -118);
	var_es_69_.writeInt((int) 6, (int) -95);
	var_es_69_.writeShort(i > 1 ? 1 : 0, 13469);
	var_es_69_.writeShort(i, 13469);
	var_es_69_.writeShort(i_16_, 13469);
	((BytesParser) var_es).pos = i_29_;
	int i_70_ = 0;
	int i_71_ = 0;
	int i_72_ = 0;
	int i_73_ = 0;
	int i_74_ = 0;
	int i_75_ = 0;
	int i_76_ = 0;
	int[] is = new int[128];
	i_45_ = 0;
	for (int i_77_ = 0; i_77_ < i; i_77_++) {
	    var_es_69_.writeInt(1297379947, (int) -116);
	    ((BytesParser) var_es_69_).pos += 4;
	    int i_78_ = ((BytesParser) var_es_69_).pos;
	    int i_79_ = -1;
	while_240_:
	    do {
		for (;;) {
		    int i_80_ = var_es.c(false);
		    var_es_69_.e(-98, i_80_);
		    int i_81_ = ((BytesParser) var_es).bytes[i_47_++] & 0xff;
		    boolean bool = i_81_ != i_79_;
		    i_79_ = i_81_ & 0xf;
		    if (i_81_ == 7) {
			if (bool)
			    var_es_69_.writeByte(255, (byte) -128);
			var_es_69_.writeByte((int) 47, (byte) -124);
			var_es_69_.writeByte((int) 0, (byte) -120);
			break while_240_;
		    }
		    if (i_81_ == 23) {
			if (bool)
			    var_es_69_.writeByte(255, (byte) -127);
			var_es_69_.writeByte((int) 81, (byte) -124);
			var_es_69_.writeByte((int) 3, (byte) -122);
			var_es_69_.writeByte((int) ((BytesParser) var_es).bytes[i_68_++],
				     (byte) -117);
			var_es_69_.writeByte((int) ((BytesParser) var_es).bytes[i_68_++],
				     (byte) -124);
			var_es_69_.writeByte((int) ((BytesParser) var_es).bytes[i_68_++],
				     (byte) -110);
		    } else {
			i_70_ ^= i_81_ >> 4;
			if (i_79_ == 0) {
			    if (bool)
				var_es_69_.writeByte(i_70_ + 144, (byte) -119);
			    i_71_ += ((BytesParser) var_es).bytes[i_55_++];
			    i_72_ += ((BytesParser) var_es).bytes[i_56_++];
			    var_es_69_.writeByte(i_71_ & 0x7f, (byte) -117);
			    var_es_69_.writeByte(i_72_ & 0x7f, (byte) -115);
			} else if (i_79_ == 1) {
			    if (bool)
				var_es_69_.writeByte(i_70_ + 128, (byte) -121);
			    i_71_ += ((BytesParser) var_es).bytes[i_55_++];
			    i_73_ += ((BytesParser) var_es).bytes[i_58_++];
			    var_es_69_.writeByte(i_71_ & 0x7f, (byte) -116);
			    var_es_69_.writeByte(i_73_ & 0x7f, (byte) -108);
			} else if (i_79_ == 2) {
			    if (bool)
				var_es_69_.writeByte(i_70_ + 176, (byte) -122);
			    i_45_ = i_45_ + ((BytesParser) var_es).bytes[i_32_++] & 0x7f;
			    var_es_69_.writeByte(i_45_, (byte) -124);
			    int i_82_;
			    if (i_45_ == 0 || i_45_ == 32)
				i_82_ = ((BytesParser) var_es).bytes[i_62_++];
			    else if (i_45_ == 1)
				i_82_ = ((BytesParser) var_es).bytes[i_52_++];
			    else if (i_45_ == 33)
				i_82_ = ((BytesParser) var_es).bytes[i_59_++];
			    else if (i_45_ == 7)
				i_82_ = ((BytesParser) var_es).bytes[i_53_++];
			    else if (i_45_ == 39)
				i_82_ = ((BytesParser) var_es).bytes[i_60_++];
			    else if (i_45_ == 10)
				i_82_ = ((BytesParser) var_es).bytes[i_54_++];
			    else if (i_45_ == 42)
				i_82_ = ((BytesParser) var_es).bytes[i_61_++];
			    else if (i_45_ == 99)
				i_82_ = ((BytesParser) var_es).bytes[i_64_++];
			    else if (i_45_ == 98)
				i_82_ = ((BytesParser) var_es).bytes[i_65_++];
			    else if (i_45_ == 101)
				i_82_ = ((BytesParser) var_es).bytes[i_66_++];
			    else if (i_45_ == 100)
				i_82_ = ((BytesParser) var_es).bytes[i_67_++];
			    else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120
				     || i_45_ == 121 || i_45_ == 123)
				i_82_ = ((BytesParser) var_es).bytes[i_48_++];
			    else
				i_82_ = ((BytesParser) var_es).bytes[i_57_++];
			    i_82_ += is[i_45_];
			    is[i_45_] = i_82_;
			    var_es_69_.writeByte(i_82_ & 0x7f, (byte) -122);
			} else if (i_79_ == 3) {
			    if (bool)
				var_es_69_.writeByte(i_70_ + 224, (byte) -116);
			    i_74_ += ((BytesParser) var_es).bytes[i_63_++];
			    i_74_ += ((BytesParser) var_es).bytes[i_51_++] << 7;
			    var_es_69_.writeByte(i_74_ & 0x7f, (byte) -112);
			    var_es_69_.writeByte(i_74_ >> 7 & 0x7f, (byte) -111);
			} else if (i_79_ == 4) {
			    if (bool)
				var_es_69_.writeByte(i_70_ + 208, (byte) -118);
			    i_75_ += ((BytesParser) var_es).bytes[i_50_++];
			    var_es_69_.writeByte(i_75_ & 0x7f, (byte) -124);
			} else if (i_79_ == 5) {
			    if (bool)
				var_es_69_.writeByte(i_70_ + 160, (byte) -115);
			    i_71_ += ((BytesParser) var_es).bytes[i_55_++];
			    i_76_ += ((BytesParser) var_es).bytes[i_49_++];
			    var_es_69_.writeByte(i_71_ & 0x7f, (byte) -125);
			    var_es_69_.writeByte(i_76_ & 0x7f, (byte) -126);
			} else {
			    if (i_79_ != 6)
				break;
			    if (bool)
				var_es_69_.writeByte(i_70_ + 192, (byte) -114);
			    var_es_69_.writeByte((int) ((BytesParser) var_es).bytes[i_62_++],
					 (byte) -115);
			}
		    }
		}
		throw new RuntimeException();
	    } while (false);
	    var_es_69_.writeLengthInt(((BytesParser) var_es_69_).pos - i_78_, -26);
	}
    }
}
