/* Class_k - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class_k extends mca
{
    private int H;
    private int I = 1;
    static int J;
    static la K;
    static int L;
    static int M;
    static int N;
    private int O;
    static int P = 0;
    static int Q = -1;
    static int R;
    
    static final void c(byte i) {
	R++;
	FileOnDisk var_cu = null;
	if (i >= -50)
	    b(69, -108);
	try {
	    vfa var_vfa = nda.signlink.a("2", (byte) -28, true);
	    while (var_vfa.f == 0)
		Connection.a(-28448, 1L);
	    if (var_vfa.f == 1) {
		var_cu = (FileOnDisk) var_vfa.hostName;
		byte[] is = new byte[(int) var_cu.getLength((int) 0)];
		int i_0_;
		for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
		    i_0_ = var_cu.read(i_1_, is, is.length - i_1_, 3);
		    if ((i_0_ ^ 0xffffffff) == 0)
			throw new IOException("EOF");
		}
		Class_lc.a((byte) -126, new BytesParser(is));
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (var_cu == null)
		    break;
		var_cu.close((byte) -127);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    final int[] a(int i, int j) {
	L++;
	int[] is = ((mca) this).s.a(j, true);
	int i_3_ = -122 / ((i - 81) / 36);
	if (((oca) ((mca) this).s).o) {
	    int i_4_ = 0;
	    for (/**/; fr.v > i_4_; i_4_++) {
		int i_5_ = js.p[i_4_];
		int i_6_ = Class_i.i[j];
		int i_7_ = I * i_5_ >> 12;
		int i_8_ = i_6_ * O >> 12;
		int i_9_ = I * (i_5_ % (4096 / I));
		int i_10_ = i_6_ % (4096 / O) * O;
		if (i_10_ < H) {
		    for (i_7_ -= i_8_; i_7_ < 0; i_7_ += 4) {
			/* empty */
		    }
		    for (/**/; i_7_ > 3; i_7_ -= 4) {
			/* empty */
		    }
		    if (i_7_ != 1) {
			is[i_4_] = 0;
			continue;
		    }
		    if (i_9_ < H) {
			is[i_4_] = 0;
			continue;
		    }
		}
		if (H > i_9_) {
		    for (i_7_ -= i_8_; i_7_ < 0; i_7_ += 4) {
			/* empty */
		    }
		    for (/**/; i_7_ > 3; i_7_ -= 4) {
			/* empty */
		    }
		    if (i_7_ > 0) {
			is[i_4_] = 0;
			continue;
		    }
		}
		is[i_4_] = 4096;
	    }
	}
	return is;
    }
    
    static final boolean b(int i, int i_11_) {
	if (i_11_ < 82)
	    b(-87, -28);
	M++;
	if (i != 7 && i != 9)
	    return false;
	return true;
    }
    
    public static void i(int i) {
	K = null;
	int i_12_ = 108 / ((67 - i) / 46);
    }
    
    public Class_k() {
	super(0, true);
	H = 204;
	O = 1;
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	if (i == 1) {
	    int i_14_ = j;
	while_74_:
	    do {
		do {
		    if (i_14_ != 0) {
			if (i_14_ != 1) {
			    if (i_14_ == 2)
				break;
			    break while_74_;
			}
		    } else {
			I = bytesParser.readUnsignedByte(-9268);
			break while_74_;
		    }
		    O = bytesParser.readUnsignedByte(i ^ ~0x2432);
		    break while_74_;
		} while (false);
		H = bytesParser.readShort(13111);
	    } while (false);
	    J++;
	}
    }
}
