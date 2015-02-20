/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import java.awt.Canvas;

public class D3DPRESENT_PARAMETERS
{
    public int FullScreen_RefreshRateInHz;
    public int BackBufferHeight;
    public boolean Windowed;
    public int PresentationInterval;
    public int Flags;
    public int AutoDepthStencilFormat = 0;
    public int MultiSampleQuality;
    public int BackBufferWidth;
    public int MultiSampleType;
    public boolean EnableAutoDepthStencil;
    public Canvas DeviceWindow;
    public int SwapEffect;
    public int BackBufferCount;
    public int BackBufferFormat;
    
    public D3DPRESENT_PARAMETERS(Canvas canvas) {
	PresentationInterval = 0;
	MultiSampleQuality = 0;
	BackBufferHeight = 0;
	MultiSampleType = 0;
	SwapEffect = 1;
	BackBufferCount = 0;
	BackBufferWidth = 0;
	BackBufferFormat = 0;
	DeviceWindow = canvas;
    }
}
