/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3DSurface extends IUnknown {

    public final native boolean UnlockRect();
    
    public final native int LockRect(int i, int i_0_, int i_1_, int i_2_, int i_3_, PixelBuffer pixelbuffer);
    
    public IDirect3DSurface(am am) {
	super(am);
    }
}
