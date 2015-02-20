/* ku - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ku extends mq
{
    static int f;
    static GameInPacket incomingPacket100 = new GameInPacket(100, -2);
    static int h;
    static int i;
    static baa j = new baa(7, 0, 1, 1);
    static nw k = new nw();
    eda[] l;
    
    static final boolean a(int i, byte i_0_, int i_1_) {
	if (i_0_ < 104)
	    return false;
	ku.i++;
	if (!((i & 0x800) != 0 | dr.a(i, i_1_, (byte) 104))
	    && !kl.a(i, 55, i_1_))
	    return false;
	return true;
    }
    
    static final void a(boolean bool) {
	ou.g.b((int) 32);
	h++;
	Class_vb.s = null;
	if (bool == true)
	    pj.j = 1;
    }
    
    public static void b(int i) {
	incomingPacket100 = null;
	j = null;
	k = null;
	if (i != -1)
	    k = null;
    }
    
    ku(eda[] var_edas) {
	((ku) this).l = var_edas;
    }
}
