/* sb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class sb extends as
{
    private SoftReference B;
    
    final boolean d(byte i) {
	int i_0_ = 93 / ((i + 70) / 55);
	return true;
    }
    
    final Object a(int i) {
	if (i != -9023)
	    return null;
	return B.get();
    }
    
    sb(gj var_gj, Object object, int i) {
	super(var_gj, i);
	B = new SoftReference(object);
    }
}
