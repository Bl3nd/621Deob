/* IDirect3DTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.am;

public class IDirect3DTexture extends IDirect3DBaseTexture {

    public IDirect3DTexture(am am) {
	super(am);
    }
    
    public final native int LockRect(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, PixelBuffer pixelbuffer);
    
    public final native boolean UnlockRect(int i);
}
