/* oca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class oca
{
    private int a;
    private pu[] b;
    static int c;
    private int d = 0;
    private Class_ae e;
    private int f = -1;
    static int inScreenPlayers = 0;
    static f h;
    static int i;
    static int j;
    private int k;
    private int[][] l;
    static bfa m;
    static GameOutPacket n = new GameOutPacket(9, 2);
    boolean o;
    
    final int[] a(int i, boolean bool) {
	oca.i++;
	if (bool != true)
	    return null;
	if (k == a) {
	    ((oca) this).o = b[i] == null;
	    b[i] = nn.d;
	    return l[i];
	}
	if (a != 1) {
	    pu var_pu = b[i];
	    if (var_pu != null)
		((oca) this).o = false;
	    else {
		((oca) this).o = true;
		if (a <= d) {
		    pu var_pu_0_ = (pu) e.c(false);
		    var_pu = new pu(i, ((pu) var_pu_0_).n);
		    b[((pu) var_pu_0_).l] = null;
		    var_pu_0_.unlink(-80);
		} else {
		    var_pu = new pu(i, d);
		    d++;
		}
		b[i] = var_pu;
	    }
	    e.a(var_pu, (byte) 7);
	    return l[((pu) var_pu).n];
	}
	((oca) this).o = i != f;
	f = i;
	return l[0];
    }
    
    final void a(byte i) {
	j++;
	for (int i_1_ = 0; a > i_1_; i_1_++)
	    l[i_1_] = null;
	b = null;
	if (i != 96)
	    a(false);
	l = null;
	e.d(2);
	e = null;
    }
    
    final int[][] a(boolean bool) {
	c++;
	if (k != a)
	    throw new RuntimeException("Can only retrieve nullLoader full image cache");
	if (bool != false)
	    a = -15;
	for (int i = 0; a > i; i++)
	    b[i] = nn.d;
	return l;
    }
    
    public static void a(int i) {
	if (i != -5518)
	    m = null;
	n = null;
	h = null;
	m = null;
    }
    
    oca(int i, int i_2_, int i_3_) {
	e = new Class_ae();
	((oca) this).o = false;
	a = i;
	k = i_2_;
	b = new pu[k];
	l = new int[a][i_3_];
    }
}
