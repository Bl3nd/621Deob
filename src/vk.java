/* vk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vk extends nfa
{
    static int g;
    static int[][] h = { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 },
			 { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 },
			 { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 },
			 { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 },
			 { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
    static wda[] i;
    static int j;
    static int k;
    
    static final boolean a(int i, int i_0_, int i_1_, int i_2_) {
	j++;
	if (!il.k)
	    return false;
	if (io.X < 100)
	    return false;
	int i_3_ = ega.k[i][i_0_][i_2_];
	if (-dca.S == i_3_)
	    return false;
	if (i_3_ == dca.S)
	    return true;
	if (wr.D == Class_q.b)
	    return false;
	int i_4_ = i_0_ << Class_fb.a;
	int i_5_ = i_2_ << Class_fb.a;
	if (!cda.a(Class_q.b[i].a(i_2_ + 1, (byte) 51, i_0_),
		   Class_q.b[i].a(i_2_ + 1, (byte) 51, i_0_ + 1),
		   i_5_ + bea.o - 1, 26403, i_5_ + 1, i_5_ - (-bea.o + 1),
		   bea.o - 1 + i_4_, Class_q.b[i].a(i_2_, (byte) 51, i_0_),
		   i_4_ + 1, i_4_ - i_1_)
	    || !cda.a(Class_q.b[i].a(i_2_ + 1, (byte) 51, i_0_ + 1),
		      Class_q.b[i].a(i_2_, (byte) 51, i_0_ + 1),
		      bea.o + (i_5_ - 1), 26403, i_5_ + 1, i_5_ + 1,
		      bea.o + i_4_ - 1, Class_q.b[i].a(i_2_, (byte) 51, i_0_),
		      bea.o - 1 + i_4_, i_4_ + 1)) {
	    ega.k[i][i_0_][i_2_] = -dca.S;
	    return false;
	}
	Class_j.j++;
	ega.k[i][i_0_][i_2_] = dca.S;
	return true;
    }
    
    static final boolean a(ww var_ww, byte i) {
	g++;
	if (var_ww == null)
	    return false;
	if (!((ww) var_ww).a)
	    return false;
	if (!var_ww.a(kca.h, false))
	    return false;
	if (i >= -42)
	    vk.i = null;
	if (dd.I.a(-32748, (long) ((ww) var_ww).G) != null)
	    return false;
	if (SpecialOutPacket.h.a(-32748, (long) ((ww) var_ww).C) != null)
	    return false;
	return true;
    }
    
    static final sl a(byte i, BytesParser var_es) {
	k++;
	int i_6_ = 19 / ((i - 54) / 55);
	return new sl(var_es.readShort2(116), var_es.readShort2(32), var_es.readShort2(82), var_es.readShort2(103),
		      var_es.readShort2(117), var_es.readShort2(48), var_es.readShort2(42), var_es.readShort2(36),
		      var_es.readTribyte(-1), var_es.readUnsignedByte(-9268));
    }
    
    public static void b(int i) {
	h = null;
	vk.i = null;
	if (i != -1)
	    a(-5, -98, -110, -35);
    }
}
