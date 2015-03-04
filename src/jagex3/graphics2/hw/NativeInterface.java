/* NativeInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.graphics2.hw;

public class NativeInterface {

    long peer;

    public final native void copyNormals
            (short[] is, short[] is_0_, short[] is_1_, byte[] is_2_, float f,
             float f_3_, int i, int i_4_, int i_5_, long l);

    public final native void copyLighting
            (short[] is, byte[] is_6_, short[] is_7_, short[] is_8_, short[] is_9_,
             short[] is_10_, byte[] is_11_, int i, int i_12_, short[] is_13_,
             int i_14_, int i_15_, int i_16_, long l);

    public NativeInterface(int i, int i_17_) {
        init(i, i_17_);
    }

    public final native void initTextureMetrics(int i, byte i_18_, byte i_19_);

    public final native void release();

    public final native void copyTexCoords(float[] fs, float[] fs_20_, int i,
                                           int i_21_, int i_22_, long l);

    public final native void copyPositions(int[] is, int[] is_23_,
                                           int[] is_24_, short[] is_25_, int i,
                                           int i_26_, int i_27_, long l);

    public final native void setAmbient(float f);

    public final native void setSunDirection(float f, float f_28_,
                                             float f_29_);

    public final native void copyColours
            (short[] is, byte[] is_30_, short[] is_31_, int i, short[] is_32_,
             int i_33_, int i_34_, int i_35_, long l);

    public final native void setSunColour(float f, float f_36_, float f_37_,
                                          float f_38_, float f_39_);

    private final native void init(int i, int i_40_);
}
