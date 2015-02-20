/* kda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jagdx.IDirect3DIndexBuffer;
import jagdx.qr;

final class kda implements hh
{
    private bt a;
    private int b;
    private boolean c;
    IDirect3DIndexBuffer d;
    private int e;
    private boolean f = false;
    private gaa g;
    
    public final void b(int i) {
	if (((kda) this).d != null) {
	    ((kda) this).d.b(6168);
	    ((kda) this).d = null;
	}
	if (i == -21271) {
	    e = 0;
	    b = 0;
	}
    }
    
    public final bt a(int i) {
	if (i != -17318)
	    b = -27;
	return a;
    }
    
    public final boolean b(byte i) {
	if (i <= 10)
	    return false;
	if (f && qr.a(((kda) this).d.Unlock(), -2005530519)) {
	    f = false;
	    return true;
	}
	return false;
    }
    
    public final Buffer a(byte i, boolean bool) {
	if (((kda) this).d == null)
	    return null;
	bool &= c;
	if (i != -88)
	    e = 15;
	if (!f
	    && qr.a(((kda) this).d.Lock(0, e, !bool ? 0 : 8192, ((gaa) g).Pg),
		    -2005530519)) {
	    f = true;
	    return ((gaa) g).Pg;
	}
	return null;
    }
    
    public final void a(int i, int i_0_) {
	if (i != 27209)
	    a((byte) -74, true);
	b = i_0_ * ((bt) a).c;
	if (b > e) {
	    int i_1_ = 8;
	    int i_2_;
	    if (c) {
		i_1_ |= 0x200;
		i_2_ = 0;
	    } else
		i_2_ = 1;
	    if (((kda) this).d != null)
		((kda) this).d.b(i ^ 0x7251);
	    ((kda) this).d = ((gaa) g).Hg.a(b, i_1_, a != bt.h ? 102 : 101,
					    i_2_, ((kda) this).d);
	    e = b;
	}
    }
    
    public final int a(byte i) {
	if (i <= 11)
	    f = true;
	return b;
    }
    
    kda(gaa var_gaa, bt var_bt, boolean bool) {
	c = bool;
	a = var_bt;
	g = var_gaa;
    }
}
