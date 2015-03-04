/* sh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sh
{
    static int a;
    static GameOutPacket outgoingPacket62 = new GameOutPacket(62, -1);
    static int c;
    private pl d;
    static int e;
    private tb f;
    private pl g;
    static int h;
    static pl i;
    static int j = 0;
    int k = 0;
    static int l;
    int m = 0;
    private lv n;
    
    public static void a(int i) {
	outgoingPacket62 = null;
	sh.i = null;
	if (i != 4664)
	    outgoingPacket62 = null;
    }
    
    static final void updatePlayer(LoginStream stream, int dummy, int pos) {
		if (dummy == 32767) {
		    vu.a = 0;
		    c++;
		    Class_is.i = false;
		    bw.handlePlayerUpdating((byte) -118, stream);
		    fq.handlePlayerUpdateMasks(stream, (byte) -126);
		    if (Class_is.i)
		    	System.out.println("---endgpp---");
		    if (((BytesParser) stream).pos != pos)
		    	throw new RuntimeException("gpi1 pos:" + ((BytesParser) stream).pos + " psize:" + pos);
		}
    }
    
    final String a(baa var_baa, long l, int i, int[] is) {
	if (i < 43)
	    a(-1, (byte) -58);
	e++;
	if (n != null) {
	    String string = n.a(l, is, 88, var_baa);
	    if (string != null)
		return string;
	}
	return Long.toString(l);
    }
    
    final uj a(int i, byte i_1_) {
	a++;
	uj var_uj = (uj) f.get((long) i, (byte) 100);
	if (var_uj != null)
	    return var_uj;
	if (i_1_ < 8)
	    return null;
	byte[] is;
	if (i >= 32768)
	    is = g.b(0x7fff & i, 24, 1);
	else
	    is = d.b(i, 50, 1);
	var_uj = new uj();
	((uj) var_uj).D = this;
	if (is != null)
	    var_uj.a((byte) 48, new BytesParser(is));
	if (i >= 32768)
	    var_uj.i(-19394);
	f.put((long) i, var_uj, 1);
	return var_uj;
    }
    
    static final void b(int i) {
	l++;
	uba.l++;
	tba var_tba = jga.sendGameOutPacket(up.G, pca.isaac, (byte) -124);
	if (i != -30184)
	    a(21);
	((tba) var_tba).loginStream.writeShort(qs.a, 13469);
	ud.a(var_tba, (byte) -36);
    }
    
    sh(int i, pl var_pl, pl var_pl_2_, lv var_lv) {
	f = new tb(64);
	n = null;
	n = var_lv;
	g = var_pl_2_;
	d = var_pl;
	if (d != null)
	    ((sh) this).m = d.a(1, true);
	if (g != null)
	    ((sh) this).k = g.a(1, true);
    }
}
