/* fda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fda
{
    static int a;
    static int b;
    static int c;
    static int d;
    
    static final int a(int i, int i_0_) {
	c++;
	if (i_0_ != 766538279)
	    return 105;
	return i >>> 7;
    }
    
    static final void a(byte i, int i_1_) {
	if (i >= 8) {
	    d++;
	    if (jl.s == 1)
		td.l = i_1_;
	    else if (jl.s == 2 || jl.s == 3)
		br.l = i_1_;
	}
    }
    
    static final void a(int i, int i_2_, long[] ls, Object[] objects,
			byte i_3_) {
	b++;
	if (i < i_2_) {
	    int i_4_ = (i + i_2_) / 2;
	    int i_5_ = i;
	    long l = ls[i_4_];
	    ls[i_4_] = ls[i_2_];
	    ls[i_2_] = l;
	    Object object = objects[i_4_];
	    objects[i_4_] = objects[i_2_];
	    objects[i_2_] = object;
	    int i_6_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_7_ = i; i_7_ < i_2_; i_7_++) {
		if (l + (long) (i_7_ & i_6_) > ls[i_7_]) {
		    long l_8_ = ls[i_7_];
		    ls[i_7_] = ls[i_5_];
		    ls[i_5_] = l_8_;
		    Object object_9_ = objects[i_7_];
		    objects[i_7_] = objects[i_5_];
		    objects[i_5_++] = object_9_;
		}
	    }
	    ls[i_2_] = ls[i_5_];
	    ls[i_5_] = l;
	    objects[i_2_] = objects[i_5_];
	    objects[i_5_] = object;
	    a(i, i_5_ - 1, ls, objects, (byte) 35);
	    a(i_5_ + 1, i_2_, ls, objects, (byte) 35);
	}
	if (i_3_ != 35)
	    a(-38);
    }
    
    static final void a(int i) {
	a++;
	for (int i_10_ = i; i_10_ < 100; i_10_++)
	    la.q[i_10_] = true;
    }
}
