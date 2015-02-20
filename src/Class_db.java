/* Class_db - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_db extends Class_q
{
    static int i;
    float j;
    static int k;
    static oj l;
    static int m;
    float n;
    static int o = 100;
    float p;
    float q;
    float r;
    static int s;
    static int t;
    static int u;
    float v;
    float w;
    float x;
    static int y;
    static int z;
    float A;
    static int B;
    static int C;
    static int D;
    static int E;
    float F;
    static int G;
    static int H;
    static int I;
    float J;
    static int K;
    float L;
    static int M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    
    final void YA(int[] is) {
	u++;
	float f = (float) is[0] - ((Class_db) this).J;
	float f_0_ = (float) is[1] - ((Class_db) this).w;
	float f_1_ = (float) is[2] - ((Class_db) this).p;
	is[2]
	    = (int) (((Class_db) this).L * f_1_
		     + (f * ((Class_db) this).x + ((Class_db) this).n * f_0_));
	is[0]
	    = (int) (((Class_db) this).v * f_1_
		     + (((Class_db) this).A * f + f_0_ * ((Class_db) this).r));
	is[1]
	    = (int) (((Class_db) this).j * f_1_
		     + (((Class_db) this).F * f + ((Class_db) this).q * f_0_));
    }
    
    final void J(int i) {
	((Class_db) this).L = 1.0F;
	m++;
	((Class_db) this).A = ((Class_db) this).q = dea.f[0x3fff & i];
	((Class_db) this).r = dea.d[0x3fff & i];
	((Class_db) this).x = ((Class_db) this).J = ((Class_db) this).n
	    = ((Class_db) this).w = ((Class_db) this).v = ((Class_db) this).j
	    = ((Class_db) this).p = 0.0F;
	((Class_db) this).F = -((Class_db) this).r;
    }
    
    final void U(int i, int i_2_, int i_3_) {
	((Class_db) this).w += (float) i_2_;
	((Class_db) this).J += (float) i;
	((Class_db) this).p += (float) i_3_;
	D++;
    }
    
    final void a(byte i, float f, float f_4_, float f_5_, float[] fs,
		 float f_6_) {
	Q++;
	fs[2] = ((Class_db) this).L * f_5_ + (f_4_ * ((Class_db) this).v
					      + ((Class_db) this).j * f);
	fs[0] = (((Class_db) this).A * f_4_ + f * ((Class_db) this).F
		 + ((Class_db) this).x * f_5_);
	float f_7_;
	float f_8_;
	float f_9_;
	if (!(f_4_ > 0.00390625F) && !(f_4_ < -0.00390625F)) {
	    if (!(f > 0.00390625F) && !(f < -0.00390625F)) {
		float f_10_ = -f_6_ / f_5_;
		f_7_ = ((Class_db) this).w + f_10_ * ((Class_db) this).n;
		f_8_ = ((Class_db) this).J + f_10_ * ((Class_db) this).x;
		f_9_ = ((Class_db) this).L * f_10_ + ((Class_db) this).p;
	    } else {
		float f_11_ = -f_6_ / f;
		f_8_ = ((Class_db) this).J + ((Class_db) this).F * f_11_;
		f_7_ = f_11_ * ((Class_db) this).q + ((Class_db) this).w;
		f_9_ = ((Class_db) this).j * f_11_ + ((Class_db) this).p;
	    }
	} else {
	    float f_12_ = -f_6_ / f_4_;
	    f_7_ = ((Class_db) this).w + f_12_ * ((Class_db) this).r;
	    f_8_ = f_12_ * ((Class_db) this).A + ((Class_db) this).J;
	    f_9_ = ((Class_db) this).p + ((Class_db) this).v * f_12_;
	}
	if (i <= 4)
	    ((Class_db) this).r = 0.23876107F;
	fs[1] = (((Class_db) this).q * f + f_4_ * ((Class_db) this).r
		 + ((Class_db) this).n * f_5_);
	fs[3] = -(fs[1] * f_7_ + f_8_ * fs[0] + fs[2] * f_9_);
    }
    
    final void wa(int i, int i_13_, int i_14_, int[] is) {
	s++;
	is[1] = (int) (((Class_db) this).n * (float) i_14_
		       + ((float) i * ((Class_db) this).r
			  + (float) i_13_ * ((Class_db) this).q));
	is[2] = (int) ((float) i_13_ * ((Class_db) this).j
		       + ((Class_db) this).v * (float) i
		       + (float) i_14_ * ((Class_db) this).L);
	is[0] = (int) (((Class_db) this).A * (float) i
		       + ((Class_db) this).F * (float) i_13_
		       + (float) i_14_ * ((Class_db) this).x);
    }
    
    final void a(int i, int i_15_, int i_16_, int[] is) {
	R++;
	is[1] = (int) (((Class_db) this).n * (float) i_16_
		       + (((Class_db) this).r * (float) i
			  + (float) i_15_ * ((Class_db) this).q)
		       + ((Class_db) this).w);
	is[0] = (int) (((Class_db) this).F * (float) i_15_
		       + ((Class_db) this).A * (float) i
		       + (float) i_16_ * ((Class_db) this).x
		       + ((Class_db) this).J);
	is[2] = (int) (((Class_db) this).p
		       + ((float) i * ((Class_db) this).v
			  + ((Class_db) this).j * (float) i_15_
			  + (float) i_16_ * ((Class_db) this).L));
    }
    
    final Class_q a() {
	y++;
	Class_db class_db_17_ = new Class_db();
	((Class_db) class_db_17_).A = ((Class_db) this).A;
	((Class_db) class_db_17_).j = ((Class_db) this).j;
	((Class_db) class_db_17_).r = ((Class_db) this).r;
	((Class_db) class_db_17_).w = ((Class_db) this).w;
	((Class_db) class_db_17_).F = ((Class_db) this).F;
	((Class_db) class_db_17_).J = ((Class_db) this).J;
	((Class_db) class_db_17_).L = ((Class_db) this).L;
	((Class_db) class_db_17_).q = ((Class_db) this).q;
	((Class_db) class_db_17_).v = ((Class_db) this).v;
	((Class_db) class_db_17_).n = ((Class_db) this).n;
	((Class_db) class_db_17_).p = ((Class_db) this).p;
	((Class_db) class_db_17_).x = ((Class_db) this).x;
	return class_db_17_;
    }
    
    final void o(int i) {
	((Class_db) this).q = 1.0F;
	C++;
	((Class_db) this).A = ((Class_db) this).L = dea.f[i & 0x3fff];
	((Class_db) this).x = dea.d[i & 0x3fff];
	((Class_db) this).v = -((Class_db) this).x;
	((Class_db) this).F = ((Class_db) this).J = ((Class_db) this).r
	    = ((Class_db) this).n = ((Class_db) this).w = ((Class_db) this).j
	    = ((Class_db) this).p = 0.0F;
    }
    
    final float[] a(boolean bool) {
	GameOutPacket.n[2] = ((Class_db) this).v;
	GameOutPacket.n[9] = ((Class_db) this).n;
	if (bool != true)
	    ((Class_db) this).v = 0.15859887F;
	k++;
	GameOutPacket.n[14] = ((Class_db) this).p;
	GameOutPacket.n[12] = ((Class_db) this).J;
	GameOutPacket.n[0] = ((Class_db) this).A;
	GameOutPacket.n[10] = ((Class_db) this).L;
	GameOutPacket.n[8] = ((Class_db) this).x;
	GameOutPacket.n[6] = ((Class_db) this).j;
	GameOutPacket.n[1] = ((Class_db) this).r;
	GameOutPacket.n[5] = ((Class_db) this).q;
	GameOutPacket.n[4] = ((Class_db) this).F;
	GameOutPacket.n[13] = ((Class_db) this).w;
	return GameOutPacket.n;
    }
    
    final void ZA(int i) {
	O++;
	float f = dea.f[0x3fff & i];
	float f_18_ = dea.d[i & 0x3fff];
	float f_19_ = ((Class_db) this).A;
	float f_20_ = ((Class_db) this).F;
	float f_21_ = ((Class_db) this).x;
	((Class_db) this).A = f_18_ * ((Class_db) this).v + f * f_19_;
	float f_22_ = ((Class_db) this).J;
	((Class_db) this).v = ((Class_db) this).v * f - f_18_ * f_19_;
	((Class_db) this).F = f_18_ * ((Class_db) this).j + f * f_20_;
	((Class_db) this).j = f * ((Class_db) this).j - f_18_ * f_20_;
	((Class_db) this).x = f * f_21_ + ((Class_db) this).L * f_18_;
	((Class_db) this).L = ((Class_db) this).L * f - f_21_ * f_18_;
	((Class_db) this).J = f * f_22_ + ((Class_db) this).p * f_18_;
	((Class_db) this).p = ((Class_db) this).p * f - f_22_ * f_18_;
    }
    
    final void oa(int i) {
	I++;
	((Class_db) this).A = 1.0F;
	((Class_db) this).q = ((Class_db) this).L = dea.f[0x3fff & i];
	((Class_db) this).j = dea.d[i & 0x3fff];
	((Class_db) this).F = ((Class_db) this).x = ((Class_db) this).J
	    = ((Class_db) this).r = ((Class_db) this).w = ((Class_db) this).v
	    = ((Class_db) this).p = 0.0F;
	((Class_db) this).n = -((Class_db) this).j;
    }
    
    static final boolean a(int i, int i_23_, boolean bool) {
	t++;
	if (bool != false)
	    return true;
	if ((i_23_ & 0x22) == 0)
	    return false;
	return true;
    }
    
    final void b(boolean bool) {
	((Class_db) this).q = -((Class_db) this).q;
	((Class_db) this).w = -((Class_db) this).w;
	if (bool != false)
	    ZA(4);
	((Class_db) this).n = -((Class_db) this).n;
	((Class_db) this).p = -((Class_db) this).p;
	z++;
	((Class_db) this).j = -((Class_db) this).j;
	((Class_db) this).v = -((Class_db) this).v;
	((Class_db) this).r = -((Class_db) this).r;
	((Class_db) this).L = -((Class_db) this).L;
    }
    
    final void NA(int i, int i_24_, int i_25_) {
	Class_db.i++;
	((Class_db) this).p = (float) i_25_;
	((Class_db) this).r = ((Class_db) this).v = ((Class_db) this).F
	    = ((Class_db) this).j = ((Class_db) this).x = ((Class_db) this).n
	    = 0.0F;
	((Class_db) this).A = ((Class_db) this).q = ((Class_db) this).L = 1.0F;
	((Class_db) this).w = (float) i_24_;
	((Class_db) this).J = (float) i;
    }
    
    public static void c(int i) {
	if (i != 3790)
	    c(8);
	l = null;
    }
    
    final float[] d(int i) {
	if (i != -1801)
	    return null;
	GameOutPacket.n[4] = ((Class_db) this).F;
	GameOutPacket.n[9] = ((Class_db) this).n;
	GameOutPacket.n[12] = 0.0F;
	GameOutPacket.n[14] = 0.0F;
	M++;
	GameOutPacket.n[10] = ((Class_db) this).L;
	GameOutPacket.n[1] = ((Class_db) this).r;
	GameOutPacket.n[6] = ((Class_db) this).j;
	GameOutPacket.n[5] = ((Class_db) this).q;
	GameOutPacket.n[2] = ((Class_db) this).v;
	GameOutPacket.n[13] = 0.0F;
	GameOutPacket.n[0] = ((Class_db) this).A;
	GameOutPacket.n[8] = ((Class_db) this).x;
	return GameOutPacket.n;
    }
    
    final void a(int i, byte i_26_, float f, int i_27_, float f_28_,
		 float f_29_, int i_30_) {
	if (i_27_ != 0) {
	    float f_31_ = dea.f[i_27_ & 0x3fff];
	    float f_32_ = dea.d[i_27_ & 0x3fff];
	    ((Class_db) this).A = (float) i * f_31_;
	    ((Class_db) this).F = (float) i_30_ * -f_32_;
	    ((Class_db) this).L = 1.0F;
	    ((Class_db) this).q = f_31_ * (float) i_30_;
	    ((Class_db) this).r = f_32_ * (float) i;
	    ((Class_db) this).v = ((Class_db) this).j = ((Class_db) this).x
		= ((Class_db) this).n = 0.0F;
	} else {
	    ((Class_db) this).r = ((Class_db) this).v = ((Class_db) this).F
		= ((Class_db) this).j = ((Class_db) this).x
		= ((Class_db) this).n = 0.0F;
	    ((Class_db) this).q = (float) i_30_;
	    ((Class_db) this).A = (float) i;
	    ((Class_db) this).L = 1.0F;
	}
	B++;
	if (i_26_ >= -1)
	    NA(-64, 118, -4);
	((Class_db) this).w = f_28_;
	((Class_db) this).p = f_29_;
	((Class_db) this).J = f;
    }
    
    final void Y() {
	((Class_db) this).r = ((Class_db) this).v = ((Class_db) this).F
	    = ((Class_db) this).j = ((Class_db) this).x = ((Class_db) this).n
	    = ((Class_db) this).J = ((Class_db) this).w = ((Class_db) this).p
	    = 0.0F;
	((Class_db) this).A = ((Class_db) this).q = ((Class_db) this).L = 1.0F;
	E++;
    }
    
    final void M(Class_q class_q) {
	S++;
	Class_db class_db_33_ = (Class_db) class_q;
	((Class_db) this).A = ((Class_db) class_db_33_).A;
	((Class_db) this).v = ((Class_db) class_db_33_).v;
	((Class_db) this).r = ((Class_db) class_db_33_).r;
	((Class_db) this).x = ((Class_db) class_db_33_).x;
	((Class_db) this).j = ((Class_db) class_db_33_).j;
	((Class_db) this).L = ((Class_db) class_db_33_).L;
	((Class_db) this).J = ((Class_db) class_db_33_).J;
	((Class_db) this).F = ((Class_db) class_db_33_).F;
	((Class_db) this).q = ((Class_db) class_db_33_).q;
	((Class_db) this).n = ((Class_db) class_db_33_).n;
	((Class_db) this).w = ((Class_db) class_db_33_).w;
	((Class_db) this).p = ((Class_db) class_db_33_).p;
    }
    
    public Class_db() {
	Y();
    }
    
    final void na(int i, int i_34_, int i_35_, int i_36_, int i_37_,
		  int i_38_) {
	H++;
	float f = dea.f[i_36_ & 0x3fff];
	float f_39_ = dea.d[0x3fff & i_36_];
	float f_40_ = dea.f[0x3fff & i_37_];
	float f_41_ = dea.d[0x3fff & i_37_];
	float f_42_ = dea.f[i_38_ & 0x3fff];
	float f_43_ = dea.d[0x3fff & i_38_];
	float f_44_ = f_42_ * f_39_;
	float f_45_ = f_39_ * f_43_;
	((Class_db) this).n = f_43_ * f_41_ + f_40_ * f_44_;
	((Class_db) this).v = f_41_ * f;
	((Class_db) this).r = f_43_ * -f_40_ + f_41_ * f_44_;
	((Class_db) this).j = -f_39_;
	((Class_db) this).x = -f_41_ * f_42_ + f_40_ * f_45_;
	((Class_db) this).q = f_42_ * f;
	((Class_db) this).F = f_43_ * f;
	((Class_db) this).A = f_45_ * f_41_ + f_42_ * f_40_;
	((Class_db) this).L = f_40_ * f;
	((Class_db) this).J = ((float) -i * ((Class_db) this).A
			       - ((Class_db) this).F * (float) i_34_
			       - ((Class_db) this).x * (float) i_35_);
	((Class_db) this).p = ((float) -i * ((Class_db) this).v
			       - (float) i_34_ * ((Class_db) this).j
			       - ((Class_db) this).L * (float) i_35_);
	((Class_db) this).w = (((Class_db) this).r * (float) -i
			       - (float) i_34_ * ((Class_db) this).q
			       - (float) i_35_ * ((Class_db) this).n);
    }
    
    final void a(Class_q class_q, byte i) {
	N++;
	Class_db class_db_46_ = (Class_db) class_q;
	((Class_db) this).A = ((Class_db) class_db_46_).A;
	((Class_db) this).F = ((Class_db) class_db_46_).r;
	((Class_db) this).x = ((Class_db) class_db_46_).v;
	if (i <= -21) {
	    ((Class_db) this).q = ((Class_db) class_db_46_).q;
	    ((Class_db) this).r = ((Class_db) class_db_46_).F;
	    ((Class_db) this).n = ((Class_db) class_db_46_).j;
	    ((Class_db) this).v = ((Class_db) class_db_46_).x;
	    ((Class_db) this).L = ((Class_db) class_db_46_).L;
	    ((Class_db) this).j = ((Class_db) class_db_46_).n;
	    ((Class_db) this).J
		= -(((Class_db) class_db_46_).J * ((Class_db) this).A
		    + ((Class_db) this).F * ((Class_db) class_db_46_).w
		    + ((Class_db) this).x * ((Class_db) class_db_46_).p);
	    ((Class_db) this).w
		= -(((Class_db) class_db_46_).J * ((Class_db) this).r
		    + ((Class_db) this).q * ((Class_db) class_db_46_).w
		    + ((Class_db) this).n * ((Class_db) class_db_46_).p);
	    ((Class_db) this).p
		= -(((Class_db) class_db_46_).p * ((Class_db) this).L
		    + (((Class_db) class_db_46_).J * ((Class_db) this).v
		       + ((Class_db) class_db_46_).w * ((Class_db) this).j));
	}
    }
    
    final void w(int i) {
	G++;
	float f = dea.f[0x3fff & i];
	float f_47_ = dea.d[0x3fff & i];
	float f_48_ = ((Class_db) this).r;
	float f_49_ = ((Class_db) this).q;
	float f_50_ = ((Class_db) this).n;
	((Class_db) this).r = f * f_48_ - ((Class_db) this).v * f_47_;
	float f_51_ = ((Class_db) this).w;
	((Class_db) this).q = f_49_ * f - f_47_ * ((Class_db) this).j;
	((Class_db) this).v = f * ((Class_db) this).v + f_47_ * f_48_;
	((Class_db) this).n = f_50_ * f - ((Class_db) this).L * f_47_;
	((Class_db) this).j = ((Class_db) this).j * f + f_49_ * f_47_;
	((Class_db) this).L = f * ((Class_db) this).L + f_47_ * f_50_;
	((Class_db) this).w = f_51_ * f - f_47_ * ((Class_db) this).p;
	((Class_db) this).p = f_51_ * f_47_ + ((Class_db) this).p * f;
    }
    
    static final String a(byte i) {
	P++;
	int i_52_ = -123 % ((i - 60) / 49);
	if (gea.n || um.b == null)
	    return "";
	return ((bfa) um.b).p;
    }
    
    final void AA(int i) {
	K++;
	float f = dea.f[0x3fff & i];
	float f_53_ = dea.d[i & 0x3fff];
	float f_54_ = ((Class_db) this).A;
	float f_55_ = ((Class_db) this).F;
	float f_56_ = ((Class_db) this).x;
	float f_57_ = ((Class_db) this).J;
	((Class_db) this).A = f * f_54_ - ((Class_db) this).r * f_53_;
	((Class_db) this).F = f_55_ * f - ((Class_db) this).q * f_53_;
	((Class_db) this).r = f_54_ * f_53_ + ((Class_db) this).r * f;
	((Class_db) this).x = f * f_56_ - ((Class_db) this).n * f_53_;
	((Class_db) this).q = f * ((Class_db) this).q + f_55_ * f_53_;
	((Class_db) this).J = f * f_57_ - ((Class_db) this).w * f_53_;
	((Class_db) this).n = f_53_ * f_56_ + f * ((Class_db) this).n;
	((Class_db) this).w = ((Class_db) this).w * f + f_53_ * f_57_;
    }
}
