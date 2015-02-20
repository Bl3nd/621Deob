/* bu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class bu extends pv implements nl
{
    private int n;
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static Class_gb u = new Class_gb();
    
    public final int a(int i) {
	if (i != 30991)
	    return 37;
	t++;
	return n;
    }
    
    final void b(byte i) {
	((pv) this).f.a((byte) -124, this);
	if (i != -54)
	    n = -29;
	r++;
    }
    
    bu(qj var_qj, int i, Buffer buffer, int i_0_, boolean bool) {
	super(var_qj, 34962, buffer, i_0_, bool);
	n = i;
    }
    
    public final long a(byte i) {
	int i_1_ = 55 / ((-48 - i) / 35);
	o++;
	return 0L;
    }
    
    public static void d(int i) {
	int i_2_ = 98 % ((-54 - i) / 43);
	u = null;
    }
    
    bu(qj var_qj, int i, byte[] is, int i_3_, boolean bool) {
	super(var_qj, 34962, is, i_3_, bool);
	n = i;
    }
    
    static final void a(Signlink var_rj, pl var_pl, int i) {
	Class_q.g = "";
	kga.lb = var_rj;
	q++;
	cv.x = var_pl;
	if (hk.operatingSystem.startsWith("win"))
	    Class_q.g += "windows/";
	else if (!hk.operatingSystem.startsWith("linux")) {
	    if (hk.operatingSystem.startsWith("mac"))
		Class_q.g += "macos/";
	} else
	    Class_q.g += "linux/";
	if (i == -3550) {
	    if (((Signlink) kga.lb).e)
		Class_q.g += "msjava/";
	    else if (hk.L.startsWith("amd64") || hk.L.startsWith("x86_64"))
		Class_q.g += "x86_64/";
	    else if (!hk.L.startsWith("i386") && !hk.L.startsWith("i486")
		     && !hk.L.startsWith("i586") && !hk.L.startsWith("x86")) {
		if (!hk.L.startsWith("ppc"))
		    Class_q.g += "universal/";
		else
		    Class_q.g += "ppc/";
	    } else
		Class_q.g += "x86/";
	}
    }
    
    public final int b(int i) {
	s++;
	if (i != 13003)
	    return -100;
	return ((pv) this).g;
    }
    
    public final void a(byte[] is, int i, int i_4_, byte i_5_) {
	if (i_5_ == -80) {
	    this.a((byte) 120, is, i);
	    p++;
	    n = i_4_;
	}
    }
}
