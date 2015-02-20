/* tm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class tm extends iea
{
    int n;
    static int o = 1338;
    static int p;
    int q;
    int r;
    static int s;
    static int t;
    int u;
    static int v;
    int w;
    static int[] x = new int[1000];
    static int y;
    int z;
    
    public wea a(int i) {
	if (i <= 38)
	    ((tm) this).z = -23;
	p++;
	return nj.j;
    }
    
    public static void b(int i) {
	x = null;
	if (i < 61)
	    b(41);
    }
    
    static final ul a(boolean bool, int i, pl var_pl) {
	y++;
	byte[] is = var_pl.a((int) 114, i);
	if (bool != false)
	    return null;
	if (is == null)
	    return null;
	return new ul(is);
    }
    
    tm(ct var_ct, rc var_rc, int i, int i_0_, int i_1_, int i_2_, int i_3_,
       int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
       int i_11_) {
	super(var_ct, var_rc, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
	((tm) this).u = i_6_;
	((tm) this).w = i_7_;
	((tm) this).n = i_9_;
	((tm) this).q = i_8_;
	((tm) this).z = i_11_;
	((tm) this).r = i_10_;
    }
    
    static final void c(int i) {
	s++;
	if (i != -1)
	    b(-97);
	for (nv var_nv = (nv) Class_u.L.a((int) 109); var_nv != null;
	     var_nv = (nv) Class_u.L.b((byte) 67)) {
	    if (((nv) var_nv).n != -1)
		var_nv.unlink(-77);
	    else {
		((nv) var_nv).s = 0;
		if (((nv) var_nv).u >= 0 && ((nv) var_nv).k >= 0
		    && Class_hc.e > ((nv) var_nv).u && bw.v > ((nv) var_nv).k)
		    rh.a(var_nv, -123);
	    }
	}
    }
    
    static final int d(int i) {
	if (i != 4929)
	    c(-18);
	v++;
	return 46;
    }
}
