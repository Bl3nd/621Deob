/* gg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class gg extends ms implements hh
{
    private bt s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    static int z;
    static int A;
    
    public final int a(byte i) {
	if (i < 11)
	    s = null;
	v++;
	return super.a((byte) 90);
    }
    
    public final Buffer a(byte i, boolean bool) {
	t++;
	if (i != -88)
	    a((byte) -113, true);
	return super.a(bool, (byte) 51, ((lm) ((ms) this).j).hi);
    }
    
    public final bt a(int i) {
	if (i != -17318)
	    s = null;
	z++;
	return s;
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_) {
	if ((i_0_ ^ 0xffffffff) != i) {
	    if (i_0_ == 1007)
		ClientScriptHandler.a(NPC.kd, i_2_, i_1_);
	    else if (i_0_ != 1010) {
		if (i_0_ != 1002) {
		    if (i_0_ == 1006)
			ClientScriptHandler.a(tb.j, i_2_, i_1_);
		} else
		    ClientScriptHandler.a(bi.nb, i_2_, i_1_);
	    } else
		ClientScriptHandler.a(gn.N, i_2_, i_1_);
	} else
	    ClientScriptHandler.a(nt.e, i_2_, i_1_);
	x++;
    }
    
    gg(lm var_lm, bt var_bt, boolean bool) {
	super(var_lm, 34963, bool);
	s = var_bt;
    }
    
    public final boolean b(byte i) {
	if (i < 10)
	    s = null;
	A++;
	return super.a(((lm) ((ms) this).j).hi, 35040);
    }
    
    public final void b(int i) {
	u++;
	super.b(i);
	if (i != -21271)
	    a(107, -114);
    }
    
    public final void a(int i, int i_3_) {
	y++;
	super.a(i, i_3_ * ((bt) s).c);
    }
}
