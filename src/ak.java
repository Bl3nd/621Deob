/* ak - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class ak implements Runnable
{
    private int a;
    static int b;
    private byte[] c;
    static int d;
    static f[] e;
    private int f;
    static int g;
    private InputStream h;
    static vw i;
    private Thread j;
    private IOException k;
    static int l;
    private int m = 0;
    static int n;
    static GameOutPacket o = new GameOutPacket(48, 0);
    static GameInPacket incomingPacket26 = new GameInPacket(26, 6);
    static GameOutPacket q = new GameOutPacket(23, 18);
    static int r = 52;
    static BytesParser s;
    static long userFlow = 0L;
    
    final void a(byte i) {
	d++;
	if (i <= 42)
	    q = null;
	h = new cca();
    }
    
    public static void b(byte i) {
	q = null;
	s = null;
	if (i == -127) {
	    incomingPacket26 = null;
	    ak.i = null;
	    e = null;
	    o = null;
	}
    }
    
    final boolean a(int i, byte i_0_) throws IOException {
	b++;
	if (i_0_ >= -80)
	    return true;
	if (i <= 0 || i >= f)
	    throw new IOException();
	synchronized (this) {
	    int i_1_;
	    if (a <= m)
		i_1_ = m - a;
	    else
		i_1_ = m + f - a;
	    if (i > i_1_) {
		if (k != null)
		    throw new IOException(k.toString());
		return false;
	    }
	    return true;
	}
    }
    
    final void a(int i) {
	g++;
	synchronized (this) {
	    if (i != 17575)
		return;
	    if (k == null)
		k = new IOException("");
	    this.notifyAll();
	}
	try {
	    j.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    final int a(int i, int i_2_, byte[] is, int i_3_) throws IOException {
	l++;
	if (i_2_ < 0 || i_3_ < 0 || is.length < i_3_ + i_2_)
	    throw new IOException();
	synchronized (this) {
	    int i_4_;
	    if (m >= a)
		i_4_ = m - a;
	    else
		i_4_ = m - a + f;
	    if (i_2_ > i_4_)
		i_2_ = i_4_;
	    if (i_2_ == 0 && k != null)
		throw new IOException(k.toString());
	    if (f < i_2_ + a) {
		int i_5_ = f - a;
		co.a(c, a, is, i_3_, i_5_);
		co.a(c, 0, is, i_5_ + i_3_, i_2_ - i_5_);
	    } else
		co.a(c, a, is, i_3_, i_2_);
	    a = (a + i_2_) % f;
	    int i_6_ = -3 % ((i + 29) / 43);
	    this.notifyAll();
	    return i_2_;
	}
    }
    
    ak(InputStream inputstream, int i) {
	a = 0;
	h = inputstream;
	f = i + 1;
	c = new byte[f];
	j = new Thread(this);
	j.setDaemon(true);
	j.start();
    }
    
    public final void run() {
	n++;
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (k != null)
			return;
		    if (a == 0)
			i = f - 1 - m;
		    else if (m > a)
			i = f - m;
		    else
			i = a - m - 1;
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_7_;
	    try {
		i_7_ = h.read(c, m, i);
		if (i_7_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    k = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		m = (m + i_7_) % f;
	    }
	}
    }
}
