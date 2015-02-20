/* IDirect3DIndexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3DIndexBuffer extends IUnknown
{
    protected final long a() {
	return super.a();
    }
    
    public final native int Unlock();
    
    private final native boolean _Update(long l, int i, int i_0_);
    
    public final native int Lock(int i, int i_1_, int i_2_,
				 GeometryBuffer geometrybuffer);
    
    IDirect3DIndexBuffer(am var_am) {
	super(var_am);
    }
}
