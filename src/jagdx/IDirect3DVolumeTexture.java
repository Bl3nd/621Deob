/* IDirect3DVolumeTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.am;

public class IDirect3DVolumeTexture extends IDirect3DBaseTexture {

    public final native boolean UnlockBox(int i);
    
    public IDirect3DVolumeTexture(am am) {
	super(am);
    }
    
    public final native int LockBox(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, PixelBuffer pixelbuffer);
}
