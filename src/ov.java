/* ov - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;

import jagdx.IDirect3DVertexBuffer;
import jagdx.qr;

final class ov implements nba
{
    private byte a;
    private boolean b = false;
    private boolean c;
    private gaa d;
    private int e;
    private int f;
    IDirect3DVertexBuffer g;
    
    public final boolean a(int i, int i_0_, int i_1_) {
	if (i > -29)
	    a(null, -126, 11, (byte) -116);
	a = (byte) i_0_;
	f = i_1_;
	if (f > e) {
	    int i_2_ = 8;
	    int i_3_;
	    if (!c)
		i_3_ = 1;
	    else {
		i_2_ |= 0x200;
		i_3_ = 0;
	    }
	    if (((ov) this).g != null)
		((ov) this).g.b(6168);
	    ((ov) this).g = ((gaa) d).Hg.a(f, i_2_, 0, i_3_, ((ov) this).g);
	    e = f;
	}
	return ((ov) this).g != null;
    }
    
    final int b(byte i) {
	if (i != -102)
	    return 82;
	return a;
    }
    
    public final boolean a(Source source, int i, int i_4_, byte i_5_) {
	if (a(-115, i, i_4_))
	    return ((ov) this).g.a(source, 0, 0, f, !c ? 0 : 8192);
	if (i_5_ <= 20)
	    d = null;
	return false;
    }
    
    public final boolean a(int i) {
	if (b && qr.a(((ov) this).g.Unlock(), -2005530519)) {
	    b = false;
	    return true;
	}
	if (i < 12)
	    a(16, -79, 8);
	return false;
    }
    
    public final void b(int i) {
	if (null != ((ov) this).g) {
	    ((ov) this).g.b(6168);
	    ((ov) this).g = null;
	}
	if (i != -21271)
	    d = null;
	e = 0;
	f = 0;
    }
    
    public final int a(byte i) {
	if (i < 11)
	    b((byte) -5);
	return f;
    }
    
    public final Buffer a(boolean bool, int i) {
	if (((ov) this).g == null)
	    return null;
	bool &= c;
	if (!b && qr.a(((ov) this).g.Lock(0, e, bool ? 8192 : 0, ((gaa) d).Pg),
		       i ^ ~0x77898840)) {
	    b = true;
	    return ((gaa) d).Pg;
	}
	if (i != 32726)
	    b((int) 62);
	return null;
    }
    
    ov(gaa var_gaa, boolean bool) {
	c = bool;
	d = var_gaa;
    }
}
