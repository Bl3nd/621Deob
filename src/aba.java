/* aba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aba
{
    private int[] a;
    private int[] b;
    int c;
    int d;
    private int e = 2;
    int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    final int a(int i) {
	if (h >= g) {
	    j = a[this.i++] << 15;
	    if (this.i >= e)
		this.i = e - 1;
	    g = (int) ((double) b[this.i] / 65536.0 * (double) i);
	    if (g > h)
		k = ((a[this.i] << 15) - j) / (g - h);
	}
	j += k;
	h++;
	return j - k >> 15;
    }
    
    final void a() {
	g = 0;
	i = 0;
	k = 0;
	j = 0;
	h = 0;
    }
    
    final void a(BytesParser var_es) {
	e = var_es.readUnsignedByte(-9268);
	b = new int[e];
	a = new int[e];
	for (int i = 0; i < e; i++) {
	    b[i] = var_es.readShort(13111);
	    a[i] = var_es.readShort(13111);
	}
    }
    
    final void b(BytesParser var_es) {
	((aba) this).f = var_es.readUnsignedByte(-9268);
	((aba) this).d = var_es.readInt(86);
	((aba) this).c = var_es.readInt(113);
	a(var_es);
    }
    
    public aba() {
	b = new int[2];
	a = new int[2];
	b[0] = 0;
	b[1] = 65535;
	a[0] = 0;
	a[1] = 65535;
    }
}
