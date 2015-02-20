/* naa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class naa extends vs
{
    static int G;
    static int H;
    static int I;
    static int J;
    static GameOutPacket K = new GameOutPacket(16, 7);
    static long L;
    
    public static void c(byte i) {
	if (i > -53)
	    L = 72L;
	K = null;
    }
    
    static final void d(byte i) {
	if (daa.ab != null)
	    daa.ab.a(-26789);
	if (i == 76) {
	    J++;
	    if (pt.g != null)
		pt.g.a(-26789);
	}
    }
    
    static final it a(byte[] is, int i) {
	int i_0_ = -40 / ((i - 19) / 34);
	G++;
	it var_it = new it();
	BytesParser var_es = new BytesParser(is);
	((BytesParser) var_es).pos = ((BytesParser) var_es).bytes.length - 2;
	int i_1_ = var_es.readShort(13111);
	int i_2_ = ((BytesParser) var_es).bytes.length - 12 - 2 - i_1_;
	((BytesParser) var_es).pos = i_2_;
	int i_3_ = var_es.readInt(97);
	((it) var_it).A = var_es.readShort(13111);
	((it) var_it).B = var_es.readShort(13111);
	((it) var_it).y = var_es.readShort(13111);
	((it) var_it).t = var_es.readShort(13111);
	int i_4_ = var_es.readUnsignedByte(-9268);
	if (i_4_ > 0) {
	    ((it) var_it).z = new il[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		int i_6_ = var_es.readShort(13111);
		il var_il = new il(dfa.a(i_6_, 128));
		((it) var_it).z[i_5_] = var_il;
		while (i_6_-- > 0) {
		    int i_7_ = var_es.readInt(94);
		    int i_8_ = var_es.readInt(74);
		    var_il.a(new GameInPacketHandler(i_8_), (byte) -30, (long) i_7_);
		}
	    }
	}
	((BytesParser) var_es).pos = 0;
	((it) var_it).I = var_es.readString3(9283);
	((it) var_it).C = new int[i_3_];
	((it) var_it).G = new String[i_3_];
	((it) var_it).w = new int[i_3_];
	int i_9_ = 0;
	while (((BytesParser) var_es).pos < i_2_) {
	    int i_10_ = var_es.readShort(13111);
	    if (i_10_ != 3) {
		if (i_10_ < 100 && i_10_ != 21 && i_10_ != 38 && i_10_ != 39)
		    ((it) var_it).w[i_9_] = var_es.readInt(93);
		else
		    ((it) var_it).w[i_9_] = var_es.readUnsignedByte(-9268);
	    } else
		((it) var_it).G[i_9_] = var_es.readString((byte) 123).intern();
	    ((it) var_it).C[i_9_++] = i_10_;
	}
	return var_it;
    }
    
    naa(pl var_pl, pl var_pl_11_, aea var_aea) {
	super(var_pl, var_pl_11_, (tm) var_aea);
    }
    
    static final eaa e(byte i) {
	H++;
	if (i != 103)
	    K = null;
	return kca.c;
    }
    
    final void a(int i, byte i_12_, int i_13_, int i_14_, int i_15_) {
	I++;
	int i_16_ = ((vs) this).v.A();
	if (i_12_ != 85)
	    K = null;
	int i_17_ = ((aea) (aea) ((lp) this).d).D * tda.a(783) / 10 % i_16_;
	((vs) this).v.b(i_17_ + (i_13_ - i_16_), i_14_, i_16_ + i_15_ - i_17_,
			i);
    }
}
