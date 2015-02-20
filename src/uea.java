/* uea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class uea
{
    private int a;
    private wn[] b;
    private int c;
    
    private final byte[] a() {
	int i = 0;
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    if (b[i_0_] != null && ((wn) b[i_0_]).r + ((wn) b[i_0_]).f > i)
		i = ((wn) b[i_0_]).r + ((wn) b[i_0_]).f;
	}
	if (i == 0)
	    return new byte[0];
	int i_1_ = 22050 * i / 1000;
	byte[] is = new byte[i_1_];
	for (int i_2_ = 0; i_2_ < 10; i_2_++) {
	    if (b[i_2_] != null) {
		int i_3_ = ((wn) b[i_2_]).r * 22050 / 1000;
		int i_4_ = ((wn) b[i_2_]).f * 22050 / 1000;
		int[] is_5_ = b[i_2_].a(i_3_, ((wn) b[i_2_]).r);
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
		    int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
		    if ((i_7_ + 128 & ~0xff) != 0)
			i_7_ = i_7_ >> 31 ^ 0x7f;
		    is[i_6_ + i_4_] = (byte) i_7_;
		}
	    }
	}
	return is;
    }
    
    static final uea a(pl var_pl, int i, int i_8_) {
	byte[] is = var_pl.b(i_8_, 100, i);
	if (is == null)
	    return null;
	return new uea(new BytesParser(is));
    }
    
    final int b() {
	int i = 9999999;
	for (int i_9_ = 0; i_9_ < 10; i_9_++) {
	    if (b[i_9_] != null && ((wn) b[i_9_]).f / 20 < i)
		i = ((wn) b[i_9_]).f / 20;
	}
	if (c < a && c / 20 < i)
	    i = c / 20;
	if (i == 9999999 || i == 0)
	    return 0;
	for (int i_10_ = 0; i_10_ < 10; i_10_++) {
	    if (b[i_10_] != null)
		((wn) b[i_10_]).f -= i * 20;
	}
	if (c < a) {
	    c -= i * 20;
	    a -= i * 20;
	}
	return i;
    }
    
    private uea(BytesParser var_es) {
	b = new wn[10];
	for (int i = 0; i < 10; i++) {
	    int i_11_ = var_es.readUnsignedByte(-9268);
	    if (i_11_ != 0) {
		((BytesParser) var_es).pos--;
		b[i] = new wn();
		b[i].a(var_es);
	    }
	}
	c = var_es.readShort(13111);
	a = var_es.readShort(13111);
    }
    
    final oaa c() {
	byte[] is = a();
	return new oaa(22050, is, 22050 * c / 1000, 22050 * a / 1000);
    }
    
    private uea() {
	b = new wn[10];
    }
}
