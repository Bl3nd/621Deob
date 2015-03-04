/* cea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

final class cea
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int[] h = new int[6];
    
    static final void a(String string, int i, Throwable throwable) {
	c++;
	do {
	    try {
		String string_0_ = "";
		if (throwable != null)
		    string_0_ = pfa.a(throwable, (byte) -103);
		if (string != null) {
		    if (throwable != null)
			string_0_ += " | ";
		    string_0_ += (String) string;
		}
		n.a(string_0_, true);
		string_0_ = ev.a(0, string_0_, ":", "%3a");
		string_0_ = ev.a(0, string_0_, "@", "%40");
		string_0_ = ev.a(0, string_0_, "&", "%26");
		string_0_ = ev.a(0, string_0_, "#", "%23");
		if (to.e != null) {
		    vfa var_vfa
			= ah.signlink.a(new URL(to.e.getCodeBase(),
					 ("clienterror.ws?nullLoader=" + il.n + "&u="
					  + qea.a + "&v1=" + Signlink.javaVendor + "&v2="
					  + Signlink.javaVersion + "&unlink=" + string_0_)),
				 4851);
		    while (var_vfa.f == 0)
			Connection.a(-28448, 1L);
		    if (i != (var_vfa.f ^ 0xffffffff))
			break;
		    DataInputStream datainputstream
			= (DataInputStream) var_vfa.hostName;
		    datainputstream.read();
		    datainputstream.close();
		}
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    static final void a(byte[][] is, gl var_gl, int i) {
	a++;
	int[] is_1_ = { -1, 0, 0, 0, 0 };
	int i_2_ = is.length;
	for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
	    byte[] is_4_ = is[i_3_];
	    if (is_4_ != null) {
		BytesParser var_es = new BytesParser(is_4_);
		int i_5_ = iu.o[i_3_] >> 8;
		int i_6_ = iu.o[i_3_] & 0xff;
		int i_7_ = 64 * i_5_ - bfa.thisPlayersRegionX;
		int i_8_ = 64 * i_6_ - BytesParser.thisPlayersRegionY;
		naa.d((byte) 76);
		var_gl.a(i_8_, i_7_, bfa.thisPlayersRegionX, i ^ ~0x71, var_es, BytesParser.thisPlayersRegionY, su.a);
		var_gl.a(lg.r, i_8_, var_es, is_1_, 6714, i_7_);
		if (!((cd) var_gl).b && i_5_ == wj.q / 8
		    && Class_kf.y / 8 == i_6_
		    && (is_1_[0] ^ 0xffffffff) != 0) {
		    Connection.tw = hi.u.a(ps.a, is_1_[1], is_1_[2], is_1_[3], -29532,
				   is_1_[0]);
		    fr.A = is_1_[4];
		}
	    }
	}
	if (i != 8)
	    h = null;
	for (int i_9_ = 0; i_2_ > i_9_; i_9_++) {
	    int i_10_ = (iu.o[i_9_] >> 8) * 64 - bfa.thisPlayersRegionX;
	    int i_11_ = (iu.o[i_9_] & 0xff) * 64 - BytesParser.thisPlayersRegionY;
	    byte[] is_12_ = is[i_9_];
	    if (is_12_ == null && Class_kf.y < 800) {
		naa.d((byte) 76);
		var_gl.a(i_11_, 64, (byte) 89, i_10_, 64);
	    }
	}
    }
    
    public static void a(byte i) {
	h = null;
	if (i < 2)
	    a(-8, 88, 87);
    }
    
    static final boolean a(int i, int i_13_, int i_14_) {
	e++;
	if (i_14_ >= -126)
	    return false;
	if ((0x10000 & i_13_) == 0)
	    return false;
	return true;
    }
    
    static final void a(boolean bool, String string, int i, int i_15_,
			String string_16_) {
	ip.a(-1, 339, string, bool, i_15_, true, string_16_);
	g++;
	if (i != 160)
	    a((dr) null, (byte) 114, 107);
    }
    
    static final void a(dr var_dr, byte i, int i_17_) {
	f++;
	if (je.i < 50 && (var_dr != null && ((dr) var_dr).j != null
			  && ((dr) var_dr).j.length > i_17_
			  && ((dr) var_dr).j[i_17_] != null)) {
	    int i_18_ = ((dr) var_dr).j[i_17_][0];
	    int i_19_ = i_18_ >> 8;
	    if (((dr) var_dr).j[i_17_].length > 1) {
		int i_20_ = (int) (Math.random()
				   * (double) ((dr) var_dr).j[i_17_].length);
		if (i_20_ > 0)
		    i_19_ = ((dr) var_dr).j[i_17_][i_20_];
	    }
	    int i_21_ = (i_18_ & 0xf9) >> 5;
	    if (((dr) var_dr).u)
		oh.a(i_19_, i_21_, 0, false, 255, false);
	    else
		io.a(255, i_19_, i_21_, 0, 29830);
	    int i_22_ = 114 % ((30 - i) / 46);
	}
    }
    
    static final void b(int i, int i_23_, int i_24_) {
	b++;
	if (i == -1630137275 && gf.a((byte) 110, i_23_))
	    us.a(Node_Sub.o[i_23_], i_24_, false);
    }
    
    static final String bytesToString(int i, int i_25_, byte[] is, int i_26_) {
		d++;
		char[] cs = new char[i_25_];
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
		    int i_29_ = is[i_28_ + i_26_] & 0xff;
		    if (i_29_ != 0) {
				if (i_29_ >= 128 && i_29_ < 160) {
				    int i_30_ = th.g[i_29_ - 128];
				    if (i_30_ == 0)
						i_30_ = 63;
				    i_29_ = i_30_;
				}
				cs[i_27_++] = (char) i_29_;
		    }
		}
		if (i != 26144)
		    return null;
		return new String(cs, 0, i_27_);
    }
}
