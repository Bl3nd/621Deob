/* js - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class js implements oc
{
    int a;
    static int b;
    int c;
    int d;
    boolean e;
    int f;
    int g;
    static int h;
    rc i;
    static GameInPacket incomingPacket40 = new GameInPacket(40, 2);
    static int k;
    ct l;
    int m;
    static int n;
    static boolean o = false;
    static int[] p;
    int q;
    int r;
    
    public final wea a(int i) {
	b++;
	if (i <= 38)
	    return null;
	return jr.m;
    }
    
    static final void a(int i, int i_0_, rc var_rc, int i_1_, ct var_ct,
			int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_) {
	lf.o = i;
	gf.e = var_ct;
	h++;
	GrandExchangeItem.l = i_0_;
	ci.m = i_2_;
	if (i_1_ <= -94) {
	    qfa.e = i_7_;
	    dk.A = i_3_;
	    LoginStream.Tb = i_8_;
	    taa.g = null;
	    gd.b = i_4_;
	    hq.f = null;
	    bea.n = i_5_;
	    bq.j = null;
	    at.J = var_rc;
	    tea.p = i_6_;
	    jr.c(3171);
	    ia.w = true;
	}
    }
    
    static final boolean a(int i, int i_9_, int i_10_) {
	if (i != 0)
	    return false;
	k++;
	if ((0x580 & i_9_) == 0)
	    return false;
	return true;
    }
    
    public static void a(byte i) {
	p = null;
	if (i <= 55)
	    o = false;
	incomingPacket40 = null;
    }
    
    js(int i, ct var_ct, rc var_rc, int i_11_, int i_12_, int i_13_, int i_14_,
       int i_15_, int i_16_, int i_17_, boolean bool) {
	((js) this).g = i_17_;
	((js) this).r = i_13_;
	((js) this).a = i_11_;
	((js) this).e = bool;
	((js) this).i = var_rc;
	((js) this).c = i;
	((js) this).d = i_14_;
	((js) this).f = i_15_;
	((js) this).m = i_12_;
	((js) this).l = var_ct;
	((js) this).q = i_16_;
    }
}
