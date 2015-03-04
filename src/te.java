/* te - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class te extends lp
{
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static GameInPacket incomingPacket63 = new GameInPacket(63, 2);
    static int z;
    private f A;
    static fh B = new fh(2, -1);
    
    public final void a(int i) {
	w++;
	super.a(-101);
	A = fq.a(((lp) this).e, 1024, ((bw) (bw) ((lp) this).d).o);
	if (i >= -41)
	    A = null;
    }
    
    final void b(int i, int i_0_, boolean bool, int i_1_) {
	z++;
	int i_2_ = this.b((byte) -8) * ((iea) ((lp) this).d).i / 10000;
	int[] is = new int[4];
	lg.r.oa(is);
	lg.r.da(i_1_, i_0_ + 2, i_1_ + i_2_, ((iea) ((lp) this).d).e + i_0_);
	A.b(i_1_, i_0_ + 2, ((iea) ((lp) this).d).i, ((iea) ((lp) this).d).e);
	lg.r.da(is[0], is[1], is[i], is[3]);
    }
    
    public static void e(int i) {
	if (i < -54) {
	    B = null;
	    incomingPacket63 = null;
	}
    }
    
    static final void a(boolean bool) {
	aea.bc.d(0);
	s++;
	for (int i = 0; i < 32; i++)
	    td.n[i] = 0L;
	if (bool == true) {
	    for (int i = 0; i < 32; i++)
		ji.i[i] = 0L;
	    mj.k = 0;
	}
    }
    
    static final void a(pp var_pp, int i, pp var_pp_3_) {
	if (((pp) var_pp_3_).o != null)
	    var_pp_3_.a((byte) -106);
	if (i == 2) {
	    t++;
	    ((pp) var_pp_3_).var_n = ((pp) var_pp).var_n;
	    ((pp) var_pp_3_).o = var_pp;
	    ((pp) ((pp) var_pp_3_).o).var_n = var_pp_3_;
	    ((pp) ((pp) var_pp_3_).var_n).o = var_pp_3_;
	}
    }
    
    public final boolean a(byte i) {
	x++;
	if (!super.a(i))
	    return false;
	return ((lp) this).e.g(1912, ((bw) (bw) ((lp) this).d).o);
    }
    
    static final int a(boolean bool, NPC class_ac) {
	r++;
	NPCDef var_du = ((NPC) class_ac).npcDef;
	if (((NPCDef) var_du).L != null) {
	    var_du = var_du.a(-4261, cp.e);
	    if (var_du == null)
		return -1;
	}
	int i = ((NPCDef) var_du).t;
	cg var_cg = class_ac.k(32195);
	if (!((Entity) class_ac).V) {
	    if (((cg) var_cg).h == ((Entity) class_ac).Bc
		|| ((Entity) class_ac).Bc == ((cg) var_cg).g
		|| ((Entity) class_ac).Bc == ((cg) var_cg).X
		|| ((Entity) class_ac).Bc == ((cg) var_cg).M)
		i = ((NPCDef) var_du).sb;
	    else if (((Entity) class_ac).Bc == ((cg) var_cg).j
		     || ((Entity) class_ac).Bc == ((cg) var_cg).e
		     || ((Entity) class_ac).Bc == ((cg) var_cg).u
		     || ((Entity) class_ac).Bc == ((cg) var_cg).m)
		i = ((NPCDef) var_du).ab;
	} else
	    i = ((NPCDef) var_du).lb;
	if (bool != false)
	    B = null;
	return i;
    }
    
    te(pl var_pl, pl var_pl_4_, bw var_bw) {
	super(var_pl, var_pl_4_, (iea) var_bw);
    }
    
    static final void a(int i, Interface var_kp) {
	if (i != 18259)
	    a(null, 62, null);
	if (((Interface) var_kp).type == 5 && ((Interface) var_kp).itemID != -1)
	    NPCDef.a(lg.r, var_kp, -124);
	v++;
    }
    
    final void a(int i, int i_5_, boolean bool, int i_6_) {
	int i_7_ = 33 % ((i - 50) / 49);
	lg.r.c(i_5_ - 2, i_6_, ((iea) ((lp) this).d).i + 4,
	       ((iea) ((lp) this).d).e + 2, ((bw) (bw) ((lp) this).d).r, 0);
	u++;
	lg.r.c(i_5_ - 1, i_6_ + 1, ((iea) ((lp) this).d).i + 2,
	       ((iea) ((lp) this).d).e, 0, 0);
    }
}
