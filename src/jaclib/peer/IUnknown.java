/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer
{
    public final native long AddRef();
    
    public final long b(int i) {
	if (i != 6168)
	    AddRef();
	return super.a();
    }
    
    protected IUnknown(am var_am) {
	reference = new IUnknownReference(this, var_am);
    }
}
