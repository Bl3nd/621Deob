/* nf - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class nf extends ft
{
    static int y;
    static BigInteger publicRSAKey = new BigInteger("10001", 16);
    static int A;
    int B;
    static int C;
    static int D;
    BytesParser E;
    byte F;
    static int G = 0;
    static int H;
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
	if (vaa.xb > i_5_ || jga.v < i || Class_md.h > i_0_
	    || i_2_ > Class_db.o) {
	    if (i_4_ == 1)
		nj.a(i_5_, i_1_, -56, i_0_, i, i_2_);
	    else
		sda.a(i_5_, i, i_1_, i_2_, i_4_, i_0_, true);
	} else if (i_4_ == 1)
	    iaa.a(i_0_, i_5_, i_1_, i_2_, i, (byte) -63);
	else
	    gca.a(i_1_, i_0_, false, i_5_, i, i_4_, i_2_);
	if (i_3_ == 376)
	    D++;
    }
    
    final int b(byte i) {
	if (i != -69)
	    ((nf) this).B = 43;
	y++;
	if (((nf) this).E == null)
	    return 0;
	return (((BytesParser) ((nf) this).E).pos * 100
		/ (((BytesParser) ((nf) this).E).bytes.length - ((nf) this).F));
    }
    
    public static void a(int i) {
	if (i == 11216)
	    publicRSAKey = null;
    }
    
    static final boolean a(int i, int i_6_, int i_7_) {
	A++;
	if (i != 1)
	    return true;
	return eba.a((byte) 75, i_7_, i_6_) & cf.a(i_6_, (byte) -124, i_7_);
    }
    
    final byte[] d(byte i) {
	if (i <= 104)
	    return null;
	C++;
	if (((ft) this).x || (((BytesParser) ((nf) this).E).bytes.length - ((nf) this).F
			      > ((BytesParser) ((nf) this).E).pos))
	    throw new RuntimeException();
	return ((BytesParser) ((nf) this).E).bytes;
    }
}
