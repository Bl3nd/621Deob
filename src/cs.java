/* cs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class cs implements ica
{
    static int a;
    static int b;
    static int c;
    static int d;
    private tl e;
    static GameOutPacket f = new GameOutPacket(39, 16);
    static dg g;
    static int h;
    static pl i;
    
    public final void a(int i) {
	a++;
	if (i >= -41)
	    a(true, -111);
    }
    
    public final boolean a(byte i) {
	if (i != 82)
	    return false;
	d++;
	return true;
    }
    
    public final void a(boolean bool, int i) {
	c++;
	if (bool)
	    lg.r.J(0, 0, ff.width, eh.height, ((tl) e).d, 0);
	if (i != 6621)
	    f = null;
    }
    
    cs(tl var_tl) {
	e = var_tl;
    }
    
    static final void b(int i) {
	b++;
	if (g.f(-63, on.performance) == 2) {
	    if (i <= 52)
		f = null;
	    byte i_0_ = (byte) (0xff & sh.j - 4);
	    int i_1_ = sh.j % Class_hc.e;
	    for (int i_2_ = 0; i_2_ < 4; i_2_++) {
		for (int i_3_ = 0; bw.v > i_3_; i_3_++)
		    Interactable.e[i_2_][i_1_][i_3_] = i_0_;
	    }
	    if (vo.clientHeight != 3) {
		for (int i_4_ = 0; i_4_ < 2; i_4_++) {
		    of.e[i_4_] = -1000000;
		    Class_md.a[i_4_] = 1000000;
		    hp.I[i_4_] = 0;
		    mba.c[i_4_] = 1000000;
		    gn.O[i_4_] = 0;
		}
		int i_5_ = ((Animable) up.thisPlayer).locX;
		int i_6_ = ((Animable) up.thisPlayer).locY;
		if (ll.x != 1 && ja.Cc == -1) {
		    int i_7_ = Class_u.b(dg.gb, vo.clientHeight, -20214, ada.N);
		    if (i_7_ - us.e < 3200
			&& (0x4 & tu.b[vo.clientHeight][dg.gb >> 9][ada.N >> 9]) != 0)
			Class_rb.a(false, 1, ada.N >> 9, (byte) 92, dg.gb >> 9,
				   ol.p);
		} else {
		    if (ll.x != 1) {
			i_6_ = dj.o;
			i_5_ = ja.Cc;
		    }
		    if ((0x4 & tu.b[vo.clientHeight][i_5_ >> 9][i_6_ >> 9]) != 0)
			Class_rb.a(false, 0, i_6_ >> 9, (byte) 88, i_5_ >> 9,
				   ol.p);
		    if (mba.e < 2560) {
			int i_8_ = dg.gb >> 9;
			int i_9_ = ada.N >> 9;
			int i_10_ = i_5_ >> 9;
			int i_11_ = i_6_ >> 9;
			int i_12_;
			if (i_8_ >= i_10_)
			    i_12_ = i_8_ - i_10_;
			else
			    i_12_ = i_10_ - i_8_;
			int i_13_;
			if (i_9_ < i_11_)
			    i_13_ = i_11_ - i_9_;
			else
			    i_13_ = i_9_ - i_11_;
			if (i_12_ == 0 && i_13_ == 0 || i_12_ <= -Class_hc.e
			    || Class_hc.e <= i_12_ || i_13_ <= -bw.v
			    || bw.v <= i_13_)
			    cea.a(("RC: " + i_8_ + "," + i_9_ + " " + i_10_
				   + "," + i_11_ + " " + bfa.thisPlayersRegionX + "," + BytesParser.thisPlayersRegionY),
				  -2, null);
			else if (i_13_ < i_12_) {
			    int i_14_ = 65536 * i_13_ / i_12_;
			    int i_15_ = 32768;
			    while (i_10_ != i_8_) {
				if (i_8_ >= i_10_) {
				    if (i_10_ < i_8_)
					i_8_--;
				} else
				    i_8_++;
				if ((0x4 & tu.b[vo.clientHeight][i_8_][i_9_]) != 0) {
				    Class_rb.a(false, 1, i_9_, (byte) 126,
					       i_8_, ol.p);
				    break;
				}
				i_15_ += i_14_;
				if (i_15_ >= 65536) {
				    i_15_ -= 65536;
				    if (i_9_ < i_11_)
					i_9_++;
				    else if (i_11_ < i_9_)
					i_9_--;
				    if ((0x4 & tu.b[vo.clientHeight][i_8_][i_9_]) != 0) {
					Class_rb.a(false, 1, i_9_, (byte) 82,
						   i_8_, ol.p);
					break;
				    }
				}
			    }
			} else {
			    int i_16_ = i_12_ * 65536 / i_13_;
			    int i_17_ = 32768;
			    while (i_11_ != i_9_) {
				if (i_9_ < i_11_)
				    i_9_++;
				else if (i_11_ < i_9_)
				    i_9_--;
				if ((tu.b[vo.clientHeight][i_8_][i_9_] & 0x4) != 0) {
				    Class_rb.a(false, 1, i_9_, (byte) 77, i_8_,
					       ol.p);
				    break;
				}
				i_17_ += i_16_;
				if (i_17_ >= 65536) {
				    i_17_ -= 65536;
				    if (i_10_ > i_8_)
					i_8_++;
				    else if (i_8_ > i_10_)
					i_8_--;
				    if ((0x4 & tu.b[vo.clientHeight][i_8_][i_9_]) != 0) {
					Class_rb.a(false, 1, i_9_, (byte) 95,
						   i_8_, ol.p);
					break;
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void a(boolean bool) {
	g = null;
	i = null;
	if (bool != true)
	    i = null;
	f = null;
    }
}
