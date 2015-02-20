/* aaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aaa
{
    static int a = 0;
    static int b;
    static int c;
    static int d;
    static int e;
    private int f;
    static int g;
    static GameInPacket incomingPacket73 = new GameInPacket(73, -1);
    private il i;
    static int j;
    static Animable[][] k;
    static int l;
    private je m = new je();
    static int n;
    static int o;
    static GameInPacket incomingPacket32 = new GameInPacket(32, 2);
    private int q;
    static int r;
    static rca s = new rca();
    static int t;
    static int[] u = new int[14];
    
    static final long stringToLong(int i, String string) {
	d++;
	long l = 0L;
	int i_0_ = string.length();
	for (int i_1_ = i; i_0_ > i_1_; i_1_++) {
	    l *= 37L;
	    char c = string.charAt(i_1_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) (c - '@');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c - 'a' + '\001');
	    else if (c >= '0' && c <= '9')
		l += (long) (c - '0' + '\033');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    public static void a(int i) {
	s = null;
	incomingPacket73 = null;
	if (i != -91)
	    stringToLong((int) 53, (String) null);
	k = null;
	u = null;
	incomingPacket32 = null;
    }
    
    final Object a(byte i, gj var_gj) {
	g++;
	long l = var_gj.a(61);
	int i_2_ = 58 % ((30 - i) / 34);
	for (as var_as = (as) this.i.a(-32748, l); var_as != null;
	     var_as = (as) this.i.c((byte) 115)) {
	    if (((as) var_as).y.a(var_gj, 126)) {
		Object object = var_as.a(-9023);
		if (object == null) {
		    var_as.unlink((int) -54);
		    var_as.a((byte) -95);
		    f += ((as) var_as).t;
		} else {
		    if (!var_as.d((byte) -13)) {
			m.a((int) 75, var_as);
			((pp) var_as).l = 0L;
		    } else {
			at var_at = new at(var_gj, object, ((as) var_as).t);
			this.i.a(var_at, (byte) -40, ((Node) var_as).nodeID);
			m.a((int) 75, var_at);
			((pp) var_at).l = 0L;
			var_as.unlink((int) -72);
			var_as.a((byte) -55);
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final void a(byte i) {
	if (i != 64)
	    d((byte) 112);
	for (as var_as = (as) m.d((byte) -127); var_as != null;
	     var_as = (as) m.a(1252027233)) {
	    if (var_as.d((byte) -125)) {
		var_as.unlink(i - 149);
		var_as.a((byte) -70);
		f += ((as) var_as).t;
	    }
	}
	r++;
    }
    
    private final void a(as var_as, int i) {
	if (i >= 3) {
	    t++;
	    if (var_as != null) {
		var_as.unlink((int) -43);
		var_as.a((byte) -69);
		f += ((as) var_as).t;
	    }
	}
    }
    
    final void a(Object object, gj var_gj, byte i) {
	j++;
	a(1, (byte) -58, var_gj, object);
	if (i != 41)
	    c((byte) -96);
    }
    
    private final void a(int i, byte i_3_, gj var_gj, Object object) {
	e++;
	if (i > q)
	    throw new IllegalStateException("s>cs");
	a(true, var_gj);
	f -= i;
	while (f < 0) {
	    as var_as = (as) m.b(-21957);
	    a(var_as, 18);
	}
	at var_at = new at(var_gj, object, i);
	this.i.a(var_at, (byte) -46, var_gj.a(72));
	m.a((int) 75, var_at);
	((pp) var_at).l = 0L;
	if (i_3_ >= -7)
	    a((int) -62);
    }
    
    final int b(byte i) {
	c++;
	if (i < 13)
	    a = 91;
	return q;
    }
    
    private final void a(boolean bool, gj var_gj) {
	b++;
	long l = var_gj.a(116);
	if (bool != true)
	    q = -33;
	for (as var_as = (as) i.a(-32748, l); var_as != null;
	     var_as = (as) i.c((byte) 120)) {
	    if (((as) var_as).y.a(var_gj, 86)) {
		a(var_as, 100);
		break;
	    }
	}
    }
    
    final void a(int i, int i_4_) {
	if (dca.P != null) {
	    for (as var_as = (as) m.d((byte) -125); var_as != null;
		 var_as = (as) m.a(1252027233)) {
		if (var_as.d((byte) -127)) {
		    if (var_as.a(-9023) == null) {
			var_as.unlink(i_4_ ^ ~0x2e);
			var_as.a((byte) -63);
			f += ((as) var_as).t;
		    }
		} else if ((long) i < ++((pp) var_as).l) {
		    as var_as_5_ = dca.P.a(var_as, (byte) -120);
		    this.i.a(var_as_5_, (byte) -64, ((Node) var_as).nodeID);
		    te.a(var_as, 2, var_as_5_);
		    var_as.unlink(i_4_ ^ ~0x1a);
		    var_as.a((byte) -69);
		}
	    }
	}
	n++;
	if (i_4_ != 0)
	    m = null;
    }
    
    final int c(byte i) {
	if (i < 62)
	    return -81;
	l++;
	return f;
    }
    
    final void d(byte i) {
	o++;
	m.c(1252027233);
	this.i.a(true);
	if (i != 77)
	    incomingPacket73 = null;
	f = q;
    }
    
    aaa(int i) {
	f = i;
	q = i;
	int i_6_;
	for (i_6_ = 1; i > i_6_ + i_6_; i_6_ += i_6_) {
	    /* empty */
	}
	this.i = new il(i_6_);
    }
}
