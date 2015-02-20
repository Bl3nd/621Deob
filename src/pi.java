/* pi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pi implements gj
{
    boolean a;
    int b;
    int c;
    static int d;
    int e;
    int f;
    int g;
    static GameInPacket incomingPacket_74;
    int i;
    static int j;
    static int k;
    static int l;
    static String[] m = new String[100];
    static int n;
    static int o;
    
    public final boolean a(gj var_gj, int i) {
	d++;
	if (!(var_gj instanceof pi))
	    return false;
	pi var_pi_0_ = (pi) var_gj;
	if (((pi) this).e != ((pi) var_pi_0_).e)
	    return false;
	if (((pi) this).i != ((pi) var_pi_0_).i)
	    return false;
	int i_1_ = -115 / ((35 - i) / 41);
	if (((pi) this).g != ((pi) var_pi_0_).g)
	    return false;
	if (((pi) this).c != ((pi) var_pi_0_).c)
	    return false;
	if (((pi) this).f != ((pi) var_pi_0_).f)
	    return false;
	if (((pi) var_pi_0_).b != ((pi) this).b)
	    return false;
	if (!((pi) this).a == ((pi) var_pi_0_).a)
	    return false;
	return true;
    }
    
    public final long a(int i) {
	j++;
	long[] ls = ml.a;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) (0xffL & ((long) ((pi) this).e ^ l))];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (((pi) this).i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) ((pi) this).i))];
	if (i <= 42)
	    return -14L;
	l = ls[(int) (((long) (((pi) this).g >> 24) ^ l) & 0xffL)] ^ l >>> 8;
	l = l >>> 8 ^ ls[(int) (((long) (((pi) this).g >> 16) ^ l) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (((pi) this).g >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) ((pi) this).g) & 0xffL)];
	l = ls[(int) ((l ^ (long) ((pi) this).c) & 0xffL)] ^ l >>> 8;
	l = ls[(int) (0xffL & ((long) (((pi) this).f >> 24) ^ l))] ^ l >>> 8;
	l = ls[(int) (0xffL & ((long) (((pi) this).f >> 16) ^ l))] ^ l >>> 8;
	l = ls[(int) (0xffL & (l ^ (long) (((pi) this).f >> 8)))] ^ l >>> 8;
	l = l >>> 8 ^ ls[(int) (((long) ((pi) this).f ^ l) & 0xffL)];
	l = l >>> 8 ^ ls[(int) (0xffL & ((long) ((pi) this).b ^ l))];
	l = ls[(int) (0xffL & (l ^ (long) (((pi) this).a ? 1 : 0)))] ^ l >>> 8;
	return l;
    }
    
    public static void b(int i) {
	if (i != 255)
	    b(70);
	m = null;
	incomingPacket_74 = null;
    }
    
    static final void a(int i, boolean bool, int i_2_, int i_3_) {
	l++;
	if (i_2_ < 8000 || i_2_ > 48000)
	    throw new IllegalArgumentException();
	if (i_3_ >= 32) {
	    k = i;
	    wq.p = bool;
	    gba.G = i_2_;
	}
    }
    
    static {
	incomingPacket_74 = new GameInPacket(74, 11);
	n = -1;
    }
}
