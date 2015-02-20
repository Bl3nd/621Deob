/* ua - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ua
{
    static int a;
    static GameInPacket incomingPacket36 = new GameInPacket(36, 10);
    static pl c;
    static short[] d = new short[256];
    static f e;
    
    public ua() {
	/* empty */
    }
    
    public static void a(int i) {
	e = null;
	int i_0_ = -105 / ((i + 53) / 55);
	incomingPacket36 = null;
	d = null;
	c = null;
    }
    
    static final void a(boolean bool, int i) {
	a++;
	if (cc.i == null || cc.i.length < i)
	    cc.i = new int[i];
	if (bool != true)
	    e = null;
    }
}
