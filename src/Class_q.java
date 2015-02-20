/* Class_q - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

abstract class Class_q
{
    static char[] a
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    static Class_i[] b;
    static int c;
    static boolean[] d = new boolean[8];
    static boolean e;
    static int f;
    static String g;
    static int h;
    
    abstract void na(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);
    
    abstract Class_q a();
    
    static final boolean a(int i, int i_5_, int i_6_) {
	f++;
	if (i_5_ != 116)
	    a(-62);
	return (i_6_ & 0x220) == 544 | (0x18 & i_6_) != 0;
    }
    
    abstract void oa(int i);
    
    abstract void YA(int[] is);
    
    public static void a(int i) {
	if (i >= -120)
	    a(-83, -20, 112);
	d = null;
	a = null;
	b = null;
	g = null;
    }
    
    abstract void J(int i);
    
    static final Class_vb b(int i) {
	h++;
	if (kca.n == null || Class_fc.d == null)
	    return null;
	for (Class_vb class_vb = (Class_vb) Class_fc.d.a(-15840);
	     class_vb != null; class_vb = (Class_vb) Class_fc.d.a(-15840)) {
	    ww var_ww = kca.a.a(((Class_vb) class_vb).o, (int) -127);
	    if (var_ww != null && ((ww) var_ww).h && var_ww.a(kca.h, false))
		return class_vb;
	}
	if (i > -90)
	    a((Signlink) null, (byte) -45, null);
	return null;
    }
    
    public Class_q() {
	/* empty */
    }
    
    abstract void NA(int i, int i_7_, int i_8_);
    
    abstract void M(Class_q class_q_9_);
    
    static final void a(Signlink var_rj, byte i, Object object) {
	c++;
	if (((Signlink) var_rj).eventQueue != null) {
	    if (i >= -48)
		d = null;
	    for (int i_10_ = 0;
		 i_10_ < 50 && ((Signlink) var_rj).eventQueue.peekEvent() != null; i_10_++)
		Connection.a(-28448, 1L);
	    do {
		try {
		    if (object == null)
			break;
		    ((Signlink) var_rj).eventQueue.postEvent(new ActionEvent(object, 1001,
							      "dummy"));
		} catch (Exception exception) {
		    break;
		}
		break;
	    } while (false);
	}
    }
    
    abstract void Y();
    
    abstract void w(int i);
    
    abstract void U(int xLoc, int i, int yLoc);
    
    abstract void AA(int i);
    
    abstract void a(int i, int i_13_, int i_14_, int[] is);
    
    abstract void wa(int i, int i_15_, int i_16_, int[] is);
    
    abstract void ZA(int i);
    
    abstract void o(int orientation);
}
