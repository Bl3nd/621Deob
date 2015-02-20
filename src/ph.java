/* ph - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class ph extends la
{
    private Class_fb B;
    private boolean C;
    private qj D;
    private ar E;
    
    final void a(char c, int i, int i_0_, int i_1_, boolean bool, ua var_ua,
		 int i_2_, int i_3_) {
	hj var_hj = (hj) var_ua;
	ar var_ar = ((hj) var_hj).f;
	D.g((byte) -107);
	D.a(E, -2);
	if (C || bool) {
	    D.a(7681, -465309136, 8448);
	    D.b(0, 768, 768, 34168);
	} else
	    D.a(7681, -465309136, 7681);
	D.b((int) 1, true);
	D.a(var_ar, -2);
	D.a(7681, -465309136, 8448);
	D.b(0, 768, 768, 34168);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = ((ar) var_ar).O / (float) ((ar) var_ar).T;
	float f_4_ = ((ar) var_ar).M / (float) ((ar) var_ar).N;
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_2_ * f }, 0);
	OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F,
						    (float) -i_3_ * f_4_ }, 0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_,
			  (byte) (i_1_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
	B.a(-29240, c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	D.b(0, 768, 768, 5890);
	D.a(8448, -465309136, 8448);
	D.a((rg) null, -2);
	D.b((int) 0, true);
	if (C || bool)
	    D.b(0, 768, 768, 5890);
    }
    
    ph(qj var_qj, sa var_sa, aga[] var_agas, boolean bool) {
	super(var_qj, var_sa);
	D = var_qj;
	int i = 0;
	for (int i_5_ = 0; i_5_ < 256; i_5_++) {
	    aga var_aga = var_agas[i_5_];
	    if (((aga) var_aga).d > i)
		i = ((aga) var_aga).d;
	    if (((aga) var_aga).b > i)
		i = ((aga) var_aga).b;
	}
	int i_6_ = i * 16;
	if (bool) {
	    byte[] is = new byte[i_6_ * i_6_];
	    for (int i_7_ = 0; i_7_ < 256; i_7_++) {
		aga var_aga = var_agas[i_7_];
		int i_8_ = ((aga) var_aga).d;
		int i_9_ = ((aga) var_aga).b;
		int i_10_ = i_7_ % 16 * i;
		int i_11_ = i_7_ / 16 * i;
		int i_12_ = i_11_ * i_6_ + i_10_;
		int i_13_ = 0;
		if (((aga) var_aga).f == null) {
		    byte[] is_14_ = ((aga) var_aga).c;
		    for (int i_15_ = 0; i_15_ < i_8_; i_15_++) {
			for (int i_16_ = 0; i_16_ < i_9_; i_16_++)
			    is[i_12_++]
				= (byte) (is_14_[i_13_++] == 0 ? 0 : -1);
			i_12_ += i_6_ - i_9_;
		    }
		} else {
		    byte[] is_17_ = ((aga) var_aga).f;
		    for (int i_18_ = 0; i_18_ < i_8_; i_18_++) {
			for (int i_19_ = 0; i_19_ < i_9_; i_19_++)
			    is[i_12_++] = is_17_[i_13_++];
			i_12_ += i_6_ - i_9_;
		    }
		}
	    }
	    E = pga.a(i_6_, false, var_qj, 124, is, i_6_, 6406, 6406);
	    C = true;
	} else {
	    int[] is = new int[i_6_ * i_6_];
	    for (int i_20_ = 0; i_20_ < 256; i_20_++) {
		aga var_aga = var_agas[i_20_];
		int[] is_21_ = ((aga) var_aga).i;
		byte[] is_22_ = ((aga) var_aga).f;
		byte[] is_23_ = ((aga) var_aga).c;
		int i_24_ = ((aga) var_aga).d;
		int i_25_ = ((aga) var_aga).b;
		int i_26_ = i_20_ % 16 * i;
		int i_27_ = i_20_ / 16 * i;
		int i_28_ = i_27_ * i_6_ + i_26_;
		int i_29_ = 0;
		if (is_22_ != null) {
		    for (int i_30_ = 0; i_30_ < i_24_; i_30_++) {
			for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
			    is[i_28_++] = (is_22_[i_29_] << 24
					   | is_21_[is_23_[i_29_] & 0xff]);
			    i_29_++;
			}
			i_28_ += i_6_ - i_25_;
		    }
		} else {
		    for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
			for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
			    int i_34_;
			    if ((i_34_ = is_23_[i_29_++]) != 0)
				is[i_28_++] = ~0xffffff | is_21_[i_34_ & 0xff];
			    else
				i_28_++;
			}
			i_28_ += i_6_ - i_25_;
		    }
		}
	    }
	    E = fca.a(26871, i_6_, var_qj, false, i_6_, is);
	    C = false;
	}
	E.b(false, 17137);
	B = new Class_fb(var_qj, 256);
	float f = ((ar) E).O / (float) ((ar) E).T;
	float f_35_ = ((ar) E).M / (float) ((ar) E).N;
	for (int i_36_ = 0; i_36_ < 256; i_36_++) {
	    aga var_aga = var_agas[i_36_];
	    int i_37_ = ((aga) var_aga).d;
	    int i_38_ = ((aga) var_aga).b;
	    int i_39_ = ((aga) var_aga).g;
	    int i_40_ = ((aga) var_aga).e;
	    float f_41_ = (float) (i_36_ % 16 * i);
	    float f_42_ = (float) (i_36_ / 16 * i);
	    float f_43_ = f_41_ * f;
	    float f_44_ = f_42_ * f_35_;
	    float f_45_ = (f_41_ + (float) i_38_) * f;
	    float f_46_ = (f_42_ + (float) i_37_) * f_35_;
	    B.a(i_36_, 0);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(f_43_, ((ar) E).M - f_44_);
	    OpenGL.glVertex2i(i_40_, i_39_);
	    OpenGL.glTexCoord2f(f_43_, ((ar) E).M - f_46_);
	    OpenGL.glVertex2i(i_40_, i_39_ + i_37_);
	    OpenGL.glTexCoord2f(f_45_, ((ar) E).M - f_46_);
	    OpenGL.glVertex2i(i_40_ + i_38_, i_39_ + i_37_);
	    OpenGL.glTexCoord2f(f_45_, ((ar) E).M - f_44_);
	    OpenGL.glVertex2i(i_40_ + i_38_, i_39_);
	    OpenGL.glEnd();
	    B.a((byte) 127);
	}
    }
    
    final void OA(char c, int i, int i_47_, int i_48_, boolean bool) {
	D.g((byte) -123);
	D.a(E, -2);
	if (C || bool) {
	    D.a(7681, -465309136, 8448);
	    D.b(0, 768, 768, 34168);
	} else
	    D.a(7681, -465309136, 7681);
	OpenGL.glColor4ub((byte) (i_48_ >> 16), (byte) (i_48_ >> 8),
			  (byte) i_48_, (byte) (i_48_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_47_, 0.0F);
	B.a(-29240, c);
	OpenGL.glLoadIdentity();
	if (C || bool)
	    D.b(0, 768, 768, 5890);
    }
}
