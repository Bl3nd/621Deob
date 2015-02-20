/* gca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class gca extends Node
{
    String k;
    static String l = "";
    static float m;
    static int n;
    
    static final void a(int i, int i_0_, boolean bool, int i_1_, int i_2_,
			int i_3_, int i_4_) {
	n++;
	int i_5_ = i_0_ + i_3_;
	int i_6_ = i_4_ - i_3_;
	for (int i_7_ = i_0_; i_7_ < i_5_; i_7_++)
	    kg.a(i_1_, wh.O[i_7_], i, i_2_, -119);
	for (int i_8_ = i_4_; i_8_ > i_6_; i_8_--)
	    kg.a(i_1_, wh.O[i_8_], i, i_2_, 42);
	int i_9_ = i_2_ - i_3_;
	if (bool == false) {
	    int i_10_ = i_3_ + i_1_;
	    for (int i_11_ = i_5_; i_11_ <= i_6_; i_11_++) {
		int[] is = wh.O[i_11_];
		kg.a(i_1_, is, i, i_10_, -128);
		kg.a(i_9_, is, i, i_2_, 109);
	    }
	}
    }
    
    public static void a(int i) {
	l = null;
	if (i > -89)
	    l = null;
    }
    
    public gca() {
	/* empty */
    }
    
    gca(String string, int i) {
	((gca) this).k = string;
    }
}
