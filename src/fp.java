/* fp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fp extends Interactable
{
    static int g;
    hi h;
    static int i = 2;
    static f[] j;
    static int k;
    hs l;
    private long m;
    static int n;
    ce o;
    static int p = -1;
    static int q;
    boolean r = false;
    int s;
    tq t;
    static int u;
    fca v;
    private int w = 0;
    private hs x;
    private int y;
    private boolean z;
    private int A;
    static int B = 500;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    
    final void a(boolean bool, Class_r class_r, int i, long l, int i_0_) {
	if (((fp) this).r)
	    bool = false;
	else if (ISAAC.k >= ((ce) ((fp) this).o).i) {
	    if (Class_ef.L[ISAAC.k] >= ig.e) {
		if (!z) {
		    if ((((ce) ((fp) this).o).mb ^ 0xffffffff) != 0) {
			int i_1_ = (int) (l - m);
			if (!((ce) ((fp) this).o).n
			    && ((ce) ((fp) this).o).mb < i_1_)
			    bool = false;
			else
			    i_1_ %= ((ce) ((fp) this).o).mb;
			if (!((ce) ((fp) this).o).tb
			    && i_1_ < ((ce) ((fp) this).o).r)
			    bool = false;
			if (((ce) ((fp) this).o).tb
			    && i_1_ >= ((ce) ((fp) this).o).r)
			    bool = false;
		    }
		} else
		    bool = false;
	    } else
		bool = false;
	} else
	    bool = false;
	g++;
	if (bool) {
	    vm.k++;
	    int i_2_ = ((((hs) ((fp) this).l).d
			 + (((hs) ((fp) this).l).h + ((hs) ((fp) this).l).p))
			/ 3);
	    int i_3_ = ((((hs) ((fp) this).l).e + ((hs) ((fp) this).l).g
			 + ((hs) ((fp) this).l).j)
			/ 3);
	    int i_4_ = ((((hs) ((fp) this).l).b + ((hs) ((fp) this).l).m
			 + ((hs) ((fp) this).l).o)
			/ 3);
	    if (((hs) ((fp) this).l).a != i_2_
		|| ((hs) ((fp) this).l).q != i_3_
		|| i_4_ != ((hs) ((fp) this).l).i) {
		((hs) ((fp) this).l).a = i_2_;
		((hs) ((fp) this).l).q = i_3_;
		((hs) ((fp) this).l).i = i_4_;
		int i_5_ = ((hs) ((fp) this).l).p - ((hs) ((fp) this).l).h;
		int i_6_ = ((hs) ((fp) this).l).g - ((hs) ((fp) this).l).e;
		int i_7_ = ((hs) ((fp) this).l).m - ((hs) ((fp) this).l).o;
		int i_8_ = ((hs) ((fp) this).l).d - ((hs) ((fp) this).l).h;
		int i_9_ = ((hs) ((fp) this).l).j - ((hs) ((fp) this).l).e;
		int i_10_ = ((hs) ((fp) this).l).b - ((hs) ((fp) this).l).o;
		F = i_7_ * i_8_ - i_10_ * i_5_;
		y = i_5_ * i_9_ - i_6_ * i_8_;
		for (D = i_6_ * i_10_ - i_7_ * i_9_;
		     (D > 32767 || F > 32767 || y > 32767 || D < -32767
		      || F < -32767 || y < -32767);
		     F >>= 1) {
		    y >>= 1;
		    D >>= 1;
		}
		int i_11_
		    = (int) Math.sqrt((double) (D * D - (-(F * F) - y * y)));
		if (i_11_ <= 0)
		    i_11_ = 1;
		D = D * 32767 / i_11_;
		y = 32767 * y / i_11_;
		F = F * 32767 / i_11_;
		if (((ce) ((fp) this).o).ab > 0
		    || ((ce) ((fp) this).o).cb > 0) {
		    int i_12_ = (int) (2607.5945876176133
				       * Math.atan2((double) y, (double) D));
		    int i_13_
			= (int) (2607.5945876176133
				 * Math.atan2((double) F,
					      Math.sqrt((double) (D * D
								  + y * y))));
		    G = ((ce) ((fp) this).o).ab - ((ce) ((fp) this).o).a;
		    A = ((ce) ((fp) this).o).cb - ((ce) ((fp) this).o).nb;
		    E = ((ce) ((fp) this).o).a + i_12_ - (G >> 1);
		    C = ((ce) ((fp) this).o).nb - (A >> 1) + i_13_;
		}
	    }
	    w += (int) ((double) i
			* ((double) (((ce) ((fp) this).o).t
				     - ((ce) ((fp) this).o).ob) * Math.random()
			   + (double) ((ce) ((fp) this).o).ob));
	    if (w > 63) {
		int i_14_ = w >> 6;
		w &= 0x3f;
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
		    int i_16_;
		    int i_17_;
		    int i_18_;
		    if (((ce) ((fp) this).o).ab <= 0
			&& ((ce) ((fp) this).o).cb <= 0) {
			i_17_ = F;
			i_16_ = D;
			i_18_ = y;
		    } else {
			int i_19_ = (int) ((double) G * Math.random()) + E;
			i_19_ &= 0x3fff;
			int i_20_ = GameInPacket.ints1[i_19_];
			int i_21_ = GameInPacket.ints2[i_19_];
			int i_22_ = C + (int) (Math.random() * (double) A);
			i_22_ &= 0x1fff;
			int i_23_ = GameInPacket.ints1[i_22_];
			int i_24_ = GameInPacket.ints2[i_22_];
			int i_25_ = 13;
			i_16_ = i_23_ * i_21_ >> i_25_;
			i_17_ = (i_24_ << 1) * -1;
			i_18_ = i_23_ * i_20_ >> i_25_;
		    }
		    float f = (float) Math.random();
		    float f_26_ = (float) Math.random();
		    if (f + f_26_ > 1.0F) {
			f = 1.0F - f;
			f_26_ = -f_26_ + 1.0F;
		    }
		    float f_27_ = -f - f_26_ + 1.0F;
		    int i_28_
			= (int) (f * (float) ((hs) ((fp) this).l).h
				 + f_26_ * (float) ((hs) ((fp) this).l).p
				 + (float) ((hs) ((fp) this).l).d * f_27_);
		    int i_29_
			= (int) ((float) ((hs) ((fp) this).l).j * f_27_
				 + (f_26_ * (float) ((hs) ((fp) this).l).g
				    + f * (float) ((hs) ((fp) this).l).e));
		    int i_30_
			= (int) (f_27_ * (float) ((hs) ((fp) this).l).b
				 + ((float) ((hs) ((fp) this).l).o * f
				    + f_26_ * (float) ((hs) ((fp) this).l).m));
		    int i_31_ = (int) ((float) ((hs) x).p * f_26_
				       + (float) ((hs) x).h * f
				       + f_27_ * (float) ((hs) x).d);
		    int i_32_ = (int) (f_27_ * (float) ((hs) x).j
				       + (f_26_ * (float) ((hs) x).g
					  + (float) ((hs) x).e * f));
		    int i_33_ = (int) (f * (float) ((hs) x).o
				       + (float) ((hs) x).m * f_26_
				       + (float) ((hs) x).b * f_27_);
		    int i_34_ = i_28_ - i_31_;
		    int i_35_ = i_29_ - i_32_;
		    int i_36_ = i_30_ - i_33_;
		    int i_37_ = (int) ((double) i_31_
				       + (double) i_34_ * Math.random());
		    int i_38_ = (int) ((double) i_35_ * Math.random()
				       + (double) i_32_);
		    int i_39_ = (int) ((double) i_33_
				       + Math.random() * (double) i_36_);
		    int i_40_ = (((ce) ((fp) this).o).C
				 + (int) ((double) (((ce) ((fp) this).o).v
						    - ((ce) ((fp) this).o).C)
					  * Math.random()));
		    int i_41_ = ((int) ((double) (((ce) ((fp) this).o).T
						  - ((ce) ((fp) this).o).D)
					* Math.random())
				 + ((ce) ((fp) this).o).D);
		    int i_42_
			= (((ce) ((fp) this).o).B
			   + (int) (Math.random()
				    * (double) (((ce) ((fp) this).o).h
						- ((ce) ((fp) this).o).B)));
		    int i_43_;
		    if (((ce) ((fp) this).o).L) {
			double d = Math.random();
			i_43_
			    = ((int) ((double) ((ce) ((fp) this).o).G
				      + d * (double) ((ce) ((fp) this).o).A)
			       | (((int) ((double) ((ce) ((fp) this).o).U * d
					  + (double) ((ce) ((fp) this).o).u)
				   << 16)
				  | (int) (d * (double) ((ce) ((fp) this).o).db
					   + (double) (((ce) ((fp) this).o)
						       .X)) << 8)
			       | ((int) ((Math.random()
					  * (double) ((ce) ((fp) this).o).ib)
					 + (double) ((ce) ((fp) this).o).N)
				  << 24));
		    } else
			i_43_
			    = ((int) (((double) ((ce) ((fp) this).o).ib
				       * Math.random())
				      + (double) ((ce) ((fp) this).o).N) << 24
			       | ((int) (((double) ((ce) ((fp) this).o).A
					  * Math.random())
					 + (double) ((ce) ((fp) this).o).G)
				  | ((int) ((double) ((ce) ((fp) this).o).u
					    + (Math.random()
					       * (double) (((ce) ((fp) this).o)
							   .U))) << 16
				     | (int) ((double) ((ce) ((fp) this).o).X
					      + ((double) (((ce) ((fp) this).o)
							   .db)
						 * Math.random())) << 8)));
		    int i_44_ = ((ce) ((fp) this).o).R;
		    if (!class_r.l() && !((ce) ((fp) this).o).gb)
			i_44_ = -1;
		    if (ui.i == sw.e) {
			fe var_fe
			    = new fe(this, i_37_, i_38_, i_39_, i_16_, i_17_,
				     i_18_, i_40_, i_41_, i_43_, i_42_, i_44_,
				     ((ce) ((fp) this).o).I,
				     ((ce) ((fp) this).o).kb);
		    } else {
			fe var_fe = pp.m[ui.i];
			ui.i = 0x3ff & ui.i + 1;
			var_fe.a(this, i_37_, i_38_, i_39_, i_16_, i_17_,
				 i_18_, i_40_, i_41_, i_43_, i_42_, i_44_,
				 ((ce) ((fp) this).o).I,
				 ((ce) ((fp) this).o).kb);
		    }
		}
	    }
	}
	if (!((fp) this).l.a(x, -128)) {
	    hs var_hs = x;
	    x = ((fp) this).l;
	    ((fp) this).l = var_hs;
	    ((hs) ((fp) this).l).o = ((hi) ((fp) this).h).l;
	    ((hs) ((fp) this).l).p = ((hi) ((fp) this).h).b;
	    ((hs) ((fp) this).l).e = ((hi) ((fp) this).h).a;
	    ((hs) ((fp) this).l).d = ((hi) ((fp) this).h).t;
	    ((hs) ((fp) this).l).h = ((hi) ((fp) this).h).j;
	    ((hs) ((fp) this).l).j = ((hi) ((fp) this).h).o;
	    ((hs) ((fp) this).l).g = ((hi) ((fp) this).h).c;
	    ((hs) ((fp) this).l).b = ((hi) ((fp) this).h).n;
	    ((hs) ((fp) this).l).m = ((hi) ((fp) this).h).m;
	}
	((fp) this).s = 0;
	int i_45_ = 17 / ((7 - i_0_) / 36);
	for (fe var_fe = (fe) ((fp) this).v.b((byte) 119); var_fe != null;
	     var_fe = (fe) ((fp) this).v.a((byte) -106)) {
	    var_fe.a(l, i);
	    ((fp) this).s++;
	}
	daa.cb += ((fp) this).s;
    }
    
    final void a(int i, Class_r class_r, long l) {
	int i_46_ = 84 / ((-45 - i) / 47);
	for (fe var_fe = (fe) ((fp) this).v.b((byte) 75); var_fe != null;
	     var_fe = (fe) ((fp) this).v.a((byte) -106))
	    var_fe.a(class_r, l);
	n++;
    }
    
    final void a(int i) {
	u++;
	((hs) ((fp) this).l).m = ((hi) ((fp) this).h).m;
	((hs) ((fp) this).l).b = ((hi) ((fp) this).h).n;
	((hs) ((fp) this).l).e = ((hi) ((fp) this).h).a;
	((hs) ((fp) this).l).p = ((hi) ((fp) this).h).b;
	((hs) ((fp) this).l).o = ((hi) ((fp) this).h).l;
	if (i != -32768)
	    a(-124, null, 21L);
	((hs) ((fp) this).l).h = ((hi) ((fp) this).h).j;
	((hs) ((fp) this).l).j = ((hi) ((fp) this).h).o;
	((hs) ((fp) this).l).d = ((hi) ((fp) this).h).t;
	((hs) ((fp) this).l).g = ((hi) ((fp) this).h).c;
	if (((hs) ((fp) this).l).h != ((hs) ((fp) this).l).p
	    || ((hs) ((fp) this).l).d != ((hs) ((fp) this).l).p
	    || ((hs) ((fp) this).l).g != ((hs) ((fp) this).l).e
	    || ((hs) ((fp) this).l).g != ((hs) ((fp) this).l).j
	    || ((hs) ((fp) this).l).o != ((hs) ((fp) this).l).m
	    || ((hs) ((fp) this).l).m != ((hs) ((fp) this).l).b) {
	    if (z) {
		((hs) x).e = ((hs) ((fp) this).l).e;
		((hs) x).d = ((hs) ((fp) this).l).d;
		((hs) x).g = ((hs) ((fp) this).l).g;
		((hs) x).m = ((hs) ((fp) this).l).m;
		((hs) x).b = ((hs) ((fp) this).l).b;
		((hs) x).h = ((hs) ((fp) this).l).h;
		((hs) x).p = ((hs) ((fp) this).l).p;
		z = false;
		((hs) x).j = ((hs) ((fp) this).l).j;
		((hs) x).o = ((hs) ((fp) this).l).o;
	    }
	} else
	    z = true;
    }
    
    static final void a(vf[][][] var_vfs, int i) {
	if (i == -6429) {
	    for (int i_47_ = 0; i_47_ < var_vfs.length; i_47_++) {
		vf[][] var_vfs_48_ = var_vfs[i_47_];
		for (int i_49_ = 0; var_vfs_48_.length > i_49_; i_49_++) {
		    for (int i_50_ = 0; i_50_ < var_vfs_48_[i_49_].length;
			 i_50_++) {
			vf var_vf = var_vfs_48_[i_49_][i_50_];
			if (var_vf != null) {
			    if (((vf) var_vf).m instanceof vda)
				((vda) ((vf) var_vf).m).a(false);
			    if (((vf) var_vf).d instanceof vda)
				((vda) ((vf) var_vf).d).a(false);
			    if (((vf) var_vf).p instanceof vda)
				((vda) ((vf) var_vf).p).a(false);
			    if (((vf) var_vf).l instanceof vda)
				((vda) ((vf) var_vf).l).a(false);
			    if (((vf) var_vf).h instanceof vda)
				((vda) ((vf) var_vf).h).a(false);
			    for (ida var_ida = ((vf) var_vf).f;
				 var_ida != null;
				 var_ida = ((ida) var_ida).d) {
				qda var_qda = ((ida) var_ida).a;
				if (var_qda instanceof vda)
				    ((vda) var_qda).a(false);
			    }
			}
		    }
		}
	    }
	    k++;
	}
    }
    
    public static void a(byte i) {
	if (i != 7)
	    a((byte) -44);
	j = null;
    }
    
    fp(Class_r class_r, hi var_hi, tq var_tq, long l) {
	((fp) this).l = new hs();
	x = new hs();
	z = false;
	((fp) this).t = var_tq;
	((fp) this).h = var_hi;
	m = l;
	((fp) this).o = ((fp) this).h.a(true);
	if (!class_r.l() && ((ce) ((fp) this).o).Y != -1)
	    ((fp) this).o = sv.a((byte) 75, ((ce) ((fp) this).o).Y);
	((fp) this).v = new fca();
	w += Math.random() * 64.0;
	a(-32768);
	((hs) x).j = ((hs) ((fp) this).l).j;
	((hs) x).b = ((hs) ((fp) this).l).b;
	((hs) x).g = ((hs) ((fp) this).l).g;
	((hs) x).e = ((hs) ((fp) this).l).e;
	((hs) x).h = ((hs) ((fp) this).l).h;
	((hs) x).p = ((hs) ((fp) this).l).p;
	((hs) x).o = ((hs) ((fp) this).l).o;
	((hs) x).m = ((hs) ((fp) this).l).m;
	((hs) x).d = ((hs) ((fp) this).l).d;
    }
}
