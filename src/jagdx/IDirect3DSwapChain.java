/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3DSwapChain extends IUnknown {

    private am am;

    private native int _GetBackBuffer(int i, int i_0_, IDirect3DSurface idirect3dsurface);

    public final IDirect3DSurface a(int i, int i_1_) {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(am);
        int backBuffer = _GetBackBuffer(i, i_1_, idirect3dsurface);
        if (qr.a(true, backBuffer)) {
            throw new bs(String.valueOf(backBuffer));
        }
        return idirect3dsurface;
    }

    public IDirect3DSwapChain(am am1) {
        super(am1);
        am = am1;
    }

    public final native int Present(int i);
}
