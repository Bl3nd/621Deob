/* wi - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wi
{
    int a;
    static int b;
    static int c;
    int d;
    static nw e;
    static int f;
    boolean g = false;
    static int h;
    static int i;
    sj j;
    static int k;
    static int l = 0;
    
    static final byte[] a(int i, boolean bool, Object object) {
	if (i != -7374)
	    a(121, 8, -16, 52, 63, -93, false);
	b++;
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (!bool)
		return is;
	    return ko.a(is, -25553);
	}
	if (object instanceof ko) {
	    ko var_ko = (ko) object;
	    return var_ko.a((byte) 108);
	}
	throw new IllegalArgumentException();
    }
    
    public static void a(int i) {
	if (i != 0)
	    e = null;
	e = null;
    }
    
    final boolean a(byte i) {
	if (i > -61)
	    return false;
	wi.i++;
	return ((sj) ((wi) this).j).e.g(1912, ((wi) this).a);
    }
    
    final void a(BytesParser var_es, int i) {
	for (;;) {
	    int i_0_ = var_es.readUnsignedByte(-9268);
	    if (i_0_ == 0)
		break;
	    a(i + 1, i_0_, var_es);
	}
	if (i != -1)
	    a(false, null, -63, -73);
	f++;
    }
    
    private final void a(int i, int i_1_, BytesParser var_es) {
	if (i_1_ == 1)
	    ((wi) this).a = var_es.readShort(i ^ 0x3337);
	else if (i_1_ == 2)
	    ((wi) this).d = var_es.readTribyte(-1);
	else if (i_1_ != 3) {
	    if (i_1_ == 4)
		((wi) this).a = -1;
	} else
	    ((wi) this).g = true;
	h++;
	if (i != 0)
	    e = null;
    }
    
    static final jt a(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
		      boolean bool) {
	k++;
	long l = ((long) i_4_ * 76724863L
		  ^ (986053L * (long) i_2_
		     ^ ((long) i * 67481L ^ (long) i_6_ * 97549L
			^ 475427L * (long) i_5_)
		     ^ 32147369L * (long) i_3_));
	jt var_jt = (jt) GameInPacket.tb.get(l, (byte) 100);
	if (var_jt != null)
	    return var_jt;
	var_jt = lm.Kh.d(i, i_6_, i_5_, i_2_, i_3_, i_4_);
	GameInPacket.tb.put(l, var_jt, 1);
	if (bool != false)
	    return null;
	return var_jt;
    }
    
    final f a(boolean bool, Class_r class_r, int i, int i_7_) {
	c++;
	if (i_7_ > -33)
	    a(14, true, null);
	long l = (long) (((Class_r) class_r).b << 19
			 | ((bool ? 262144 : 0) | (i << 16 | ((wi) this).a)));
	f var_f = (f) ((sj) ((wi) this).j).k.get(l, (byte) 100);
	if (var_f != null)
	    return var_f;
	if (!((sj) ((wi) this).j).e.g(1912, ((wi) this).a))
	    return null;
	aga var_aga = aga.a(((sj) ((wi) this).j).e, ((wi) this).a, 0);
	if (var_aga != null) {
	    ((aga) var_aga).h = ((aga) var_aga).e = ((aga) var_aga).a
		= ((aga) var_aga).g = 0;
	    if (bool)
		var_aga.g();
	    for (int i_8_ = 0; i_8_ < i; i_8_++)
		var_aga.e();
	}
	var_f = class_r.a(var_aga, true);
	if (var_f != null)
	    ((sj) ((wi) this).j).k.put(l, var_f, 1);
	return var_f;
    }
    
    public wi() {
	/* empty */
    }
    
    static {
	e = new nw();
    }
}
