/* eq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class eq extends fu implements fl
{
    static je C = new je();
    static int D;
    static int E;
    private int F;
    static GameOutPacket G;
    private int H;
    static int I;
    static int J;
    static int[] K = new int[6];
    private int L;
    static boolean[] M = new boolean[100];
    static int[] N;
    
    static final boolean a(int i, int i_0_, int i_1_) {
	J++;
	if (i_1_ > -12)
	    return false;
	return ((Class_q.a(i_0_, 116, i) | (i & 0x2000) != 0
		 | nh.a(i_0_, 85, i))
		& tj.a(i_0_, 55, i));
    }
    
    public static void a(byte i) {
	G = null;
	if (i != -80)
	    a(91, -48, -89);
	K = null;
	M = null;
	C = null;
	N = null;
    }
    
    static final char a(byte i, byte i_2_) {
	E++;
	if (i <= 22)
	    return '\uff8b';
	int i_3_ = i_2_ & 0xff;
	if (i_3_ == 0)
	    throw new IllegalArgumentException("Non cp1252 character 0x"
					       + Integer.toString(i_3_, 16)
					       + " provided");
	if (i_3_ >= 128 && i_3_ < 160) {
	    int i_4_ = th.g[i_3_ - 128];
	    if (i_4_ == 0)
		i_4_ = 63;
	    i_3_ = i_4_;
	}
	return (char) i_3_;
    }
    
    static final void b(int i) {
	if (i == -8234) {
	    gea.n = false;
	    I++;
	    caa.a(aw.l, hn.b, lfa.r, (byte) 31, mr.a);
	}
    }
    
    eq(lm var_lm, Class_ec class_ec, int i, int i_5_, int i_6_, byte[] is) {
	super(var_lm, 32879, class_ec, bt.g, i * i_5_ * i_6_, false);
	F = i_5_;
	L = i_6_;
	H = i;
	((fu) this).d.a(this, 0);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((fu) this).u, 0, this.e(26701), H, F, L, 0,
			      Animable.a(6407, ((fu) this).o), 5121, is, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    static final int a(int i, String string, int i_7_, byte[] is) {
	D++;
	int i_8_ = i_7_;
	int i_9_ = string.length();
	if (i != -1)
	    return 60;
	for (int i_10_ = 0; i_9_ > i_10_; i_10_ += 4) {
	    int i_11_ = jb.a(-1, string.charAt(i_10_));
	    int i_12_
		= i_10_ + 1 >= i_9_ ? -1 : jb.a(-1, string.charAt(i_10_ + 1));
	    int i_13_
		= i_9_ > i_10_ + 2 ? jb.a(-1, string.charAt(i_10_ + 2)) : -1;
	    int i_14_
		= i_10_ + 3 < i_9_ ? jb.a(i, string.charAt(i_10_ + 3)) : -1;
	    is[i_7_++] = (byte) hba.bitwiseArg1ORArg2(i_12_ >>> 4, i_11_ << 2);
	    if ((i_13_ ^ 0xffffffff) == 0)
		break;
	    is[i_7_++] = (byte) hba.bitwiseArg1ORArg2(uca.a(i_12_ << 4, 240), i_13_ >>> 2);
	    if (i_14_ == -1)
		break;
	    is[i_7_++] = (byte) hba.bitwiseArg1ORArg2(uca.a(i_13_ << 6, 192), i_14_);
	}
	return i_7_ - i_8_;
    }
    
    static {
	G = new GameOutPacket(30, 3);
	N = new int[3];
    }
}
