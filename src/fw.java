/* fw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

final class fw extends BytesParser
{
    static int Db;
    static int Eb = 0;
    static int Fb;
    static int Gb;
    static int Hb;
    static int Ib = 0;
    static oj Jb;
    static int Kb;
    
    static final void y(int i) {
	if (i == 25923) {
	    rk.t = null;
	    dr.x = null;
	    Gb++;
	    jba.d = null;
	    ok.C = false;
	    vu.b = null;
	    kaa.m = null;
	}
    }
    
    final void a(byte i, float f) {
	Kb++;
	if (i != -71)
	    Ib = 98;
	int i_0_ = Stream.floatToRawIntBits(f);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) i_0_;
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (i_0_ >> 8);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (i_0_ >> 16);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (i_0_ >> 24);
    }
    
    static final void b(int i, boolean bool) {
	Db++;
	qba var_qba = ofa.a(9, i, (byte) -91);
	if (bool != true)
	    b(-120, true);
	var_qba.i(0);
    }
    
    final void a(float f, int i) {
	Hb++;
	int i_1_ = Stream.floatToRawIntBits(f);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (i_1_ >> 24);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (i_1_ >> 16);
	int i_2_ = -97 % ((-11 - i) / 35);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (i_1_ >> 8);
	((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) i_1_;
    }
    
    static final int z(int i) {
	Fb++;
	int i_3_ = nw.a.c((byte) -106);
	if (i != 20666)
	    return 40;
	if (ke.H.length - 1 > i_3_)
	    nw.a = ke.H[i_3_ + 1];
	return 100;
    }
    
    fw(int i) {
	super(i);
    }
    
    public static void A(int i) {
	if (i != 15775)
	    Ib = -43;
	Jb = null;
    }
}
