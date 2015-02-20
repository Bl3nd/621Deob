/* cfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cfa
{
    static int a = 1405;
    static byte b;
    String c;
    static int d;
    String e;
    String f;
    static int g;
    
    static final qba a(byte i) {
	d++;
	qba var_qba = (qba) eq.C.d((byte) -52);
	if (var_qba != null) {
	    var_qba.unlink(-96);
	    var_qba.a((byte) -72);
	    return var_qba;
	}
	if (i <= 101)
	    a((byte) -103);
	do {
	    var_qba = (qba) kaa.n.d((byte) -108);
	    if (var_qba == null)
		return null;
	    if (var_qba.b((byte) -108) > us.a(125))
		return null;
	    var_qba.unlink(-103);
	    var_qba.a((byte) -57);
	} while ((~0x7fffffffffffffffL & ((pp) var_qba).l) == 0L);
	return var_qba;
    }
    
    static final void b(byte i) {
	if (i > -26)
	    a = 84;
	if (hm.h == 9)
	    ei.a(5, -15);
	else if (hm.h != 5 && hm.h != 6) {
	    if (hm.h == 12)
		ei.a(3, -124);
	} else
	    ei.a(3, -117);
	g++;
    }
    
    cfa(String string, String string_0_, String string_1_) {
	((cfa) this).c = string;
	((cfa) this).f = string_0_;
	((cfa) this).e = string_1_;
    }
}
