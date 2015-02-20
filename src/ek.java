/* ek - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ek
{
    private pl a;
    static int b;
    boolean c;
    static int d;
    private tb e;
    static int f;
    static int g;
    static int h;
    boolean i = false;
    static GameOutPacket j = new GameOutPacket(64, 6);
    static int k;
    static pl l;
    static int m;
    static int n;
    pl o;
    static int p;
    static int q;
    static int r;
    static GameInPacket clientScriptGameInPacket = new GameInPacket(47, -2);
    static int t;
    tb u;
    tb v;
    static f[] w;
    tb x;
    int y;
    
    static final byte[] a(int i, byte[] is) {
	r++;
	BytesParser var_es = new BytesParser(is);
	int i_0_ = var_es.readUnsignedByte(-9268);
	int i_1_ = var_es.readInt(121);
	if (i_1_ < 0 || sj.r != 0 && sj.r < i_1_)
	    throw new RuntimeException();
	if (i != i_0_) {
	    int i_2_ = var_es.readInt(72);
	    if (i_2_ < 0 || sj.r != 0 && i_2_ > sj.r)
		throw new RuntimeException();
	    byte[] is_3_ = new byte[i_2_];
	    if (i_0_ != 1) {
		synchronized (jq.l) {
		    jq.l.a((byte) 126, var_es, is_3_);
		}
	    } else
		eea.a(is_3_, i_2_, is, i_1_, 9);
	    return is_3_;
	}
	byte[] is_4_ = new byte[i_1_];
	var_es.readBytes(is_4_, true, i_1_, 0);
	return is_4_;
    }
    
    final void a(int i, byte i_5_) {
	synchronized (e) {
	    e.a(true, i);
	}
	d++;
	if (i_5_ < 97)
	    b((int) 11, (byte) -43);
	synchronized (((ek) this).u) {
	    ((ek) this).u.a(true, i);
	}
	synchronized (((ek) this).v) {
	    ((ek) this).v.a(true, i);
	}
	synchronized (((ek) this).x) {
	    ((ek) this).x.a(true, i);
	}
    }
    
    public static void a(int i) {
	if (i != 1)
	    clientScriptGameInPacket = null;
	l = null;
	clientScriptGameInPacket = null;
	w = null;
	j = null;
    }
    
    final void b(int i) {
	p++;
	synchronized (e) {
	    e.a(18385);
	}
	synchronized (((ek) this).u) {
	    ((ek) this).u.a(i ^ 0x14ea);
	}
	synchronized (((ek) this).v) {
	    if (i != 21307)
		b(78);
	    ((ek) this).v.a(18385);
	}
	synchronized (((ek) this).x) {
	    ((ek) this).x.a(i ^ 0x14ea);
	}
    }
    
    final void a(int i, int i_6_) {
	e = new tb(i_6_);
	int i_7_ = -31 / ((-36 - i) / 46);
	q++;
    }
    
    final void c(int i) {
	synchronized (e) {
	    e.c((byte) 73);
	}
	n++;
	synchronized (((ek) this).u) {
	    ((ek) this).u.c((byte) -120);
	}
	synchronized (((ek) this).v) {
	    ((ek) this).v.c((byte) 66);
	    if (i < 82)
		j = null;
	}
	synchronized (((ek) this).x) {
	    ((ek) this).x.c((byte) 76);
	}
    }
    
    final ObjectDef getObjectDef(byte dummy, int objectID) {
		t++;
		ObjectDef obj;
		synchronized (e) {
		    obj = (ObjectDef) e.get((long) objectID, (byte) 100);
		}
		if (obj != null)
		    return obj;
		byte[] is;
		synchronized (a) {
		    is = a.b(vm.a((byte) 121, objectID), 50, Class_wb.a(objectID, -20650));
		}
		obj = new ObjectDef();
		((ObjectDef) obj).objectID = objectID;
		((ObjectDef) obj).nb = this;
		if (is != null)
		    obj.parseValues((byte) 0, new BytesParser(is));
		if (dummy <= 16)
		    return null;
		obj.a(false);
		if (((ObjectDef) obj).y) {
		    ((ObjectDef) obj).qb = false;
		    ((ObjectDef) obj).ab = 0;
		}
		if (!((ek) this).c && ((ObjectDef) obj).Db) {
		    ((ObjectDef) obj).T = null;
		    ((ObjectDef) obj).l = null;
		}
		synchronized (e) {
		    e.put((long) objectID, obj, 1);
		}
		return obj;
    }
    
    static final boolean a(int i, int i_9_, int i_10_) {
	k++;
	if (i != 1)
	    a(null, 51, (byte) 47, 34);
	if (!tl.a(i_9_, i_10_, 14031) && !kl.a(i_9_, 55, i_10_))
	    return false;
	return true;
    }
    
    final void b(byte i, int i_11_) {
	((ek) this).y = i_11_;
	h++;
	if (i <= 94)
	    a = null;
	synchronized (((ek) this).u) {
	    ((ek) this).u.a(18385);
	}
	synchronized (((ek) this).v) {
	    ((ek) this).v.a(18385);
	}
	synchronized (((ek) this).x) {
	    ((ek) this).x.a(18385);
	}
    }
    
    static final int b(int i, byte i_12_) {
	if (i_12_ != 29)
	    a(null, 125, (byte) -41, -11);
	f++;
	if (i == 6407 || i == 34843 || i == 34837)
	    return 6407;
	if (i == 6408 || i == 34842 || i == 34836)
	    return 6408;
	if (i == 6406 || i == 34844)
	    return 6406;
	if (i == 6409 || i == 34846)
	    return 6409;
	if (i == 6410 || i == 34847)
	    return 6410;
	if (i == 6402)
	    return 6402;
	throw new IllegalArgumentException("");
    }
    
    static final eaa a(pl var_pl, int i, byte i_13_, int i_14_) {
	m++;
	if (i_13_ > -91)
	    return null;
	BytesParser var_es = new BytesParser(var_pl.b(i_14_, -114, i));
	eaa var_eaa
	    = new eaa(i_14_, var_es.readString((byte) 125), var_es.readString((byte) 121),
		      var_es.readInt(125), var_es.readInt(120), var_es.readUnsignedByte(-9268) == 1,
		      var_es.readUnsignedByte(-9268), var_es.readUnsignedByte(-9268));
	int i_15_ = var_es.readUnsignedByte(-9268);
	for (int i_16_ = 0; i_15_ > i_16_; i_16_++)
	    ((eaa) var_eaa).A.b(new Class_nb(var_es.readUnsignedByte(-9268), var_es.readShort(13111),
					     var_es.readShort(13111), var_es.readShort(13111),
					     var_es.readShort(13111), var_es.readShort(13111),
					     var_es.readShort(13111), var_es.readShort(13111),
					     var_es.readShort(13111)),
				(byte) 93);
	var_eaa.a((int) 113);
	return var_eaa;
    }
    
    final void a(boolean bool, int i) {
	g++;
	if (!((ek) this).c != !bool) {
	    ((ek) this).c = bool;
	    if (i == -6407)
		b(i + 27714);
	}
    }
    
    final void a(int i, boolean bool) {
	b++;
	if (!bool == ((ek) this).i) {
	    ((ek) this).i = bool;
	    b(i + 21306);
	    if (i != 1)
		a(-81, -4, -92);
	}
    }
    
    ek(Class_rf class_rf, int i, boolean bool, pl var_pl, pl var_pl_17_) {
	e = new tb(64);
	((ek) this).u = new tb(500);
	((ek) this).v = new tb(30);
	((ek) this).x = new tb(50);
	a = var_pl;
	((ek) this).c = bool;
	((ek) this).o = var_pl_17_;
	if (a != null) {
	    int i_18_ = a.a((byte) -107) - 1;
	    a.a(i_18_, true);
	}
    }
}
