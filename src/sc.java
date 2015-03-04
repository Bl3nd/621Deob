/* sc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sc
{
    int a = rca.a(0);
    static int b;
    String c;
    String d;
    String e;
    int f;
    String g;
    static int h;
    static GameOutPacket outgoingPacket67 = new GameOutPacket(67, -1);
    String j;
    int k;
    int l;
    int m;
    
    static final void a(long[] ls, int i, Object[] objects) {
	fda.a(i, ls.length - 1, ls, objects, (byte) 35);
	b++;
    }
    
    public static void a(int i) {
	sc.outgoingPacket67 = null;
	if (i != -16044)
	    a(-56);
    }
    
    final void a(String string, String string_0_, String string_1_,
		 String string_2_, int i, int i_3_, int i_4_, boolean bool,
		 String string_5_) {
	((sc) this).a = rca.a(0);
	h++;
	((sc) this).k = i;
	((sc) this).f = i_4_;
	((sc) this).l = pm.currentTimedTicks;
	((sc) this).d = string;
	((sc) this).e = string_5_;
	((sc) this).g = string_0_;
	((sc) this).c = string_2_;
	((sc) this).m = i_3_;
	((sc) this).j = string_1_;
	if (bool != false)
	    a(-30);
    }
    
    sc(int i, int i_6_, String string, String string_7_, String string_8_,
       String string_9_, int i_10_, String string_11_) {
	((sc) this).f = i_10_;
	((sc) this).j = string;
	((sc) this).m = i_6_;
	((sc) this).k = i;
	((sc) this).c = string_7_;
	((sc) this).g = string_11_;
	((sc) this).l = pm.currentTimedTicks;
	((sc) this).e = string_8_;
	((sc) this).d = string_9_;
    }
}
