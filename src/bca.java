/* bca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class bca
{
    static int a;
    static int b;
    static int c = -1;
    static int d;
    static int e;
    static int f;
    
    static final void a(byte i) {
	b++;
	int i_0_ = 0;
	if (cs.g.a((int) -107, on.performance)) {
	    i_0_ |= 0x1;
	    i_0_ |= 0x10;
	    i_0_ |= 0x20;
	    i_0_ |= 0x2;
	    i_0_ |= 0x4;
	}
	if (!((jb) cs.g).k)
	    i_0_ |= 0x40;
	ps.a((byte) 67, i_0_);
	ul.k.b((byte) 102, i_0_);
	laa.itemDefLoader.c(-12209, i_0_);
	jm.p.a(-111, i_0_);
	Class_ic.H.c(-12336, i_0_);
	if (i <= 45)
	    a((byte) 110);
	Class_lc.c(i_0_, 1);
	ee.a(i_0_, (byte) 81);
	lh.a(i_0_, (byte) 31);
	BytesParser.b(i_0_, (byte) 51);
	ka.a((byte) -8);
    }
    
    static final void a(boolean bool, boolean bool_1_) {
	if (Class_ub.W == null)
	    ip.h((int) -123);
	d++;
	if (bool != true)
	    a((byte) -104, null);
	if (bool_1_)
	    Class_ub.W.a((int) 111);
    }
    
    static final Interface a(byte i, Interface var_kp) {
	f++;
	if (((Interface) var_kp).parentID != -1)
	    return efa.a(-1018745488, ((Interface) var_kp).parentID);
	if (i < 119)
	    a((byte) 112, null);
	int i_2_ = ((Interface) var_kp).interfaceID >>> 16;
	ufa var_ufa = new ufa(ida.l);
	for (tt var_tt = (tt) var_ufa.a((byte) 75); var_tt != null;
	     var_tt = (tt) var_ufa.a((int) 1)) {
	    if (((tt) var_tt).l == i_2_)
		return efa.a(-1018745488, (int) ((Node) var_tt).nodeID);
	}
	return null;
    }
    
    static final int a(int i) {
	int i_3_ = -54 / ((i - 69) / 37);
	e++;
	return cda.d;
    }
    
    static final void a(int i, int i_4_, int i_5_) {
	a++;
	if (i_5_ != 0)
	    a(-27, -117, -85);
	qba var_qba = ofa.a(6, i_4_, (byte) -33);
	var_qba.c((byte) 11);
	((qba) var_qba).v = i;
    }
}
