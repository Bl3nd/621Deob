/* df - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class df
{
    int a = 0;
    static int b;
    static int c;
    int d;
    int e = 0;
    static boolean[] f = new boolean[200];
    int g;
    static int h;
    
    public static void a(byte i) {
	if (i != 89)
	    f = null;
	f = null;
    }
    
    private final void a(BytesParser var_es, int i, byte i_0_) {
	if (i_0_ == 77) {
	    if (i == 1)
		((df) this).a = var_es.readUnsignedByte(-9268);
	    else if (i == 2)
		((df) this).d = var_es.readShort(13111);
	    else if (i != 3) {
		if (i == 4)
		    ((df) this).e = var_es.readShort2(i_0_ - 46);
	    } else
		((df) this).g = var_es.readShort(13111);
	    h++;
	}
    }
    
    final void a(BytesParser var_es, int i) {
	if (i == -16042) {
	    b++;
	    for (;;) {
		int i_1_ = var_es.readUnsignedByte(i + 6774);
		if (i_1_ == 0)
		    break;
		a(var_es, i_1_, (byte) 77);
	    }
	}
    }
    
    public df() {
	((df) this).d = 2048;
	((df) this).g = 2048;
    }
}
