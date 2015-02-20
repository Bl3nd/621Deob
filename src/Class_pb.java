/* Class_pb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_pb
{
    static int a;
    static int b;
    int c;
    static int d;
    static int e;
    int f;
    int g;
    static baa h = new baa(9, 0, 4, 1);
    static int i = 0;
    
    abstract void a(int i, byte i_0_, int i_1_);
    
    static final void a(int i, byte i_2_) {
	b++;
	qba var_qba = ofa.a(7, i, (byte) 108);
	if (i_2_ != 75)
	    h = null;
	var_qba.i(0);
    }
    
    static final void a(Node class_d, Node class_d_3_, int i) {
	a++;
	if (((Node) class_d).next != null)
	    class_d.unlink(i ^ ~0x48);
	((Node) class_d).next = ((Node) class_d_3_).next;
	((Node) class_d).previous = class_d_3_;
	((Node) ((Node) class_d).next).previous = class_d;
	((Node) ((Node) class_d).previous).next = class_d;
	if (i != 4)
	    b(82, (byte) 74);
    }
    
    abstract void a(int i, int i_4_, int i_5_);
    
    public static void a(byte i) {
	h = null;
	if (i != -70)
	    a((byte) 46);
    }
    
    abstract void b(int i, int i_6_, int i_7_);
    
    Class_pb(int i, int i_8_, int i_9_) {
	((Class_pb) this).g = i_9_;
	((Class_pb) this).f = i;
	((Class_pb) this).c = i_8_;
    }
    
    static final void b(int i, byte i_10_) {
	e++;
	if (Interactable.e == null)
	    Interactable.e = new byte[4][Class_hc.e][bw.v];
	if (i != 4319)
	    Class_pb.i = -45;
	for (int i_11_ = 0; i_11_ < 4; i_11_++) {
	    for (int i_12_ = 0; Class_hc.e > i_12_; i_12_++) {
		for (int i_13_ = 0; bw.v > i_13_; i_13_++)
		    Interactable.e[i_11_][i_12_][i_13_] = i_10_;
	    }
	}
    }
    
    static final void a(int i, int i_14_) {
	wq.o = -1;
	d++;
	nda.g = i;
	wh.J = i_14_;
	sh.h = 100;
    }
}
