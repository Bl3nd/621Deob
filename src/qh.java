/* qh - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class qh extends Node
{
    static int k = 0;
    static int l;
    static int m;
    static int n;
    boolean o;
    qj p;
    static byte[][] q;
    static int r;
    static int s;
    static int t;
    
    abstract void a(pm var_pm, boolean bool, int i, pm var_pm_0_);
    
    int a(int i) {
	if (i != 1)
	    a((BytesParser) null, 96);
	l++;
	return 0;
    }
    
    final int b(int i) {
	t++;
	if (i != 1)
	    ((qh) this).o = true;
	return 1;
    }
    
    abstract void c(int i);
    
    static final uba a(BytesParser var_es, int i) {
	int i_1_ = -123 % ((i + 19) / 47);
	n++;
	return new uba(var_es.readShort2(66), var_es.readShort2(96), var_es.readShort2(49), var_es.readShort2(94),
		       var_es.readTribyte(-1), var_es.readUnsignedByte(-9268));
    }
    
    final boolean a(byte i) {
	r++;
	if (i < 14)
	    return false;
	return false;
    }
    
    abstract void a(int i, int i_2_, int i_3_);
    
    abstract boolean i(int i);
    
    final boolean j(int i) {
	if (i != -16056)
	    q = null;
	m++;
	return ((qh) this).o;
    }
    
    qh(qj var_qj) {
	((qh) this).p = var_qj;
    }
    
    public static void k(int i) {
	q = null;
	if (i != 1)
	    q = null;
    }
    
    abstract void a(int i, int i_4_);
    
    abstract boolean l(int i);
}
