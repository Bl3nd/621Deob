/* no - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class no extends pp
{
    int s = 0;
    static int t;
    static int u;
    static int v;
    static int w;
    static boolean x = false;
    
    static final ar a(qj var_qj, int i, int i_0_, int i_1_, int i_2_) {
	v++;
	if (i_2_ != 34037)
	    return null;
	if (!((qj) var_qj).pg
	    && (!ar.a(i_1_, (byte) 98) || !ar.a(i_0_, (byte) 98))) {
	    if (((qj) var_qj).vf)
		return new ar(var_qj, 34037, i, i_1_, i_0_);
	    return new ar(var_qj, i, i_1_, i_0_, dfa.a(i_1_, 128),
			  dfa.a(i_0_, 128));
	}
	return new ar(var_qj, 3553, i, i_1_, i_0_);
    }
    
    static final void a(byte i, int i_3_, int i_4_, int i_5_, int i_6_) {
	u++;
	int i_7_ = 0;
	if (i != 82)
	    x = false;
	int i_8_ = i_3_;
	int i_9_ = -i_3_;
	int i_10_ = -1;
	int i_11_ = sl.a(i_5_ + i_3_, 4095, vaa.xb, jga.v);
	int i_12_ = sl.a(i_5_ - i_3_, 4095, vaa.xb, jga.v);
	kg.a(i_12_, wh.O[i_4_], i_6_, i_11_, -113);
	while (i_8_ > i_7_) {
	    i_10_ += 2;
	    i_9_ += i_10_;
	    if (i_9_ > 0) {
		i_8_--;
		i_9_ -= i_8_ << 1;
		int i_13_ = i_4_ - i_8_;
		int i_14_ = i_8_ + i_4_;
		if (Class_md.h <= i_14_ && Class_db.o >= i_13_) {
		    int i_15_ = sl.a(i_5_ + i_7_, 4095, vaa.xb, jga.v);
		    int i_16_ = sl.a(i_5_ - i_7_, 4095, vaa.xb, jga.v);
		    if (i_14_ <= Class_db.o)
			kg.a(i_16_, wh.O[i_14_], i_6_, i_15_, i ^ ~0x3c);
		    if (Class_md.h <= i_13_)
			kg.a(i_16_, wh.O[i_13_], i_6_, i_15_, 45);
		}
	    }
	    i_7_++;
	    int i_17_ = i_4_ - i_7_;
	    int i_18_ = i_7_ + i_4_;
	    if (Class_md.h <= i_18_ && Class_db.o >= i_17_) {
		int i_19_ = sl.a(i_8_ + i_5_, 4095, vaa.xb, jga.v);
		int i_20_ = sl.a(i_5_ - i_8_, 4095, vaa.xb, jga.v);
		if (i_18_ <= Class_db.o)
		    kg.a(i_20_, wh.O[i_18_], i_6_, i_19_, i + 11);
		if (Class_md.h <= i_17_)
		    kg.a(i_20_, wh.O[i_17_], i_6_, i_19_, 34);
	    }
	}
    }
    
    final void a(BytesParser var_es, int i) {
	for (;;) {
	    int i_21_ = var_es.readUnsignedByte(-9268);
	    if (i_21_ == 0)
		break;
	    a(var_es, 106, i_21_);
	}
	t++;
	if (i >= -19)
	    a((byte) 91, 62, 125, 126, -74);
    }
    
    public no() {
	/* empty */
    }
    
    private final void a(BytesParser var_es, int i, int i_22_) {
	w++;
	if (i_22_ == 2)
	    ((no) this).s = var_es.readShort(13111);
	int i_23_ = -68 % ((58 - i) / 44);
    }
}
