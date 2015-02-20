/* hv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hv
{
    int[] a;
    short b;
    short[] c;
    static int d;
    int[] e = new int[4];
    static boolean f = true;
    short g;
    byte h;
    short[] i;
    short j;
    static GameOutPacket k = new GameOutPacket(74, 4);
    short[] l;
    int[] m;
    byte n;
    short o;
    static tb p;
    static int q = 0;
    static int[] r = new int[14];
    static fh s;
    static boolean t;
    static int thisPlayersRights;
    
    public static void a(int i) {
	s = null;
	k = null;
	r = null;
	p = null;
	if (i != 0)
	    a(-56);
    }
    
    static final int a(int i, bfa var_bfa) {
	d++;
	String string = Class_ob.a(var_bfa, i ^ 0x629c);
	int[] is = null;
	if (!nt.a(((bfa) var_bfa).v, (byte) 20)) {
	    if ((((bfa) var_bfa).o ^ 0xffffffff) != 0)
		is = ((ItemDef) laa.itemDefLoader.d(12388, ((bfa) var_bfa).o)).eb;
	    else if (!sl.b(-1, ((bfa) var_bfa).v)) {
		if (hq.a(((bfa) var_bfa).v, 21922)) {
		    Object object = null;
		    ObjectDef var_bda;
		    if (((bfa) var_bfa).v == 1008)
			var_bda = ul.k.getObjectDef((byte) 125, (int) ((bfa) var_bfa).n);
		    else
			var_bda
			    = ul.k.getObjectDef((byte) 33, (int) (((bfa) var_bfa).n >>> 32
						       & 0x7fffffffL));
		    if (((ObjectDef) var_bda).xb != null)
			var_bda = var_bda.a(cp.e, -1643);
		    if (var_bda != null)
			is = ((ObjectDef) var_bda).l;
		}
	    } else {
		NPCNode var_mi
		    = (NPCNode) uo.a.a(-32748, (long) (int) ((bfa) var_bfa).n);
		if (var_mi != null) {
		    NPC class_ac = ((NPCNode) var_mi).l;
		    NPCDef var_du = ((NPC) class_ac).npcDef;
		    if (((NPCDef) var_du).L != null)
			var_du = var_du.a(-4261, cp.e);
		    if (var_du != null)
			is = ((NPCDef) var_du).G;
		}
	    }
	} else
	    is = ((ItemDef) laa.itemDefLoader.d(12388, (int) ((bfa) var_bfa).n)).eb;
	if (is != null)
	    string += nj.a(is, (byte) 126);
	int i_0_ = dca.R.a(en.S, string, 111);
	if (i != 25322)
	    a(36, null);
	if (((bfa) var_bfa).m)
	    i_0_ += ua.e.E() + 4;
	return i_0_;
    }
    
    hv(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
       int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
       int i_13_) {
	((hv) this).h = (byte) i;
	((hv) this).a = new int[4];
	((hv) this).m = new int[4];
	((hv) this).n = (byte) i_1_;
	((hv) this).m[0] = i_2_;
	((hv) this).m[1] = i_3_;
	((hv) this).m[2] = i_4_;
	((hv) this).m[3] = i_5_;
	((hv) this).a[0] = i_6_;
	((hv) this).a[3] = i_9_;
	((hv) this).a[2] = i_8_;
	((hv) this).a[1] = i_7_;
	((hv) this).e[1] = i_11_;
	((hv) this).e[0] = i_10_;
	((hv) this).j = (short) (i_2_ >> Class_fb.a);
	((hv) this).e[2] = i_12_;
	((hv) this).e[3] = i_13_;
	((hv) this).o = (short) (i_4_ >> Class_fb.a);
	((hv) this).b = (short) (i_10_ >> Class_fb.a);
	((hv) this).g = (short) (i_12_ >> Class_fb.a);
	((hv) this).c = new short[4];
	((hv) this).i = new short[4];
	((hv) this).l = new short[4];
    }
    
    static {
	p = new tb(32);
	s = new fh(12, 19);
	t = false;
	thisPlayersRights = 0;
    }
}
