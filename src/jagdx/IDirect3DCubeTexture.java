/* IDirect3DCubeTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.am;

public class IDirect3DCubeTexture extends IDirect3DBaseTexture {

    public final native boolean UnlockRect(int i, int j);
    
    public IDirect3DCubeTexture(am am) {
	super(am);
    }
    
    public final native int LockRect(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, PixelBuffer pixelbuffer);
}
