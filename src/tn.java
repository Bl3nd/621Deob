/* tn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class tn extends OutputStream
{
    static int a;
    static int[] b = new int[8];
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int[] i;
    static vt[] j = new vt[50];
    static pl k;
    
    public final void write(int i) throws IOException {
	g++;
	throw new IOException();
    }
    
    static final void a(int i, byte i_0_) {
	pu.m.a(true, i);
	f++;
	if (i_0_ != -89)
	    a(109, (int) -86);
    }
    
    public static void a(int i) {
	b = null;
	if (i > -109)
	    tn.i = null;
	tn.i = null;
	k = null;
	j = null;
    }
    
    static final nn a(int i, BytesParser var_es) {
	d++;
	String string = var_es.readString((byte) 119);
	ct var_ct = dh.b((byte) 87)[var_es.readUnsignedByte(-9268)];
	rc var_rc = dg.b((int) 95)[var_es.readUnsignedByte(i - 10291)];
	int i_1_ = var_es.readShort2(75);
	if (i != 1023)
	    a((byte) 17);
	int i_2_ = var_es.readShort2(51);
	int i_3_ = var_es.readUnsignedByte(-9268);
	int i_4_ = var_es.readUnsignedByte(-9268);
	int i_5_ = var_es.readUnsignedByte(-9268);
	int i_6_ = var_es.readShort(13111);
	int i_7_ = var_es.readShort(13111);
	int i_8_ = var_es.readInt(73);
	int i_9_ = var_es.readInt(i - 907);
	int i_10_ = var_es.readInt(71);
	return new nn(string, var_ct, var_rc, i_1_, i_2_, i_3_, i_4_, i_5_,
		      i_6_, i_7_, i_8_, i_9_, i_10_);
    }
    
    static final void a(Interface var_kp, int i) {
	if (rr.g == ((Interface) var_kp).Ac)
	    la.q[((Interface) var_kp).Xb] = true;
	c++;
	if (i != 1023)
	    tn.i = null;
    }
    
    static final void a(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			int i_15_) {
	e++;
	if (i_14_ == i_15_)
	    id.a(i, i_11_, i_12_, i_14_, (byte) 37);
	else {
	    if (vaa.xb <= i - i_14_ && i + i_14_ <= jga.v
		&& i_11_ - i_15_ >= Class_md.h && i_11_ + i_15_ <= Class_db.o)
		sw.a(1641, i_15_, i_14_, i_12_, i_11_, i);
	    else
		je.a(i_12_, i_13_ ^ 0x4ae3, i, i_15_, i_14_, i_11_);
	    if (i_13_ != -19170)
		tn.i = null;
	}
    }
    
    static final int a(int i, int i_16_) {
	h++;
	if (i_16_ != 1023)
	    b = null;
	return i & 0x3ff;
    }
    
    static final void a(byte i) {
	dc.b = null;
	Class_b.e = null;
	if (i <= 23)
	    a((int) -44);
	a++;
    }
}
