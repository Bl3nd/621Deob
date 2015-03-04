/* faa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class faa
{
    static int a;
    static int b;
    static int c;
    static GameInPacket incomingPacket62 = new GameInPacket(62, -1);
    static int e = 0;
    static LoginStream loginStream = new LoginStream(7500);
    static int g;
    
    static final void a(int i) {
	g++;
	if (Class_eb.q != 0) {
	    try {
		if (++lr.j > 2000) {
		    if (ce.y != null) {
			ce.y.d(0);
			ce.y = null;
		    }
		    if (tfa.u < 2) {
			cf.world.rotateConnectionMethods((int) 0);
			Class_eb.q = 1;
			tfa.u++;
			lr.j = 0;
		    } else {
			Class_eb.q = 0;
			RSKeyListener.s = -5;
			return;
		    }
		}
		if (Class_eb.q == 1) {
		    maa.vfa = cf.world.a(nda.signlink);
		    Class_eb.q = 2;
		}
		if (Class_eb.q == 2) {
		    if (maa.vfa.f == 2)
			throw new IOException();
		    if (maa.vfa.f != 1)
			return;
		    ce.y = bd.a(-125, (Socket) maa.vfa.hostName, 7500);
		    maa.vfa = null;
		    InputStreamSub.a((byte) 117);
		    Class_eb.q = 4;
		}
		if (Class_eb.q == 4) {
		    if (!ce.y.a(1, (byte) -100))
			return;
		    ce.y.a((byte) 103, 0, ((BytesParser) loginStream).bytes, 1);
		    int i_0_ = ((BytesParser) loginStream).bytes[0] & 0xff;
		    if (i_0_ != 21) {
			Class_eb.q = 0;
			RSKeyListener.s = i_0_;
			ce.y.d(0);
			ce.y = null;
			return;
		    }
		    Class_eb.q = 5;
		}
		int i_1_ = 71 / ((i - 69) / 41);
		if (Class_eb.q == 5) {
		    if (!ce.y.a(1, (byte) 125))
			return;
		    ce.y.a((byte) 78, 0, ((BytesParser) loginStream).bytes, 1);
		    Class_eb.q = 6;
		    bg.f = new String[0xff & ((BytesParser) loginStream).bytes[0]];
		}
		if (Class_eb.q == 6) {
		    if (ce.y.a(bg.f.length * 8, (byte) 116)) {
			((BytesParser) loginStream).pos = 0;
			ce.y.a((byte) 81, 0, ((BytesParser) loginStream).bytes, 8 * bg.f.length);
			for (int i_2_ = 0; bg.f.length > i_2_; i_2_++)
			    bg.f[i_2_] = kba.a((byte) -114, loginStream.readLong(false));
			RSKeyListener.s = 21;
			Class_eb.q = 0;
			ce.y.d(0);
			ce.y = null;
		    }
		}
	    } catch (IOException ioexception) {
		if (ce.y != null) {
		    ce.y.d(0);
		    ce.y = null;
		}
		if (tfa.u >= 2) {
		    Class_eb.q = 0;
		    RSKeyListener.s = -4;
		} else {
		    cf.world.rotateConnectionMethods((int) 0);
		    tfa.u++;
		    Class_eb.q = 1;
		    lr.j = 0;
		}
	    }
	}
    }
    
    static final void a(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_) {
	c++;
	int i_10_ = i_8_ - 334;
	if (i_10_ < 0)
	    i_10_ = 0;
	else if (i_10_ > 100)
	    i_10_ = 100;
	int i_11_ = cda.a + (gf.f - cda.a) * i_10_ / 100;
	i = i * i_11_ >> 8;
	int i_12_ = 0x3fff & -i_4_ + 16384;
	int i_13_ = 0x3fff & -i_6_ + 16384;
	if (i_7_ < 30)
	    incomingPacket62 = null;
	int i_14_ = 0;
	int i_15_ = 0;
	int i_16_ = i;
	if (i_12_ != 0) {
	    i_15_ = GameInPacket.ints1[i_12_] * -i_16_ >> 14;
	    i_16_ = i_16_ * GameInPacket.ints2[i_12_] >> 14;
	}
	if (i_13_ != 0) {
	    i_14_ = i_16_ * GameInPacket.ints1[i_13_] >> 14;
	    i_16_ = i_16_ * GameInPacket.ints2[i_13_] >> 14;
	}
	gn.G = i_6_;
	us.e = i_9_ - i_15_;
	dg.gb = i_5_ - i_14_;
	ada.N = i_3_ - i_16_;
	mba.e = i_4_;
	GPIPlayer.e = 0;
    }
    
    static final int a(int i, int i_17_, boolean bool) {
	a++;
	if (bool != true)
	    a(90, 91, true);
	int i_18_ = 0;
	for (/**/; i_17_ > 0; i_17_--) {
	    i_18_ = 0x1 & i | i_18_ << 1;
	    i >>>= 1;
	}
	return i_18_;
    }
    
    public static void a(byte i) {
	incomingPacket62 = null;
	if (i < 35)
	    a((int) 15);
	loginStream = null;
    }
}
