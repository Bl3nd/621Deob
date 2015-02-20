/* tda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tda
{
    static int a;
    static rc b = new rc();
    static int c;
    static int d;
    int e;
    static int f;
    static GameOutPacket g = new GameOutPacket(51, 4);
    static GameInPacket incomingPacket15;
    static int i = 0;
    static int[] j = { 7, 8, 9, 10, 11, 12, 13, 15 };
    
    public final String toString() {
	d++;
	throw new IllegalStateException();
    }
    
    static final int a(int i) {
	a++;
	if (i != 783)
	    tda.i = -104;
	return Class_ub.W.a((byte) -39);
    }
    
    public static void a(boolean bool) {
	if (bool != false)
	    a(-100);
	j = null;
	incomingPacket15 = null;
	b = null;
	g = null;
    }
    
    static final tm a(BytesParser var_es, int i) {
	c++;
	iea var_iea = la.a(55, var_es);
	int i_0_ = var_es.readShort(13111);
	int i_1_ = var_es.readShort(13111);
	int i_2_ = var_es.readShort(13111);
	int i_3_ = var_es.readShort(13111);
	int i_4_ = var_es.readShort(13111);
	if (i < 22)
	    return null;
	int i_5_ = var_es.readShort(13111);
	return new tm(((iea) var_iea).m, ((iea) var_iea).j, ((iea) var_iea).k,
		      ((iea) var_iea).d, ((iea) var_iea).i, ((iea) var_iea).e,
		      ((iea) var_iea).g, ((iea) var_iea).b, ((iea) var_iea).f,
		      i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
    }
    
    tda(int i) {
	((tda) this).e = i;
    }
    
    static {
	incomingPacket15 = new GameInPacket(15, -2);
    }
}
