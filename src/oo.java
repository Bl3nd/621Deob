/* oo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class oo
{
    private IDirect3DSurface a;
    private IDirect3DSwapChain b;
    private IDirect3DSurface c;
    
    final boolean a(byte i) {
	if (i != 14)
	    a = null;
	return null != b;
    }
    
    final void b(byte i) {
	int i_0_ = 78 % ((i - 36) / 36);
	if (null != c) {
	    c.b(6168);
	    c = null;
	}
	if (a != null) {
	    a.b(6168);
	    a = null;
	}
	if (b != null) {
	    b.b(6168);
	    b = null;
	}
    }
    
    final void a(IDirect3DSurface idirect3dsurface,
		 IDirect3DSwapChain idirect3dswapchain, byte i) {
	b = idirect3dswapchain;
	int i_1_ = 28 / ((i + 15) / 47);
	a = idirect3dsurface;
	c = b.a(0, 0);
    }
    
    final int a(boolean bool, int i) {
	if (bool != true)
	    b((byte) 18);
	return b.Present(i);
    }
    
    oo(IDirect3DSwapChain idirect3dswapchain,
       IDirect3DSurface idirect3dsurface) {
	a(idirect3dsurface, idirect3dswapchain, (byte) 112);
    }
}
