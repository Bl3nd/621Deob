/* qt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qt extends pp
{
    char[] s;
    int[] t;
    static int u;
    static int v;
    String w;
    int[] x;
    static int y = 0;
    static int z;
    char[] A;
    static int B;
    static int C;
    static GameInPacket incomingPacket48 = new GameInPacket(48, 12);
    static Class_ae F;
    static int H;
    static int I = 0;
    static float J;
    
    final int a(char c, int i) {
	if (i != 3766)
	    return 65;
	u++;
	if (((qt) this).x == null)
	    return -1;
	for (int i_0_ = 0; ((qt) this).x.length > i_0_; i_0_++) {
	    if (((qt) this).s[i_0_] == c)
		return ((qt) this).x[i_0_];
	}
	return -1;
    }
    
    static final void a(int i, ww var_ww, oj var_oj, Class_r class_r, int i_1_,
			int i_2_, Class_vb class_vb, int i_3_) {
	H++;
	int i_4_ = ((Class_vb) class_vb).p - i_2_ / 2 - 5;
	int i_5_ = i_1_ + 2;
	if (((ww) var_ww).p != 0)
	    class_r.f(((ww) var_ww).p, i_4_, i_5_, i_3_ + 1,
		      i_1_ - i_5_ + i * var_oj.a() + 1, i_2_ + 10);
	if (((ww) var_ww).w != 0)
	    class_r.b(i_2_ + 10, i_5_, i_1_ + i * var_oj.a() - (i_5_ - 1),
		      i_4_, 20822, ((ww) var_ww).w);
	int i_6_ = ((ww) var_ww).E;
	if (((Class_vb) class_vb).l && ((ww) var_ww).z != -1)
	    i_6_ = ((ww) var_ww).z;
	for (int i_7_ = i_3_; i > i_7_; i_7_++) {
	    String string = nt.d[i_7_];
	    if (i - 1 > i_7_)
		string = string.substring(0, string.length() - 4);
	    var_oj.a(class_r, string, ((Class_vb) class_vb).p, i_1_, i_6_,
		     true);
	    i_1_ += var_oj.a();
	}
    }
    
    public static void b(byte i) {
	F = null;
	incomingPacket48 = null;
	if (i >= -58)
	    J = 0.3833629F;
    }
    
    public qt() {
	/* empty */
    }
    
    final void a(int i) {
	if (i > -23)
	    I = -12;
	C++;
	if (((qt) this).t != null) {
	    for (int i_8_ = 0; i_8_ < ((qt) this).t.length; i_8_++)
		((qt) this).t[i_8_] = hba.bitwiseArg1ORArg2(((qt) this).t[i_8_], 32768);
	}
	if (((qt) this).x != null) {
	    for (int i_9_ = 0; ((qt) this).x.length > i_9_; i_9_++)
		((qt) this).x[i_9_] = hba.bitwiseArg1ORArg2(((qt) this).x[i_9_], 32768);
	}
    }
    
    final int a(byte i, char c) {
	z++;
	if (((qt) this).t == null)
	    return -1;
	if (i <= 28)
	    a((byte) -121, '\uffd0');
	for (int i_10_ = 0; ((qt) this).t.length > i_10_; i_10_++) {
	    if (c == ((qt) this).A[i_10_])
		return ((qt) this).t[i_10_];
	}
	return -1;
    }
    
    private final void a(int i, int i_11_, BytesParser var_es) {
	if (i == -1) {
	    if (i_11_ != 1) {
		if (i_11_ == 2) {
		    int i_12_ = var_es.readUnsignedByte(-9268);
		    ((qt) this).x = new int[i_12_];
		    ((qt) this).s = new char[i_12_];
		    for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
			((qt) this).x[i_13_] = var_es.readShort(i + 13112);
			byte i_14_ = var_es.readByte(-20933);
			((qt) this).s[i_13_]
			    = i_14_ == 0 ? '\0' : eq.a((byte) 115, i_14_);
		    }
		} else if (i_11_ == 3) {
		    int i_15_ = var_es.readUnsignedByte(-9268);
		    ((qt) this).A = new char[i_15_];
		    ((qt) this).t = new int[i_15_];
		    for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
			((qt) this).t[i_16_] = var_es.readShort(i + 13112);
			byte i_17_ = var_es.readByte(-20933);
			((qt) this).A[i_16_]
			    = i_17_ == 0 ? '\0' : eq.a((byte) 67, i_17_);
		    }
		}
	    } else
		((qt) this).w = var_es.readString((byte) 117);
	    B++;
	}
    }
    
    final void a(BytesParser var_es, int i) {
	v++;
	if (i <= 36)
	    ((qt) this).A = null;
	for (;;) {
	    int i_18_ = var_es.readUnsignedByte(-9268);
	    if (i_18_ == 0)
		break;
	    a(-1, i_18_, var_es);
	}
    }
    
    static {
	F = new Class_ae();
    }
}
