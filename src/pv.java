/* pv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

abstract class pv
{
    static int a;
    static boolean b = false;
    static int c;
    private int d;
    static int x_ = -1;
    qj f;
    int g;
    static int h;
    static int i;
    static la j;
    static int k;
    private int l;
    private boolean m;
    
    static final boolean a(int i, vda var_vda) {
	h++;
	ObjectDef var_bda = ul.k.getObjectDef((byte) 34, var_vda.b((byte) 127));
	if (i == (((ObjectDef) var_bda).u ^ 0xffffffff))
	    return true;
	wi var_wi = gda.d.a(((ObjectDef) var_bda).u, (byte) 65);
	if (((wi) var_wi).a == -1)
	    return true;
	return var_wi.a((byte) -127);
    }
    
    public static void c(int i) {
	j = null;
	if (i < 103)
	    j = null;
    }
    
    final void a(byte i, byte[] is, int i_0_) {
	b((byte) -54);
	pv.i++;
	if (l >= i_0_)
	    OpenGL.glBufferSubDataARBub(d, 0, i_0_, is, 0);
	else {
	    OpenGL.glBufferDataARBub(d, i_0_, is, 0, m ? 35040 : 35044);
	    ((qj) ((pv) this).f).De += i_0_ - l;
	    l = i_0_;
	}
	int i_1_ = -8 % ((i - 77) / 38);
    }
    
    protected final void finalize() throws Throwable {
	c++;
	((pv) this).f.b(8448, ((pv) this).g, l);
	super.finalize();
    }
    
    abstract void b(byte i);
    
    static final boolean a(int i, int i_2_, int i_3_) {
	if (i != 35044)
	    c(-43);
	a++;
	if ((0x800 & i_2_) == 0)
	    return false;
	return true;
    }
    
    pv(qj var_qj, int i, byte[] is, int i_4_, boolean bool) {
	l = i_4_;
	m = bool;
	d = i;
	((pv) this).f = var_qj;
	OpenGL.glGenBuffersARB(1, di.d, 0);
	((pv) this).g = di.d[0];
	b((byte) -54);
	OpenGL.glBufferDataARBub(i, l, is, 0, !m ? 35044 : 35040);
	((qj) ((pv) this).f).De += l;
    }
    
    pv(qj var_qj, int i, Buffer buffer, int i_5_, boolean bool) {
	m = bool;
	l = i_5_;
	d = i;
	((pv) this).f = var_qj;
	OpenGL.glGenBuffersARB(1, di.d, 0);
	((pv) this).g = di.d[0];
	b((byte) -54);
	OpenGL.glBufferDataARBa(i, l, buffer.getAddress(), m ? 35040 : 35044);
	((qj) ((pv) this).f).De += l;
    }
}
