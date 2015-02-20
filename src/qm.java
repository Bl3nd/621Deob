/* qm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class qm
{
    static baa a = new baa(10, 2, 2, 0);
    static int b;
    private Inflater c;
    static int heapSize = 64;
    static int e;
    static boolean f = false;
    static int g;
    
    final void a(byte i, BytesParser var_es, byte[] is) {
	e++;
	if (((BytesParser) var_es).bytes[((BytesParser) var_es).pos] != 31
	    || ((BytesParser) var_es).bytes[((BytesParser) var_es).pos + 1] != -117)
	    throw new RuntimeException("Invalid GZIP header!");
	if (c == null)
	    c = new Inflater(true);
	try {
	    c.setInput(((BytesParser) var_es).bytes, ((BytesParser) var_es).pos + 10,
		       -((BytesParser) var_es).pos - 10 - 8 + ((BytesParser) var_es).bytes.length);
	    c.inflate(is);
	} catch (Exception exception) {
	    c.reset();
	    throw new RuntimeException("Invalid GZIP compressed data!");
	}
	c.reset();
	if (i < 118)
	    f = true;
    }
    
    final byte[] a(byte[] is, int i) {
	g++;
	BytesParser var_es = new BytesParser(is);
	int i_0_ = 121 / ((-71 - i) / 51);
	((BytesParser) var_es).pos = is.length - 4;
	int i_1_ = var_es.readIntReversed(-86);
	byte[] is_2_ = new byte[i_1_];
	((BytesParser) var_es).pos = 0;
	a((byte) 125, var_es, is_2_);
	return is_2_;
    }
    
    public static void a(int i) {
	a = null;
	if (i <= 119)
	    f = false;
    }
    
    static final void a(int i, long l) {
	b++;
	int i_3_ = el.d + ((Animable) up.thisPlayer).locX;
	int i_4_ = la.s + ((Animable) up.thisPlayer).locY;
	if (vaa.L - i_3_ < -2000 || vaa.L - i_3_ > 2000
	    || Class_k.N - i_4_ < -2000 || Class_k.N - i_4_ > 2000) {
	    Class_k.N = i_4_;
	    vaa.L = i_3_;
	}
	if (i_3_ != vaa.L) {
	    int i_5_ = i_3_ - vaa.L;
	    int i_6_ = (int) ((long) i_5_ * l / 320L);
	    if (i_5_ <= 0) {
		if (i_6_ != 0) {
		    if (i_6_ < i_5_)
			i_6_ = i_5_;
		} else
		    i_6_ = -1;
	    } else if (i_6_ == 0)
		i_6_ = 1;
	    else if (i_6_ > i_5_)
		i_6_ = i_5_;
	    vaa.L += i_6_;
	}
	if (!((jb) cs.g).n) {
	    qw.n += (float) l * afa.a / 6.0F;
	    pm.F += (float) l * pda.J / 6.0F;
	}
	if (i_4_ != Class_k.N) {
	    int i_7_ = i_4_ - Class_k.N;
	    int i_8_ = (int) ((long) i_7_ * l / 320L);
	    if (i_7_ > 0) {
		if (i_8_ == 0)
		    i_8_ = 1;
		else if (i_8_ > i_7_)
		    i_8_ = i_7_;
	    } else if (i_8_ == 0)
		i_8_ = -1;
	    else if (i_8_ < i_7_)
		i_8_ = i_7_;
	    Class_k.N += i_8_;
	}
	if (i != -2001)
	    heapSize = 98;
	Class_kf.a(5126);
    }
    
    public qm() {
	this(-1, 1000000, 1000000);
    }
    
    private qm(int i, int i_9_, int i_10_) {
	/* empty */
    }
}
