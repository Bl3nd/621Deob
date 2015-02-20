/* tv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tv
{
    int a = -1;
    int b = -1;
    static int c;
    static int d;
    static Class_md e;
    int[] f;
    
    public static void a(int i) {
	e = null;
	if (i != 2)
	    e = null;
    }
    
    final void a(BytesParser var_es, int i) {
	if (i != 0)
	    ((tv) this).a = -77;
	for (;;) {
	    int i_0_ = var_es.readUnsignedByte(-9268);
	    if (i_0_ == 0)
		break;
	    a(var_es, 0, i_0_);
	}
	c++;
    }
    
    private final void a(BytesParser var_es, int i, int i_1_) {
	if (i != 0)
	    a(null, 98, 48);
	if (i_1_ == 1)
	    ((tv) this).a = var_es.readShort(13111);
	else if (i_1_ != 2) {
	    if (i_1_ == 3)
		((tv) this).b = var_es.readUnsignedByte(-9268);
	} else {
	    ((tv) this).f = new int[var_es.readUnsignedByte(-9268)];
	    for (int i_2_ = 0; ((tv) this).f.length > i_2_; i_2_++)
		((tv) this).f[i_2_] = var_es.readShort(13111);
	}
	d++;
    }
    
    public tv() {
	/* empty */
    }
}
