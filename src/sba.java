/* sba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sba extends Node
{
    static int k;
    static int[] l;
    static int m;
    static int n;
    Class_ae o = new Class_ae();
    static int p;
    static int q = 0;
    static int r;
    
    public static void a(byte i) {
	l = null;
	if (i != -123)
	    a((int) -82);
    }
    
    static final void a(int i, Signlink var_rj, int packetSize, BytesParser var_es) {
	m++;
	if (i >= -5)
	    a((byte) -30);
	vp var_vp = new vp();
	((vp) var_vp).s = var_es.readUnsignedByte(-9268);
	((vp) var_vp).p = var_es.readInt(115);
	((vp) var_vp).n = new int[((vp) var_vp).s];
	((vp) var_vp).m = new byte[((vp) var_vp).s][][];
	((vp) var_vp).r = new vfa[((vp) var_vp).s];
	((vp) var_vp).l = new int[((vp) var_vp).s];
	((vp) var_vp).q = new int[((vp) var_vp).s];
	((vp) var_vp).k = new vfa[((vp) var_vp).s];
	for (int i_1_ = 0; i_1_ < ((vp) var_vp).s; i_1_++) {
	    try {
		int i_2_ = var_es.readUnsignedByte(-9268);
		if (i_2_ == 0 || i_2_ == 1 || i_2_ == 2) {
		    String string = var_es.readString((byte) 122);
		    String string_3_ = var_es.readString((byte) 120);
		    int i_4_ = 0;
		    if (i_2_ == 1)
			i_4_ = var_es.readInt(78);
		    ((vp) var_vp).n[i_1_] = i_2_;
		    ((vp) var_vp).q[i_1_] = i_4_;
		    ((vp) var_vp).k[i_1_]
			= var_rj.a(string_3_, je.a(18944, string), 0);
		} else if (i_2_ == 3 || i_2_ == 4) {
		    String string = var_es.readString((byte) 117);
		    String string_5_ = var_es.readString((byte) 118);
		    int i_6_ = var_es.readUnsignedByte(-9268);
		    String[] strings = new String[i_6_];
		    for (int i_7_ = 0; i_6_ > i_7_; i_7_++)
			strings[i_7_] = var_es.readString((byte) 116);
		    byte[][] is = new byte[i_6_][];
		    if (i_2_ == 3) {
			for (int i_8_ = 0; i_6_ > i_8_; i_8_++) {
			    int i_9_ = var_es.readInt(93);
			    is[i_8_] = new byte[i_9_];
			    var_es.readBytes(is[i_8_], true, i_9_, 0);
			}
		    }
		    ((vp) var_vp).n[i_1_] = i_2_;
		    Class[] var_classes = new Class[i_6_];
		    for (int i_10_ = 0; i_6_ > i_10_; i_10_++)
			var_classes[i_10_] = je.a(18944, strings[i_10_]);
		    ((vp) var_vp).r[i_1_]
			= var_rj.a(je.a(18944, string), string_5_, var_classes,
				   1727313032);
		    ((vp) var_vp).m[i_1_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((vp) var_vp).l[i_1_] = -1;
	    } catch (SecurityException securityexception) {
		((vp) var_vp).l[i_1_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((vp) var_vp).l[i_1_] = -3;
	    } catch (Exception exception) {
		((vp) var_vp).l[i_1_] = -4;
	    } catch (Throwable throwable) {
		((vp) var_vp).l[i_1_] = -5;
	    }
	}
	dl.c.b(var_vp, (byte) 93);
    }
    
    static final void a(int i, byte i_11_) {
	n++;
	qba var_qba = ofa.a(2, i, (byte) -127);
	var_qba.i(0);
	int i_12_ = -24 % (-i_11_ / 45);
    }
    
    static final boolean a(byte i, int i_13_, int i_14_) {
	if (i < 32)
	    a((int) -77);
	r++;
	if (!(dk.a(33, i_13_, i_14_) | (i_13_ & 0x70000) != 0)
	    && !ih.a(i_13_, -1, i_14_))
	    return false;
	return true;
    }
    
    public sba() {
	/* empty */
    }
    
    static final void a(int i) {
	p++;
	li.a();
	for (int i_15_ = 0; i_15_ < 4; i_15_++)
	    su.a[i_15_].a(2097152);
	Entity.c((byte) -67);
	if (i != 9811)
	    a((byte) -53, -47, 45);
	um.a(0);
	System.gc();
	lg.r.ya();
    }
    
    static final void a(int i, int i_16_, int i_17_) {
	int i_18_ = -49 % ((-46 - i_16_) / 62);
	k++;
	qba var_qba = ofa.a(5, i_17_, (byte) -128);
	var_qba.c((byte) 11);
	((qba) var_qba).v = i;
    }
}
