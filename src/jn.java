/* jn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jn extends cl
{
    private bd t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int[] y = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    private float z = 0.0F;
    static int A;
    static int B;
    static GameInPacket incomingPacket54 = new GameInPacket(54, -2);
    static int E;
    static int F;
    static int G;
    static int[] I = new int[4096];
    
    jn(en var_en, bd var_bd) {
	super(var_en);
	t = var_bd;
    }
    
    final boolean a(int i) {
	if (i != -16777216)
	    a(true, false);
	u++;
	return t.a((byte) -44);
    }
    
    public static void f(int i) {
	I = null;
	incomingPacket54 = null;
	y = null;
	if (i < 110)
	    I = null;
    }
    
    static final void a(byte i, Player var_qi) {
	if (i == 70) {
	    x++;
	    ql var_ql = (ql) gl.O.a(-32748, (long) ((Entity) var_qi).lb);
	    if (var_ql != null) {
		if (((ql) var_ql).K != null) {
		    ej.r.a(((ql) var_ql).K);
		    ((ql) var_ql).K = null;
		}
		var_ql.unlink(-15);
	    }
	}
    }
    
    final void a(int i, boolean bool) {
	((cl) this).l.e(0, 1);
	G++;
	((cl) this).l.a(hn.f, true, ku.k);
	((cl) this).l.a(false, mca.l, 0, true, (byte) 39);
	((cl) this).l.a(0, bu.u, -18836);
	((cl) this).l.d(3, 0);
	((cl) this).l.e(0, 0);
	int i_0_ = -62 % ((52 - i) / 36);
	((cl) this).l.c((byte) 48, -16777216);
	((cl) this).l.a(0, ik.o, -18836);
	c((byte) -108);
    }
    
    final void a(int i, int i_1_, hfa var_hfa) {
	((cl) this).l.a(var_hfa, 0);
	if (i_1_ <= 47)
	    a((int) -28);
	F++;
    }
    
    static final void a(int i, String string, int i_2_) {
	w++;
	qba var_qba = ofa.a(2, i_2_, (byte) -84);
	var_qba.c((byte) 11);
	if (i != 11332)
	    incomingPacket54 = null;
	((qba) var_qba).x = string;
    }
    
    final void d(int i) {
	B++;
	((cl) this).l.e(0, 1);
	((cl) this).l.a(Class_rf.e, true, Class_rf.e);
	((cl) this).l.a(0, 1, mca.l);
	((cl) this).l.a(0, mca.l, -18836);
	((cl) this).l.d(i + 19095, 1);
	((cl) this).l.a((hfa) null, 0);
	((cl) this).l.e(i + 19092, 0);
	if (i != -19092)
	    y = null;
	((cl) this).l.a(0, mca.l, -18836);
    }
    
    final void a(int i, int i_3_, byte i_4_) {
	v++;
	((cl) this).l.e(0, 1);
	if ((i & 0x80) != 0)
	    ((cl) this).l.a((hfa) null, 0);
	else if ((0x1 & i_3_) == 1) {
	    if (((bd) t).e) {
		z = (float) (((en) ((cl) this).l).Me % 4000) / 4000.0F;
		((cl) this).l.a(((bd) t).b, i_4_ - 65);
	    } else {
		int i_5_ = 16 * (((en) ((cl) this).l).Me % 4000) / 4000;
		((cl) this).l.a(((bd) t).c[i_5_], i_4_ - 65);
	    }
	} else if (!((bd) t).e)
	    ((cl) this).l.a(((bd) t).c[0], 0);
	else
	    ((cl) this).l.a(((bd) t).b, 0);
	if (i_4_ != 65)
	    a(true, false);
	((cl) this).l.e(0, 0);
    }
    
    final void a(boolean bool, boolean bool_6_) {
	((cl) this).l.a(Class_rf.e, bool, ku.k);
	E++;
    }
    
    final void c(byte i) {
	A++;
	if (((cl) this).l.L(-41) == 0) {
	    mga var_mga = ((cl) this).l.f(true);
	    ((cl) this).l.e(0, 1);
	    mga var_mga_7_ = ((cl) this).l.E(97);
	    var_mga_7_.M(var_mga);
	    var_mga_7_.a((byte) -75, 0.125F, 0.125F, 1.0F);
	    var_mga_7_.a(0.0F, z, 0.0F, (byte) -112);
	    ((cl) this).l.a(104, nda.d);
	    ((cl) this).l.e(0, 0);
	}
	if (i > -35)
	    f(-43);
    }
}
