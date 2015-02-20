/* uq - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class uq extends mca
{
    static Animable[] H;
    static int I;
    static int J;
    static int K;
    static int L;
    static boolean M = false;
    
    public uq() {
	super(0, true);
    }
    
    final int[] a(int i, int j) {
	L++;
	int[] is = ((mca) this).s.a(j, true);
	int i_1_ = -21 % ((81 - i) / 36);
	if (((oca) ((mca) this).s).o) {
	    int i_2_ = Class_i.i[j];
	    for (int i_3_ = 0; i_3_ < fr.v; i_3_++)
		is[i_3_] = b(i_2_, false, js.p[i_3_]) % 4096;
	}
	return is;
    }
    
    public static void a(boolean bool) {
	H = null;
	if (bool != false)
	    M = false;
    }
    
    private final int b(int i, boolean bool, int i_4_) {
	I++;
	if (bool != false)
	    b(122, false, 0);
	int i_5_ = i_4_ + i * 57;
	i_5_ = i_5_ << 1 ^ i_5_;
	return (-((i_5_ * (i_5_ * (i_5_ * 15731) + 789221) + 1376312589
		   & 0x7fffffff)
		  / 262144)
		+ 4096);
    }
    
    static final void b(int i, int i_6_) {
	K++;
	qba var_qba = ofa.a(i_6_, i, (byte) 88);
	var_qba.i(0);
    }
}
