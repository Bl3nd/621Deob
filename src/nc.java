/* nc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;

abstract class nc extends Node
{
    int[] k;
    static int l;
    static int m = 0;
    static int n = 0;
    static int o;
    int p;
    int q;
    
    abstract void a(int i, Canvas canvas);
    
    static final int a(int i, int i_0_, int i_1_, int i_2_) {
	l++;
	if (i != 217)
	    return -14;
	if (i_1_ <= 243) {
	    if (i_1_ > 217)
		i_2_ >>= 3;
	    else if (i_1_ > 192)
		i_2_ >>= 2;
	    else if (i_1_ > 179)
		i_2_ >>= 1;
	} else
	    i_2_ >>= 4;
	return (i_1_ >> 1) + ((i_2_ >> 5 << 7) + ((i_0_ >> 2 & 0x3f) << 10));
    }
    
    static final mba a(Throwable throwable, String string) {
	o++;
	mba var_mba;
	if (!(throwable instanceof mba))
	    var_mba = new mba(throwable, string);
	else {
	    var_mba = (mba) throwable;
	    ((mba) var_mba).d += ' ' + (String) string;
	}
	return var_mba;
    }
    
    abstract void a(int i, int i_3_, Graphics graphics, byte i_4_);
    
    abstract void a(int i, int i_5_, int i_6_, Graphics graphics, byte i_7_,
		    int i_8_);
    
    public nc() {
	/* empty */
    }
}
