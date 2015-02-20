/* IDirect3D - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import java.awt.Canvas;

import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3D extends IUnknown
{
    private am b;
    
    public final D3DADAPTER_IDENTIFIER a(int i, int i_0_) {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	int i_1_ = _GetAdapterIdentifier(i, i_0_, d3dadapter_identifier);
	if (qr.a(true, i_1_))
	    throw new bs(String.valueOf(i_1_));
	return d3dadapter_identifier;
    }
    
    public final native int CheckDeviceFormat(int i, int i_2_, int i_3_,
					      int i_4_, int i_5_, int i_6_);
    
    private final native int _GetDeviceCaps(int i, int i_7_, D3DCAPS d3dcaps);
    
    private final native int _GetAdapterDisplayMode
	(int i, D3DDISPLAYMODE d3ddisplaymode);
    
    public final native int CheckDeviceMultiSampleType
	(int i, int i_8_, int i_9_, boolean bool, int i_10_);
    
    public final native int CheckDepthStencilMatch(int i, int i_11_, int i_12_,
						   int i_13_, int i_14_);
    
    private static final native int _Direct3DCreate(int i,
						    IDirect3D idirect3d);
    
    public final native int CheckDeviceType(int i, int i_15_, int i_16_,
					    int i_17_, boolean bool);
    
    private final native int _GetAdapterIdentifier
	(int i, int i_18_, D3DADAPTER_IDENTIFIER d3dadapter_identifier);
    
    public final int a(int i, D3DDISPLAYMODE d3ddisplaymode) {
	return _GetAdapterDisplayMode(i, d3ddisplaymode);
    }
    
    private final native int _CreateDevice
	(int i, int i_19_, Canvas canvas, int i_20_,
	 D3DPRESENT_PARAMETERS d3dpresent_parameters,
	 IDirect3DDevice idirect3ddevice);
    
    private IDirect3D(am var_am) {
	super(var_am);
	b = var_am;
    }
    
    public final D3DCAPS b(int i, int i_21_) {
	D3DCAPS d3dcaps = new D3DCAPS();
	int i_22_ = _GetDeviceCaps(i, i_21_, d3dcaps);
	if (qr.a(true, i_22_))
	    throw new bs(String.valueOf(i_22_));
	return d3dcaps;
    }
    
    public final IDirect3DDevice a
	(int i, int i_23_, Canvas canvas, int i_24_,
	 D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	IDirect3DDevice idirect3ddevice = new IDirect3DDevice(b);
	int i_25_ = _CreateDevice(i, i_23_, canvas, i_24_, d3dpresent_parameters, idirect3ddevice);
	if (qr.a(true, i_25_))
	    throw new bs(String.valueOf(i_25_));
	return idirect3ddevice;
    }
    
    public static final IDirect3D a(int i, am var_am) {
	IDirect3D idirect3d = new IDirect3D(var_am);
	int i_26_ = _Direct3DCreate(i, idirect3d);
	if (qr.a(true, i_26_))
	    throw new bs(String.valueOf(i_26_));
	return idirect3d;
    }
}
