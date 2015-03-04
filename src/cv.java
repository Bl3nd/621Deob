/* cv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class cv
{
    private long a = -1L;
    private long b;
    private byte[] c;
    static int d;
    static int e;
    static int f;
    static int g = 0;
    static int h;
    private long i;
    private byte[] j;
    static int k;
    private long l = -1L;
    private int m;
    static int n;
    static int o;
    private FileOnDisk p;
    private long q;
    static int r;
    private long s;
    static int t;
    static int u;
    static int v;
    static int w;
    static pl x;
    static int[] y = new int[1];
    private int z = 0;
    
    final void a(int i, byte i_0_, int i_1_, byte[] is) throws IOException {
	f++;
	try {
	    if (i_1_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_1_ + i - is.length);
	    if (this.l != -1L && q >= this.l
		&& q + (long) i_1_ <= this.l + (long) z) {
		co.a(j, (int) (q - this.l), is, i, i_1_);
		q += (long) i_1_;
		return;
	    }
	    long l = q;
	    int i_2_ = i;
	    int i_3_ = i_1_;
	    if (a <= q && (long) m + a > q) {
		int i_4_ = (int) (a + (long) m - q);
		if (i_1_ < i_4_)
		    i_4_ = i_1_;
		co.a(c, (int) (q - a), is, i, i_4_);
		i_1_ -= i_4_;
		q += (long) i_4_;
		i += i_4_;
	    }
	    if (i_0_ <= 78)
		return;
	    if (c.length >= i_1_) {
		if (i_1_ > 0) {
		    c(0);
		    int i_5_ = i_1_;
		    if (m < i_5_)
			i_5_ = m;
		    co.a(c, 0, is, i, i_5_);
		    i += i_5_;
		    i_1_ -= i_5_;
		    q += (long) i_5_;
		}
	    } else {
		p.seek(q);
		s = q;
		while (i_1_ > 0) {
		    int i_6_ = p.read(i, is, i_1_);
		    if ((i_6_ ^ 0xffffffff) == 0)
			break;
		    q += (long) i_6_;
		    s += (long) i_6_;
		    i_1_ -= i_6_;
		    i += i_6_;
		}
	    }
	    if (this.l != -1L) {
		if (this.l > q && i_1_ > 0) {
		    int i_7_ = (int) (this.l - q) + i;
		    if (i_7_ > i_1_ + i)
			i_7_ = i_1_ + i;
		    while (i < i_7_) {
			i_1_--;
			is[i++] = (byte) 0;
			q++;
		    }
		}
		long l_8_ = -1L;
		long l_9_ = -1L;
		if (this.l >= l && this.l < (long) i_3_ + l)
		    l_8_ = this.l;
		else if (this.l <= l && l < this.l + (long) z)
		    l_8_ = l;
		if (this.l + (long) z <= l
		    || (long) i_3_ + l < (long) z + this.l) {
		    if (l + (long) i_3_ > this.l
			&& this.l + (long) z >= (long) i_3_ + l)
			l_9_ = (long) i_3_ + l;
		} else
		    l_9_ = this.l + (long) z;
		if (l_8_ > -1L && l_8_ < l_9_) {
		    int i_10_ = (int) (l_9_ - l_8_);
		    co.a(j, (int) (l_8_ - this.l), is, (int) (l_8_ - l) + i_2_,
			 i_10_);
		    if (q < l_9_) {
			i_1_ -= l_9_ - q;
			q = l_9_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    s = -1L;
	    throw ioexception;
	}
	if (i_1_ > 0)
	    throw new EOFException();
    }
    
    static final byte[] a(byte[] is, int i, int i_11_) {
	o++;
	if (i_11_ != 27995)
	    b((int) 84);
	byte[] is_12_ = new byte[i];
	co.a(is, 0, is_12_, 0, i);
	return is_12_;
    }
    
    private final void a(int i) throws IOException {
	if (this.l != -1L) {
	    if (this.l != s) {
		p.seek(this.l);
		s = this.l;
	    }
	    p.write(0, z, j);
	    s += (long) z;
	    if (this.i < s)
		this.i = s;
	    long l = -1L;
	    if (a > this.l || (long) m + a <= this.l) {
		if (this.l <= a && a < (long) z + this.l)
		    l = a;
	    } else
		l = this.l;
	    long l_13_ = -1L;
	    if (a >= this.l + (long) z || (long) m + a < this.l + (long) z) {
		if (a + (long) m > this.l && this.l + (long) z >= (long) m + a)
		    l_13_ = (long) m + a;
	    } else
		l_13_ = (long) z + this.l;
	    if (l > -1L && l < l_13_) {
		int i_14_ = (int) (l_13_ - l);
		co.a(j, (int) (l - this.l), c, (int) (l - a), i_14_);
	    }
	    z = 0;
	    this.l = -1L;
	}
	n++;
	if (i != -1)
	    g = -42;
    }
    
    public static void b(int i) {
	x = null;
	y = null;
	if (i != -5715)
	    y = null;
    }
    
    private final void c(int i) throws IOException {
	r++;
	m = i;
	if (s != q) {
	    p.seek(q);
	    s = q;
	}
	a = q;
	while (c.length > m) {
	    int i_15_ = c.length - m;
	    if (i_15_ > 200000000)
		i_15_ = 200000000;
	    int i_16_ = p.read(m, c, i_15_);
	    if (i_16_ == -1)
		break;
	    m += i_16_;
	    s += (long) i_16_;
	}
    }
    
    final void seek(int i, long length) throws IOException {
	u++;
	if (length < 0L)
	    throw new IOException("Invalid seek to " + length + " in file " + a((byte) -53));
	if (i != 13755)
	    a(null, -90, 66);
	q = length;
    }
    
    final void a(byte[] is, int i, int i_17_, int i_18_) throws IOException {
	k++;
	do {
	    try {
		if (b < (long) i_17_ + q)
		    b = q + (long) i_17_;
		if (this.l != -1L && (this.l > q || q > (long) z + this.l))
		    a(i_18_ - 27896);
		if (this.l != -1L
		    && (long) i_17_ + q > (long) j.length + this.l) {
		    int i_19_ = (int) (this.l - q + (long) j.length);
		    co.a(is, i, j, (int) (q - this.l), i_19_);
		    q += (long) i_19_;
		    i_17_ -= i_19_;
		    i += i_19_;
		    z = j.length;
		    a((int) -1);
		}
		if (i_17_ > j.length) {
		    if (q != s) {
			p.seek(q);
			s = q;
		    }
		    p.write(i, i_17_, is);
		    s += (long) i_17_;
		    if (s > this.i)
			this.i = s;
		    long l = -1L;
		    if (a > q || q >= (long) m + a) {
			if (q <= a && (long) i_17_ + q > a)
			    l = a;
		    } else
			l = q;
		    long l_20_ = -1L;
		    if (a >= (long) i_17_ + q
			|| q + (long) i_17_ > (long) m + a) {
			if (a + (long) m > q
			    && (long) m + a <= q + (long) i_17_)
			    l_20_ = (long) m + a;
		    } else
			l_20_ = (long) i_17_ + q;
		    if (l > -1L && l_20_ > l) {
			int i_21_ = (int) (l_20_ - l);
			co.a(is, (int) (l + (long) i - q), c, (int) (l - a),
			     i_21_);
		    }
		    q += (long) i_17_;
		} else if (i_17_ > 0) {
		    if (this.l == -1L)
			this.l = q;
		    co.a(is, i, j, (int) (q - this.l), i_17_);
		    q += (long) i_17_;
		    if (q - this.l > (long) z)
			z = (int) (q - this.l);
		} else {
		    if (i_18_ == 27895)
			break;
		    s = -95L;
		}
	    } catch (IOException ioexception) {
		s = -1L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    static final void a(boolean bool, byte i) {
	t++;
	Class_mb.a(4, ff.width, bool, Class_vb.u, eh.height);
	int i_22_ = -81 % ((48 - i) / 55);
    }
    
    private final File a(byte i) {
	h++;
	if (i > -20)
	    c = null;
	return p.getFile();
    }
    
    final long d(int i) {
	w++;
	if (i != 0)
	    return -95L;
	return b;
    }
    
    final void b(byte i) throws IOException {
	if (i == 101) {
	    v++;
	    a((int) -1);
	    p.close();
	}
    }
    
    final void a(boolean bool, byte[] is) throws IOException {
	a(0, (byte) 106, is.length, is);
	if (bool != false)
	    g = -5;
	e++;
    }
    
    cv(FileOnDisk var_cu, int i, int i_23_) throws IOException {
	p = var_cu;
	b = this.i = var_cu.getLength();
	j = new byte[i_23_];
	c = new byte[i];
	q = 0L;
    }
}
