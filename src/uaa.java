/* uaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class uaa
{
    static int a;
    static int b;
    static int c;
    static boolean d;
    static int e;
    static int f;
    static int g;
    static int h = -1;
    static int i;
    static int j;
    private je k = new je();
    static int l;
    static int m;
    static int var_n;
    static int o;
    static int p;
    private je q = new je();
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    private je w = new je();
    private je x = new je();
    private Connection y;
    private long z;
    private BytesParser A = new BytesParser(4);
    private int B;
    private BytesParser C;
    volatile int D;
    volatile int E;
    private byte F = 0;
    private nf G;
    
    static final tba a(boolean bool, int i, int i_0_, int i_1_) {
	v++;
	tba var_tba = null;
	if (i_1_ == 0) {
	    ia.O++;
	    var_tba = jga.sendGameOutPacket(lg.k, pca.isaac, (byte) 86);
	}
	if (i_1_ == 1) {
	    sj.a++;
	    var_tba = jga.sendGameOutPacket(ak.q, pca.isaac, (byte) 78);
	}
	((tba) var_tba).loginStream.writeShortReversedPlus128(-117, bfa.thisPlayersRegionX + i);
	((tba) var_tba).loginStream.writeBytePlus128((byte) -72,
			    (int) (uc.c.a((byte) -68, (int) 82) ? 1 : 0));
	((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_0_ + BytesParser.thisPlayersRegionY);
	po.d = false;
	h = i_0_;
	bca.c = i;
	ho.a(bool);
	return var_tba;
    }
    
    final nf a(int i, int i_2_, int i_3_, boolean bool, byte i_4_) {
	f++;
	long l = (long) (i + (i_2_ << 16));
	nf var_nf = new nf();
	((ft) var_nf).u = bool;
	((pp) var_nf).l = l;
	((nf) var_nf).F = i_4_;
	if (!bool) {
	    if (f(0) >= 20)
		throw new RuntimeException();
	    w.a((int) 75, var_nf);
	} else {
	    if (g(26) >= 20)
		throw new RuntimeException();
	    k.a((int) 75, var_nf);
	}
	if (i_3_ != 4)
	    return null;
	return var_nf;
    }
    
    final boolean a(int i) {
	o++;
	if (y != null) {
	    long l = us.a(94);
	    int i_5_ = (int) (l - z);
	    z = l;
	    if (i_5_ > 200)
		i_5_ = 200;
	    B += i_5_;
	    if (B > 30000) {
		try {
		    y.a((byte) 61);
		} catch (Exception exception) {
		    /* empty */
		}
		y = null;
	    }
	}
	if (y == null) {
	    if (g(47) != 0 || f(0) != 0)
		return false;
	    return true;
	}
	try {
	    y.b((byte) 17);
	    for (nf var_nf = (nf) k.d((byte) -126); var_nf != null;
		 var_nf = (nf) k.a(1252027233)) {
		((BytesParser) A).pos = 0;
		A.writeByte((int) 1, (byte) -124);
		A.writeTribyte((int) ((pp) var_nf).l, (byte) -22);
		y.a(4, 0, (byte) -94, ((BytesParser) A).bytes);
		q.a((int) 75, var_nf);
	    }
	    for (nf var_nf = (nf) w.d((byte) -55); var_nf != null;
		 var_nf = (nf) w.a(1252027233)) {
		((BytesParser) A).pos = 0;
		A.writeByte((int) 0, (byte) -119);
		A.writeTribyte((int) ((pp) var_nf).l, (byte) -22);
		y.a(4, 0, (byte) -60, ((BytesParser) A).bytes);
		x.a((int) 75, var_nf);
	    }
	    int i_6_ = -107 % ((-22 - i) / 35);
	    for (int i_7_ = 0; i_7_ < 100; i_7_++) {
		int i_8_ = y.availableSkips(-22874);
		if (i_8_ < 0)
		    throw new IOException();
		if (i_8_ == 0)
		    break;
		B = 0;
		int i_9_ = 0;
		if (G == null)
		    i_9_ = 8;
		else if (((nf) G).B == 0)
		    i_9_ = 1;
		if (i_9_ > 0) {
		    int i_10_ = i_9_ - ((BytesParser) C).pos;
		    if (i_10_ > i_8_)
			i_10_ = i_8_;
		    y.a(((BytesParser) C).pos, ((BytesParser) C).bytes, i_10_, 14216);
		    if (F != 0) {
			for (int i_11_ = 0; i_10_ > i_11_; i_11_++)
			    ((BytesParser) C).bytes[((BytesParser) C).pos + i_11_]
				= (byte) mv.a(((BytesParser) C).bytes[((BytesParser) C).pos + i_11_],
					      (int) F);
		    }
		    ((BytesParser) C).pos += i_10_;
		    if (((BytesParser) C).pos >= i_9_) {
			if (G == null) {
			    ((BytesParser) C).pos = 0;
			    int i_12_ = C.readUnsignedByte(-9268);
			    int i_13_ = C.readShort(13111);
			    int i_14_ = C.readUnsignedByte(-9268);
			    int i_15_ = C.readInt(70);
			    int i_16_ = 0x7f & i_14_;
			    boolean bool = (i_14_ & 0x80) != 0;
			    long l = (long) ((i_12_ << 16) + i_13_);
			    Object object = null;
			    nf var_nf;
			    if (bool) {
				for (var_nf = (nf) x.d((byte) -115);
				     var_nf != null;
				     var_nf = (nf) x.a(1252027233)) {
				    if (l == ((pp) var_nf).l)
					break;
				}
			    } else {
				for (var_nf = (nf) q.d((byte) -100);
				     var_nf != null;
				     var_nf = (nf) q.a(1252027233)) {
				    if (((pp) var_nf).l == l)
					break;
				}
			    }
			    if (var_nf == null)
				throw new IOException();
			    G = var_nf;
                System.out.println("[uaa]");
			    int i_17_ = i_16_ == 0 ? 5 : 9;
			    ((nf) G).E = new BytesParser(i_17_ + (i_15_ + ((nf) G).F));
			    ((nf) G).E.writeByte(i_16_, (byte) -122);
			    ((nf) G).E.writeInt(i_15_, (int) -120);
			    ((nf) G).B = 8;
			    ((BytesParser) C).pos = 0;
			} else if (((nf) G).B == 0) {
			    if ((((BytesParser) C).bytes[0] ^ 0xffffffff) == 0) {
				((nf) G).B = 1;
				((BytesParser) C).pos = 0;
			    } else
				G = null;
			} else
			    throw new IOException();
		    }
		} else {
		    int i_18_ = ((BytesParser) ((nf) G).E).bytes.length - ((nf) G).F;
		    int i_19_ = -((nf) G).B + 512;
		    if (i_18_ - ((BytesParser) ((nf) G).E).pos < i_19_)
			i_19_ = i_18_ - ((BytesParser) ((nf) G).E).pos;
		    if (i_19_ > i_8_)
			i_19_ = i_8_;
		    y.a(((BytesParser) ((nf) G).E).pos, ((BytesParser) ((nf) G).E).bytes, i_19_,
			14216);
		    if (F != 0) {
			for (int i_20_ = 0; i_19_ > i_20_; i_20_++)
			    ((BytesParser) ((nf) G).E).bytes[i_20_ + ((BytesParser) ((nf) G).E).pos]
				= (byte) mv.a((((BytesParser) ((nf) G).E).bytes
					       [i_20_ + ((BytesParser) ((nf) G).E).pos]),
					      (int) F);
		    }
		    ((BytesParser) ((nf) G).E).pos += i_19_;
		    ((nf) G).B += i_19_;
		    if (i_18_ != ((BytesParser) ((nf) G).E).pos) {
			if (((nf) G).B == 512)
			    ((nf) G).B = 0;
		    } else {
			G.a((byte) -104);
			((ft) G).x = false;
			G = null;
		    }
		}
	    }
	    return true;
	} catch (IOException ioexception) {
	    try {
		y.a((byte) 61);
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((uaa) this).E++;
	    ((uaa) this).D = -2;
	    y = null;
	    if (g(111) == 0 && f(0) == 0)
		return true;
	    return false;
	}
    }
    
    static final void b(int i) {
	a++;
	po.c.a((byte) -116);
	or.a((int) 74);
	ClientScript.gameInPacket = null;
	if (i != -101)
	    e = -66;
	dj.b = 0;
	gv.a = 0;
	jt.c = null;
	ng.u = null;
	((BytesParser) faa.loginStream).pos = 0;
	iq.a(true);
	rc.d = null;
	Class_fd.L = 0;
	wj.clanChatPlayerCount = 0;
	rba.l = 0;
	n.j = null;
    }
    
    final void a(byte i) {
	g++;
	if (i < 3)
	    a(false, -52, -85, 111);
	if (y != null)
	    y.a((byte) 61);
    }
    
    final void c(int i) {
	uaa.i++;
	if (y != null) {
	    try {
		((BytesParser) A).pos = 0;
		A.writeByte((int) 7, (byte) -115);
		A.writeTribyte(0, (byte) -22);
		y.a(i, 0, (byte) -55, ((BytesParser) A).bytes);
	    } catch (IOException ioexception) {
		try {
		    y.a((byte) 61);
		} catch (Exception exception) {
		    /* empty */
		}
		((uaa) this).D = -2;
		((uaa) this).E++;
		y = null;
	    }
	}
    }
    
    final void a(int i, boolean bool) {
	if (i >= 126) {
	    b++;
	    if (y != null) {
		try {
		    ((BytesParser) A).pos = 0;
		    A.writeByte((int) (bool ? 2 : 3), (byte) -128);
		    A.writeTribyte(0, (byte) -22);
		    y.a(4, 0, (byte) -69, ((BytesParser) A).bytes);
		} catch (IOException ioexception) {
		    try {
			y.a((byte) 61);
		    } catch (Exception exception) {
			/* empty */
		    }
		    ((uaa) this).E++;
		    y = null;
		    ((uaa) this).D = -2;
		}
	    }
	}
    }
    
    final void a(boolean bool) {
	if (bool == true) {
	    try {
		y.a((byte) 61);
	    } catch (Exception exception) {
		/* empty */
	    }
	    p++;
	    ((uaa) this).E++;
	    ((uaa) this).D = -1;
	    y = null;
	    F = (byte) (int) (255.0 * Math.random() + 1.0);
	}
    }
    
    final void a(int i, boolean bool, Connection var_rfa) {
	if (i <= 10)
	    a((int) 66);
	m++;
	if (y != null) {
	    try {
		y.a((byte) 61);
	    } catch (Exception exception) {
		/* empty */
	    }
	    y = null;
	}
	y = var_rfa;
	b((byte) -123);
	a(127, bool);
	((BytesParser) C).pos = 0;
	G = null;
	for (;;) {
	    nf var_nf = (nf) q.b(-21957);
	    if (var_nf == null)
		break;
	    k.a((int) 75, var_nf);
	}
	for (;;) {
	    nf var_nf = (nf) x.b(-21957);
	    if (var_nf == null)
		break;
	    w.a((int) 75, var_nf);
	}
	if (F != 0) {
	    try {
		((BytesParser) A).pos = 0;
            System.out.println("[uaa] sldk");
		A.writeByte((int) 4, (byte) -111);
		A.writeByte((int) F, (byte) -126);
		A.writeShort(0, 13469);
		y.a(4, 0, (byte) -62, ((BytesParser) A).bytes);
	    } catch (IOException ioexception) {
		try {
		    y.a((byte) 61);
		} catch (Exception exception) {
		    /* empty */
		}
		((uaa) this).D = -2;
		((uaa) this).E++;
		y = null;
	    }
	}
	B = 0;
	z = us.a(96);
    }
    
    static final void a(boolean bool, efa var_efa) {
	dp.k = var_efa;
	var_n++;
	if (bool != false)
	    h = -115;
    }
    
    final boolean d(int i) {
	if (i <= 22)
	    a((int) -42);
	l++;
	if (f(0) < 20)
	    return false;
	return true;
    }
    
    private final void b(byte i) {
	t++;
	if (y != null) {
	    try {
		if (i != -123)
		    g(42);
		((BytesParser) A).pos = 0;
		A.writeByte((int) 6, (byte) -122);
		A.writeTribyte(3, (byte) -22);
		y.a(4, 0, (byte) -117, ((BytesParser) A).bytes);
	    } catch (IOException ioexception) {
		try {
		    y.a((byte) 61);
		} catch (Exception exception) {
		    /* empty */
		}
		((uaa) this).E++;
		((uaa) this).D = -2;
		y = null;
	    }
	}
    }
    
    final boolean e(int i) {
	u++;
	if (i != 26555)
	    return false;
	if (g(112) < 20)
	    return false;
	return true;
    }
    
    final void c(byte i) {
	if (y != null)
	    y.b((int) 35);
	s++;
	if (i >= -11)
	    x = null;
    }
    
    private final int f(int i) {
	if (i != 0)
	    return -42;
	j++;
	return w.d((int) 0) + x.d((int) 0);
    }
    
    final int g(int i) {
	if (i < 8)
	    a(false, 115, 17, -44);
	r++;
	return k.d((int) 0) + q.d((int) 0);
    }
    
    public uaa() {
	((uaa) this).E = 0;
	((uaa) this).D = 0;
	C = new BytesParser(8);
    }
    
    static {
	c = 0;
	d = false;
    }
}
