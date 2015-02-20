/* dea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class dea
{
    static GameOutPacket a = new GameOutPacket(18, 7);
    static int b;
    static oj c;
    static float[] d;
    static int e;
    static float[] f = new float[16384];
    static int[] g;
    static int h;
    
    static final String a(int i, String string) {
	b++;
	int i_0_ = string.length();
	int i_1_ = 0;
	if (i != 19317)
	    h = -63;
	for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
	    char c = string.charAt(i_2_);
	    if (c == '<' || c == '>')
		i_1_ += 3;
	}
	StringBuffer stringbuffer = new StringBuffer(i_1_ + i_0_);
	for (int i_3_ = 0; i_0_ > i_3_; i_3_++) {
	    char c = string.charAt(i_3_);
	    if (c == '<')
		stringbuffer.append("<lt>");
	    else if (c != '>')
		stringbuffer.append(c);
	    else
		stringbuffer.append("<gt>");
	}
	return stringbuffer.toString();
    }
    
    static final boolean a(int i, int i_4_) {
	if (i_4_ != -4)
	    c = null;
	e++;
	if ((i < 0 || i > 3) && i != 9)
	    return false;
	return true;
    }
    
    public static void a(int i) {
	f = null;
	g = null;
	if (i != 16384)
	    a(45, 64);
	c = null;
	a = null;
	d = null;
    }
    
    static {
	dea.d = new float[16384];
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    dea.d[i] = (float) Math.sin((double) i * d);
	    f[i] = (float) Math.cos(d * (double) i);
	}
	g = new int[1000];
    }
}
