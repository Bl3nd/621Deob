/* sa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jaggl.OpenGL;

final class sa
{
    static int a;
    int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    private byte[] h;
    static int i;
    static int j;
    int k;
    private byte[][] l;
    static int m;
    int n;
    static int o;
    static GameInPacket p = new GameInPacket(98, 8);
    static int q;
    static int[] r = new int[8];
    static boolean s = false;
    static vfa t;
    
    final int a(int i, byte i_0_) {
	if (i_0_ < 88)
	    ((sa) this).k = -116;
	e++;
	return h[i] & 0xff;
    }
    
    final int a(byte i, String string) {
	if (i != 99)
	    a((byte) -45, (String) null);
	c++;
	return a(null, string, 103);
    }
    
    final String a(byte i, f[] var_fs, String string, int i_1_) {
	f++;
	if (a(var_fs, string, 121) <= i_1_)
	    return string;
	i_1_ -= a(null, "...", 95);
	int i_2_ = -1;
	int i_3_ = -1;
	int i_4_ = 0;
	int i_5_ = string.length();
	String string_6_ = "";
	if (i >= -37)
	    a(-7, null, null, -123);
	for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
	    char c = string.charAt(i_7_);
	    if (c == 60)
		i_2_ = i_7_;
	    else {
		if (c == 62 && i_2_ != -1) {
		    String string_8_ = string.substring(i_2_ + 1, i_7_);
		    i_2_ = -1;
		    if (string_8_.equals("lt"))
			c = '<';
		    else if (string_8_.equals("gt"))
			c = '>';
		    else if (!string_8_.equals("nbsp")) {
			if (!string_8_.equals("shy")) {
			    if (!string_8_.equals("times")) {
				if (string_8_.equals("euro"))
				    c = '\u20ac';
				else if (string_8_.equals("copy"))
				    c = '\u00a9';
				else {
				    if (!string_8_.equals("reg")) {
					if (string_8_.startsWith("img=")
					    && var_fs != null) {
					    try {
						int i_9_
						    = (Class_g.a
						       (128,
							string_8_
							    .substring(4)));
						i_4_ += var_fs[i_9_].A();
						i_3_ = -1;
						if (i_4_ > i_1_)
						    return string_6_ + "...";
						string_6_
						    = string.substring(0,
								       (i_7_
									+ 1));
					    } catch (Exception exception) {
						/* empty */
					    }
					}
					continue;
				    }
				    c = '\u00ae';
				}
			    } else
				c = '\u00d7';
			} else
			    c = '\u00ad';
		    } else
			c = '\u00a0';
		}
		if ((i_2_ ^ 0xffffffff) == 0) {
		    i_4_ += h[0xff & ou.a((byte) 99, c)] & 0xff;
		    if (l != null && (i_3_ ^ 0xffffffff) != 0)
			i_4_ += l[i_3_][c];
		    i_3_ = c;
		    int i_10_ = i_4_;
		    if (l != null)
			i_10_ += l[c][46];
		    if (i_10_ > i_1_)
			return string_6_ + "...";
		    string_6_ = string.substring(0, i_7_ + 1);
		}
	    }
	}
	return string;
    }
    
    final int a(f[] var_fs, String string, int i) {
	q++;
	if (string == null)
	    return 0;
	int i_11_ = -1;
	int i_12_ = -1;
	if (i <= 54)
	    h = null;
	int i_13_ = 0;
	int i_14_ = string.length();
	for (int i_15_ = 0; i_14_ > i_15_; i_15_++) {
	    char c = string.charAt(i_15_);
	    if (c == 60)
		i_11_ = i_15_;
	    else {
		if (c == 62 && (i_11_ ^ 0xffffffff) != 0) {
		    String string_16_ = string.substring(i_11_ + 1, i_15_);
		    i_11_ = -1;
		    if (string_16_.equals("lt"))
			c = '<';
		    else if (string_16_.equals("gt"))
			c = '>';
		    else if (string_16_.equals("nbsp"))
			c = '\u00a0';
		    else if (!string_16_.equals("shy")) {
			if (string_16_.equals("times"))
			    c = '\u00d7';
			else if (string_16_.equals("euro"))
			    c = '\u20ac';
			else if (string_16_.equals("copy"))
			    c = '\u00a9';
			else if (string_16_.equals("reg"))
			    c = '\u00ae';
			else {
			    if (string_16_.startsWith("img=")
				&& var_fs != null) {
				try {
				    int i_17_
					= Class_g.a(128,
						    string_16_.substring(4));
				    i_13_ += var_fs[i_17_].A();
				    i_12_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			    continue;
			}
		    } else
			c = '\u00ad';
		}
		if ((i_11_ ^ 0xffffffff) == 0) {
		    i_13_ += 0xff & h[ou.a((byte) 99, c) & 0xff];
		    if (l != null && (i_12_ ^ 0xffffffff) != 0)
			i_13_ += l[i_12_][c];
		    i_12_ = c;
		}
	    }
	}
	return i_13_;
    }
    
    final int a(String string, String[] strings, int i, int[] is, f[] var_fs) {
	g++;
	if (string == null)
	    return 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = i;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = -1;
	int i_24_ = -1;
	int i_25_ = 0;
	int i_26_ = string.length();
	for (int i_27_ = 0; i_26_ > i_27_; i_27_++) {
	    int i_28_ = ou.a((byte) 99, string.charAt(i_27_)) & 0xff;
	    int i_29_ = 0;
	    if (i_28_ == 60)
		i_23_ = i_27_;
	    else {
		int i_30_;
		if ((i_23_ ^ 0xffffffff) == 0) {
		    i_30_ = i_27_;
		    i_29_ += a(i_28_, (byte) 118);
		    if (l != null && (i_24_ ^ 0xffffffff) != 0)
			i_29_ += l[i_24_][i_28_];
		    i_24_ = i_28_;
		} else {
		    if (i_28_ != 62)
			continue;
		    i_30_ = i_23_;
		    String string_31_ = string.substring(i_23_ + 1, i_27_);
		    i_23_ = -1;
		    if (!string_31_.equals("br")) {
			if (!string_31_.equals("lt")) {
			    if (string_31_.equals("gt")) {
				i_29_ += a(62, (byte) 113);
				if (l != null && i_24_ != -1)
				    i_29_ += l[i_24_][62];
				i_24_ = 62;
			    } else if (string_31_.equals("nbsp")) {
				i_29_ += a(160, (byte) 97);
				if (l != null && (i_24_ ^ 0xffffffff) != 0)
				    i_29_ += l[i_24_][160];
				i_24_ = 160;
			    } else if (!string_31_.equals("shy")) {
				if (!string_31_.equals("times")) {
				    if (!string_31_.equals("euro")) {
					if (!string_31_.equals("copy")) {
					    if (!string_31_.equals("reg")) {
						if (string_31_
							.startsWith("img=")
						    && var_fs != null) {
						    try {
							int i_32_
							    = (Class_g.a
							       (i + 129,
								(string_31_
								     .substring
								 (4))));
							i_29_ += var_fs
								     [i_32_]
								     .A();
							i_24_ = -1;
						    } catch (Exception exception) {
							/* empty */
						    }
						}
					    } else {
						i_29_ += a(174, (byte) 117);
						if (l != null && i_24_ != -1)
						    i_29_ += l[i_24_][174];
						i_24_ = 174;
					    }
					} else {
					    i_29_ += a(169, (byte) 100);
					    if (l != null && i_24_ != -1)
						i_29_ += l[i_24_][169];
					    i_24_ = 169;
					}
				    } else {
					i_29_ += a(8364, (byte) 110);
					if (l != null
					    && (i_24_ ^ 0xffffffff) != 0)
					    i_29_ += l[i_24_][8364];
					i_24_ = 8364;
				    }
				} else {
				    i_29_ += a(215, (byte) 94);
				    if (l != null && i_24_ != -1)
					i_29_ += l[i_24_][215];
				    i_24_ = 215;
				}
			    } else {
				i_29_ += a(173, (byte) 102);
				if (l != null && (i_24_ ^ 0xffffffff) != 0)
				    i_29_ += l[i_24_][173];
				i_24_ = 173;
			    }
			} else {
			    i_29_ += a(60, (byte) 92);
			    if (l != null && i_24_ != -1)
				i_29_ += l[i_24_][60];
			    i_24_ = 60;
			}
		    } else {
			strings[i_25_] = string.substring(i_19_, i_27_ + 1);
			if (++i_25_ >= strings.length)
			    return 0;
			i_24_ = -1;
			i_19_ = i_27_ + 1;
			i_18_ = 0;
			i_20_ = -1;
			continue;
		    }
		    i_28_ = -1;
		}
		if (i_29_ > 0) {
		    i_18_ += i_29_;
		    if (is != null) {
			if (i_28_ == 32) {
			    i_20_ = i_27_;
			    i_21_ = i_18_;
			    i_22_ = 1;
			}
			if (i_18_
			    > is[is.length <= i_25_ ? is.length - 1 : i_25_]) {
			    if (i_20_ >= 0) {
				strings[i_25_]
				    = string.substring(i_19_,
						       -i_22_ + 1 + i_20_);
				i_25_++;
				if (strings.length <= i_25_)
				    return 0;
				i_19_ = i_20_ + 1;
				i_18_ -= i_21_;
				i_24_ = -1;
				i_20_ = -1;
			    } else {
				strings[i_25_]
				    = string.substring(i_19_, i_30_);
				i_25_++;
				if (strings.length <= i_25_)
				    return 0;
				i_24_ = -1;
				i_19_ = i_30_;
				i_20_ = -1;
				i_18_ = i_29_;
			    }
			}
			if (i_28_ == 45) {
			    i_21_ = i_18_;
			    i_22_ = 0;
			    i_20_ = i_27_;
			}
		    }
		}
	    }
	}
	if (string.length() > i_19_) {
	    strings[i_25_] = string.substring(i_19_, string.length());
	    i_25_++;
	}
	return i_25_;
    }
    
    final int a(String string, f[] var_fs, int i, int i_33_) {
	sa.i++;
	int i_34_ = a(string, pk.d, -1, new int[] { i }, var_fs);
	int i_35_ = 0;
	int i_36_ = -109 % ((i_33_ + 53) / 48);
	for (int i_37_ = 0; i_34_ > i_37_; i_37_++) {
	    int i_38_ = a(var_fs, pk.d[i_37_], 61);
	    if (i_38_ > i_35_)
		i_35_ = i_38_;
	}
	return i_35_;
    }
    
    public static void a(byte i) {
	r = null;
	p = null;
	t = null;
	if (i != 109)
	    a((byte) 94);
    }
    
    static final void a(int i, int i_39_, int i_40_, int i_41_, int i_42_,
			int i_43_, int[] is, int i_44_) {
	m++;
	if (i_41_ != 160)
	    a(52, -83, -5, 9, -74, -32, null, 100);
	if (i_40_ > 0 && !ar.a(i_40_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i_42_ > 0 && !ar.a(i_42_, (byte) 98))
	    throw new IllegalArgumentException("");
	if (i_43_ != 32993)
	    throw new IllegalArgumentException("");
	int i_45_ = 0;
	int i_46_ = i_40_ >= i_42_ ? i_42_ : i_40_;
	int i_47_ = i_40_ >> 1;
	int i_48_ = i_42_ >> 1;
	int[] is_49_ = is;
	int[] is_50_ = new int[i_48_ * i_47_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_45_, i_39_, i_40_, i_42_, 0, i_43_,
				 i_44_, is_49_, 0);
	    if (i_46_ <= 1)
		break;
	    int i_51_ = 0;
	    int i_52_ = 0;
	    int i_53_ = i_52_ + i_40_;
	    int[] is_54_ = is_50_;
	    for (int i_55_ = 0; i_55_ < i_48_; i_55_++) {
		for (int i_56_ = 0; i_56_ < i_47_; i_56_++) {
		    int i_57_ = is_49_[i_52_++];
		    int i_58_ = is_49_[i_53_++];
		    int i_59_ = is_49_[i_52_++];
		    int i_60_ = 0xff & i_57_ >> 8;
		    int i_61_ = i_57_ >> 24 & 0xff;
		    int i_62_ = is_49_[i_53_++];
		    int i_63_ = i_57_ >> 16 & 0xff;
		    int i_64_ = i_57_ & 0xff;
		    i_61_ += i_59_ >> 24 & 0xff;
		    i_63_ += 0xff & i_59_ >> 16;
		    i_60_ += (i_59_ & 0xffaf) >> 8;
		    i_64_ += i_59_ & 0xff;
		    i_63_ += i_58_ >> 16 & 0xff;
		    i_61_ += 0xff & i_58_ >> 24;
		    i_60_ += (0xffd7 & i_58_) >> 8;
		    i_64_ += 0xff & i_58_;
		    i_61_ += 0xff & i_62_ >> 24;
		    i_63_ += (i_62_ & 0xffff60) >> 16;
		    i_64_ += i_62_ & 0xff;
		    i_60_ += (i_62_ & 0xff32) >> 8;
		    is_50_[i_51_++]
			= hba.bitwiseArg1ORArg2(uca.a(i_64_ >> 2, 255),
				hba.bitwiseArg1ORArg2(uca.a(1020, i_60_) << 6,
				      hba.bitwiseArg1ORArg2(uca.a(i_61_ << 22, -16777216),
					    uca.a(i_63_ << 14, 16711680))));
		}
		i_53_ += i_40_;
		i_52_ += i_40_;
	    }
	    is_50_ = is_49_;
	    i_42_ = i_48_;
	    is_49_ = is_54_;
	    i_40_ = i_47_;
	    i_47_ >>= 1;
	    i_48_ >>= 1;
	    i_45_++;
	    i_46_ >>= 1;
	}
    }
    
    static final void a(int i, int i_65_, File file, byte[] is)
	throws IOException {
	a++;
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	if (i_65_ > -96)
	    t = null;
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (java.io.EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    final int a(int i, String string, f[] var_fs, int i_66_) {
	d++;
	if (i_66_ > -41)
	    return -60;
	return a(string, pk.d, -1, new int[] { i }, var_fs);
    }
    
    final int a(int i, int i_67_, String string, byte i_68_, f[] var_fs) {
	j++;
	if (i_68_ >= -43)
	    return -27;
	if (i_67_ == 0)
	    i_67_ = ((sa) this).k;
	int i_69_ = a(string, pk.d, -1, new int[] { i }, var_fs);
	int i_70_ = i_67_ * (i_69_ - 1);
	return ((sa) this).n + (((sa) this).b + i_70_);
    }
    
    final int a(int i, char c, int i_71_) {
	if (i >= -34)
	    t = null;
	o++;
	if (l == null)
	    return 0;
	return l[i_71_][c];
    }
    
    sa(byte[] is) {
	BytesParser var_es = new BytesParser(is);
	int i = var_es.readUnsignedByte(-9268);
	if (i != 0)
	    throw new RuntimeException("");
	boolean bool = var_es.readUnsignedByte(-9268) == 1;
	h = new byte[256];
	var_es.readBytes(h, true, 256, 0);
	if (bool) {
	    int[] is_72_ = new int[256];
	    for (int i_73_ = 0; i_73_ < 256; i_73_++)
		is_72_[i_73_] = var_es.readUnsignedByte(-9268);
	    int[] is_74_ = new int[256];
	    for (int i_75_ = 0; i_75_ < 256; i_75_++)
		is_74_[i_75_] = var_es.readUnsignedByte(-9268);
	    byte[][] is_76_ = new byte[256][];
	    for (int i_77_ = 0; i_77_ < 256; i_77_++) {
		is_76_[i_77_] = new byte[is_72_[i_77_]];
		byte i_78_ = 0;
		for (int i_79_ = 0; i_79_ < is_76_[i_77_].length; i_79_++) {
		    i_78_ += var_es.readByte(-20933);
		    is_76_[i_77_][i_79_] = i_78_;
		}
	    }
	    byte[][] is_80_ = new byte[256][];
	    for (int i_81_ = 0; i_81_ < 256; i_81_++) {
		is_80_[i_81_] = new byte[is_72_[i_81_]];
		byte i_82_ = 0;
		for (int i_83_ = 0; i_83_ < is_80_[i_81_].length; i_83_++) {
		    i_82_ += var_es.readByte(-20933);
		    is_80_[i_81_][i_83_] = i_82_;
		}
	    }
	    l = new byte[256][256];
	    for (int i_84_ = 0; i_84_ < 256; i_84_++) {
		if (i_84_ != 32 && i_84_ != 160) {
		    for (int i_85_ = 0; i_85_ < 256; i_85_++) {
			if (i_85_ != 32 && i_85_ != 160)
			    l[i_84_][i_85_]
				= (byte) mfa.a(is_76_, h, is_74_, false,
					       is_80_, is_72_, i_85_, i_84_);
		    }
		}
	    }
	    ((sa) this).k = is_72_[32] + is_74_[32];
	} else
	    ((sa) this).k = var_es.readUnsignedByte(-9268);
	var_es.readUnsignedByte(-9268);
	var_es.readUnsignedByte(-9268);
	((sa) this).b = var_es.readUnsignedByte(-9268);
	((sa) this).n = var_es.readUnsignedByte(-9268);
    }
}
