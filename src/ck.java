/* ck - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ck extends mca
{
    static int H;
    static GameOutPacket I = new GameOutPacket(72, 15);
    static ki J = new ki();
    static short[][][] K;
    static int currentGameInPacketSize = 0;
    
    public ck() {
	super(0, true);
    }
    
    final int[] a(int i, int j) {
	H++;
	int i_1_ = -47 % ((81 - i) / 36);
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o)
	    co.a(is, 0, fr.v, Class_i.i[j]);
	return is;
    }
    
    public static void i(int i) {
	K = null;
	J = null;
	if (i != 0)
	    i(-60);
	I = null;
    }
    
    static final boolean a(ha var_ha, int i, int i_2_, int i_3_,
			   boolean[] bools) {
	boolean bool = false;
	if (Class_q.b != wr.D) {
	    int i_4_ = vr.b[i].a(i_3_, i_2_, true);
	    int i_5_ = 0;
	    for (/**/; i_5_ <= i; i_5_++) {
		Class_i class_i = vr.b[i_5_];
		if (class_i != null) {
		    int i_6_ = i_4_ - class_i.a(i_3_, i_2_, true);
		    if (bools != null) {
			bools[i_5_]
			    = class_i.a(var_ha, i_2_, i_6_, i_3_, 0, false);
			if (!bools[i_5_])
			    continue;
		    }
		    class_i.E(var_ha, i_2_, i_6_, i_3_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
}
