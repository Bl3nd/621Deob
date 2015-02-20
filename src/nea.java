/* nea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class nea extends ko
{
    private ByteBuffer i;
    
    final void a(byte[] is, boolean bool) {
	i = ByteBuffer.allocateDirect(is.length);
	if (bool != true)
	    i = null;
	i.position(0);
	i.put(is);
    }
    
    final byte[] a(byte i) {
	byte[] is = new byte[this.i.capacity()];
	this.i.position(0);
	this.i.get(is);
	int i_0_ = -115 % ((-62 - i) / 54);
	return is;
    }
    
    final byte[] a(byte i, int i_1_, int i_2_) {
	this.i.position(i_2_);
	byte[] is = new byte[i_1_];
	this.i.get(is, 0, i_1_);
	if (i != -112)
	    this.i = null;
	return is;
    }
}
