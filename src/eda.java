/* eda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eda
{
    static int a;
    static int b;
    private long c;
    private int d;
    static int e;
    static int f;
    static int g;
    static Class_gb h = new Class_gb();
    static Class_ae i = new Class_ae();
    static pl j;
    
    private final void a(jv var_jv, int i) {
	e++;
	int i_0_ = -106 / ((29 - i) / 36);
	c |= (long) (((jv) var_jv).i << jv.q * d++);
    }
    
    public static void a(int i) {
	h = null;
	if (i <= 104)
	    a((byte) -57);
	j = null;
	eda.i = null;
    }
    
    private final int a(int i, int i_1_) {
	f++;
	if (i_1_ != 15)
	    a(68, (int) 89);
	return 0xf & (int) (c >> i * jv.q);
    }
    
    static final kg a(byte i) {
	if (i <= 28)
	    a((byte) -34);
	a++;
	try {
	    return (kg) Class.forName("gq").newInstance();
	} catch (Throwable throwable) {
	    return null;
	}
    }
    
    final jv a(int i, byte i_2_) {
	if (i_2_ != 96)
	    c = 33L;
	b++;
	return jv.a(a(i, (int) 15), 31974);
    }
    
    eda(jv var_jv) {
	d = 1;
	c = (long) ((jv) var_jv).i;
    }
    
    final int b(int i) {
	g++;
	int i_3_ = 42 % ((i + 27) / 52);
	return d;
    }
    
    eda(jv[] var_jvs) {
	for (int i = 0; var_jvs.length > i; i++)
	    a(var_jvs[i], 66);
    }
}
