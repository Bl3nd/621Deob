/* saa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class saa extends fu implements oq
{
    static int C;
    static int D;
    static int E;
    static int F;
    
    static final void b(int i) {
	sf.a(i - 1);
	if (i != 0)
	    b(102, 125);
	C++;
	naa.d((byte) 76);
    }
    
    static final int a(int i, int i_0_, int i_1_, int i_2_) {
	i_0_ &= 0x3;
	D++;
	if (i_0_ == 0)
	    return i_2_;
	if (i_0_ == 1)
	    return i;
	int i_3_ = 52 / ((i_1_ - 9) / 56);
	if (i_0_ == 2)
	    return 7 - i_2_;
	return 7 - i;
    }
    
    saa(lm var_lm, int i, boolean bool, int[][] is) {
	super(var_lm, 34067, nda.h, bt.g, 6 * i * i, bool);
	((fu) this).d.a(this, 0);
	if (bool) {
	    for (int i_4_ = 0; i_4_ < 6; i_4_++)
		this.a(i, (byte) -124, i_4_ + 34069, is[i_4_], i);
	} else {
	    for (int i_5_ = 0; i_5_ < 6; i_5_++)
		OpenGL.glTexImage2Di(i_5_ + 34069, 0, this.e(26701), i, i, 0,
				     Animable.a(6407, ((fu) this).o),
				     ((lm) ((fu) this).d).ti, is[i_5_], 0);
	}
    }
    
    static final tda b(int i, int i_6_) {
	E++;
	if (i != 34067)
	    return null;
	tda[] var_tdas = fm.a(false);
	for (int i_7_ = 0; var_tdas.length > i_7_; i_7_++) {
	    tda var_tda = var_tdas[i_7_];
	    if (i_6_ == ((tda) var_tda).e)
		return var_tda;
	}
	return null;
    }
}
