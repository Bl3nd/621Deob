/* iv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class iv
{
    private int a;
    private int b = -1;
    private int c;
    boolean d;
    int e;
    private int f;
    static int g;
    static int h;
    private short[] i;
    static int j;
    bea k;
    static int l;
    private short[] m;
    static GameOutPacket n;
    private short[] o;
    static int p;
    private int q;
    byte r;
    private short[] s;
    static int t = 0;
    static int u;
    private int v;
    int w;
    static int x;
    static boolean y;
    private int z;
    
    final void a(int i, BytesParser var_es) {
	for (;;) {
	    int i_0_ = var_es.readUnsignedByte(i - 9271);
	    if (i_0_ == 0)
		break;
	    a(i_0_, (byte) 3, var_es);
	}
	l++;
	if (i != 3)
	    q = -114;
    }
    
    private final void a(int i, byte i_1_, BytesParser var_es) {
	if (i != 1) {
	    if (i == 2)
		((iv) this).w = var_es.readShort(13111);
	    else if (i != 4) {
		if (i == 5)
		    c = var_es.readShort(13111);
		else if (i != 6) {
		    if (i == 7)
			z = var_es.readUnsignedByte(-9268);
		    else if (i == 8)
			a = var_es.readUnsignedByte(-9268);
		    else if (i == 9) {
			b = 8224;
			((iv) this).r = (byte) 3;
		    } else if (i == 10)
			((iv) this).d = true;
		    else if (i != 11) {
			if (i == 12)
			    ((iv) this).r = (byte) 4;
			else if (i == 13)
			    ((iv) this).r = (byte) 5;
			else if (i == 14) {
			    ((iv) this).r = (byte) 2;
			    b = 256 * var_es.readUnsignedByte(-9268);
			} else if (i == 15) {
			    ((iv) this).r = (byte) 3;
			    b = var_es.readShort(i_1_ + 13108);
			} else if (i != 16) {
			    if (i == 40) {
				int i_2_ = var_es.readUnsignedByte(i_1_ - 9271);
				m = new short[i_2_];
				o = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				    o[i_3_] = (short) var_es.readShort(13111);
				    m[i_3_] = (short) var_es.readShort(13111);
				}
			    } else if (i == 41) {
				int i_4_ = var_es.readUnsignedByte(-9268);
				s = new short[i_4_];
				this.i = new short[i_4_];
				for (int i_5_ = 0; i_4_ > i_5_; i_5_++) {
				    this.i[i_5_] = (short) var_es.readShort(13111);
				    s[i_5_] = (short) var_es.readShort(13111);
				}
			    }
			} else {
			    ((iv) this).r = (byte) 3;
			    b = var_es.readInt(77);
			}
		    } else
			((iv) this).r = (byte) 1;
		} else
		    q = var_es.readShort(13111);
	    } else
		v = var_es.readShort(13111);
	} else
	    f = var_es.readShort(i_1_ + 13108);
	if (i_1_ != 3)
	    this.i = null;
	h++;
    }
    
    final da a(int i, Class_r class_r, int i_6_, hl var_hl, int i_7_, int i_8_,
	       int i_9_) {
	p++;
	int i_10_ = -8 % ((i_6_ - 31) / 35);
	return a(0, 0, false, 0, i, i_8_, i_9_, null, (byte) 2, i_7_, null,
		 false, class_r, var_hl);
    }
    
    final da a(hl var_hl, int i, Class_r class_r, int i_11_, int i_12_,
	       int i_13_, int i_14_) {
	x++;
	if (i < 70)
	    this.i = null;
	return a(0, 0, false, 0, i_11_, i_12_, i_14_, null, (byte) 5, i_13_,
		 null, false, class_r, var_hl);
    }
    
    public static void a(int i) {
	if (i >= -114)
	    a(-117, (byte) 123);
	n = null;
    }
    
    final da a(int i, int i_15_, int i_16_, int i_17_, byte i_18_,
	       Class_i class_i, int i_19_, boolean bool, Class_i class_i_20_,
	       int i_21_, Class_r class_r, hl var_hl, int i_22_) {
	if (i_18_ != 0)
	    a(-122, (BytesParser) null);
	g++;
	return a(i_22_, i_17_, bool, i, i_16_, i_15_, i_21_, class_i_20_,
		 (byte) 2, i_19_, class_i, false, class_r, var_hl);
    }
    
    static final boolean a(int i, byte i_23_) {
	if (i_23_ != -59)
	    return true;
	u++;
	if (i != 0 && i != 2)
	    return false;
	return true;
    }
    
    private final da a(int i, int i_24_, boolean bool, int i_25_, int i_26_,
		       int i_27_, int i_28_, Class_i class_i, byte i_29_,
		       int i_30_, Class_i class_i_31_, boolean bool_32_,
		       Class_r class_r, hl var_hl) {
	j++;
	int i_33_ = i_27_;
	dr var_dr
	    = ((((iv) this).w ^ 0xffffffff) != 0 && (i_30_ ^ 0xffffffff) != 0
	       ? var_hl.c(64, ((iv) this).w) : null);
	bool = bool & ((iv) this).r != 0;
	if (var_dr != null)
	    i_33_ |= var_dr.a(1024, i_26_, false, i_30_);
	if (bool)
	    i_33_ = i_33_ | (((iv) this).r != 3 ? 2 : 7);
	if (bool_32_ != false)
	    return null;
	if (c != 128)
	    i_33_ |= 0x2;
	if (v != 128 || q != 0)
	    i_33_ |= 0x5;
	da var_da;
	synchronized (((bea) ((iv) this).k).l) {
	    var_da
		= ((da)
		   ((bea) ((iv) this).k).l.get((long) (((iv) this).e
						     |= (((Class_r) class_r).b
							 << 29)),
					     (byte) 100));
	}
	if (var_da == null || class_r.b(var_da.PA(), i_33_) != 0) {
	    if (var_da != null)
		i_33_ = class_r.a(i_33_, var_da.PA());
	    int i_34_ = i_33_;
	    if (o != null)
		i_34_ |= 0x4000;
	    if (this.i != null)
		i_34_ |= 0x8000;
	    eg var_eg = efa.a(f, ((bea) ((iv) this).k).b, 0, bool_32_);
	    if (var_eg == null)
		return null;
	    if (((eg) var_eg).bb < 13)
		var_eg.a((byte) -107, 2);
	    var_da = class_r.a(var_eg, i_34_, ((bea) ((iv) this).k).m, z + 64,
			       a + 850);
	    if (o != null) {
		for (int i_35_ = 0; o.length > i_35_; i_35_++)
		    var_da.d(o[i_35_], m[i_35_]);
	    }
	    if (this.i != null) {
		for (int i_36_ = 0; this.i.length > i_36_; i_36_++)
		    var_da.DA(this.i[i_36_], s[i_36_]);
	    }
	    var_da.SA(i_33_);
	    synchronized (((bea) ((iv) this).k).l) {
		((bea) ((iv) this).k).l.put((long) (((iv) this).e
						  |= (((Class_r) class_r).b
						      << 29)),
					  var_da, 1);
	    }
	}
	da var_da_37_
	    = (var_dr != null
	       ? var_dr.a(i_29_, var_da, i_33_, 7, 0, i_28_, i_30_, i_26_)
	       : var_da.a(i_29_, i_33_, true));
	if (v != 128 || c != 128)
	    var_da_37_.R(v, c, v);
	if (q != 0) {
	    if (q == 90)
		var_da_37_.M(4096);
	    if (q == 180)
		var_da_37_.M(8192);
	    if (q == 270)
		var_da_37_.M(12288);
	}
	if (bool)
	    var_da_37_.ba(((iv) this).r, b, class_i_31_, class_i, i_25_, i_24_,
			  i);
	var_da_37_.SA(i_27_);
	return var_da_37_;
    }
    
    public iv() {
	a = 0;
	c = 128;
	((iv) this).w = -1;
	((iv) this).r = (byte) 0;
	v = 128;
	q = 0;
	((iv) this).d = false;
	z = 0;
    }
    
    static {
	n = new GameOutPacket(4, 3);
	y = false;
    }
}
