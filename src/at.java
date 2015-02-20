/* at - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class at extends as
{
    static int B;
    static int C;
    static int D;
    static int E;
    static int F;
    private Object G;
    static int H;
    static ki I = new ki();
    static rc J;
    static wa[] K = new wa[14];
    
    final boolean d(byte i) {
	int i_0_ = 63 / ((-70 - i) / 55);
	H++;
	return false;
    }
    
    static final void a(String string, String string_1_, int i, int i_2_,
			int i_3_, String string_4_, String string_5_,
			byte i_6_, String string_7_) {
	D++;
	if (i_6_ <= 99)
	    i(68);
	sc var_sc = he.d[99];
	for (int i_8_ = 99; i_8_ > 0; i_8_--)
	    he.d[i_8_] = he.d[i_8_ - 1];
	if (var_sc != null)
	    var_sc.a(string_5_, string_1_, string_7_, string_4_, i, i_2_, i_3_,
		     false, string);
	else
	    var_sc = new sc(i, i_2_, string_7_, string_4_, string, string_5_,
			    i_3_, string_1_);
	pl.f++;
	aea.G = tb.u;
	he.d[0] = var_sc;
    }
    
    public static void i(int i) {
	if (i != 27843)
	    a(null, null, -24, 82, -42, null, null, (byte) -28, null);
	K = null;
	J = null;
	I = null;
    }
    
    final Object a(int i) {
	if (i != -9023)
	    return null;
	C++;
	return G;
    }
    
    static final void f(byte i) {
	lm.Kh.ra(dm.a * ((float) ((jb) cs.g).db * 0.1F + 0.7F));
	B++;
	lm.Kh.VA(kw.v, LoginStream.Qb, bq.k, (float) (bl.k << 2), (float) (hp.C << 2),
		 (float) (Class_i.l << 2));
	lm.Kh.a(dr.e);
	if (i != -38)
	    a(-31, -98, 74, null);
    }
    
    static final boolean a(int i, byte i_9_) {
	if (i_9_ >= -77)
	    return false;
	E++;
	if (i != 3 && i != 4)
	    return false;
	return true;
    }
    
    at(gj var_gj, Object object, int i) {
	super(var_gj, i);
	G = object;
    }
    
    static final void a(int i, int i_10_, int i_11_, dfa var_dfa) {
	vf var_vf = lh.a(i, i_10_, i_11_);
	if (var_vf != null) {
	    ((vf) var_vf).m = var_dfa;
	    int i_12_ = Class_q.b == wr.D ? 1 : 0;
	    if (var_dfa.g((byte) 115)) {
		if (var_dfa.e((byte) 23))
		    lm.Nh[i_12_][fg.a[i_12_]++] = var_dfa;
		else
		    aaa.k[i_12_][baa.l[i_12_]++] = var_dfa;
	    } else
		cca.d[i_12_][cc.f[i_12_]++] = var_dfa;
	}
    }
}
