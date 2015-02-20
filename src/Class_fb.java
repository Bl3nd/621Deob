/* Class_fb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class_fb
{
    static int a;
    static int b;
    static float c;
    static int d;
    static GameInPacket incomingPacket71 = new GameInPacket(71, 8);
    private int f;
    static int g;
    static int h;
    static byte[][] i;
    static on[] j = new on[8];
    
    final void a(int i, int i_0_) {
	g++;
	OpenGL.glNewList(f + i, 4864);
	if (i_0_ != 0)
	    a((int) 119);
    }
    
    final void a(byte i) {
	OpenGL.glEndList();
	b++;
	if (i < 31)
	    a(53, 2);
    }
    
    final void a(int i, char c) {
	d++;
	OpenGL.glCallList(f + c);
	if (i != -29240)
	    Class_fb.i = null;
    }
    
    static final int a(int i) {
	int i_1_ = -1;
	for (int i_2_ = 0; i_2_ < ko.a - 1; i_2_++) {
	    if (i < tg.M[i_2_] + fm.f[i_2_]) {
		i_1_ = i_2_;
		break;
	    }
	}
	if (i_1_ == -1)
	    i_1_ = ko.a - 1;
	return i_1_;
    }
    
    static final hj a(int i, int i_3_, qj var_qj, byte i_4_, int[] is,
		      int[] is_5_) {
	if (i_4_ != 96)
	    b(58);
	h++;
	byte[] is_6_ = new byte[i_3_ * i];
	for (int i_7_ = 0; i_7_ < i_3_; i_7_++) {
	    int i_8_ = is_5_[i_7_] + i * i_7_;
	    for (int i_9_ = 0; is[i_7_] > i_9_; i_9_++)
		is_6_[i_8_++] = (byte) -1;
	}
	return new hj(var_qj, i, i_3_, is_6_);
    }
    
    static final void b(int i) {
	uaa.c = i;
	for (int i_10_ = 0; i_10_ < sv.T; i_10_++) {
	    for (int i_11_ = 0; i_11_ < nf.H; i_11_++) {
		if (ol.p[i][i_10_][i_11_] == null)
		    ol.p[i][i_10_][i_11_] = new vf(i);
	    }
	}
    }
    
    Class_fb(qj var_qj, int i) {
	f = OpenGL.glGenLists(i);
    }
    
    public static void c(int i) {
	Class_fb.i = null;
	incomingPacket71 = null;
	j = null;
	if (i != 1)
	    a = -7;
    }
    
    static {
	i = new byte[1000][];
    }
}
