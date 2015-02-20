/* lj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class lj extends sp
{
    private SoftReference x;
    
    final Object i(int i) {
	if (i != -1)
	    i(-72);
	return x.get();
    }
    
    final boolean a(int i) {
	if (i >= -50)
	    x = null;
	return true;
    }
    
    lj(Object object, int i) {
	super(i);
	x = new SoftReference(object);
    }
}
