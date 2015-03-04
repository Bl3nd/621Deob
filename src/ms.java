/* ms - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class ms implements et
{
    private int a;
    static int b;
    static int c;
    private boolean d;
    private int e = -1;
    static int f;
    static int g;
    static int h;
    private int i;
    lm j;
    private NativeHeapBuffer k;
    static int l;
    static int m;
    private int n;
    static int o;
    static int p;
    static int q;
    private int r;
    
    protected final void finalize() throws Throwable {
	b(-21271);
	c++;
	super.finalize();
    }
    
    void b(int i) {
	if (i == -21271) {
	    h++;
	    if (e > 0) {
		((ms) this).j.a(this.i, e, (byte) 2);
		e = -1;
	    }
	}
    }
    
    final void c(int i) {
	q++;
	if (((lm) ((ms) this).j).xi)
	    OpenGL.glBindBufferARB(n, e);
	if (i != 35001)
	    ((ms) this).j = null;
    }
    
    final Buffer a(boolean bool, byte i, MapBuffer mapbuffer) {
	if (i <= 34)
	    a((MapBuffer) null, -51);
	g++;
	if (a == 0) {
	    e(122);
	    if (e <= 0) {
		a = 2;
		return k;
	    }
	    OpenGL.glBindBufferARB(n, e);
	    if (bool) {
		OpenGL.glBufferDataARBub(n, r, null, 0, !d ? 35044 : 35040);
		if (this.i <= ((en) ((ms) this).j).Jd.size) {
		    a = 1;
		    return ((en) ((ms) this).j).Jd;
		}
	    }
	    if (!mapbuffer.b() && mapbuffer.a(n, this.i, 35001)) {
		a = 2;
		return mapbuffer;
	    }
	}
	return null;
    }
    
    final long d(int i) {
	o++;
	if (i != 0)
	    return 57L;
	if (e != 0)
	    return 0L;
	return k.getAddress();
    }
    
    private final void e(int i) {
	if (i > 113) {
	    l++;
	    if (e < 0) {
		if (!((lm) ((ms) this).j).xi)
		    e = 0;
		else {
		    OpenGL.glGenBuffersARB(1, kl.l, 0);
		    e = kl.l[0];
		    OpenGL.glBindBufferARB(n, e);
		}
	    }
	}
    }
    
    void a(int i, int i_0_) {
	if (r < i_0_) {
	    e(i - 27095);
	    if (e > 0) {
		OpenGL.glBindBufferARB(n, e);
		OpenGL.glBufferDataARBub(n, i_0_, null, 0, d ? 35040 : 35044);
		((en) ((ms) this).j).Qd += i_0_ - r;
	    } else
		k = ((ms) this).j.a(i_0_, (byte) 112, false);
	    r = i_0_;
	}
	if (i != 27209)
	    n = -53;
	m++;
	this.i = i_0_;
    }
    
    final boolean a(int i, Source source, byte i_1_) {
	b++;
	if (i_1_ <= 101)
	    ((ms) this).j = null;
	if (i <= r) {
	    if (e > 0) {
		OpenGL.glBindBufferARB(n, e);
		OpenGL.glBufferSubDataARBa(n, 0, this.i, source.getAddress());
		((en) ((ms) this).j).Qd += i - this.i;
	    } else
		throw new RuntimeException("ARGH!");
	} else {
	    e(119);
	    if (e <= 0)
		throw new RuntimeException("ARGH!");
	    OpenGL.glBindBufferARB(n, e);
	    OpenGL.glBufferDataARBa(n, i, source.getAddress(),
				    d ? 35040 : 35044);
	    ((en) ((ms) this).j).Qd += i - this.i;
	    r = i;
	}
	this.i = i;
	return true;
    }
    
    final boolean a(MapBuffer mapbuffer, int i) {
	p++;
	boolean bool = true;
	if (i != 35040)
	    e(-42);
	if (a != 0) {
	    if (e > 0) {
		OpenGL.glBindBufferARB(n, e);
		if (a != 1)
		    bool = mapbuffer.a();
		else
		    OpenGL.glBufferSubDataARBa(n, 0, r, ((en) ((ms) this).j)
							    .Jd.getAddress());
	    }
	    a = 0;
	}
	return bool;
    }
    
    public int a(byte i) {
	f++;
	if (i < 11)
	    return -47;
	return this.i;
    }
    
    ms(lm var_lm, int i, boolean bool) {
	a = 0;
	n = i;
	((ms) this).j = var_lm;
	d = bool;
    }
}
