/* ci - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

final class ci extends Node
{
    static int k;
    private NativeHeapBuffer l;
    static int m;
    static int n;
    static int o;
    static int p;
    private gv q;
    private dga r;
    float s;
    static int t;
    static int u;
    private int[] v;
    static int w;
    private wk x;
    int y;
    static int z;
    private Stream A;
    private qj B;
    int C;
    int D;
    int E;
    
    final void a(byte i, int i_0_) {
	t++;
	l = ((qj) B).ne.a(4 * i_0_, true);
	A = new Stream(l);
	int i_1_ = -108 % ((i - 18) / 33);
    }
    
    static final void a(int i) {
	if (i > -3)
	    a(21);
	n++;
	raa.a();
    }
    
    final void a(int i, int i_2_, byte i_3_, int i_4_, float f) {
	if (((ci) this).D != -1) {
	    vca var_vca = ((Class_r) B).j.a(((ci) this).D, (byte) 86);
	    int i_5_ = 0xff & ((vca) var_vca).q;
	    if (i_5_ != 0 && ((vca) var_vca).i != 4) {
		int i_6_;
		if (i < 0)
		    i_6_ = 0;
		else if (i <= 127)
		    i_6_ = 131586 * i;
		else
		    i_6_ = 16777215;
		if (i_5_ != 256) {
		    int i_7_ = i_5_;
		    int i_8_ = -i_5_ + 256;
		    i_4_ = ((0xff0000
			     & i_8_ * (i_4_ & 0xff00) + (i_6_ & 0xff00) * i_7_)
			    + (~0xff00ff & (i_8_ * (i_4_ & 0xff00ff)
					    + (i_6_ & 0xff00ff) * i_7_))) >> 8;
		} else
		    i_4_ = i_6_;
	    }
	    int i_9_ = ((vca) var_vca).f & 0xff;
	    if (i_9_ != 0) {
		i_9_ += 256;
		int i_10_ = i_9_ * (i_4_ >> 16 & 0xff);
		if (i_10_ > 65535)
		    i_10_ = 65535;
		int i_11_ = ((0xff00 & i_4_) >> 8) * i_9_;
		if (i_11_ > 65535)
		    i_11_ = 65535;
		int i_12_ = (0xff & i_4_) * i_9_;
		if (i_12_ > 65535)
		    i_12_ = 65535;
		i_4_ = (i_12_ >> 8) + ((i_11_ & 0xff00)
				       + ((~0x69ff00ff & i_10_) << 8));
	    }
	}
	p++;
	A.b(4 * i_2_);
	if (f != 1.0F) {
	    int i_13_ = i_4_ >> 16 & 0xff;
	    int i_14_ = (i_4_ & 0xfffc) >> 8;
	    int i_15_ = 0xff & i_4_;
	    i_13_ *= f;
	    i_14_ *= f;
	    if (i_13_ < 0)
		i_13_ = 0;
	    else if (i_13_ > 255)
		i_13_ = 255;
	    i_15_ *= f;
	    if (i_14_ < 0)
		i_14_ = 0;
	    else if (i_14_ > 255)
		i_14_ = 255;
	    if (i_15_ >= 0) {
		if (i_15_ > 255)
		    i_15_ = 255;
	    } else
		i_15_ = 0;
	    i_4_ = i_14_ << 8 | i_13_ << 16 | i_15_;
	}
	A.d((byte) (i_4_ >> 16));
	A.d((byte) (i_4_ >> 8));
	A.d((byte) i_4_);
	int i_16_ = 0 % ((1 - i_3_) / 60);
    }
    
    final void a(int i, int i_17_, int[] is) {
	o++;
	int i_18_ = 0;
	fw var_fw = ((qj) B).Zf;
	((BytesParser) var_fw).pos = i_17_;
	if (!((qj) B).ig) {
	    for (int i_19_ = 0; i_19_ < i; i_19_++) {
		int i_20_ = is[i_19_];
		short[] is_21_ = ((dga) r).p[i_20_];
		int i_22_ = v[i_20_];
		if (i_22_ != 0 && is_21_ != null) {
		    int i_23_ = 0;
		    int i_24_ = 0;
		    while (is_21_.length > i_24_) {
			if ((1 << i_23_++ & i_22_) == 0)
			    i_24_ += 3;
			else {
			    i_18_++;
			    var_fw.writeShortReversed2(is_21_[i_24_++] & 0xffff, (byte) 0);
			    var_fw.writeShortReversed2(is_21_[i_24_++] & 0xffff, (byte) 0);
			    i_18_++;
			    var_fw.writeShortReversed2(is_21_[i_24_++] & 0xffff, (byte) 0);
			    i_18_++;
			}
		    }
		}
	    }
	} else {
	    for (int i_25_ = 0; i_25_ < i; i_25_++) {
		int i_26_ = is[i_25_];
		short[] is_27_ = ((dga) r).p[i_26_];
		int i_28_ = v[i_26_];
		if (i_28_ != 0 && is_27_ != null) {
		    int i_29_ = 0;
		    int i_30_ = 0;
		    while (i_30_ < is_27_.length) {
			if ((1 << i_29_++ & i_28_) == 0)
			    i_30_ += 3;
			else {
			    var_fw.writeShort(0xffff & is_27_[i_30_++], i_17_ + 13469);
			    i_18_++;
			    i_18_++;
			    var_fw.writeShort(0xffff & is_27_[i_30_++], 13469);
			    var_fw.writeShort(0xffff & is_27_[i_30_++], i_17_ + 13469);
			    i_18_++;
			}
		    }
		}
	    }
	}
	if (i_18_ > 0) {
	    x.a(5123, 17816, ((BytesParser) var_fw).pos, ((BytesParser) var_fw).bytes);
	    B.a(((dga) r).bb, (byte) 100, q, ((dga) r).fb, ((dga) r).db);
	    B.a(((ci) this).D, i_17_ + 22, (0x8 & ((dga) r).D) != 0,
		(0x7 & ((dga) r).D) != 0);
	    if (((qj) B).Hf)
		B.YA(2147483647, ((ci) this).C, ((ci) this).E, ((ci) this).y);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / ((ci) this).s, 1.0F / ((ci) this).s, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    B.a(((dga) r).bb, (byte) 94, q, ((dga) r).fb, ((dga) r).db);
	    B.a(i_18_, 0, 4, x, 255);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    final void b(byte i, int i_31_) {
	A.c();
	k++;
	nl var_nl = B.a(4, false, 4 * i_31_, l, i ^ ~0x23);
	q = new gv(var_nl, 5121, 4, 0);
	if (i != -33)
	    v = null;
	l = null;
	A = null;
    }
    
    final void c(byte i, int i_32_) {
	if (i != 6)
	    ((ci) this).y = -51;
	A.b(4 * i_32_ + 3);
	z++;
	A.d(-1);
    }
    
    static final String a(byte[] is, int i, int i_33_, int i_34_) {
	if (i_33_ != -241)
	    a(-77);
	u++;
	char[] cs = new char[i_34_];
	int i_35_ = 0;
	int i_36_ = i_34_ + i;
	for (int i_37_ = i; i_36_ > i_37_; i_37_++) {
	    int i_38_ = 0xff & is[i_37_];
	    if (i_38_ >= 128) {
		if (i_38_ < 194)
		    throw new IllegalArgumentException
			      ("Overlong encoding in UTF-8 encoding " + i_38_);
		if (i_38_ < 224) {
		    if (i_37_ + 1 >= i_36_)
			throw new IllegalArgumentException
				  ("Incomplete two-byte sequence at end of UTF-8 encoding");
		    int i_39_ = is[++i_37_] & 0xff;
		    if (i_39_ < 128 || i_39_ > 191)
			throw new IllegalArgumentException
				  ("Illegal second byte in two-byte sequence in UTF-8 encoding");
		    cs[i_35_++] = (char) hba.bitwiseArg1ORArg2(uca.a(-12352, i_38_ << 6),
					       uca.a(-129, i_39_));
		} else if (i_38_ < 240) {
		    if (i_36_ <= i_37_ + 2)
			throw new IllegalArgumentException
				  ("Incomplete three-byte sequence at end of UTF-8 encoding");
		    int i_40_ = is[++i_37_] & 0xff;
		    if (i_40_ < 128 || i_40_ > 191)
			throw new IllegalArgumentException
				  ("Illegal second byte in three-byte sequence in UTF-8 encoding");
		    int i_41_ = 0xff & is[++i_37_];
		    if (i_41_ < 128 || i_41_ > 191)
			throw new IllegalArgumentException
				  ("Illegal third byte in three-byte sequence in UTF-8 encoding");
		    cs[i_35_++] = (char) hba.bitwiseArg1ORArg2(hba.bitwiseArg1ORArg2(uca.a(i_38_, -225) << 12,
						     uca.a(-8256, i_40_ << 6)),
					       uca.a(i_41_, -129));
		} else {
		    if (i_38_ < 244)
			throw new IllegalArgumentException
				  ("Unsupported four-byte sequence in UTF-8 encoding");
		    throw new IllegalArgumentException
			      ("Illegal first sequence byte in UTF-8 encoding "
			       + i_38_);
		}
	    } else
		cs[i_35_++] = (char) i_38_;
	}
	return new String(cs, 0, i_35_);
    }
    
    final void a(int i, int i_42_, boolean bool, int i_43_) {
	if (bool == false) {
	    v[i_43_ * ((Class_i) r).k + i]
		= hba.bitwiseArg1ORArg2(v[i_43_ * ((Class_i) r).k + i], 1 << i_42_);
	    w++;
	}
    }
    
    ci(dga var_dga, int i, int i_44_, int i_45_, int i_46_, int i_47_) {
	r = var_dga;
	((ci) this).y = i_47_;
	((ci) this).C = i_45_;
	v = new int[((Class_i) r).j * ((Class_i) r).k];
	((ci) this).s = (float) i_44_;
	((ci) this).D = i;
	B = ((dga) r).F;
	((ci) this).E = i_46_;
	x = new wk(B, 5123, null, 1);
    }
}
