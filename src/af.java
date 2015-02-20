/* af - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class af
{
    static int a;
    static int b;
    private qj c;
    long d;
    static int e;
    
    protected final void finalize() throws Throwable {
	c.a(((af) this).d, 46);
	b++;
	super.finalize();
    }
    
    static final void a(int i, int i_0_, byte[] is, byte i_1_, int i_2_,
			int i_3_) {
	a++;
	if (i_2_ > i) {
	    i_3_ += i;
	    i_0_ = i_2_ - i >> 2;
	    if (i_1_ > 80) {
		while (--i_0_ >= 0) {
		    is[i_3_++] = (byte) 1;
		    is[i_3_++] = (byte) 1;
		    is[i_3_++] = (byte) 1;
		    is[i_3_++] = (byte) 1;
		}
		i_0_ = i_2_ - i & 0x3;
		while (--i_0_ >= 0)
		    is[i_3_++] = (byte) 1;
	    }
	}
    }
    
    static final void a(int[] is, int[] is_4_, byte i, NPC class_ac,
			int[] is_5_) {
	for (int i_6_ = 0; is.length > i_6_; i_6_++) {
	    int i_7_ = is[i_6_];
	    int i_8_ = is_5_[i_6_];
	    int i_9_ = is_4_[i_6_];
	    for (int i_10_ = 0; i_8_ != 0 && ((Entity) class_ac).ans.length > i_10_;
		 i_8_ >>>= 1) {
		if ((i_8_ & 0x1) != 0) {
		    if (i_7_ == -1)
			((Entity) class_ac).ans[i_10_] = null;
		    else {
			dr var_dr = Class_ef.J.c(i + 158, i_7_);
			int i_11_ = ((dr) var_dr).g;
			an var_an = ((Entity) class_ac).ans[i_10_];
			if (var_an != null) {
			    if (((an) var_an).c == i_7_) {
				if (i_11_ != 0) {
				    if (i_11_ == 1) {
					((an) var_an).g = 1;
					((an) var_an).b = 0;
					((an) var_an).d = 0;
					((an) var_an).e = 0;
					((an) var_an).a = i_9_;
					qga.a(((Animable) class_ac).height, var_dr,
					      ((Animable) class_ac).locX,
					      ((Animable) class_ac).locY, i ^ ~0x16, 0,
					      false);
				    } else if (i_11_ == 2)
					((an) var_an).e = 0;
				} else
				    var_an = ((Entity) class_ac).ans[i_10_] = null;
			    } else if (((dr) var_dr).t
				       >= (((dr) Class_ef.J.c(64,
							      ((an) var_an).c))
					   .t))
				var_an = ((Entity) class_ac).ans[i_10_] = null;
			}
			if (var_an == null) {
			    var_an = ((Entity) class_ac).ans[i_10_] = new an();
			    ((an) var_an).c = i_7_;
			    ((an) var_an).b = 0;
			    ((an) var_an).e = 0;
			    ((an) var_an).d = 0;
			    ((an) var_an).a = i_9_;
			    ((an) var_an).g = 1;
			    qga.a(((Animable) class_ac).height, var_dr, ((Animable) class_ac).locX,
				  ((Animable) class_ac).locY, 60, 0, false);
			}
		    }
		}
		i_10_++;
	    }
	}
	e++;
	if (i == -94) {
	    /* empty */
	}
    }
    
    af(qj var_qj, long l, int i) {
	((af) this).d = l;
	c = var_qj;
    }
}
