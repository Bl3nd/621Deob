/* hga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hga
{
    static int a;
    static tda b;
    static int c;
    int d = 0;
    static int x = -1;
    static int f;
    static int g;
    static int h;
    
    static final void a(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
	g++;
	if ((on.performance ^ 0xffffffff) != i_0_) {
	    it.N = on.performance;
	    ur.setTKVersion(0, true);
	} else
	    lba.b(i_0_ ^ ~0x49, false);
	ofa.O = i_2_;
	iea.a = i_1_;
	ll.w = bool;
	kca.b(i);
    }
    
    final void a(BytesParser var_es, int i) {
	f++;
	if (i != -1)
	    b = null;
	for (;;) {
	    int i_3_ = var_es.readUnsignedByte(-9268);
	    if (i_3_ == 0)
		break;
	    a(var_es, i, i_3_);
	}
    }
    
    static final int a(Class_r class_r, ng var_ng, int i) {
	h++;
	if ((((ng) var_ng).j ^ 0xffffffff) == 0) {
	    if (((ng) var_ng).q != -1) {
		vca var_vca
		    = ((Class_r) class_r).j.a(((ng) var_ng).q, (byte) 86);
		if (!((vca) var_vca).u)
		    return ((vca) var_vca).v;
	    }
	} else
	    return ((ng) var_ng).j;
	if (i <= 118)
	    a(36, -99, -31, true, -1);
	return ((ng) var_ng).d;
    }
    
    private final void a(BytesParser var_es, int i, int i_4_) {
	a++;
	if (i_4_ == 5)
	    ((hga) this).d = var_es.readShort(13111);
	if (i != -1)
	    ((hga) this).d = -74;
    }
    
    public hga() {
	/* empty */
    }
    
    public static void a(byte i) {
	int i_5_ = 4 % ((i + 45) / 55);
	b = null;
    }
}
