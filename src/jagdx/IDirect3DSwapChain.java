/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3DSwapChain extends IUnknown
{
    private am b;
    
    private final native int _GetBackBuffer(int i, int i_0_,
					    IDirect3DSurface idirect3dsurface);
    
    public final IDirect3DSurface a(int i, int i_1_) {
	IDirect3DSurface idirect3dsurface = new IDirect3DSurface(b);
	int i_2_ = _GetBackBuffer(i, i_1_, idirect3dsurface);
	if (qr.a(true, i_2_))
	    throw new bs(String.valueOf(i_2_));
	return idirect3dsurface;
    }
    
    IDirect3DSwapChain(am var_am) {
	super(var_am);
	b = var_am;
    }
    
    public final native int Present(int i);
}
