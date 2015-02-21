/* mga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mga extends Class_q
{
    static int i;
    static int j;
    static int k;
    static int l;
    static int m;
    static int n;
    static tb o;
    float p;
    float q;
    static int r;
    static boolean s = false;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    float A;
    static int B;
    static int C;
    static int D;
    float E;
    float F;
    static int G;
    float H;
    float I;
    static int J;
    static int K;
    static int L;
    float M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    float T;
    static int U;
    static int V;
    static int W;
    static int X;
    static int Y;
    static int Z;
    static int ab;
    static int bb;
    float cb;
    static int db;
    static int eb;
    float fb;
    float gb;
    static int hb;
    
    final void M(Class_q class_q) {
	k++;
	mga var_mga_0_ = (mga) class_q;
	((mga) this).A = ((mga) var_mga_0_).A;
	((mga) this).fb = ((mga) var_mga_0_).fb;
	((mga) this).H = ((mga) var_mga_0_).H;
	((mga) this).I = ((mga) var_mga_0_).I;
	((mga) this).T = ((mga) var_mga_0_).T;
	((mga) this).M = ((mga) var_mga_0_).M;
	((mga) this).cb = ((mga) var_mga_0_).cb;
	((mga) this).E = ((mga) var_mga_0_).E;
	((mga) this).F = ((mga) var_mga_0_).F;
	((mga) this).q = ((mga) var_mga_0_).q;
	((mga) this).p = ((mga) var_mga_0_).p;
	((mga) this).gb = ((mga) var_mga_0_).gb;
    }
    
    final void a(int i, Class_q class_q) {
	B++;
	mga var_mga_1_ = (mga) class_q;
	((mga) this).M = ((mga) var_mga_1_).M;
	((mga) this).p = 0.0F;
	((mga) this).gb = ((mga) var_mga_1_).gb;
	((mga) this).A = (float) i;
	((mga) this).I = ((mga) var_mga_1_).I;
	((mga) this).H = ((mga) var_mga_1_).H;
	((mga) this).q = ((mga) var_mga_1_).q;
	((mga) this).T = ((mga) var_mga_1_).T;
	((mga) this).E = 0.0F;
	((mga) this).F = ((mga) var_mga_1_).F;
	((mga) this).fb = ((mga) var_mga_1_).fb;
	((mga) this).cb = ((mga) var_mga_1_).cb;
    }
    
    static final void c(int i) {
	if (i == 0) {
	    if (qd.v == 2) {
		vk.i[0].a(ff.p[0]);
		vk.i[1].a(ff.p[1]);
	    } else if (qd.v == 3) {
		vk.i[0].a(ff.p[0]);
		vk.i[1].a(ff.p[1]);
		vk.i[2].a(ff.p[2]);
	    } else {
		vk.i[0].a(ff.p[0]);
		vk.i[1].a(ff.p[1]);
		vk.i[2].a(ff.p[2]);
		vk.i[3].a(ff.p[3]);
	    }
	} else if (i == 1) {
	    if (qd.v == 2)
		vk.i[0].a(ff.p[2]);
	    else if (qd.v == 3) {
		vk.i[0].a(ff.p[3]);
		vk.i[1].a(ff.p[4]);
	    } else {
		vk.i[0].a(ff.p[4]);
		vk.i[1].a(ff.p[5]);
		vk.i[2].a(ff.p[6]);
	    }
	} else if (i == 2) {
	    if (qd.v == 2)
		vk.i[0].a(ff.p[3]);
	    else if (qd.v == 3)
		vk.i[0].a(ff.p[5]);
	    else
		vk.i[0].a(ff.p[7]);
	}
    }
    
    final void oa(int i) {
	((mga) this).M = 1.0F;
	j++;
	((mga) this).T = ((mga) this).I = oi.v[0x3fff & i];
	((mga) this).fb = oi.x[i & 0x3fff];
	((mga) this).q = ((mga) this).gb = ((mga) this).A = ((mga) this).cb
	    = ((mga) this).p = ((mga) this).H = ((mga) this).E = 0.0F;
	((mga) this).F = -((mga) this).fb;
    }
    
    final void na(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
	P++;
	float f = oi.v[i_4_ & 0x3fff];
	float f_7_ = oi.x[i_4_ & 0x3fff];
	float f_8_ = oi.v[i_5_ & 0x3fff];
	float f_9_ = oi.x[0x3fff & i_5_];
	float f_10_ = oi.v[0x3fff & i_6_];
	float f_11_ = oi.x[i_6_ & 0x3fff];
	float f_12_ = f_7_ * f_10_;
	float f_13_ = f_7_ * f_11_;
	((mga) this).q = f_11_ * f;
	((mga) this).F = f_8_ * f_12_ + f_9_ * f_11_;
	((mga) this).fb = -f_7_;
	((mga) this).gb = f_8_ * f_13_ + f_10_ * -f_9_;
	((mga) this).H = f_9_ * f;
	((mga) this).T = f * f_10_;
	((mga) this).cb = -f_8_ * f_11_ + f_12_ * f_9_;
	((mga) this).I = f * f_8_;
	((mga) this).M = f_13_ * f_9_ + f_8_ * f_10_;
	((mga) this).A
	    = ((float) -i * ((mga) this).M - ((mga) this).q * (float) i_2_
	       - ((mga) this).gb * (float) i_3_);
	((mga) this).p
	    = ((float) -i * ((mga) this).cb - (float) i_2_ * ((mga) this).T
	       - ((mga) this).F * (float) i_3_);
	((mga) this).E
	    = (((mga) this).H * (float) -i - ((mga) this).fb * (float) i_2_
	       - (float) i_3_ * ((mga) this).I);
    }
    
    final void a(float f, float f_14_, float f_15_, byte i) {
	int i_16_ = 121 / ((i + 7) / 43);
	((mga) this).p += f_15_;
	((mga) this).A += f;
	((mga) this).E += f_14_;
	X++;
    }
    
    final void J(int i) {
	((mga) this).I = 1.0F;
	W++;
	((mga) this).M = ((mga) this).T = oi.v[i & 0x3fff];
	((mga) this).cb = oi.x[0x3fff & i];
	((mga) this).q = -((mga) this).cb;
	((mga) this).gb = ((mga) this).A = ((mga) this).F = ((mga) this).p
	    = ((mga) this).H = ((mga) this).fb = ((mga) this).E = 0.0F;
    }
    
    final void a(int i, int i_17_, int i_18_, int[] is) {
	is[2] = (int) ((float) i_17_ * ((mga) this).fb
		       + ((mga) this).H * (float) i
		       + (float) i_18_ * ((mga) this).I + ((mga) this).E);
	w++;
	is[1] = (int) (((mga) this).p + ((float) i * ((mga) this).cb
					 + ((mga) this).T * (float) i_17_
					 + ((mga) this).F * (float) i_18_));
	is[0] = (int) (((mga) this).gb * (float) i_18_
		       + (((mga) this).M * (float) i
			  + (float) i_17_ * ((mga) this).q)
		       + ((mga) this).A);
    }
    
    final float[] a(int i, float[] fs) {
	fs[6] = ((mga) this).F;
	fs[5] = ((mga) this).T;
	fs[4] = ((mga) this).cb;
	fs[1] = ((mga) this).q;
	fs[2] = ((mga) this).gb;
	fs[0] = ((mga) this).M;
	fs[3] = ((mga) this).A;
	if (i != -26631)
	    ((mga) this).F = 0.81421393F;
	fs[7] = ((mga) this).p;
	u++;
	return fs;
    }
    
    final void o(int i) {
	((mga) this).T = 1.0F;
	n++;
	((mga) this).M = ((mga) this).I = oi.v[0x3fff & i];
	((mga) this).gb = oi.x[0x3fff & i];
	((mga) this).H = -((mga) this).gb;
	((mga) this).q = ((mga) this).A = ((mga) this).cb = ((mga) this).F
	    = ((mga) this).p = ((mga) this).fb = ((mga) this).E = 0.0F;
    }
    
    static final void a(int i, int i_19_, byte i_20_, Interface var_kp) {
	eb++;
	if (((Interface) var_kp).hd != 0) {
	    if (((Interface) var_kp).hd != 1) {
		if (((Interface) var_kp).hd == 2)
		    ((Interface) var_kp).locX
			= i_19_ - ((Interface) var_kp).hc - ((Interface) var_kp).minHScroll;
		else if (((Interface) var_kp).hd == 3)
		    ((Interface) var_kp).locX = ((Interface) var_kp).hc * i_19_ >> 14;
		else if (((Interface) var_kp).hd != 4)
		    ((Interface) var_kp).locX
			= i_19_ - ((Interface) var_kp).minHScroll - (((Interface) var_kp).hc * i_19_
						      >> 14);
		else
		    ((Interface) var_kp).locX = ((i_19_ - ((Interface) var_kp).minHScroll) / 2
				       + (i_19_ * ((Interface) var_kp).hc >> 14));
	    } else
		((Interface) var_kp).locX
		    = (i_19_ - ((Interface) var_kp).minHScroll) / 2 + ((Interface) var_kp).hc;
	} else
	    ((Interface) var_kp).locX = ((Interface) var_kp).hc;
	if (i_20_ > -42)
	    c(-35);
	if (((Interface) var_kp).ab != 0) {
	    if (((Interface) var_kp).ab != 1) {
		if (((Interface) var_kp).ab != 2) {
		    if (((Interface) var_kp).ab != 3) {
			if (((Interface) var_kp).ab != 4)
			    ((Interface) var_kp).locY = (i - (i * ((Interface) var_kp).Wc >> 14)
					       - ((Interface) var_kp).minVScroll);
			else
			    ((Interface) var_kp).locY = ((i - ((Interface) var_kp).minVScroll) / 2
					       + (i * ((Interface) var_kp).Wc >> 14));
		    } else
			((Interface) var_kp).locY = ((Interface) var_kp).Wc * i >> 14;
		} else
		    ((Interface) var_kp).locY = i - ((Interface) var_kp).Wc - ((Interface) var_kp).minVScroll;
	    } else
		((Interface) var_kp).locY = ((Interface) var_kp).Wc + (i - ((Interface) var_kp).minVScroll) / 2;
	} else
	    ((Interface) var_kp).locY = ((Interface) var_kp).Wc;
	if (lba.Q
	    && (((nm) client.c(var_kp)).l != 0 || ((Interface) var_kp).type == 0)) {
	    if (((Interface) var_kp).locX >= 0) {
		if (((Interface) var_kp).minHScroll + ((Interface) var_kp).locX > i_19_)
		    ((Interface) var_kp).locX = i_19_ - ((Interface) var_kp).minHScroll;
	    } else
		((Interface) var_kp).locX = 0;
	    if (((Interface) var_kp).locY >= 0) {
		if (((Interface) var_kp).locY + ((Interface) var_kp).minVScroll > i)
		    ((Interface) var_kp).locY = i - ((Interface) var_kp).minVScroll;
	    } else
		((Interface) var_kp).locY = 0;
	}
    }
    
    final void NA(int i, int i_21_, int i_22_) {
	((mga) this).cb = ((mga) this).H = ((mga) this).q = ((mga) this).fb
	    = ((mga) this).gb = ((mga) this).F = 0.0F;
	V++;
	((mga) this).A = (float) i;
	((mga) this).E = (float) i_22_;
	((mga) this).p = (float) i_21_;
	((mga) this).M = ((mga) this).T = ((mga) this).I = 1.0F;
    }
    
    final float a(float f, float f_23_, float f_24_, int i) {
	R++;
	if (i <= 59)
	    b(0.40349302F, -45, -0.48776874F, 0.7283173F);
	return (((mga) this).p
		+ (f_24_ * ((mga) this).F
		   + (f_23_ * ((mga) this).T + f * ((mga) this).cb)));
    }
    
    final void wa(int i, int i_25_, int i_26_, int[] is) {
	is[2] = (int) (((mga) this).fb * (float) i_25_
		       + (float) i * ((mga) this).H
		       + ((mga) this).I * (float) i_26_);
	C++;
	is[0] = (int) ((float) i_25_ * ((mga) this).q
		       + ((mga) this).M * (float) i
		       + ((mga) this).gb * (float) i_26_);
	is[1] = (int) (((mga) this).cb * (float) i
		       + ((mga) this).T * (float) i_25_
		       + ((mga) this).F * (float) i_26_);
    }
    
    static final String a(boolean bool, int i) {
	x++;
	if (bool != true)
	    return null;
	String string = Integer.toString(i);
	for (int i_27_ = string.length() - 3; i_27_ > 0; i_27_ -= 3)
	    string
		= string.substring(0, i_27_) + "," + string.substring(i_27_);
	if (string.length() > 9)
	    return (" <col=00ff80>" + string.substring(0, string.length() - 8)
		    + GameText.millionMoneyLetter_.getString((byte) -59, cba.languageID) + " (" + string + ")</col>");
	if (string.length() > 6)
	    return (" <col=ffffff>" + string.substring(0, string.length() - 4)
		    + GameText.thousandMoneyLetter_.getString((byte) 78, cba.languageID) + " (" + string + ")</col>");
	return " <col=ffff00>" + string + "</col>";
    }
    
    final float a(float f, int i, float f_28_, float f_29_) {
	int i_30_ = 114 / ((i - 39) / 34);
	db++;
	return (((mga) this).E
		+ (f_28_ * ((mga) this).I
		   + (f_29_ * ((mga) this).H + ((mga) this).fb * f)));
    }
    
    final void Y() {
	((mga) this).M = ((mga) this).T = ((mga) this).I = 1.0F;
	t++;
	((mga) this).cb = ((mga) this).H = ((mga) this).q = ((mga) this).fb
	    = ((mga) this).gb = ((mga) this).F = ((mga) this).A
	    = ((mga) this).p = ((mga) this).E = 0.0F;
    }
    
    final float[] b(int i, float[] fs) {
	fs[9] = ((mga) this).fb;
	Z++;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 0.0F;
	fs[6] = ((mga) this).F;
	fs[1] = ((mga) this).q;
	fs[4] = ((mga) this).cb;
	fs[7] = 0.0F;
	fs[2] = ((mga) this).gb;
	fs[8] = ((mga) this).H;
	fs[3] = 0.0F;
	fs[11] = 0.0F;
	if (i > -46)
	    ((mga) this).I = -0.7262448F;
	fs[10] = ((mga) this).I;
	fs[12] = 0.0F;
	fs[5] = ((mga) this).T;
	fs[0] = ((mga) this).M;
	return fs;
    }
    
    final void a(float f, float f_31_, float f_32_, float f_33_, float f_34_,
		 float f_35_, float f_36_, float f_37_, float f_38_,
		 boolean bool) {
	((mga) this).I = f;
	if (bool != false)
	    ((mga) this).q = 1.4509151F;
	((mga) this).p = 0.0F;
	((mga) this).q = f_31_;
	((mga) this).H = f_35_;
	N++;
	((mga) this).T = f_38_;
	((mga) this).cb = f_36_;
	((mga) this).F = f_37_;
	((mga) this).A = 0.0F;
	((mga) this).fb = f_33_;
	((mga) this).M = f_34_;
	((mga) this).gb = f_32_;
	((mga) this).E = 0.0F;
    }
    
    final void b(float f, int i, float f_39_, float f_40_) {
	((mga) this).M = f;
	((mga) this).T = f_39_;
	((mga) this).q = 0.0F;
	((mga) this).I = f_40_;
	((mga) this).A = 0.0F;
	((mga) this).gb = 0.0F;
	((mga) this).cb = 0.0F;
	((mga) this).p = 0.0F;
	S++;
	((mga) this).E = 0.0F;
	if (i != 18543)
	    ((mga) this).gb = -1.4950978F;
	((mga) this).fb = 0.0F;
	((mga) this).F = 0.0F;
	((mga) this).H = 0.0F;
    }
    
    final void a(int i, float f, byte i_41_, float f_42_, float f_43_,
		 int i_44_, int i_45_) {
	if (i_45_ != 0) {
	    float f_46_ = oi.v[0x3fff & i_45_];
	    float f_47_ = oi.x[i_45_ & 0x3fff];
	    ((mga) this).q = f_47_ * -2.0F * (float) i_44_;
	    ((mga) this).p
		= f + (float) (i_44_ * 2) * (-0.5F * f_47_ - 0.5F * f_46_);
	    ((mga) this).I = 1.0F;
	    ((mga) this).cb = (float) i * (2.0F * f_47_);
	    ((mga) this).A
		= (float) (i * 2) * (0.5F * f_47_ - 0.5F * f_46_) + f_43_;
	    ((mga) this).T = f_46_ * 2.0F * (float) i_44_;
	    ((mga) this).H = ((mga) this).fb = ((mga) this).gb
		= ((mga) this).F = 0.0F;
	    ((mga) this).E = f_42_;
	    ((mga) this).M = (float) i * (f_46_ * 2.0F);
	} else {
	    ((mga) this).p = f - (float) i_44_;
	    ((mga) this).A = f_43_ - (float) i;
	    ((mga) this).E = f_42_;
	    ((mga) this).T = (float) (i_44_ * 2);
	    ((mga) this).I = 1.0F;
	    ((mga) this).M = (float) (2 * i);
	    ((mga) this).cb = ((mga) this).H = ((mga) this).q
		= ((mga) this).fb = ((mga) this).gb = ((mga) this).F = 0.0F;
	}
	K++;
	if (i_41_ != 100)
	    a((byte) -65, 0.1053651F, 1.5524045F, 1.4930007F);
    }
    
    final void ZA(int i) {
	bb++;
	float f = oi.v[0x3fff & i];
	float f_48_ = oi.x[0x3fff & i];
	float f_49_ = ((mga) this).M;
	float f_50_ = ((mga) this).q;
	float f_51_ = ((mga) this).gb;
	((mga) this).M = f_48_ * ((mga) this).H + f * f_49_;
	float f_52_ = ((mga) this).A;
	((mga) this).H = f * ((mga) this).H - f_48_ * f_49_;
	((mga) this).q = f_50_ * f + ((mga) this).fb * f_48_;
	((mga) this).fb = ((mga) this).fb * f - f_48_ * f_50_;
	((mga) this).gb = ((mga) this).I * f_48_ + f * f_51_;
	((mga) this).A = ((mga) this).E * f_48_ + f_52_ * f;
	((mga) this).I = f * ((mga) this).I - f_48_ * f_51_;
	((mga) this).E = f * ((mga) this).E - f_48_ * f_52_;
    }
    
    final void a(float f, byte i, float f_53_, float f_54_) {
	((mga) this).M = ((mga) this).T = ((mga) this).I = 1.0F;
	((mga) this).E = f_53_;
	if (i != 36)
	    ((mga) this).I = 0.17980927F;
	((mga) this).p = f;
	((mga) this).cb = ((mga) this).H = ((mga) this).q = ((mga) this).fb
	    = ((mga) this).gb = ((mga) this).F = 0.0F;
	Y++;
	((mga) this).A = f_54_;
    }
    
    final void w(int i) {
	Q++;
	float f = oi.v[i & 0x3fff];
	float f_55_ = oi.x[i & 0x3fff];
	float f_56_ = ((mga) this).cb;
	float f_57_ = ((mga) this).T;
	float f_58_ = ((mga) this).F;
	float f_59_ = ((mga) this).p;
	((mga) this).cb = f * f_56_ - f_55_ * ((mga) this).H;
	((mga) this).T = f_57_ * f - ((mga) this).fb * f_55_;
	((mga) this).H = f_56_ * f_55_ + f * ((mga) this).H;
	((mga) this).F = f * f_58_ - f_55_ * ((mga) this).I;
	((mga) this).fb = f * ((mga) this).fb + f_57_ * f_55_;
	((mga) this).p = f * f_59_ - f_55_ * ((mga) this).E;
	((mga) this).I = ((mga) this).I * f + f_55_ * f_58_;
	((mga) this).E = f * ((mga) this).E + f_55_ * f_59_;
    }
    
    final void a(float f, float[] fs, float f_60_, float f_61_, int i) {
	if (i != 12342)
	    U(-125, -51, 97);
	G++;
	fs[2] = ((mga) this).I * f_61_ + (((mga) this).fb * f_60_
					  + f * ((mga) this).H);
	fs[0] = f_61_ * ((mga) this).gb + (((mga) this).M * f
					   + ((mga) this).q * f_60_);
	fs[1] = (((mga) this).T * f_60_ + f * ((mga) this).cb
		 + ((mga) this).F * f_61_);
    }
    
    final void a(byte i, Class_q class_q) {
	J++;
	mga var_mga_62_ = (mga) class_q;
	float f = ((mga) this).M;
	float f_63_ = ((mga) this).cb;
	if (i != -6)
	    ((mga) this).H = 1.1429617F;
	float f_64_ = ((mga) this).q;
	float f_65_ = ((mga) this).T;
	float f_66_ = ((mga) this).gb;
	float f_67_ = ((mga) this).F;
	float f_68_ = ((mga) this).A;
	((mga) this).cb
	    = (f_63_ * ((mga) var_mga_62_).T + f * ((mga) var_mga_62_).cb
	       + ((mga) var_mga_62_).F * ((mga) this).H);
	float f_69_ = ((mga) this).p;
	((mga) this).M
	    = (((mga) var_mga_62_).gb * ((mga) this).H
	       + (f_63_ * ((mga) var_mga_62_).q + ((mga) var_mga_62_).M * f));
	((mga) this).q = (((mga) this).fb * ((mga) var_mga_62_).gb
			  + (((mga) var_mga_62_).M * f_64_
			     + ((mga) var_mga_62_).q * f_65_));
	((mga) this).T = (((mga) this).fb * ((mga) var_mga_62_).F
			  + (f_65_ * ((mga) var_mga_62_).T
			     + ((mga) var_mga_62_).cb * f_64_));
	((mga) this).H
	    = (((mga) var_mga_62_).I * ((mga) this).H
	       + (((mga) var_mga_62_).H * f + ((mga) var_mga_62_).fb * f_63_));
	((mga) this).gb
	    = (f_66_ * ((mga) var_mga_62_).M + f_67_ * ((mga) var_mga_62_).q
	       + ((mga) this).I * ((mga) var_mga_62_).gb);
	((mga) this).fb
	    = (((mga) var_mga_62_).fb * f_65_ + f_64_ * ((mga) var_mga_62_).H
	       + ((mga) this).fb * ((mga) var_mga_62_).I);
	((mga) this).F = (((mga) this).I * ((mga) var_mga_62_).F
			  + (((mga) var_mga_62_).cb * f_66_
			     + ((mga) var_mga_62_).T * f_67_));
	((mga) this).I
	    = (((mga) var_mga_62_).H * f_66_ + ((mga) var_mga_62_).fb * f_67_
	       + ((mga) var_mga_62_).I * ((mga) this).I);
	((mga) this).A
	    = ((mga) var_mga_62_).A + (((mga) var_mga_62_).gb * ((mga) this).E
				       + (f_69_ * ((mga) var_mga_62_).q
					  + ((mga) var_mga_62_).M * f_68_));
	((mga) this).p = (((mga) var_mga_62_).F * ((mga) this).E
			  + (f_69_ * ((mga) var_mga_62_).T
			     + f_68_ * ((mga) var_mga_62_).cb)
			  + ((mga) var_mga_62_).p);
	((mga) this).E
	    = ((mga) var_mga_62_).E + (((mga) this).E * ((mga) var_mga_62_).I
				       + (f_68_ * ((mga) var_mga_62_).H
					  + f_69_ * ((mga) var_mga_62_).fb));
    }
    
    final void a(Class_q class_q, Class_q class_q_70_) {
	i++;
	mga var_mga_71_ = (mga) class_q;
	mga var_mga_72_ = (mga) class_q_70_;
	((mga) this).M
	    = (((mga) var_mga_72_).H * ((mga) var_mga_71_).gb
	       + (((mga) var_mga_71_).M * ((mga) var_mga_72_).M
		  + ((mga) var_mga_72_).cb * ((mga) var_mga_71_).q));
	((mga) this).cb = (((mga) var_mga_71_).cb * ((mga) var_mga_72_).M
			   + ((mga) var_mga_72_).cb * ((mga) var_mga_71_).T
			   + ((mga) var_mga_71_).F * ((mga) var_mga_72_).H);
	((mga) this).q = (((mga) var_mga_71_).q * ((mga) var_mga_72_).T
			  + ((mga) var_mga_71_).M * ((mga) var_mga_72_).q
			  + ((mga) var_mga_72_).fb * ((mga) var_mga_71_).gb);
	((mga) this).H = (((mga) var_mga_71_).I * ((mga) var_mga_72_).H
			  + (((mga) var_mga_71_).fb * ((mga) var_mga_72_).cb
			     + ((mga) var_mga_71_).H * ((mga) var_mga_72_).M));
	((mga) this).T
	    = (((mga) var_mga_72_).fb * ((mga) var_mga_71_).F
	       + (((mga) var_mga_72_).T * ((mga) var_mga_71_).T
		  + ((mga) var_mga_72_).q * ((mga) var_mga_71_).cb));
	((mga) this).fb = (((mga) var_mga_71_).H * ((mga) var_mga_72_).q
			   + ((mga) var_mga_72_).T * ((mga) var_mga_71_).fb
			   + ((mga) var_mga_72_).fb * ((mga) var_mga_71_).I);
	((mga) this).gb = (((mga) var_mga_72_).gb * ((mga) var_mga_71_).M
			   + ((mga) var_mga_71_).q * ((mga) var_mga_72_).F
			   + ((mga) var_mga_72_).I * ((mga) var_mga_71_).gb);
	((mga) this).F = (((mga) var_mga_72_).I * ((mga) var_mga_71_).F
			  + (((mga) var_mga_71_).cb * ((mga) var_mga_72_).gb
			     + ((mga) var_mga_71_).T * ((mga) var_mga_72_).F));
	((mga) this).I
	    = (((mga) var_mga_72_).I * ((mga) var_mga_71_).I
	       + (((mga) var_mga_72_).F * ((mga) var_mga_71_).fb
		  + ((mga) var_mga_71_).H * ((mga) var_mga_72_).gb));
	((mga) this).A
	    = (((mga) var_mga_71_).A
	       + (((mga) var_mga_72_).E * ((mga) var_mga_71_).gb
		  + (((mga) var_mga_71_).M * ((mga) var_mga_72_).A
		     + ((mga) var_mga_71_).q * ((mga) var_mga_72_).p)));
	((mga) this).p = (((mga) var_mga_71_).p
			  + (((mga) var_mga_72_).p * ((mga) var_mga_71_).T
			     + ((mga) var_mga_71_).cb * ((mga) var_mga_72_).A
			     + ((mga) var_mga_71_).F * ((mga) var_mga_72_).E));
	((mga) this).E = (((mga) var_mga_71_).E
			  + (((mga) var_mga_72_).A * ((mga) var_mga_71_).H
			     + ((mga) var_mga_71_).fb * ((mga) var_mga_72_).p
			     + ((mga) var_mga_72_).E * ((mga) var_mga_71_).I));
    }
    
    final float[] a(byte i, float[] fs) {
	fs[3] = 0.0F;
	fs[9] = ((mga) this).F;
	r++;
	fs[15] = 1.0F;
	fs[7] = 0.0F;
	if (i != 68)
	    a(-1.5778545F, (byte) -108, 0.42632407F, -0.065725215F);
	fs[10] = ((mga) this).I;
	fs[14] = ((mga) this).E;
	fs[13] = ((mga) this).p;
	fs[12] = ((mga) this).A;
	fs[2] = ((mga) this).H;
	fs[11] = 0.0F;
	fs[5] = ((mga) this).T;
	fs[4] = ((mga) this).q;
	fs[1] = ((mga) this).cb;
	fs[0] = ((mga) this).M;
	fs[6] = ((mga) this).fb;
	fs[8] = ((mga) this).gb;
	return fs;
    }
    
    final void U(int i, int i_73_, int i_74_) {
	((mga) this).A += (float) i;
	((mga) this).p += (float) i_73_;
	hb++;
	((mga) this).E += (float) i_74_;
    }
    
    final void b(int i, Class_q class_q) {
	O++;
	mga var_mga_75_ = (mga) class_q;
	((mga) this).q = ((mga) var_mga_75_).cb;
	((mga) this).M = ((mga) var_mga_75_).M;
	((mga) this).gb = ((mga) var_mga_75_).H;
	((mga) this).H = ((mga) var_mga_75_).gb;
	if (i == 2) {
	    ((mga) this).T = ((mga) var_mga_75_).T;
	    ((mga) this).cb = ((mga) var_mga_75_).q;
	    ((mga) this).F = ((mga) var_mga_75_).fb;
	    ((mga) this).fb = ((mga) var_mga_75_).F;
	    ((mga) this).I = ((mga) var_mga_75_).I;
	    ((mga) this).A = -(((mga) this).q * ((mga) var_mga_75_).p
			       + ((mga) this).M * ((mga) var_mga_75_).A
			       + ((mga) var_mga_75_).E * ((mga) this).gb);
	    ((mga) this).p = -(((mga) this).F * ((mga) var_mga_75_).E
			       + (((mga) this).T * ((mga) var_mga_75_).p
				  + ((mga) this).cb * ((mga) var_mga_75_).A));
	    ((mga) this).E = -(((mga) this).fb * ((mga) var_mga_75_).p
			       + ((mga) this).H * ((mga) var_mga_75_).A
			       + ((mga) this).I * ((mga) var_mga_75_).E);
	}
    }
    
    final float[] c(int i, float[] fs) {
	fs[11] = 0.0F;
	fs[10] = ((mga) this).E;
	fs[5] = ((mga) this).T;
	ab++;
	fs[7] = 0.0F;
	fs[0] = ((mga) this).M;
	fs[1] = ((mga) this).cb;
	fs[2] = 0.0F;
	int i_76_ = -63 / ((-10 - i) / 49);
	fs[12] = 0.0F;
	fs[3] = 0.0F;
	fs[9] = ((mga) this).p;
	fs[15] = 1.0F;
	fs[6] = 0.0F;
	fs[4] = ((mga) this).q;
	fs[8] = ((mga) this).A;
	fs[14] = 0.0F;
	fs[13] = 0.0F;
	return fs;
    }
    
    final void AA(int i) {
	D++;
	float f = oi.v[i & 0x3fff];
	float f_77_ = oi.x[i & 0x3fff];
	float f_78_ = ((mga) this).M;
	float f_79_ = ((mga) this).q;
	float f_80_ = ((mga) this).gb;
	((mga) this).M = f_78_ * f - f_77_ * ((mga) this).cb;
	float f_81_ = ((mga) this).A;
	((mga) this).q = f_79_ * f - ((mga) this).T * f_77_;
	((mga) this).cb = f_77_ * f_78_ + ((mga) this).cb * f;
	((mga) this).T = ((mga) this).T * f + f_79_ * f_77_;
	((mga) this).gb = f * f_80_ - f_77_ * ((mga) this).F;
	((mga) this).F = f_80_ * f_77_ + f * ((mga) this).F;
	((mga) this).A = f * f_81_ - f_77_ * ((mga) this).p;
	((mga) this).p = f * ((mga) this).p + f_81_ * f_77_;
    }
    
    final void d(int i) {
	((mga) this).F = -((mga) this).F;
	y++;
	((mga) this).I = -((mga) this).I;
	((mga) this).cb = -((mga) this).cb;
	((mga) this).fb = -((mga) this).fb;
	((mga) this).p = -((mga) this).p;
	((mga) this).E = -((mga) this).E;
	((mga) this).T = -((mga) this).T;
	((mga) this).H = -((mga) this).H;
	if (i != 0)
	    NA(-103, -82, -116);
    }
    
    final void YA(int[] is) {
	U++;
	float f = (float) is[0] - ((mga) this).A;
	float f_82_ = (float) is[1] - ((mga) this).p;
	float f_83_ = (float) is[2] - ((mga) this).E;
	is[2] = (int) (((mga) this).gb * f + ((mga) this).F * f_82_
		       + ((mga) this).I * f_83_);
	is[0] = (int) (f_83_ * ((mga) this).H
		       + (f_82_ * ((mga) this).cb + f * ((mga) this).M));
	is[1] = (int) (f * ((mga) this).q + f_82_ * ((mga) this).T
		       + ((mga) this).fb * f_83_);
    }
    
    final void a(byte i, float f, float f_84_, float f_85_) {
	((mga) this).H *= f_85_;
	((mga) this).p *= f_84_;
	((mga) this).I *= f_85_;
	int i_86_ = -45 % ((i - 45) / 51);
	((mga) this).M *= f;
	((mga) this).T *= f_84_;
	((mga) this).fb *= f_85_;
	((mga) this).A *= f;
	((mga) this).q *= f;
	((mga) this).gb *= f;
	((mga) this).F *= f_84_;
	((mga) this).cb *= f_84_;
	((mga) this).E *= f_85_;
	z++;
    }
    
    final float[] d(int i, float[] fs) {
	fs[14] = 0.0F;
	fs[9] = ((mga) this).fb;
	fs[12] = 0.0F;
	fs[15] = 1.0F;
	fs[0] = ((mga) this).M;
	l++;
	fs[1] = ((mga) this).q;
	if (i != -5928)
	    ((mga) this).A = 1.0251913F;
	fs[2] = ((mga) this).gb;
	fs[3] = ((mga) this).A;
	fs[6] = ((mga) this).F;
	fs[10] = ((mga) this).I;
	fs[11] = ((mga) this).E;
	fs[5] = ((mga) this).T;
	fs[4] = ((mga) this).cb;
	fs[8] = ((mga) this).H;
	fs[7] = ((mga) this).p;
	fs[13] = 0.0F;
	return fs;
    }
    
    public static void e(int i) {
	if (i != -3)
	    s = true;
	o = null;
    }
    
    final Class_q a() {
	L++;
	mga var_mga_87_ = new mga();
	((mga) var_mga_87_).q = ((mga) this).q;
	((mga) var_mga_87_).I = ((mga) this).I;
	((mga) var_mga_87_).cb = ((mga) this).cb;
	((mga) var_mga_87_).p = ((mga) this).p;
	((mga) var_mga_87_).F = ((mga) this).F;
	((mga) var_mga_87_).A = ((mga) this).A;
	((mga) var_mga_87_).H = ((mga) this).H;
	((mga) var_mga_87_).T = ((mga) this).T;
	((mga) var_mga_87_).gb = ((mga) this).gb;
	((mga) var_mga_87_).E = ((mga) this).E;
	((mga) var_mga_87_).M = ((mga) this).M;
	((mga) var_mga_87_).fb = ((mga) this).fb;
	return var_mga_87_;
    }
    
    final void a(float f, float[] fs, float f_88_, int i, float f_89_,
		 float f_90_) {
	v++;
	fs[2] = ((mga) this).I * f + (((mga) this).H * f_90_
				      + ((mga) this).fb * f_88_);
	fs[i] = (((mga) this).M * f_90_ + f_88_ * ((mga) this).q
		 + ((mga) this).gb * f);
	fs[1] = f * ((mga) this).F + (f_90_ * ((mga) this).cb
				      + f_88_ * ((mga) this).T);
	float f_91_;
	float f_92_;
	float f_93_;
	if (!(f_90_ > 0.00390625F) && !(f_90_ < -0.00390625F)) {
	    if (f_88_ > 0.00390625F || f_88_ < -0.00390625F) {
		float f_94_ = -f_89_ / f_88_;
		f_92_ = ((mga) this).p + f_94_ * ((mga) this).T;
		f_91_ = ((mga) this).E + ((mga) this).fb * f_94_;
		f_93_ = ((mga) this).A + ((mga) this).q * f_94_;
	    } else {
		float f_95_ = -f_89_ / f;
		f_92_ = ((mga) this).p + ((mga) this).F * f_95_;
		f_93_ = ((mga) this).A + ((mga) this).gb * f_95_;
		f_91_ = ((mga) this).I * f_95_ + ((mga) this).E;
	    }
	} else {
	    float f_96_ = -f_89_ / f_90_;
	    f_91_ = f_96_ * ((mga) this).H + ((mga) this).E;
	    f_92_ = ((mga) this).p + f_96_ * ((mga) this).cb;
	    f_93_ = ((mga) this).A + f_96_ * ((mga) this).M;
	}
	fs[3] = -(f_93_ * fs[0] + f_92_ * fs[1] + f_91_ * fs[2]);
    }
    
    public mga() {
	Y();
    }
    
    final float a(int i, float f, float f_97_, float f_98_) {
	if (i <= 50)
	    return -3.5129948F;
	m++;
	return (f_98_ * ((mga) this).gb
		+ (((mga) this).q * f + f_97_ * ((mga) this).M)
		+ ((mga) this).A);
    }
    
    static {
	o = new tb(4);
    }
}
