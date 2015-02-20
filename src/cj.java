/* cj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cj
{
    static int a;
    boolean b = false;
    static boolean[] c = new boolean[100];
    boolean d = false;
    static fa e;
    int f;
    int g;
    static int h;
    int i = -1;
    static GameInPacket incomingPacket77;
    static int k;
    static int l = 2;
    int m;
    int var_n;
    
    static final boolean a(Animable var_lo, boolean bool, byte[][][] is, int i,
			   byte i_0_) {
	if (!ISAAC.e)
	    return false;
	int i_1_ = ((Animable) var_lo).locX >> Class_fb.a;
	int i_2_ = ((Animable) var_lo).locY >> Class_fb.a;
	if (i_1_ >= fp.q && i_1_ < fq.h && i_2_ >= dp.n && i_2_ < hea.d) {
	    if ((is != null && ((Animable) var_lo).height >= i
		 && is[((Animable) var_lo).height][i_1_][i_2_] == i_0_)
		|| !var_lo.f(4095) || var_lo.f((byte) 125)) {
		if (!bool && i_1_ >= n.e - 16 && i_1_ <= n.e + 16
		    && i_2_ >= fm.i - 16 && i_2_ <= fm.i + 16) {
		    if (kw.B) {
			ff.p[Class_ug.Y++].a(var_lo, (byte) 87);
			Class_ug.Y %= ko.a;
		    } else
			var_lo.b(false, nda.k);
		}
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    public static void a(byte i) {
	int i_3_ = 12 % ((-43 - i) / 60);
	c = null;
	e = null;
	incomingPacket77 = null;
    }
    
    final void a(BytesParser var_es, int i, int i_4_) {
	for (;;) {
	    int i_5_ = var_es.readUnsignedByte(-9268);
	    if (i_5_ == 0)
		break;
	    a(var_es, i_5_, 7, i_4_);
	}
	if (i > -53)
	    a(null, -68, -55, 27);
	k++;
    }
    
    private final void a(BytesParser var_es, int i, int i_6_, int i_7_) {
	if (i_6_ == 7) {
	    if (i != 1) {
		if (i != 2) {
		    if (i == 3)
			var_es.readByte(-20933);
		    else if (i != 4) {
			if (i == 5)
			    ((cj) this).f = var_es.readUnsignedByte(-9268);
			else if (i == 6)
			    ((cj) this).b = true;
			else if (i == 7)
			    ((cj) this).d = true;
		    } else
			((cj) this).m = var_es.readUnsignedByte(-9268);
		} else {
		    ((cj) this).g = var_es.readShort(i_6_ ^ 0x3330) + 1;
		    ((cj) this).var_n = var_es.readShort(13111) + 1;
		}
	    } else {
		((cj) this).i = var_es.readShort(13111);
		if (((cj) this).i == 65535)
		    ((cj) this).i = -1;
	    }
	    h++;
	}
    }
    
    static final boolean a(int i, int i_8_, int i_9_) {
	a++;
	if (i_8_ != -545)
	    incomingPacket77 = null;
	return (i_9_ & 0x18) != 0 | (0x220 & i_9_) == 544;
    }
    
    public cj() {
	((cj) this).g = 64;
	((cj) this).f = 1;
	((cj) this).m = 2;
	((cj) this).var_n = 64;
    }
    
    static {
	incomingPacket77 = new GameInPacket(77, 8);
    }
}
