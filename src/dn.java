/* dn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dn
{
    static int a = 0;
    PlayerUpdateLocation b;
    static int c = -1;
    private short[] d;
    static int e;
    private int[] f = { -1, -1, -1, -1, -1 };
    private short[] g;
    private short[] h;
    static int i;
    static int j;
    private int[] k;
    private short[] l;
    static int m;
    static int n;
    static int o;
    static int p;
    static int q;
    
    static final void a(int i, String string) {
	if (i != -2747)
	    a(-71, (String) null);
	System.exit(1);
	dn.i++;
    }
    
    final eg a(int i) {
	e++;
	if (k == null)
	    return null;
	eg[] var_egs = new eg[k.length];
	synchronized (((PlayerUpdateLocation) ((dn) this).b).e) {
	    for (int i_0_ = 0; i_0_ < k.length; i_0_++)
		var_egs[i_0_]
		    = efa.a(k[i_0_], ((PlayerUpdateLocation) ((dn) this).b).e, 0, false);
	}
	int i_1_ = -87 % ((i + 26) / 51);
	for (int i_2_ = 0; k.length > i_2_; i_2_++) {
	    if (((eg) var_egs[i_2_]).bb < 13)
		var_egs[i_2_].a((byte) -107, 2);
	}
	eg var_eg;
	if (var_egs.length == 1)
	    var_eg = var_egs[0];
	else
	    var_eg = new eg(var_egs, var_egs.length);
	if (var_eg == null)
	    return null;
	if (d != null) {
	    for (int i_3_ = 0; i_3_ < d.length; i_3_++)
		var_eg.a(d[i_3_], (byte) -111, g[i_3_]);
	}
	if (h != null) {
	    for (int i_4_ = 0; i_4_ < h.length; i_4_++)
		var_eg.a(h[i_4_], (int) -60, l[i_4_]);
	}
	return var_eg;
    }
    
    static final boolean a(int i, int i_5_) {
	j++;
	if (i < 12)
	    c = 63;
	if (i_5_ != 0 && i_5_ != 1 && i_5_ != 2)
	    return false;
	return true;
    }
    
    final void a(int i, BytesParser var_es) {
	o++;
	if (i >= 5) {
	    for (;;) {
		int i_6_ = var_es.readUnsignedByte(-9268);
		if (i_6_ == 0)
		    break;
		a(i_6_, var_es, false);
	    }
	}
    }
    
    final boolean a(boolean bool) {
	m++;
	if (k == null)
	    return true;
	boolean bool_7_ = bool;
	synchronized (((PlayerUpdateLocation) ((dn) this).b).e) {
	    for (int i = 0; i < k.length; i++) {
		if (!((PlayerUpdateLocation) ((dn) this).b).e.a(0, (byte) 75, k[i]))
		    bool_7_ = false;
	    }
	}
	return bool_7_;
    }
    
    final eg b(boolean bool) {
	q++;
	eg[] var_egs = new eg[5];
	if (bool != false)
	    a = 102;
	int i = 0;
	synchronized (((PlayerUpdateLocation) ((dn) this).b).e) {
	    for (int i_8_ = 0; i_8_ < 5; i_8_++) {
		if (f[i_8_] != -1)
		    var_egs[i++]
			= efa.a(f[i_8_], ((PlayerUpdateLocation) ((dn) this).b).e, 0, false);
	    }
	}
	for (int i_9_ = 0; i_9_ < 5; i_9_++) {
	    if (var_egs[i_9_] != null && ((eg) var_egs[i_9_]).bb < 13)
		var_egs[i_9_].a((byte) -107, 2);
	}
	eg var_eg = new eg(var_egs, i);
	if (d != null) {
	    for (int i_10_ = 0; i_10_ < d.length; i_10_++)
		var_eg.a(d[i_10_], (byte) 55, g[i_10_]);
	}
	if (h != null) {
	    for (int i_11_ = 0; i_11_ < h.length; i_11_++)
		var_eg.a(h[i_11_], (int) 120, l[i_11_]);
	}
	return var_eg;
    }
    
    private final void a(int i, BytesParser var_es, boolean bool) {
	p++;
	if (i != 1) {
	    if (i == 2) {
		int i_12_ = var_es.readUnsignedByte(-9268);
		k = new int[i_12_];
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		    k[i_13_] = var_es.readShort(13111);
	    } else if (i != 3) {
		if (i != 40) {
		    if (i != 41) {
			if (i >= 60 && i < 70)
			    f[i - 60] = var_es.readShort(13111);
		    } else {
			int i_14_ = var_es.readUnsignedByte(-9268);
			l = new short[i_14_];
			h = new short[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
			    h[i_15_] = (short) var_es.readShort(13111);
			    l[i_15_] = (short) var_es.readShort(13111);
			}
		    }
		} else {
		    int i_16_ = var_es.readUnsignedByte(-9268);
		    g = new short[i_16_];
		    d = new short[i_16_];
		    for (int i_17_ = 0; i_16_ > i_17_; i_17_++) {
			d[i_17_] = (short) var_es.readShort(13111);
			g[i_17_] = (short) var_es.readShort(13111);
		    }
		}
	    }
	} else
	    var_es.readUnsignedByte(-9268);
	if (bool != false)
	    ((dn) this).b = null;
    }
    
    public dn() {
	/* empty */
    }
    
    final boolean a(byte i) {
	n++;
	boolean bool = true;
	if (i >= -67)
	    return false;
	synchronized (((PlayerUpdateLocation) ((dn) this).b).e) {
	    for (int i_18_ = 0; i_18_ < 5; i_18_++) {
		if ((f[i_18_] ^ 0xffffffff) != 0
		    && !((PlayerUpdateLocation) ((dn) this).b).e.a(0, (byte) 79, f[i_18_]))
		    bool = false;
	    }
	}
	return bool;
    }
}
