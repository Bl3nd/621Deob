/* gea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class gea implements Runnable
{
    static int a;
    static int b;
    private byte[] c;
    private int d;
    static int e;
    private int f = 0;
    private IOException g;
    private Thread h;
    static int i;
    static int j;
    private OutputStream k;
    private int l = 0;
    static tb m = new tb(50);
    static boolean n = false;
    static boolean o = false;
    
    final void a(int i, int i_0_, byte[] is, int i_1_) throws IOException {
	e++;
	if (i_1_ < 0 || i < 0 || i + i_1_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (g != null)
		throw new IOException(g.toString());
	    if (i_0_ != 0)
		n = false;
	    int i_2_;
	    if (l >= f)
		i_2_ = d + f - l - 1;
	    else
		i_2_ = f - 1 - l;
	    if (i_1_ > i_2_)
		throw new IOException("");
	    if (i_1_ + l <= d)
		co.a(is, i, c, l, i_1_);
	    else {
		int i_3_ = d - l;
		co.a(is, i, c, l, i_3_);
		co.a(is, i_3_ + i, c, 0, i_1_ - i_3_);
	    }
	    l = (l + i_1_) % d;
	    this.notifyAll();
	}
    }
    
    public final void run() {
	b++;
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (g != null)
			return;
		    if (l < f)
			i = l + (d - f);
		    else
			i = l - f;
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (f + i > d) {
		    int i_4_ = d - f;
		    k.write(c, f, i_4_);
		    k.write(c, 0, i - i_4_);
		} else
		    k.write(c, f, i);
	    } catch (IOException ioexception) {
		synchronized (this) {
		    g = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		f = (f + i) % d;
	    }
	}
    }
    
    static final ej a(int i) {
	if (i != 0)
	    return null;
	gea.i++;
	ej var_ej = (ej) aj.fca.a(true);
	if (var_ej != null) {
	    uba.m--;
	    return var_ej;
	}
	return new ej();
    }
    
    final void b(int i) {
	j++;
	synchronized (this) {
	    if (g == null)
		g = new IOException("");
	    this.notifyAll();
	}
	try {
	    if (i >= -78)
		a(-86);
	    h.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    final void c(int i) {
	a++;
	if (i != 10454)
	    run();
	k = new tn();
    }
    
    public static void d(int i) {
	if (i == 0)
	    m = null;
    }
    
    gea(OutputStream outputstream, int i) {
	k = outputstream;
	d = i + 1;
	c = new byte[d];
	h = new Thread(this);
	h.setDaemon(true);
	h.start();
    }
}
