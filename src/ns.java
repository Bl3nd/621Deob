/* ns - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class ns extends IncomingPackets
{
    static int n;
    NativeHeap o;
    static int p;
    static int q;
    static int r;
    static int[] s = new int[4096];
    static GameInPacket accessMaskGameInPacket;
    static pl u;
    static int v;
    
    static final String a(int i, boolean bool, boolean bool_0_, int i_1_) {
	p++;
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException("Invalid radix:" + i);
	if (!bool || i_1_ < 0)
	    return Integer.toString(i_1_, i);
	int i_2_ = 2;
	for (int i_3_ = i_1_ / i; i_3_ != 0; i_3_ /= i)
	    i_2_++;
	char[] cs = new char[i_2_];
	cs[0] = '+';
	if (bool_0_ != false)
	    a(-68L, -123);
	for (int i_4_ = i_2_ - 1; i_4_ > 0; i_4_--) {
	    int i_5_ = i_1_;
	    i_1_ /= i;
	    int i_6_ = i_5_ - i * i_1_;
	    if (i_6_ >= 10)
		cs[i_4_] = (char) (i_6_ + 87);
	    else
		cs[i_4_] = (char) (i_6_ + 48);
	}
	return new String(cs);
    }
    
    final void b(byte i) {
	((ns) this).o.deallocate();
	r++;
	if (i > -77)
	    s = null;
    }
    
    public static void a(int i) {
	u = null;
	s = null;
	int i_7_ = 53 / ((80 - i) / 45);
	accessMaskGameInPacket = null;
    }
    
    static final String bytesToUTF8(int i, byte[] is) {
	n++;
	int i_8_ = is.length;
	char[] cs = new char[i_8_];
	int i_9_ = 0;
	int i_10_ = 0;
	if (i != -129)
	    accessMaskGameInPacket = null;
	for (/**/; i_10_ < i_8_; i_10_++) {
	    int i_11_ = 0xff & is[i_10_];
	    if (i_11_ >= 128) {
		if (i_11_ >= 194) {
		    if (i_11_ < 224) {
			if (i_10_ + 1 >= i_8_)
			    throw new IllegalArgumentException
				      ("Incomplete two-byte sequence at end of UTF-8 encoding");
			int i_12_ = 0xff & is[++i_10_];
			if (i_12_ < 128 || i_12_ > 191)
			    throw new IllegalArgumentException
				      ("Illegal second byte in two-byte sequence in UTF-8 encoding");
			cs[i_9_++] = (char) hba.bitwiseArg1ORArg2(uca.a(-193, i_11_) << 6,
						  uca.a(-129, i_12_));
		    } else {
			if (i_11_ >= 240) {
			    if (i_11_ < 244)
				throw new IllegalArgumentException
					  ("Unsupported four-byte sequence in UTF-8 encoding");
			    throw new IllegalArgumentException
				      ("Illegal first sequence byte in UTF-8 encoding "
				       + i_11_);
			}
			if (i_10_ + 2 >= i_8_)
			    throw new IllegalArgumentException
				      ("Incomplete three-byte sequence at end of UTF-8 encoding");
			int i_13_ = is[++i_10_] & 0xff;
			if (i_13_ < 128 || i_13_ > 191)
			    throw new IllegalArgumentException
				      ("Illegal second byte in three-byte sequence in UTF-8 encoding");
			int i_14_ = is[++i_10_] & 0xff;
			if (i_14_ < 128 || i_14_ > 191)
			    throw new IllegalArgumentException
				      ("Illegal third byte in three-byte sequence in UTF-8 encoding");
			cs[i_9_++]
			    = (char) hba.bitwiseArg1ORArg2(uca.a(-129, i_14_),
					   hba.bitwiseArg1ORArg2(uca.a(i_11_, -225) << 12,
						 uca.a(i_13_ << 6, -8256)));
		    }
		} else
		    throw new IllegalArgumentException
			      ("Overlong encoding in UTF-8 encoding " + i_11_);
	    } else
		cs[i_9_++] = (char) i_11_;
	}
	return new String(cs, 0, i_9_);
    }
    
    static final void c(byte i) {
	lba.b(57, false);
	q++;
	if (i == -58) {
	    if (it.N >= 0 && it.N != 0) {
		ur.setTKVersion(it.N, true);
		it.N = -1;
	    }
	}
    }
    
    ns(int heap) {
	((ns) this).o = new NativeHeap(heap);
    }
    
    static final String a(long l, int i) {
	v++;
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	if (i < 37)
	    return null;
	int i_15_ = 0;
	for (long l_16_ = l; l_16_ != 0L; l_16_ /= 37L)
	    i_15_++;
	StringBuffer stringbuffer = new StringBuffer(i_15_);
	while (l != 0L) {
	    long l_17_ = l;
	    l /= 37L;
	    char c = Class_q.a[(int) (l_17_ - l * 37L)];
	    if (c == '_') {
		int i_18_ = stringbuffer.length() - 1;
		stringbuffer.setCharAt
		    (i_18_, Character.toUpperCase(stringbuffer.charAt(i_18_)));
		c = '\u00a0';
	    }
	    stringbuffer.append(c);
	}
	stringbuffer.reverse();
	stringbuffer.setCharAt(0,
			       Character.toUpperCase(stringbuffer.charAt(0)));
	return stringbuffer.toString();
    }
    
    static {
	for (int i = 0; i < 4096; i++)
	    s[i] = dk.a(i, false);
	accessMaskGameInPacket = new GameInPacket(105, 14);
    }
}
