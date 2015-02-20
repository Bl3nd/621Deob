/* uf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class uf
{
    static int a;
    short[] b;
    byte[] c;
    short[] d;
    static BigInteger rsaModulus
	= (new BigInteger
	   ("a9ef8d9b9a57ae01e455deaa04bf8b2cec7bb5fe55b0f9613440ce793c1e1a35573cc8634a5a8748065e0fa72700b18d669bdb958ed4dd985c14b675f4e98c8b",
	    16));
    short[] f;
    static int g;
    static int h = 1;
    
    public static void a(int i) {
	rsaModulus = null;
	int i_0_ = 89 % ((i + 4) / 33);
    }
    
    static final byte[] a(String string, int i) {
	a++;
	int i_1_ = string.length();
	if (i != 16)
	    return null;
	if (i_1_ == 0)
	    return new byte[0];
	int i_2_ = i_1_ + 3 & ~0x3;
	int i_3_ = 3 * (i_2_ / 4);
	if (i_2_ - 2 >= i_1_
	    || (jb.a(-1, string.charAt(i_2_ - 2)) ^ 0xffffffff) == 0)
	    i_3_ -= 2;
	else if (i_1_ <= i_2_ - 1
		 || jb.a(i ^ ~0x10, string.charAt(i_2_ - 1)) == -1)
	    i_3_--;
	byte[] is = new byte[i_3_];
	eq.a(i - 17, string, 0, is);
	return is;
    }
}
