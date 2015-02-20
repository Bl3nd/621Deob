/* bd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class bd
{
    private ls[] a = null;
    fl b = null;
    ls[] c = null;
    static int d;
    boolean e;
    static int f;
    static int g;
    fl h = null;
    private en i;
    static tb j = new tb(260);
    static int[] k
	= { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
    static int l;
    
    final boolean a(boolean bool) {
	if (((bd) this).h == null) {
	    if (cca.b == null) {
		byte[] is = Class_rb.a(0, 8, 16.0F, 16, 0.5F, 0.6F, 4.0F, 128,
				       128, new vq(419684), 4.0F);
		cca.b = kg.a(-137, is, false);
	    }
	    byte[] is = wi.a(-7374, false, cca.b);
	    byte[] is_0_ = new byte[4 * is.length];
	    int i = 0;
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		int i_2_ = 128 * (i_1_ * 128);
		int i_3_ = i_2_;
		for (int i_4_ = 0; i_4_ < 128; i_4_++) {
		    int i_5_ = i_3_ + 128 * i_4_;
		    int i_6_ = 128 * (i_4_ - 1 & 0x7f) + i_3_;
		    int i_7_ = i_3_ + 128 * (i_4_ + 1 & 0x7f);
		    for (int i_8_ = 0; i_8_ < 128; i_8_++) {
			float f = (float) ((0xff & is[i_6_ + i_8_])
					   - (0xff & is[i_8_ + i_7_]));
			float f_9_
			    = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff)
				       - (is[(0x7f & i_8_ + 1) + i_5_]
					  & 0xff));
			float f_10_
			    = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_
								   + 16384.0F
								   + f * f)));
			is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (f_10_ * f + 127.0F);
			is_0_[i++] = is[i_2_++];
		    }
		}
	    }
	    ((bd) this).h = this.i.a(-13331, is_0_, 128, 16, nda.h, 128);
	}
	if (bool != true)
	    ((bd) this).c = null;
	d++;
	if (((bd) this).h == null)
	    return false;
	return true;
    }
    
    final boolean a(byte i) {
	if (i > -21)
	    j = null;
	g++;
	if (((bd) this).e) {
	    if (((bd) this).b == null)
		return false;
	    return true;
	}
	if (((bd) this).c == null)
	    return false;
	return true;
    }
    
    public static void a(int i) {
	k = null;
	if (i < 103)
	    a((int) -53);
	j = null;
    }
    
    static final fm a(int i, Socket socket, int i_11_) throws IOException {
	f++;
	if (i > -71)
	    k = null;
	return new fr(socket, i_11_);
    }
    
    bd(en var_en) {
	this.i = var_en;
	((bd) this).e = ((en) this.i).Jf;
	if (((bd) this).e && !this.i.a(NPC.Xc, bt.g, 12))
	    ((bd) this).e = false;
	if (((bd) this).e || this.i.a(100, bt.g, NPC.Xc)) {
	    dfa.i(-6899);
	    if (!((bd) this).e) {
		((bd) this).c = new ls[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is
			= id.a(32768, (byte) 121, 256 * (i * 128), cga.x);
		    ((bd) this).c[i]
			= this.i.a(is, 128, 128, NPC.Xc, true, (byte) 73);
		}
		a = new ls[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = id.a(32768, (byte) 121, 128 * i * 256, pda.q);
		    a[i]
			= this.i.a(is, 128, 128, NPC.Xc, true, (byte) 73);
		}
	    } else {
		byte[] is = wi.a(-7374, false, cga.x);
		((bd) this).b
		    = this.i.a(-13331, is, 128, 16, NPC.Xc, 128);
		is = wi.a(-7374, false, pda.q);
		this.i.a(-13331, is, 128, 16, NPC.Xc, 128);
	    }
	}
    }
}
