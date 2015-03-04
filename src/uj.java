/* uj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class uj extends pp
{
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static Class_mc x;
    static int y;
    static int z;
    static int A;
    static int B;
    int[] C;
    sh D;
    static int F = -1;
    static int G;
    private int[][] H;
    private int[] I;
    static boolean[][] J
	= { new boolean[4], { false, true, true, false },
	    { true, false, true, false }, { true, false, true, false },
	    { false, false, true, false }, { false, false, true, false },
	    { true, false, true, false }, { true, false, false, true },
	    { true, false, false, true }, { true, true, false, false },
	    new boolean[4], { false, true, false, true }, new boolean[4] };
    boolean K = true;
    static int L;
    static int M;
    private String[] N;
    static int O;
    
    final void a(byte i, BytesParser var_es) {
	if (i == 48) {
	    M++;
	    for (;;) {
		int i_0_ = var_es.readUnsignedByte(-9268);
		if (i_0_ == 0)
		    break;
		a(i_0_, var_es, (byte) -31);
	    }
	}
    }
    
    final baa a(int i, int i_1_) {
	int i_2_ = 94 % ((i + 62) / 58);
	G++;
	if (I == null || i_1_ < 0 || I.length < i_1_)
	    return null;
	return je.a((byte) 127, I[i_1_]);
    }
    
    final void a(int[] is, int i, BytesParser var_es) {
	z++;
	if (I != null) {
	    for (int i_3_ = i; i_3_ < I.length && i_3_ < is.length; i_3_++) {
		int i_4_ = ((baa) a(56, i_3_)).i;
		if (i_4_ > 0)
		    var_es.writeAmountOfBytes(i_4_, -6, (long) is[i_3_]);
	    }
	}
    }
    
    final String a(int i, BytesParser var_es) {
	w++;
	StringBuffer stringbuffer = new StringBuffer(80);
	if (I != null) {
	    for (int i_5_ = 0; i_5_ < I.length; i_5_++) {
		stringbuffer.append(N[i_5_]);
		stringbuffer.append(((uj) this).D.a(a(-125, i_5_),
						    var_es.a((byte) -107,
							     (((baa)
							       je.a((byte) 103,
								    I[i_5_]))
							      .f)),
						    i - 1673, H[i_5_]));
	    }
	}
	stringbuffer.append(N[N.length - 1]);
	if (i != 1772)
	    I = null;
	return stringbuffer.toString();
    }
    
    final int a(int i, int i_6_, int i_7_) {
	y++;
	if (I == null || i_7_ < 0 || i_7_ > I.length)
	    return -1;
	int i_8_ = 0 % ((-49 - i) / 63);
	if (H[i_7_] == null || i_6_ < 0 || i_6_ > H[i_7_].length)
	    return -1;
	return H[i_7_][i_6_];
    }
    
    final String b(byte i) {
	v++;
	StringBuffer stringbuffer = new StringBuffer(80);
	if (N == null)
	    return "";
	stringbuffer.append(N[0]);
	int i_9_ = -121 % ((-46 - i) / 34);
	for (int i_10_ = 1; N.length > i_10_; i_10_++) {
	    stringbuffer.append("...");
	    stringbuffer.append(N[i_10_]);
	}
	return stringbuffer.toString();
    }
    
    public static void a(int i) {
	J = null;
	int i_11_ = -62 / ((43 - i) / 34);
	x = null;
    }
    
    private final void a(int i, BytesParser var_es, byte i_12_) {
	B++;
	if (i == 1)
	    N = vq.a(i_12_ ^ 0x66, var_es.readString((byte) 124), '<');
	else if (i == 2) {
	    int i_13_ = var_es.readUnsignedByte(-9268);
	    ((uj) this).C = new int[i_13_];
	    for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
		((uj) this).C[i_14_] = var_es.readShort(13111);
	} else if (i != 3) {
	    if (i == 4)
		((uj) this).K = false;
	} else {
	    int i_15_ = var_es.readUnsignedByte(-9268);
	    I = new int[i_15_];
	    H = new int[i_15_][];
	    for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
		int i_17_ = var_es.readShort(13111);
		baa var_baa = je.a((byte) 124, i_17_);
		if (var_baa != null) {
		    I[i_16_] = i_17_;
		    H[i_16_] = new int[((baa) var_baa).g];
		    for (int i_18_ = 0; i_18_ < ((baa) var_baa).g; i_18_++)
			H[i_16_][i_18_] = var_es.readShort(13111);
		}
	    }
	}
	if (i_12_ != -31)
	    a(58, 1, 62);
    }
    
    final void i(int i) {
	if (((uj) this).C != null) {
	    for (int i_19_ = 0; ((uj) this).C.length > i_19_; i_19_++)
		((uj) this).C[i_19_] = hba.bitwiseArg1ORArg2(((uj) this).C[i_19_], 32768);
	}
	O++;
	if (i != -19394)
	    a(16, 89, -121);
    }
    
    static final void a(int i, Class_r class_r) {
	u++;
	if ((mu.j >= 2 || ba.c) && kr.a == null) {
	    String string;
	    if (ba.c && mu.j < 2)
		string = Class_kd.itemName + GameText.space.getString(cba.languageID) + Class_ag.k + " ->";
	    else if (!vh.shiftClickEnabled || !uc.c.a((byte) -68, (int) 81) || mu.j <= 2) {
		bfa var_bfa = (bfa) ((Node) ((Class_ae) oba.I).o).next;
		string = Class_ob.a(var_bfa, 118);
		int[] is = null;
		if (!nt.a(((bfa) var_bfa).v, (byte) 106)) {
		    if (((bfa) var_bfa).o == -1) {
			if (sl.b(-1, ((bfa) var_bfa).v)) {
			    NPCNode var_mi
				= (NPCNode) uo.a.a(-32748,
					      (long) (int) ((bfa) var_bfa).n);
			    if (var_mi != null) {
				NPC class_ac = ((NPCNode) var_mi).npc;
				NPCDef var_du = ((NPC) class_ac).npcDef;
				if (((NPCDef) var_du).L != null)
				    var_du = var_du.a(-4261, cp.e);
				if (var_du != null)
				    is = ((NPCDef) var_du).G;
			    }
			} else if (hq.a(((bfa) var_bfa).v, 21922)) {
			    Object object = null;
			    ObjectDef var_bda;
			    if (((bfa) var_bfa).v != 1008)
				var_bda
				    = ul.k.getObjectDef((byte) 121,
					     (int) (((bfa) var_bfa).n >>> 32
						    & 0x7fffffffL));
			    else
				var_bda = ul.k.getObjectDef((byte) 45,
						 (int) ((bfa) var_bfa).n);
			    if (((ObjectDef) var_bda).xb != null)
				var_bda = var_bda.a(cp.e, i ^ ~0xfff995);
			    if (var_bda != null)
				is = ((ObjectDef) var_bda).l;
			}
		    } else
			is = ((ItemDef) laa.itemDefLoader.d(12388, ((bfa) var_bfa).o)).eb;
		} else
		    is = ((ItemDef) laa.itemDefLoader.d(12388, (int) ((bfa) var_bfa).n)).eb;
		if (is != null)
		    string += nj.a(is, (byte) 126);
	    } else
		string
		    = Class_ob.a((bfa) ((Node)
					((Node) ((Class_ae) oba.I).o).next).next,
				 125);
	    if (i != 16777215)
		a((int) -120, (Class_r) null);
	    if (mu.j > 2)
		string += "<col=ffffff> / " + (mu.j - 2) + GameText._moreOptionsText.getString(cba.languageID);
	    if (qg.d != null) {
		la var_la = qg.d.b(class_r, i ^ ~0xffe3c2);
		if (var_la == null)
		    var_la = pv.j;
		var_la.a(en.S, ((Interface) qg.d).minVScroll, fp.p, ((Interface) qg.d).shadowColor,
			 ((Interface) qg.d).minHScroll, Class_wb.random, string, -125, pt.c, pg.h,
			 ((Interface) qg.d).Z, pda.z, ((Interface) qg.d).textColor, uda.seed,
			 ((Interface) qg.d).Fb);
		caa.a(pt.c[2], pt.c[1], pt.c[3], (byte) 31, pt.c[0]);
	    } else if (rh.y != null && me.q == wa.t) {
		int i_20_
		    = pv.j.a(pda.z, Class_wb.random, en.S, Class_ue.e + 4, 16777215,
			     dp.o + 16, 0, string, false, uda.seed);
		caa.a(dca.R.a((byte) 99, string) + i_20_, dp.o, 16, (byte) 31,
		      Class_ue.e + 4);
	    }
	}
    }
    
    final int c(byte i) {
	t++;
	if (i != 3)
	    ((uj) this).K = false;
	if (I == null)
	    return 0;
	return I.length;
    }
    
    public uj() {
	/* empty */
    }
    
    static {
	s = 0;
    }
}
