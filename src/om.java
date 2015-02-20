/* om - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class om
{
    private int[] a;
    private static float[][] b = new float[2][8];
    int[] c;
    static int[][] d = new int[2][8];
    private int[][][] e = new int[2][2][4];
    static int f;
    private static float g;
    private int[][][] h;
    
    private final float a(int i, int i_0_, float f) {
	float f_1_ = ((float) h[i][0][i_0_]
		      + f * (float) (h[i][1][i_0_] - h[i][0][i_0_]));
	f_1_ *= 1.2207031E-4F;
	return a(f_1_);
    }
    
    final void a(BytesParser var_es, aba var_aba) {
	int i = var_es.readUnsignedByte(-9268);
	((om) this).c[0] = i >> 4;
	((om) this).c[1] = i & 0xf;
	if (i != 0) {
	    a[0] = var_es.readShort(13111);
	    a[1] = var_es.readShort(13111);
	    int i_2_ = var_es.readUnsignedByte(-9268);
	    for (int i_3_ = 0; i_3_ < 2; i_3_++) {
		for (int i_4_ = 0; i_4_ < ((om) this).c[i_3_]; i_4_++) {
		    h[i_3_][0][i_4_] = var_es.readShort(13111);
		    e[i_3_][0][i_4_] = var_es.readShort(13111);
		}
	    }
	    for (int i_5_ = 0; i_5_ < 2; i_5_++) {
		for (int i_6_ = 0; i_6_ < ((om) this).c[i_5_]; i_6_++) {
		    if ((i_2_ & 1 << i_5_ * 4 << i_6_) != 0) {
			h[i_5_][1][i_6_] = var_es.readShort(13111);
			e[i_5_][1][i_6_] = var_es.readShort(13111);
		    } else {
			h[i_5_][1][i_6_] = h[i_5_][0][i_6_];
			e[i_5_][1][i_6_] = e[i_5_][0][i_6_];
		    }
		}
	    }
	    if (i_2_ != 0 || a[1] != a[0])
		var_aba.a(var_es);
	} else
	    a[0] = a[1] = 0;
    }
    
    private final float b(int i, int i_7_, float f) {
	float f_8_ = ((float) e[i][0][i_7_]
		      + f * (float) (e[i][1][i_7_] - e[i][0][i_7_]));
	f_8_ *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f_8_ / 20.0F));
    }
    
    final int a(int i, float f) {
	if (i == 0) {
	    float f_9_ = (float) a[0] + (float) (a[1] - a[0]) * f;
	    f_9_ *= 0.0030517578F;
	    g = (float) Math.pow(0.1, (double) (f_9_ / 20.0F));
	    om.f = (int) (g * 65536.0F);
	}
	if (((om) this).c[i] == 0)
	    return 0;
	float f_10_ = b(i, 0, f);
	b[i][0] = -2.0F * f_10_ * (float) Math.cos((double) a(i, 0, f));
	b[i][1] = f_10_ * f_10_;
	for (int i_11_ = 1; i_11_ < ((om) this).c[i]; i_11_++) {
	    f_10_ = b(i, i_11_, f);
	    float f_12_
		= -2.0F * f_10_ * (float) Math.cos((double) a(i, i_11_, f));
	    float f_13_ = f_10_ * f_10_;
	    b[i][i_11_ * 2 + 1] = b[i][i_11_ * 2 - 1] * f_13_;
	    b[i][i_11_ * 2]
		= b[i][i_11_ * 2 - 1] * f_12_ + b[i][i_11_ * 2 - 2] * f_13_;
	    for (int i_14_ = i_11_ * 2 - 1; i_14_ >= 2; i_14_--)
		b[i][i_14_]
		    += b[i][i_14_ - 1] * f_12_ + b[i][i_14_ - 2] * f_13_;
	    b[i][1] += b[i][0] * f_12_ + f_13_;
	    b[i][0] += f_12_;
	}
	if (i == 0) {
	    for (int i_15_ = 0; i_15_ < ((om) this).c[0] * 2; i_15_++)
		b[0][i_15_] *= g;
	}
	for (int i_16_ = 0; i_16_ < ((om) this).c[i] * 2; i_16_++)
	    d[i][i_16_] = (int) (b[i][i_16_] * 65536.0F);
	return ((om) this).c[i] * 2;
    }
    
    private static final float a(float f) {
	float f_17_ = 32.703197F * (float) Math.pow(2.0, (double) f);
	return f_17_ * 3.1415927F / 11025.0F;
    }
    
    public om() {
	a = new int[2];
	((om) this).c = new int[2];
	h = new int[2][2][4];
    }
    
    public static void a() {
	b = null;
	d = null;
    }
}
