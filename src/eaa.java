/* eaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class eaa extends pp
{
    int s;
    int t;
    int u;
    int v;
    int w;
    boolean x = true;
    static int y;
    static int z;
    Class_ae A;
    static int B;
    int C;
    static int D;
    static int E;
    int F;
    String G;
    int H;
    String I;
    static int J;
    static int K;
    
    static final boolean a(int i, boolean bool, int i_0_, int i_1_, int i_2_,
			   int i_3_, int i_4_, int i_5_, int i_6_) {
	D++;
	if (i >= i_3_ + i_2_ || i + i_0_ <= i_3_)
	    return false;
	if (i_4_ + i_6_ <= i_1_ || i_4_ >= i_1_ + i_5_)
	    return false;
	if (bool != false)
	    return false;
	return true;
    }
    
    final void a(int i) {
	((eaa) this).F = 0;
	((eaa) this).C = 0;
	((eaa) this).H = 12800;
	((eaa) this).s = 12800;
	J++;
	for (Class_nb class_nb = (Class_nb) ((eaa) this).A.a((int) 109);
	     class_nb != null;
	     class_nb = (Class_nb) ((eaa) this).A.b((byte) 94)) {
	    if (((eaa) this).F < ((Class_nb) class_nb).t)
		((eaa) this).F = ((Class_nb) class_nb).t;
	    if (((eaa) this).H > ((Class_nb) class_nb).m)
		((eaa) this).H = ((Class_nb) class_nb).m;
	    if (((eaa) this).s > ((Class_nb) class_nb).l)
		((eaa) this).s = ((Class_nb) class_nb).l;
	    if (((eaa) this).C < ((Class_nb) class_nb).o)
		((eaa) this).C = ((Class_nb) class_nb).o;
	}
	if (i < 68)
	    a(1, -88, -24);
    }
    
    final boolean a(int i, byte i_7_, int i_8_, int[] is) {
	B++;
	for (Class_nb class_nb = (Class_nb) ((eaa) this).A.a((int) 85);
	     class_nb != null;
	     class_nb = (Class_nb) ((eaa) this).A.b((byte) 91)) {
	    if (class_nb.a(i, i_8_, false)) {
		class_nb.a(is, i_8_, i, 0);
		return true;
	    }
	}
	if (i_7_ > -84)
	    ((eaa) this).t = 57;
	return false;
    }
    
    final boolean a(int i, int i_9_, int[] is, int i_10_, int i_11_) {
	E++;
	if (i_10_ != 255)
	    return true;
	for (Class_nb class_nb = (Class_nb) ((eaa) this).A.a((int) 88);
	     class_nb != null;
	     class_nb = (Class_nb) ((eaa) this).A.b((byte) 96)) {
	    if (class_nb.a(i, 57, i_9_, i_11_)) {
		class_nb.a(is, i_9_, i, i_10_ ^ 0xff);
		return true;
	    }
	}
	return false;
    }
    
    final boolean a(int i, int i_12_, int i_13_) {
	z++;
	Class_nb class_nb = (Class_nb) ((eaa) this).A.a((int) 124);
	if (i != 13543)
	    ((eaa) this).I = null;
	for (/**/; class_nb != null;
	     class_nb = (Class_nb) ((eaa) this).A.b((byte) 29)) {
	    if (class_nb.a(i_13_, i_12_, false))
		return true;
	}
	return false;
    }
    
    final boolean a(int i, int i_14_, int[] is, byte i_15_) {
	K++;
	for (Class_nb class_nb = (Class_nb) ((eaa) this).A.a((int) 103);
	     class_nb != null;
	     class_nb = (Class_nb) ((eaa) this).A.b((byte) 46)) {
	    if (class_nb.b(i, 7369, i_14_)) {
		class_nb.a(i, i_14_, is, (byte) -99);
		return true;
	    }
	}
	if (i_15_ > -113)
	    ((eaa) this).s = 44;
	return false;
    }
    
    eaa(int i, String string, String string_16_, int i_17_, int i_18_,
	boolean bool, int i_19_, int i_20_) {
	((eaa) this).v = -1;
	((eaa) this).s = 12800;
	((eaa) this).C = 0;
	((eaa) this).F = 0;
	((eaa) this).H = 12800;
	((eaa) this).w = -1;
	((eaa) this).w = i_19_;
	((eaa) this).G = string_16_;
	((eaa) this).x = bool;
	((eaa) this).v = i_18_;
	((eaa) this).u = i_17_;
	((eaa) this).I = string;
	((eaa) this).t = i;
	if (((eaa) this).w == 255)
	    ((eaa) this).w = 0;
	((eaa) this).A = new Class_ae();
    }
}
