/* jg - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_jg extends mca
{
    static ki H = new ki();
    static int I;
    private int J = 4096;
    static int K;
    static int L;
    static int M;
    static lf N;
    static int O = 1400;
    static int height;
    static String Q = null;
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    int i_1_ = j;
	    if (i_1_ == 0)
		J = (bytesParser.readUnsignedByte(-9268) << 12) / 255;
	    K++;
	}
    }
    
    static final mk a(byte i, BytesParser var_es) {
	if (i < 102)
	    a((int) -107, (Class_i) null);
	M++;
	int i_2_ = var_es.readShort(13111);
	return new mk(i_2_);
    }
    
    public Class_jg() {
	this(4096);
    }
    
    final int[] a(int i, int j) {
	I++;
	int i_4_ = 10 / ((i - 81) / 36);
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o)
	    co.a(is, 0, fr.v, J);
	return is;
    }
    
    Class_jg(int i) {
	super(0, true);
	J = i;
    }
    
    static final void a(int i, Class_i class_i) {
	Class_q.b[i] = class_i;
    }
    
    static final int b(int i, int i_5_) {
	if (i != 255)
	    b(-64, -57);
	L++;
	return 0xff & i_5_;
    }
    
    public static void a(boolean bool) {
	N = null;
	H = null;
	Q = null;
	if (bool != false)
	    a(false);
    }
}
