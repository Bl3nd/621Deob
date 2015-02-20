/* rd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class rd extends Class_q
{
    float i;
    static int j;
    float k;
    static int l;
    float m;
    static float n;
    float o;
    static int p;
    float q;
    static int r;
    float s;
    static int t;
    static int u;
    float v;
    float w;
    static int x;
    static int y;
    float z;
    static int A;
    float B;
    float C;
    static Interface D = null;
    static int E;
    static int F;
    static int G;
    static int H;
    static int I;
    static tba[] J;
    static int[] K = new int[4096];
    static int L;
    float M;
    static int N;
    
    final void a(int i, int i_0_, int i_1_, int[] is) {
	is[1] = (int) (((rd) this).w * (float) i_1_
		       + ((float) i * ((rd) this).i
			  + ((rd) this).k * (float) i_0_)
		       + ((rd) this).o);
	l++;
	is[0] = (int) ((float) i_1_ * ((rd) this).s
		       + (((rd) this).z * (float) i
			  + ((rd) this).m * (float) i_0_)
		       + ((rd) this).v);
	is[2] = (int) (((rd) this).B + (((rd) this).C * (float) i_1_
					+ ((float) i_0_ * ((rd) this).M
					   + ((rd) this).q * (float) i)));
    }
    
    final void U(int i, int i_2_, int i_3_) {
	((rd) this).o += (float) i_2_;
	((rd) this).v += (float) i;
	r++;
	((rd) this).B += (float) i_3_;
    }
    
    final void ZA(int i) {
	x++;
	float f = oi.v[i & 0x3fff];
	float f_4_ = oi.x[i & 0x3fff];
	float f_5_ = ((rd) this).z;
	float f_6_ = ((rd) this).m;
	float f_7_ = ((rd) this).s;
	((rd) this).z = f * f_5_ + ((rd) this).q * f_4_;
	float f_8_ = ((rd) this).v;
	((rd) this).q = f * ((rd) this).q - f_4_ * f_5_;
	((rd) this).m = ((rd) this).M * f_4_ + f_6_ * f;
	((rd) this).s = ((rd) this).C * f_4_ + f * f_7_;
	((rd) this).M = f * ((rd) this).M - f_4_ * f_6_;
	((rd) this).v = f_4_ * ((rd) this).B + f_8_ * f;
	((rd) this).C = f * ((rd) this).C - f_7_ * f_4_;
	((rd) this).B = ((rd) this).B * f - f_8_ * f_4_;
    }
    
    final Class_q a() {
	N++;
	rd var_rd_9_ = new rd();
	((rd) var_rd_9_).z = ((rd) this).z;
	((rd) var_rd_9_).w = ((rd) this).w;
	((rd) var_rd_9_).m = ((rd) this).m;
	((rd) var_rd_9_).B = ((rd) this).B;
	((rd) var_rd_9_).k = ((rd) this).k;
	((rd) var_rd_9_).o = ((rd) this).o;
	((rd) var_rd_9_).v = ((rd) this).v;
	((rd) var_rd_9_).q = ((rd) this).q;
	((rd) var_rd_9_).M = ((rd) this).M;
	((rd) var_rd_9_).s = ((rd) this).s;
	((rd) var_rd_9_).i = ((rd) this).i;
	((rd) var_rd_9_).C = ((rd) this).C;
	return var_rd_9_;
    }
    
    final void AA(int i) {
	p++;
	float f = oi.v[0x3fff & i];
	float f_10_ = oi.x[i & 0x3fff];
	float f_11_ = ((rd) this).z;
	float f_12_ = ((rd) this).m;
	float f_13_ = ((rd) this).s;
	float f_14_ = ((rd) this).v;
	((rd) this).z = f_11_ * f - ((rd) this).i * f_10_;
	((rd) this).i = f_11_ * f_10_ + f * ((rd) this).i;
	((rd) this).m = f * f_12_ - ((rd) this).k * f_10_;
	((rd) this).s = f_13_ * f - ((rd) this).w * f_10_;
	((rd) this).k = f * ((rd) this).k + f_10_ * f_12_;
	((rd) this).v = f_14_ * f - f_10_ * ((rd) this).o;
	((rd) this).w = f_10_ * f_13_ + ((rd) this).w * f;
	((rd) this).o = f * ((rd) this).o + f_10_ * f_14_;
    }
    
    final void w(int i) {
	t++;
	float f = oi.v[i & 0x3fff];
	float f_15_ = oi.x[i & 0x3fff];
	float f_16_ = ((rd) this).i;
	float f_17_ = ((rd) this).k;
	float f_18_ = ((rd) this).w;
	float f_19_ = ((rd) this).o;
	((rd) this).i = f_16_ * f - f_15_ * ((rd) this).q;
	((rd) this).q = ((rd) this).q * f + f_15_ * f_16_;
	((rd) this).k = f * f_17_ - f_15_ * ((rd) this).M;
	((rd) this).w = f_18_ * f - ((rd) this).C * f_15_;
	((rd) this).M = f_15_ * f_17_ + f * ((rd) this).M;
	((rd) this).C = f * ((rd) this).C + f_15_ * f_18_;
	((rd) this).o = f * f_19_ - ((rd) this).B * f_15_;
	((rd) this).B = f_15_ * f_19_ + f * ((rd) this).B;
    }
    
    final void oa(int i) {
	((rd) this).z = 1.0F;
	L++;
	((rd) this).k = ((rd) this).C = oi.v[0x3fff & i];
	((rd) this).M = oi.x[0x3fff & i];
	((rd) this).m = ((rd) this).s = ((rd) this).v = ((rd) this).i
	    = ((rd) this).o = ((rd) this).q = ((rd) this).B = 0.0F;
	((rd) this).w = -((rd) this).M;
    }
    
    final void YA(int[] is) {
	u++;
	float f = (float) is[0] - ((rd) this).v;
	float f_20_ = (float) is[1] - ((rd) this).o;
	float f_21_ = (float) is[2] - ((rd) this).B;
	is[0] = (int) (f_21_ * ((rd) this).q
		       + (f_20_ * ((rd) this).i + ((rd) this).z * f));
	is[2] = (int) (f_21_ * ((rd) this).C
		       + (f * ((rd) this).s + ((rd) this).w * f_20_));
	is[1] = (int) (((rd) this).k * f_20_ + f * ((rd) this).m
		       + ((rd) this).M * f_21_);
    }
    
    final void J(int i) {
	((rd) this).C = 1.0F;
	I++;
	((rd) this).z = ((rd) this).k = oi.v[i & 0x3fff];
	((rd) this).i = oi.x[0x3fff & i];
	((rd) this).m = -((rd) this).i;
	((rd) this).s = ((rd) this).v = ((rd) this).w = ((rd) this).o
	    = ((rd) this).q = ((rd) this).M = ((rd) this).B = 0.0F;
    }
    
    final void NA(int i, int i_22_, int i_23_) {
	((rd) this).o = (float) i_22_;
	((rd) this).B = (float) i_23_;
	((rd) this).i = ((rd) this).q = ((rd) this).m = ((rd) this).M
	    = ((rd) this).s = ((rd) this).w = 0.0F;
	((rd) this).z = ((rd) this).k = ((rd) this).C = 1.0F;
	((rd) this).v = (float) i;
	A++;
    }
    
    public static void a(byte i) {
	J = null;
	K = null;
	if (i < 14)
	    G = -126;
	D = null;
    }
    
    final void M(Class_q class_q) {
	E++;
	rd var_rd_24_ = (rd) class_q;
	((rd) this).B = ((rd) var_rd_24_).B;
	((rd) this).v = ((rd) var_rd_24_).v;
	((rd) this).C = ((rd) var_rd_24_).C;
	((rd) this).z = ((rd) var_rd_24_).z;
	((rd) this).o = ((rd) var_rd_24_).o;
	((rd) this).M = ((rd) var_rd_24_).M;
	((rd) this).q = ((rd) var_rd_24_).q;
	((rd) this).w = ((rd) var_rd_24_).w;
	((rd) this).k = ((rd) var_rd_24_).k;
	((rd) this).m = ((rd) var_rd_24_).m;
	((rd) this).i = ((rd) var_rd_24_).i;
	((rd) this).s = ((rd) var_rd_24_).s;
    }
    
    final void o(int i) {
	F++;
	((rd) this).k = 1.0F;
	((rd) this).z = ((rd) this).C = oi.v[0x3fff & i];
	((rd) this).s = oi.x[0x3fff & i];
	((rd) this).m = ((rd) this).v = ((rd) this).i = ((rd) this).w
	    = ((rd) this).o = ((rd) this).M = ((rd) this).B = 0.0F;
	((rd) this).q = -((rd) this).s;
    }
    
    final void na(int i, int i_25_, int i_26_, int i_27_, int i_28_,
		  int i_29_) {
	y++;
	float f = oi.v[i_27_ & 0x3fff];
	float f_30_ = oi.x[0x3fff & i_27_];
	float f_31_ = oi.v[0x3fff & i_28_];
	float f_32_ = oi.x[0x3fff & i_28_];
	float f_33_ = oi.v[i_29_ & 0x3fff];
	float f_34_ = oi.x[0x3fff & i_29_];
	float f_35_ = f_33_ * f_30_;
	float f_36_ = f_30_ * f_34_;
	((rd) this).i = f_34_ * -f_31_ + f_32_ * f_35_;
	((rd) this).k = f * f_33_;
	((rd) this).C = f * f_31_;
	((rd) this).M = -f_30_;
	((rd) this).w = f_32_ * f_34_ + f_35_ * f_31_;
	((rd) this).z = f_32_ * f_36_ + f_31_ * f_33_;
	((rd) this).q = f * f_32_;
	((rd) this).s = -f_32_ * f_33_ + f_36_ * f_31_;
	((rd) this).m = f_34_ * f;
	((rd) this).v
	    = ((float) -i * ((rd) this).z - ((rd) this).m * (float) i_25_
	       - ((rd) this).s * (float) i_26_);
	((rd) this).o
	    = (((rd) this).i * (float) -i - (float) i_25_ * ((rd) this).k
	       - ((rd) this).w * (float) i_26_);
	((rd) this).B
	    = (((rd) this).q * (float) -i - ((rd) this).M * (float) i_25_
	       - ((rd) this).C * (float) i_26_);
    }
    
    final void wa(int i, int i_37_, int i_38_, int[] is) {
	is[1]
	    = (int) (((rd) this).k * (float) i_37_ + ((rd) this).i * (float) i
		     + ((rd) this).w * (float) i_38_);
	H++;
	is[2] = (int) (((rd) this).C * (float) i_38_
		       + (((rd) this).M * (float) i_37_
			  + ((rd) this).q * (float) i));
	is[0]
	    = (int) ((float) i * ((rd) this).z + ((rd) this).m * (float) i_37_
		     + ((rd) this).s * (float) i_38_);
    }
    
    final void Y() {
	j++;
	((rd) this).i = ((rd) this).q = ((rd) this).m = ((rd) this).M
	    = ((rd) this).s = ((rd) this).w = ((rd) this).v = ((rd) this).o
	    = ((rd) this).B = 0.0F;
	((rd) this).z = ((rd) this).k = ((rd) this).C = 1.0F;
    }
    
    public rd() {
	Y();
    }
    
    static {
	G = 0;
	J = new tba[300];
    }
}
