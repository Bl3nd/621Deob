/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.am;
import jaclib.peer.pa;

public class D3DLIGHT extends pa {

    public D3DLIGHT(am am) {
        super(am);
        Init();
    }

    public final native void SetSpotParams(float f, float f_0_, float f_1_);

    public final native void SetAttenuation(float f, float f_2_, float f_3_);

    public final native void SetType(int i);

    public final native void SetSpecular(float f, float f_4_, float f_5_,
                                         float f_6_);

    public final native void SetRange(float f);

    public final native void SetDiffuse(float f, float f_7_, float f_8_,
                                        float f_9_);

    private final native void Init();

    public final native void SetDirection(float f, float f_10_, float f_11_);

    public final native void SetAmbient(float f, float f_12_, float f_13_, float f_14_);

    public final native void SetPosition(float f, float f_15_, float f_16_);
}
