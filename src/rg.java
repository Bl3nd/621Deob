/* rg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class rg implements nca
{
    private boolean a = false;
    static int b;
    static int c;
    private boolean d;
    static int e;
    static int f;
    static int g;
    static int h;
    int i;
    static int j;
    int k;
    static int l;
    static int m;
    private int n;
    qj o;
    static int p;
    int q;
    static int r;
    
    static final void a(byte[] is, boolean bool) {
	if (bool == true) {
	    j++;
	    BytesParser var_es = new BytesParser(is);
	    for (;;) {
		int i = var_es.readUnsignedByte(-9268);
		if (i == 0)
		    break;
		if (i == 2)
		    ao.h = var_es.readShort(13111);
	    }
	}
    }
    
    final int a(boolean bool) {
	if (bool != true)
	    ((rg) this).q = -92;
	p++;
	return ((rg) this).q;
    }
    
    protected final void finalize() throws Throwable {
	b((byte) -69);
	e++;
	super.finalize();
    }
    
    private final void b(int i) {
	((rg) this).o.a(this, -2);
	r++;
	if (i != 29924)
	    ((rg) this).i = -80;
	if (!a) {
	    OpenGL.glTexParameteri(((rg) this).i, 10241, d ? 9984 : 9728);
	    OpenGL.glTexParameteri(((rg) this).i, 10240, 9728);
	} else {
	    OpenGL.glTexParameteri(((rg) this).i, 10241, d ? 9987 : 9729);
	    OpenGL.glTexParameteri(((rg) this).i, 10240, 9729);
	}
    }
    
    private final int a(byte i) {
	g++;
	int i_0_ = ((rg) this).o.d(-6402, ((rg) this).k) * n;
	int i_1_ = 38 / ((i + 31) / 54);
	if (!d)
	    return i_0_;
	return 4 * i_0_ / 3;
    }
    
    final void b(byte i) {
	l++;
	if (i <= -7) {
	    if (((rg) this).q > 0) {
		((rg) this).o.c(a((byte) -92), 20024, ((rg) this).q);
		((rg) this).q = 0;
	    }
	}
    }
    
    private final void a(int i, int i_2_) {
	b++;
	((qj) ((rg) this).o).Ee -= i;
	((qj) ((rg) this).o).Ee += a((byte) 35);
	if (i_2_ >= -27)
	    c(114);
    }
    
    final boolean c(int i) {
	c++;
	if (((qj) ((rg) this).o).wg) {
	    int i_3_ = a((byte) 111);
	    ((rg) this).o.a(this, -2);
	    OpenGL.glGenerateMipmapEXT(((rg) this).i);
	    d = true;
	    b(29924);
	    a(i_3_, -89);
	    return true;
	}
	if (i != 9566)
	    return false;
	return false;
    }
    
    final void a(boolean bool, int i) {
	m++;
	if (bool == !d) {
	    int i_4_ = a((byte) -92);
	    d = true;
	    b(29924);
	    a(i_4_, -111);
	}
	if (i != 3)
	    ((rg) this).q = 91;
    }
    
    final void b(boolean bool, int i) {
	h++;
	if (i == 17137) {
	    if (!a != !bool) {
		a = bool;
		b(29924);
	    }
	}
    }
    
    static final String a(byte i, String string) {
	if (i <= 91)
	    return null;
	f++;
	String string_5_ = ns.a(aaa.stringToLong(0, string), 124);
	if (string_5_ == null)
	    string_5_ = "";
	return string_5_;
    }
    
    rg(qj var_qj, int i, int i_6_, int i_7_, boolean bool) {
	((rg) this).o = var_qj;
	n = i_7_;
	d = bool;
	((rg) this).i = i;
	((rg) this).k = i_6_;
	OpenGL.glGenTextures(1, kg.g, 0);
	((rg) this).q = kg.g[0];
	a(0, -44);
    }
    
    public abstract void a(int i);
}
