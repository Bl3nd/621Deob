/* dp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dp
{
    static int a;
    private pl b;
    static int c;
    static int d;
    private tb e = new tb(64);
    static int f;
    static pk g = new pk("WTQA", 2);
    static int h;
    static int i;
    static int j;
    static efa k;
    static GameInPacket incomingPacket50 = new GameInPacket(50, 6);
    static boolean m = false;
    static int n;
    static int o = -1;
    
    final void a(int i) {
	if (i < 94)
	    a((int) 36, (String) null);
	f++;
	synchronized (e) {
	    e.c((byte) 91);
	}
    }
    
    static final int b(int i) {
	d++;
	if (i > -121)
	    return -102;
	return 16;
    }
    
    final void c(int i) {
	synchronized (e) {
	    e.a(18385);
	}
	if (i >= -32)
	    a((int) 66, (String) null);
	j++;
    }
    
    public static void a(byte i) {
	g = null;
	incomingPacket50 = null;
	k = null;
	if (i >= -6)
	    b(119);
    }
    
    static final oga d(int i) {
	a++;
	if (i <= 64)
	    return null;
	try {
	    return (oga) Class.forName("st").newInstance();
	} catch (Throwable throwable) {
	    return new tr();
	}
    }
    
    final vu a(byte i, int i_0_) {
	c++;
	vu var_vu;
	synchronized (e) {
	    var_vu = (vu) e.get((long) i_0_, (byte) 100);
	}
	if (var_vu != null)
	    return var_vu;
	byte[] is;
	synchronized (b) {
	    is = b.b(i_0_, 51, 11);
	}
	var_vu = new vu();
	if (i != 6)
	    g = null;
	if (is != null)
	    var_vu.a((byte) -101, new BytesParser(is));
	synchronized (e) {
	    e.put((long) i_0_, var_vu, 1);
	}
	return var_vu;
    }
    
    final void a(int i, int i_1_) {
	h++;
	synchronized (e) {
	    e.a(true, i_1_);
	}
	if (i < 107)
	    a((byte) -74, -49);
    }
    
    static final int a(int i, String string) {
	if (i != 15895)
	    return 79;
	dp.i++;
	int i_2_ = string.length();
	int i_3_ = 0;
	for (int i_4_ = 0; i_2_ > i_4_; i_4_++) {
	    char c = string.charAt(i_4_);
	    if (c > '\u007f') {
		if (c <= '\u07ff')
		    i_3_ += 2;
		else
		    i_3_ += 3;
	    } else
		i_3_++;
	}
	return i_3_;
    }
    
    dp(Class_rf class_rf, int i, pl var_pl) {
	b = var_pl;
	if (b != null)
	    b.a(11, true);
    }
}
