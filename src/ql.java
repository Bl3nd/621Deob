/* ql - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ql extends Node
{
    boolean k;
    int l;
    static int m;
    oaa n;
    int o;
    int p;
    int yLoc;
    go r;
    static int s;
    int t;
    boolean u;
    ObjectDef v;
    hw w;
    boolean x;
    int y;
    int z;
    int A = 0;
    static GameInPacket incomingPacket103 = new GameInPacket(103, 10);
    int xLoc;
    int D;
    int[] E;
    Player F;
    int G;
    NPC H;
    go I;
    int J;
    hw K;
    oaa L;
    
    static final int a(int i) {
	if (i != 0)
	    incomingPacket103 = null;
	s++;
	return ISAAC.k;
    }
    
    final void a(byte i) {
	m++;
	if (i == -99) {
	    int i_0_ = ((ql) this).p;
	    boolean bool = ((ql) this).x;
	    if (((ql) this).v != null) {
		ObjectDef var_bda = ((ql) this).v.a(cp.e, -1643);
		if (var_bda == null) {
		    ((ql) this).J = 0;
		    ((ql) this).l = 0;
		    ((ql) this).o = 0;
		    ((ql) this).x = false;
		    ((ql) this).E = null;
		    ((ql) this).k = false;
		    ((ql) this).p = -1;
		    ((ql) this).t = 0;
		} else {
		    ((ql) this).o = ((ObjectDef) var_bda).eb;
		    ((ql) this).E = ((ObjectDef) var_bda).n;
		    ((ql) this).x = ((ObjectDef) var_bda).Cb;
		    ((ql) this).J = ((ObjectDef) var_bda).m;
		    ((ql) this).l = ((ObjectDef) var_bda).Qb;
		    ((ql) this).p = ((ObjectDef) var_bda).Nb;
		    ((ql) this).k = ((ObjectDef) var_bda).kb;
		    ((ql) this).t = ((ObjectDef) var_bda).gb << 9;
		}
	    } else if (((ql) this).H == null) {
		if (((ql) this).F != null) {
		    ((ql) this).p = wea.a(((ql) this).F, false);
		    ((ql) this).t = ((Player) ((ql) this).F).xd << 9;
		    ((ql) this).J = ((Player) ((ql) this).F).Od;
		    ((ql) this).x = ((Player) ((ql) this).F).sd;
		}
	    } else {
		int i_1_ = te.a(false, ((ql) this).H);
		if (i_1_ != i_0_) {
		    ((ql) this).p = i_1_;
		    NPCDef var_du = ((NPC) ((ql) this).H).npcDef;
		    if (((NPCDef) var_du).L != null)
			var_du = var_du.a(-4261, cp.e);
		    if (var_du != null) {
			((ql) this).t = ((NPCDef) var_du).pb << 9;
			((ql) this).J = ((NPCDef) var_du).h;
			((ql) this).x = ((NPCDef) var_du).v;
		    } else {
			((ql) this).J = ((ql) this).t = 0;
			((ql) this).x = ((NPCDef) ((NPC) ((ql) this).H).npcDef).v;
		    }
		}
	    }
	    if ((((ql) this).p != i_0_ || !((ql) this).x != !bool)
		&& ((ql) this).K != null) {
		ej.r.a(((ql) this).K);
		((ql) this).n = null;
		((ql) this).r = null;
		((ql) this).K = null;
	    }
	}
    }
    
    public static void b(int i) {
	incomingPacket103 = null;
	if (i != 103)
	    b(-84);
    }
    
    public ql() {
	/* empty */
    }
}
