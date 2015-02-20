/* fr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class fr extends fm
{
    static int j;
    static int k;
    static int l;
    static int m;
    static int n;
    static int o;
    static GameOutPacket p = new GameOutPacket(19, 8);
    static int q;
    private gea r;
    static int s;
    static sfa t = new sfa();
    private ak u;
    static int v;
    private Socket w;
    static cv x;
    static GameOutPacket y;
    static int z = 1;
    static int A;
    
    static final int a(int i, int i_0_, int i_1_) {
	n++;
	int i_2_
	    = (bh.a(i + 91923, 4, i_0_ + 45365, (byte) -115) - 128
	       + (bh.a(i + 37821, 2, i_0_ + 10294, (byte) -128) - 128 >> 1)
	       + (bh.a(i, 1, i_0_, (byte) -102) - 128 >> 2));
	i_2_ = (int) ((double) i_2_ * 0.3) + 35;
	if (i_2_ < 10)
	    i_2_ = 10;
	else if (i_2_ > 60)
	    i_2_ = 60;
	if (i_1_ != 45365)
	    return 16;
	return i_2_;
    }
    
    final void a(int i) {
	if (i != 0)
	    z = 6;
	q++;
	u.a((byte) 51);
	r.c(i ^ 0x28d6);
    }
    
    final int a(byte i, int i_3_, byte[] is, int i_4_) throws IOException {
	s++;
	if (i <= 39)
	    finalize();
	return u.a(49, i_4_, is, i_3_);
    }
    
    final void d(int i) {
	try {
	    w.close();
	    if (i != 0)
		r = null;
	} catch (IOException ioexception) {
	    /* empty */
	}
	l++;
	u.a(17575);
	r.b(i - 111);
    }
    
    static final void a(int i, byte i_5_, int i_6_, Class_mc class_mc) {
	Class_qb.i[i][i_6_] = class_mc;
	int i_7_ = -22 / ((30 - i_5_) / 34);
	o++;
    }
    
    final boolean a(int i, byte i_8_) throws IOException {
	int i_9_ = 125 % ((i_8_ - 58) / 54);
	k++;
	return u.a(i, (byte) -105);
    }
    
    public static void a(byte i) {
	t = null;
	x = null;
	if (i >= -24)
	    A = -75;
	y = null;
	p = null;
    }
    
    protected final void finalize() {
	d(0);
	j++;
    }
    
    final void a(byte[] is, int i, int i_10_, byte i_11_) throws IOException {
	r.a(i, 0, is, i_10_);
	m++;
	if (i_11_ < 112)
	    a((byte) 89);
    }
    
    fr(Socket socket, int i) throws IOException {
	w = socket;
	w.setSoTimeout(30000);
	w.setTcpNoDelay(true);
	u = new ak(w.getInputStream(), i);
	r = new gea(w.getOutputStream(), i);
    }
    
    static {
	y = new GameOutPacket(38, 7);
    }
}
