/* ha - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class ha extends pp
{
    static wea s = new wea(9, 2);
    static int t;
    static int u;
    static boolean v = true;
    
    static final vj a(int i, boolean bool) {
	t++;
	vj var_vj = (vj) Class_ab.b.get((long) i, (byte) 100);
	if (var_vj != null)
	    return var_vj;
	byte[] is = kl.h.b(i, 117, 1);
	var_vj = new vj();
	((vj) var_vj).j = i;
	if (is != null)
	    var_vj.a((byte) -125, new BytesParser(is));
	var_vj.a((byte) 110);
	if (((vj) var_vj).b == 2 && gh.P.a(-32748, (long) i) == null) {
	    gh.P.a(new GameInPacketHandler(rba.i), (byte) -39, (long) i);
	    mu.m[rba.i++] = var_vj;
	}
	Class_ab.b.put((long) i, var_vj, 1);
	if (bool != false)
	    return null;
	return var_vj;
    }
    
    public static void a(int i) {
	s = null;
	if (i != 2)
	    u = 69;
    }
    
    public ha() {
	/* empty */
    }
}
