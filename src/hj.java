/* hj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class hj extends ua
{
    ar f;
    static int g;
    static Class_ae h = new Class_ae();
    static int i;
    static GameOutPacket j = new GameOutPacket(22, 7);
    
    public static void a(byte i) {
	int i_0_ = -89 / ((i + 44) / 51);
	h = null;
	j = null;
    }
    
    static final boolean a(int i, byte i_1_, int i_2_) {
	if (i_1_ < 10)
	    return false;
	hj.i++;
	if (!((i_2_ & 0x70000) != 0 | Class_db.a(i, i_2_, false))
	    && !ih.a(i_2_, -1, i))
	    return false;
	return true;
    }
    
    hj(qj var_qj, int i, int i_3_, byte[] is) {
	((hj) this).f = pga.a(i_3_, false, var_qj, 97, is, i, 6406, 6406);
	((hj) this).f.a(false, (byte) -124, false);
    }
}
