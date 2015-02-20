/* jm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class jm
{
    private th a;
    private BigInteger b;
    private pda[] c;
    private nf d;
    static int[] e;
    static int f;
    private BytesParser g;
    private BigInteger h;
    static boolean[] i;
    static int j = 0;
    private uaa k;
    static int l;
    static int m;
    static int n;
    static char[] o
	= { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
	    '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3',
	    '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	    '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd',
	    '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6',
	    '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
	    '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da',
	    '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	    '\u00f1', '\u00d1', '\u00df' };
    static Class_lb p;
    
    final boolean a(int i) {
	f++;
	if (g != null)
	    return true;
	if (d == null) {
	    if (k.e(26555))
		return false;
	    d = k.a(255, 255, i + 17431, true, (byte) 0);
	}
	if (((ft) d).x)
	    return false;
	BytesParser var_es = new BytesParser(d.d((byte) 112));
	((BytesParser) var_es).pos = 5;
	int i_0_ = var_es.readUnsignedByte(-9268);
	((BytesParser) var_es).pos += i_0_ * 72;
	byte[] is = new byte[((BytesParser) var_es).bytes.length - ((BytesParser) var_es).pos];
	var_es.readBytes(is, true, is.length, 0);
	byte[] is_1_;
	if (b != null && h != null) {
	    BigInteger biginteger = new BigInteger(is);
	    BigInteger biginteger_2_ = biginteger.modPow(b, h);
	    is_1_ = biginteger_2_.toByteArray();
	} else
	    is_1_ = is;
	if (is_1_.length != 65)
	    throw new RuntimeException();
	byte[] is_3_ = Class_a.a(((BytesParser) var_es).pos + (-is.length - 5),
				 ((BytesParser) var_es).bytes, i + 17554, 5);
	for (int i_4_ = 0; i_4_ < 64; i_4_++) {
	    if (is_3_[i_4_] != is_1_[i_4_ + 1])
		throw new RuntimeException();
	}
	if (i != -17427)
	    return true;
	g = var_es;
	c = new pda[i_0_];
	return true;
    }
    
    final void b(int i) {
	l++;
	if (c != null) {
	    for (int i_5_ = 0; c.length > i_5_; i_5_++) {
		if (c[i_5_] != null)
		    c[i_5_].b((int) -117);
	    }
	    if (i != -18366)
		o = null;
	    for (int i_6_ = 0; i_6_ < c.length; i_6_++) {
		if (c[i_6_] != null)
		    c[i_6_].d((int) 60);
	    }
	}
    }
    
    private final pda a(boolean bool, boolean bool_7_, lf var_lf, int i,
			lf var_lf_8_) {
	n++;
	if (g == null)
	    throw new RuntimeException();
	if (i < 0 || i >= c.length)
	    throw new RuntimeException();
	if (c[i] != null)
	    return c[i];
	((BytesParser) g).pos = i * 72 + 6;
	int i_9_ = g.readInt(84);
	int i_10_ = g.readInt(89);
	byte[] is = new byte[64];
	g.readBytes(is, bool, 64, 0);
	pda var_pda
	    = new pda(i, var_lf_8_, var_lf, k, a, i_9_, is, i_10_, bool_7_);
	c[i] = var_pda;
	return var_pda;
    }
    
    final pda a(int i, lf var_lf, lf var_lf_11_, byte i_12_) {
	int i_13_ = 27 / ((i_12_ + 59) / 46);
	m++;
	return a(true, true, var_lf, i, var_lf_11_);
    }
    
    public static void c(int i) {
	e = null;
	if (i != 242)
	    c(59);
	jm.i = null;
	o = null;
	p = null;
    }
    
    jm(uaa var_uaa, th var_th, BigInteger biginteger,
       BigInteger biginteger_14_) {
	a = var_th;
	b = biginteger;
	h = biginteger_14_;
	k = var_uaa;
	if (!k.e(26555))
	    d = k.a(255, 255, 4, true, (byte) 0);
    }
}
