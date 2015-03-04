/* jba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jba
{
    static int a;
    static dp b;
    static int c;
    static int[] d;
    
    public static void a(byte i) {
	if (i != 34)
	    a((byte) -44);
	d = null;
	b = null;
    }
    
    static final void a(int i, BytesParser var_es) {
	a++;
	int i_0_ = var_es.readSmart2(-13829);
	ida.i = new sw[i_0_];
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    ida.i[i_1_] = new sw();
	    ((sw) ida.i[i_1_]).d = var_es.readSmart2(-13829);
	    ((sw) ida.i[i_1_]).c = var_es.readString2(-1);
	}
	if (i <= 109)
	    b = null;
	Class_g.B = var_es.readSmart2(-13829);
	hj.g = var_es.readSmart2(-13829);
	pga.d = var_es.readSmart2(-13829);
	nk.i = new WorldSub[-Class_g.B + 1 + hj.g];
	for (int i_2_ = 0; i_2_ < pga.d; i_2_++) {
	    int i_3_ = var_es.readSmart2(-13829);
	    WorldSub var_iw = nk.i[i_3_] = new WorldSub();
	    ((he) var_iw).b = var_es.readUnsignedByte(-9268);
	    ((he) var_iw).e = var_es.readInt(64);
	    ((WorldSub) var_iw).worldID = Class_g.B + i_3_;
	    ((WorldSub) var_iw).activity = var_es.readString2(-1);
	    ((WorldSub) var_iw).m = var_es.readString2(-1);
	}
	br.o = var_es.readInt(113);
	pv.b = true;
    }
    
    static final void b(byte i) {
	c++;
	if (!dq.e) {
	    mo.F = true;
	    dq.e = true;
	    if (!((jb) cs.g).n)
		afa.aFloat += (-afa.aFloat - 24.0F) / 2.0F;
	    else
		qw.n = (float) ((int) qw.n - 65 & ~0x7f);
	    if (i != 6)
		d = null;
	}
    }
}
