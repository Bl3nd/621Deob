/* mf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefLoader
{
    static int a;
    static GameInPacket incomingPacket53 = new GameInPacket(53, 2);
    static int c;
    static int d;
    static int e;
    pl f;
    int g;
    static int h;
    int i;
    private tb j = new tb(64);
    static int k;
    static int l;
    static int m;
    static int n;
    static int o;
    static int p;
    private boolean q;
    static int r;
    private pl s;
    tb t = new tb(50);
    static int u;
    aaa v = new aaa(250);
    private pi w = new pi();
    private dp x;
    private String[] y;
    int z;
    private String[] A;
    
    final f a(int i, boolean bool, Class_r class_r, int i_0_, PlayerDef var_kn,
	      boolean bool_1_, int i_2_, Class_r class_r_3_, int i_4_,
	      la var_la, int i_5_, int i_6_) {
	h++;
	f var_f = a(i_4_, i_2_, var_kn, class_r_3_, i_5_, i_0_, 127, i);
	if (var_f != null)
	    return var_f;
	ItemDef var_uv = d(12388, i_2_);
	if (i_5_ > 1 && ((ItemDef) var_uv).Fb != null) {
	    int i_7_ = -1;
	    for (int i_8_ = 0; i_8_ < 10; i_8_++) {
		if (((ItemDef) var_uv).X[i_8_] <= i_5_
		    && ((ItemDef) var_uv).X[i_8_] != 0)
		    i_7_ = ((ItemDef) var_uv).Fb[i_8_];
	    }
	    if (i_7_ != -1)
		var_uv = d(12388, i_7_);
	}
	int[] is = var_uv.a(var_la, i_5_, bool, var_kn, class_r, i_4_, 97,
			    class_r_3_, i, i_0_);
	if (is == null)
	    return null;
	f var_f_9_;
	if (!bool_1_)
	    var_f_9_ = class_r_3_.a(is, 0, 36, 36, 32);
	else
	    var_f_9_ = class_r.a(is, 0, 36, 36, 32);
	if (i_6_ < 103)
	    return null;
	if (!bool_1_) {
	    pi var_pi = new pi();
	    ((pi) var_pi).e = ((Class_r) class_r_3_).b;
	    ((pi) var_pi).c = i_0_;
	    ((pi) var_pi).a = var_kn != null;
	    ((pi) var_pi).f = i_4_;
	    ((pi) var_pi).i = i_2_;
	    ((pi) var_pi).g = i_5_;
	    ((pi) var_pi).b = i;
	    ((ItemDefLoader) this).v.a(var_f_9_, var_pi, (byte) 41);
	}
	return var_f_9_;
    }
    
    static final tba a(int i) {
	if (i != 18375)
	    incomingPacket53 = null;
	c++;
	if (mr.d == 0)
	    return new tba();
	return rd.J[--mr.d];
    }
    
    static final void a(int i, int i_10_) {
	e++;
	qba var_qba = ofa.a(5, i, (byte) 118);
	var_qba.i(i_10_);
    }
    
    final void b(int i) {
	int i_11_ = -53 / ((18 - i) / 35);
	synchronized (((ItemDefLoader) this).v) {
	    ((ItemDefLoader) this).v.d((byte) 77);
	}
	r++;
    }
    
    final void b(int i, int i_12_) {
	a++;
	synchronized (j) {
	    j.a(true, i);
	}
	synchronized (((ItemDefLoader) this).t) {
	    ((ItemDefLoader) this).t.a(true, i);
	}
	synchronized (((ItemDefLoader) this).v) {
	    if (i_12_ != 50) {
		/* empty */
	    } else
		((ItemDefLoader) this).v.a(i, i_12_ - 50);
	}
    }
    
    final f a(int i, int i_13_, PlayerDef var_kn, Class_r class_r, int i_14_,
	      int i_15_, int i_16_, int i_17_) {
	((pi) w).f = i;
	((pi) w).i = i_13_;
	((pi) w).e = ((Class_r) class_r).b;
	n++;
	((pi) w).a = var_kn != null;
	if (i_16_ < 122)
	    b(-22);
	((pi) w).g = i_14_;
	((pi) w).c = i_15_;
	((pi) w).b = i_17_;
	return (f) ((ItemDefLoader) this).v.a((byte) 123, w);
    }
    
    final void c(int i) {
	synchronized (j) {
	    j.a(18385);
	    if (i <= 107)
		a(-18, 29, null, null, 80, -126, 89, 26);
	}
	u++;
	synchronized (((ItemDefLoader) this).t) {
	    ((ItemDefLoader) this).t.a(18385);
	}
	synchronized (((ItemDefLoader) this).v) {
	    ((ItemDefLoader) this).v.d((byte) 77);
	}
    }
    
    final void d(int i) {
	p++;
	synchronized (((ItemDefLoader) this).t) {
	    ((ItemDefLoader) this).t.a(18385);
	    if (i != 0)
		w = null;
	}
    }
    
    final void e(int i) {
	o++;
	synchronized (j) {
	    j.c((byte) 51);
	}
	synchronized (((ItemDefLoader) this).t) {
	    ((ItemDefLoader) this).t.c((byte) -122);
	}
	synchronized (((ItemDefLoader) this).v) {
	    if (i != 0) {
		/* empty */
	    } else
		((ItemDefLoader) this).v.a((byte) 64);
	}
    }
    
    final void a(boolean bool, int i) {
	k++;
	if (bool != q) {
	    q = bool;
	    c(127);
	    if (i != 5)
		incomingPacket53 = null;
	}
    }
    
    public static void f(int i) {
	incomingPacket53 = null;
	if (i != -11)
	    incomingPacket53 = null;
    }
    
    final void c(int i, int i_18_) {
	l++;
	if (i != -12209)
	    j = null;
	((ItemDefLoader) this).z = i_18_;
	synchronized (((ItemDefLoader) this).t) {
	    ((ItemDefLoader) this).t.a(18385);
	}
    }
    
    final ItemDef d(int i, int i_19_) {
	m++;
	if (i != 12388)
	    return null;
	ItemDef var_uv;
	synchronized (j) {
	    var_uv = (ItemDef) j.get((long) i_19_, (byte) 100);
	}
	if (var_uv != null)
	    return var_uv;
	byte[] is;
	synchronized (s) {
	    is = s.b(oh.b(i_19_, (byte) 75), i ^ ~0x301d, sw.a(-21557, i_19_));
	}
	var_uv = new ItemDef();
	((ItemDef) var_uv).G = i_19_;
	((ItemDef) var_uv).loader = this;
	((ItemDef) var_uv).groundActions
	    = new String[] { null, null, GameText.p.getString((byte) 100, ((ItemDefLoader) this).i),
			     null, null };
	((ItemDef) var_uv).actions = new String[] { null, null, null, null,
					 GameText.q.getString((byte) -80, ((ItemDefLoader) this).i) };
	if (is != null)
	    var_uv.a(30035, new BytesParser(is));
	var_uv.a((int) 114);
	if (((ItemDef) var_uv).o != -1)
	    var_uv.a(d(12388, ((ItemDef) var_uv).o), d(12388, ((ItemDef) var_uv).certID),
		     i ^ ~0x3058);
	if ((((ItemDef) var_uv).n ^ 0xffffffff) != 0)
	    var_uv.a(-22824, d(12388, ((ItemDef) var_uv).K), d(i, ((ItemDef) var_uv).n));
	if (!q && ((ItemDef) var_uv).isMembersItem) {
	    ((ItemDef) var_uv).itemName = GameText.n.getString((byte) 81, ((ItemDefLoader) this).i);
	    ((ItemDef) var_uv).groundActions = A;
	    ((ItemDef) var_uv).actions = y;
	    ((ItemDef) var_uv).wb = 0;
	    ((ItemDef) var_uv).eb = null;
	    ((ItemDef) var_uv).Y = false;
	    if (((ItemDef) var_uv).d != null) {
		boolean bool = false;
		for (Node class_d = ((ItemDef) var_uv).d.b((byte) 124);
		     class_d != null; class_d = ((ItemDef) var_uv).d.b(12561)) {
		    vu var_vu = x.a((byte) 6, (int) ((Node) class_d).nodeID);
		    if (!((vu) var_vu).d)
			bool = true;
		    else
			class_d.unlink(-106);
		}
		if (!bool)
		    ((ItemDef) var_uv).d = null;
	    }
	}
	synchronized (j) {
	    j.put((long) i_19_, var_uv, 1);
	}
	return var_uv;
    }
    
    ItemDefLoader(Class_rf class_rf, int i, boolean bool, dp var_dp, pl var_pl,
       pl var_pl_20_) {
	s = var_pl;
	((ItemDefLoader) this).f = var_pl_20_;
	((ItemDefLoader) this).i = i;
	q = bool;
	x = var_dp;
	if (s != null) {
	    int i_21_ = s.a((byte) -107) - 1;
	    ((ItemDefLoader) this).g = s.a(i_21_, true) + i_21_ * 256;
	} else
	    ((ItemDefLoader) this).g = 0;
	A = new String[] { null, null, GameText.p.getString((byte) -78, ((ItemDefLoader) this).i), null,
			   null };
	y = new String[] { null, null, null, null,
			   GameText.q.getString((byte) -43, ((ItemDefLoader) this).i) };
    }
}
