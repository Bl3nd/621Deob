/* taa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class taa
{
    static int a;
    static int b;
    static int c = -1;
    static int d;
    static int e;
    static int f;
    static aga g;
    static int h = 0;
    private tb i = new tb(256);
    private qj j;
    static int k;
    static fba[] l;
    private fa m;
    
    public static void a(byte i) {
	int i_0_ = 89 % ((8 - i) / 47);
	l = null;
	g = null;
    }
    
    final void a(int i) {
	k++;
	if (i > 112)
	    this.i.a(true, 5);
    }
    
    final void b(int i) {
	e++;
	this.i.a(i + 11977);
	if (i != 6408)
	    j = null;
    }
    
    static final void a(boolean bool) {
	if (bool != false)
	    a((byte) 121);
	GameInPacket.tb.a(18385);
	d++;
    }
    
    final pm a(int i, int i_1_) {
	f++;
	if (i_1_ != 256)
	    a((int) -57);
	Object object = this.i.get((long) i, (byte) 100);
	if (object != null)
	    return (pm) object;
	if (!m.a(false, i))
	    return null;
	vca var_vca = m.a(i, (byte) 86);
	int i_2_ = !((vca) var_vca).p ? ((qj) j).Wd : 64;
	pm var_pm;
	if (((vca) var_vca).t && j.z()) {
	    float[] fs = m.a(i_1_ ^ 0x17f, i_2_, false, 0.7F, i_2_, i);
	    var_pm = new pm(j, 3553, 34842, i_2_, i_2_, ((vca) var_vca).g != 0,
			    fs, 6408);
	} else {
	    int[] is;
	    if (!((vca) var_vca).s && Class_jc.a(-30497, ((vca) var_vca).i))
		is = m.a(i, 0.7F, true, i_2_, -5969, i_2_);
	    else
		is = m.a(0.7F, i_2_, (byte) 76, false, i_2_, i);
	    var_pm = new pm(j, 3553, 6408, i_2_, i_2_, ((vca) var_vca).g != 0,
			    is, false);
	}
	var_pm.a(((vca) var_vca).r, (byte) -91, ((vca) var_vca).m);
	this.i.put((long) i, var_pm, 1);
	return var_pm;
    }
    
    taa(qj var_qj, fa var_fa) {
	j = var_qj;
	m = var_fa;
    }
    
    static {
	b = 0;
    }
}
