/* dba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dba
{
    static int a;
    static int b;
    static int connectionStage;
    static f d;
    int e = 16777215;
    int f;
    int g;
    static int h;
    int i;
    boolean j;
    static int k;
    static int l = 0;
    int m;
    static int n;
    int o;
    int p = 8;
    static int q;
    
    static final void a(long l, int i) {
	n++;
	int i_0_ = fu.a;
	int i_1_ = qg.j;
	if (i < 28)
	    k = -33;
	if (vaa.L != i_0_) {
	    int i_2_ = i_0_ - vaa.L;
	    int i_3_ = (int) (l * (long) i_2_ / 320L);
	    if (i_2_ > 0) {
		if (i_3_ != 0) {
		    if (i_3_ > i_2_)
			i_3_ = i_2_;
		} else
		    i_3_ = 1;
	    } else if (i_3_ == 0)
		i_3_ = -1;
	    else if (i_2_ > i_3_)
		i_3_ = i_2_;
	    vaa.L += i_3_;
	}
	if (i_1_ != Class_k.N) {
	    int i_4_ = i_1_ - Class_k.N;
	    int i_5_ = (int) ((long) i_4_ * l / 320L);
	    if (i_4_ > 0) {
		if (i_5_ == 0)
		    i_5_ = 1;
		else if (i_4_ < i_5_)
		    i_5_ = i_4_;
	    } else if (i_5_ != 0) {
		if (i_5_ < i_4_)
		    i_5_ = i_4_;
	    } else
		i_5_ = -1;
	    Class_k.N += i_5_;
	}
	if (!((jb) cs.g).n) {
	    pm.F += 8.0F * ((float) l * pda.J / 40.0F);
	    qw.n += afa.aFloat * (float) l / 40.0F * 8.0F;
	}
	Class_kf.a(5126);
    }
    
    final void a(int i, BytesParser var_es) {
	for (;;) {
	    int i_6_ = var_es.readUnsignedByte(i - 9267);
	    if (i_6_ == 0)
		break;
	    a((byte) -106, var_es, i_6_);
	}
	a++;
	if (i != -1)
	    a(-100, -105, -37);
    }
    
    static final boolean a(int i, int i_7_, int i_8_) {
	int i_9_ = -40 / ((i_7_ - 9) / 62);
	q++;
	if (!((i & 0x70000) != 0 | dga.b(110, i, i_8_)) && !ih.a(i, -1, i_8_))
	    return false;
	return true;
    }
    
    private final void a(byte i, BytesParser var_es, int i_10_) {
	if (i_10_ == 1)
	    ((dba) this).p = var_es.readShort(13111);
	else if (i_10_ == 2)
	    ((dba) this).j = true;
	else if (i_10_ == 3) {
	    ((dba) this).m = var_es.readShort2(124);
	    ((dba) this).o = var_es.readShort2(96);
	    ((dba) this).i = var_es.readShort2(88);
	} else if (i_10_ == 4)
	    ((dba) this).g = var_es.readUnsignedByte(-9268);
	else if (i_10_ != 5) {
	    if (i_10_ == 6)
		((dba) this).e = var_es.readTribyte(-1);
	} else
	    ((dba) this).f = var_es.readShort(13111);
	h++;
	int i_11_ = 100 / ((-57 - i) / 46);
    }
    
    public static void a(int i) {
	d = null;
	if (i != 16777215)
	    d = null;
    }
    
    public dba() {
	/* empty */
    }
    
    static {
	connectionStage = 0;
    }
}
