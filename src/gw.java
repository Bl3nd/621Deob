/* gw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gw
{
    boolean a;
    private static short[] b = new short[500];
    int c = 0;
    private static short[] d = new short[500];
    jj e;
    short[] f;
    byte[] g;
    boolean h;
    private static byte[] i;
    private static short[] j = new short[500];
    short[] k;
    short[] l;
    private static short[] m = new short[500];
    boolean n;
    short[] o;
    short[] p;
    private static short[] q;
    
    public static void a() {
	j = null;
	m = null;
	b = null;
	d = null;
	q = null;
	i = null;
    }
    
    gw(byte[] is, jj var_jj) {
	((gw) this).a = false;
	((gw) this).h = false;
	((gw) this).e = null;
	((gw) this).n = false;
	((gw) this).e = var_jj;
	try {
	    BytesParser var_es = new BytesParser(is);
	    BytesParser var_es_0_ = new BytesParser(is);
	    var_es.readUnsignedByte(-9268);
	    ((BytesParser) var_es).pos += 2;
	    int i = var_es.readUnsignedByte(-9268);
	    int i_1_ = 0;
	    int i_2_ = -1;
	    int i_3_ = -1;
	    ((BytesParser) var_es_0_).pos = ((BytesParser) var_es).pos + i;
	    for (int i_4_ = 0; i_4_ < i; i_4_++) {
		int i_5_ = ((jj) ((gw) this).e).k[i_4_];
		if (i_5_ == 0)
		    i_2_ = i_4_;
		int i_6_ = var_es.readUnsignedByte(-9268);
		if (i_6_ > 0) {
		    if (i_5_ == 0)
			i_3_ = i_4_;
		    j[i_1_] = (short) i_4_;
		    short i_7_ = 0;
		    if (i_5_ == 3 || i_5_ == 10)
			i_7_ = (short) 128;
		    if ((i_6_ & 0x1) != 0)
			m[i_1_] = (short) var_es_0_.readSmart(-9561);
		    else
			m[i_1_] = i_7_;
		    if ((i_6_ & 0x2) != 0)
			b[i_1_] = (short) var_es_0_.readSmart(-9561);
		    else
			b[i_1_] = i_7_;
		    if ((i_6_ & 0x4) != 0)
			d[i_1_] = (short) var_es_0_.readSmart(-9561);
		    else
			d[i_1_] = i_7_;
		    gw.i[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
		    if (i_5_ == 2 || i_5_ == 9) {
			m[i_1_] = (short) (m[i_1_] << 2 & 0x3fff);
			b[i_1_] = (short) (b[i_1_] << 2 & 0x3fff);
			d[i_1_] = (short) (d[i_1_] << 2 & 0x3fff);
		    }
		    q[i_1_] = (short) -1;
		    if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
			if (i_2_ > i_3_) {
			    q[i_1_] = (short) i_2_;
			    i_3_ = i_2_;
			}
		    } else if (i_5_ == 5)
			((gw) this).a = true;
		    else if (i_5_ == 7)
			((gw) this).n = true;
		    else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
			((gw) this).h = true;
		    i_1_++;
		}
	    }
	    if (((BytesParser) var_es_0_).pos != is.length)
		throw new RuntimeException();
	    ((gw) this).c = i_1_;
	    ((gw) this).k = new short[i_1_];
	    ((gw) this).f = new short[i_1_];
	    ((gw) this).l = new short[i_1_];
	    ((gw) this).p = new short[i_1_];
	    ((gw) this).o = new short[i_1_];
	    ((gw) this).g = new byte[i_1_];
	    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
		((gw) this).k[i_8_] = j[i_8_];
		((gw) this).f[i_8_] = m[i_8_];
		((gw) this).l[i_8_] = b[i_8_];
		((gw) this).p[i_8_] = d[i_8_];
		((gw) this).o[i_8_] = q[i_8_];
		((gw) this).g[i_8_] = gw.i[i_8_];
	    }
	} catch (Exception exception) {
	    ((gw) this).c = 0;
	    ((gw) this).a = false;
	    ((gw) this).n = false;
	}
    }
    
    static {
	i = new byte[500];
	q = new short[500];
    }
}
