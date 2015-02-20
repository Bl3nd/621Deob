/* nr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class nr
{
    static GameOutPacket a;
    static Interface b;
    static int c;
    static int[] d = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
		       2, 2, 2, 3 };
    static int e;
    static int f;
    static int g;
    static int h;
    static pl i;
    Class_wb j = new Class_wb();
    static int k;
    private Class_wb l;
    
    final Class_wb a(int i) {
	if (i != -19895)
	    b(-107);
	k++;
	Class_wb class_wb = ((Class_wb) ((nr) this).j).h;
	if (class_wb == ((nr) this).j) {
	    l = null;
	    return null;
	}
	l = ((Class_wb) class_wb).h;
	return class_wb;
    }
    
    public static void b(int i) {
	nr.i = null;
	if (i != -1)
	    a(null, -30, null, null, null);
	d = null;
	a = null;
	b = null;
    }
    
    final void c(int i) {
	f++;
	for (;;) {
	    Class_wb class_wb = ((Class_wb) ((nr) this).j).h;
	    if (((nr) this).j == class_wb)
		break;
	    class_wb.a(10511);
	}
	if (i == 0)
	    l = null;
    }
    
    final int d(int i) {
	c++;
	int i_0_ = 0;
	Class_wb class_wb = ((Class_wb) ((nr) this).j).h;
	if (i != -14300)
	    e(9);
	for (/**/; class_wb != ((nr) this).j;
	     class_wb = ((Class_wb) class_wb).h)
	    i_0_++;
	return i_0_;
    }
    
    final void a(byte i, Class_wb class_wb) {
	e++;
	if (((Class_wb) class_wb).g != null)
	    class_wb.a(i + 10385);
	((Class_wb) class_wb).h = ((nr) this).j;
	((Class_wb) class_wb).g = ((Class_wb) ((nr) this).j).g;
	if (i != 126)
	    d = null;
	((Class_wb) ((Class_wb) class_wb).g).h = class_wb;
	((Class_wb) ((Class_wb) class_wb).h).g = class_wb;
    }
    
    static final void a(int[] is, int i, int[] is_1_, Player var_qi, int[] is_2_) {
	g++;
	int i_3_ = -48 / ((i + 11) / 48);
	for (int i_4_ = 0; is.length > i_4_; i_4_++) {
	    int i_5_ = is[i_4_];
	    int i_6_ = is_1_[i_4_];
	    int i_7_ = is_2_[i_4_];
	    for (int i_8_ = 0; i_6_ != 0 && i_8_ < ((Entity) var_qi).ans.length;
		 i_8_++) {
		if ((0x1 & i_6_) != 0) {
		    if (i_5_ != -1) {
			dr var_dr = Class_ef.J.c(64, i_5_);
			int i_9_ = ((dr) var_dr).g;
			an var_an = ((Entity) var_qi).ans[i_8_];
			if (var_an != null) {
			    if (((an) var_an).c == i_5_) {
				if (i_9_ == 0)
				    var_an = ((Entity) var_qi).ans[i_8_] = null;
				else if (i_9_ != 1) {
				    if (i_9_ == 2)
					((an) var_an).e = 0;
				} else {
				    ((an) var_an).d = 0;
				    ((an) var_an).b = 0;
				    ((an) var_an).g = 1;
				    ((an) var_an).a = i_7_;
				    ((an) var_an).e = 0;
				    qga.a(((Animable) var_qi).height, var_dr,
					  ((Animable) var_qi).locX, ((Animable) var_qi).locY, 82,
					  0, var_qi == up.thisPlayer);
				}
			    } else if (((dr) var_dr).t
				       >= (((dr) Class_ef.J.c(64,
							      ((an) var_an).c))
					   .t))
				var_an = ((Entity) var_qi).ans[i_8_] = null;
			}
			if (var_an == null) {
			    var_an = ((Entity) var_qi).ans[i_8_] = new an();
			    ((an) var_an).a = i_7_;
			    ((an) var_an).e = 0;
			    ((an) var_an).c = i_5_;
			    ((an) var_an).g = 1;
			    ((an) var_an).d = 0;
			    ((an) var_an).b = 0;
			    qga.a(((Animable) var_qi).height, var_dr, ((Animable) var_qi).locX,
				  ((Animable) var_qi).locY, 81, 0, up.thisPlayer == var_qi);
			}
		    } else
			((Entity) var_qi).ans[i_8_] = null;
		}
		i_6_ >>>= 1;
	    }
	}
    }
    
    final Class_wb e(int i) {
	h++;
	int i_10_ = -93 / ((-55 - i) / 57);
	Class_wb class_wb = l;
	if (((nr) this).j == class_wb) {
	    l = null;
	    return null;
	}
	l = ((Class_wb) class_wb).h;
	return class_wb;
    }
    
    public nr() {
	((Class_wb) ((nr) this).j).g = ((nr) this).j;
	((Class_wb) ((nr) this).j).h = ((nr) this).j;
    }
    
    static {
	a = new GameOutPacket(81, 2);
    }
}
