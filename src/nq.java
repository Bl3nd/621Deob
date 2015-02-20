/* nq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class nq extends pv implements dw
{
    static int[] n;
    static int o;
    static int p;
    private int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static Rectangle[] v;
    static GameOutPacket w;
    static int x = 0;
    static int y;
    
    nq(qj var_qj, int i, byte[] is, int i_0_, boolean bool) {
	super(var_qj, 34963, is, i_0_, bool);
	q = i;
    }
    
    static final boolean a(int i, char c) {
	y++;
	if (i >= -114)
	    return true;
	if ((c < '0' || c > '9') && (c < 'A' || c > 'Z')
	    && (c < 'a' || c > 'z'))
	    return false;
	return true;
    }
    
    final void b(byte i) {
	if (i != -54)
	    n = null;
	o++;
	((pv) this).f.a(i - 38, this);
    }
    
    public final int a(byte i) {
	u++;
	if (i != -17)
	    w = null;
	return q;
    }
    
    public static void d(int i) {
	v = null;
	w = null;
	n = null;
	if (i > -19)
	    n = null;
    }
    
    public final long a(int i) {
	if (i != 13456)
	    n = null;
	r++;
	return 0L;
    }
    
    public final void a(int i, int i_1_, int i_2_, byte[] is) {
	if (i_1_ == 17816) {
	    this.a((byte) 126, is, i_2_);
	    t++;
	    q = i;
	}
    }
    
    public final int b(int i) {
	s++;
	if (i != -22904)
	    return 93;
	return ((pv) this).g;
    }
    
    static {
	n = new int[] { 7500, 500 };
	v = new Rectangle[100];
	w = new GameOutPacket(46, 8);
    }
}
