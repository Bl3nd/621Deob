/* hea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hea
{
    static int a;
    static int b;
    static int c = 0;
    static int d;
    static SpecialOutPacket e;
    static int[] f = new int[3];
    static SpecialOutPacket specialOutPacket15;
    static SpecialOutPacket mainLoginOutPacket;
    static SpecialOutPacket i;
    static SpecialOutPacket mainLoginOutPacket2;
    static SpecialOutPacket lobbyLoginOutPacket;
    static SpecialOutPacket l;
    static SpecialOutPacket m;
    static SpecialOutPacket n;
    static SpecialOutPacket o;
    static SpecialOutPacket p;
    static SpecialOutPacket q;
    static SpecialOutPacket specialOutPacket26;
    static SpecialOutPacket s;
    private static SpecialOutPacket[] t;
    
    public static void a(int i) {
	n = null;
	q = null;
	l = null;
	mainLoginOutPacket = null;
	if (i == 1) {
	    e = null;
	    f = null;
	    o = null;
	    m = null;
	    mainLoginOutPacket2 = null;
	    s = null;
	    p = null;
	    hea.i = null;
	    t = null;
	    lobbyLoginOutPacket = null;
	    specialOutPacket15 = null;
	    specialOutPacket26 = null;
	}
    }
    
    static final WorldSub b(int i) {
	if (i != 6684)
	    return null;
	ff.s = 0;
	a++;
	return GameOutPacket.a();
    }
    
    static {
	e = new SpecialOutPacket(14, 1);
	specialOutPacket15 = new SpecialOutPacket(15, 4);
	mainLoginOutPacket = new SpecialOutPacket(16, -2);
	hea.i = new SpecialOutPacket(17, 0);
	mainLoginOutPacket2 = new SpecialOutPacket(18, -2);
	lobbyLoginOutPacket = new SpecialOutPacket(19, -2);
	l = new SpecialOutPacket(20, 6);
	m = new SpecialOutPacket(21, 9);
	n = new SpecialOutPacket(22, -2);
	o = new SpecialOutPacket(23, 4);
	p = new SpecialOutPacket(24, -1);
	q = new SpecialOutPacket(25, -2);
	specialOutPacket26 = new SpecialOutPacket(26, 0);
	s = new SpecialOutPacket(27, 0);
	t = new SpecialOutPacket[32];
	SpecialOutPacket[] var_jus = kg.a((byte) 88);
	for (int i = 0; i < var_jus.length; i++)
	    t[((SpecialOutPacket) var_jus[i]).packetID] = var_jus[i];
    }
}
