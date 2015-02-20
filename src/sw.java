/* sw - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class sw
{
    static qda[] a;
    static GameInPacket currentGameInPacket = null;
    String c;
    int d;
    static int e = 0;
    static int f;
    static int g;
    static int h;
    
    public static void a(int i) {
	a = null;
	currentGameInPacket = null;
	if (i != -1)
	    a = null;
    }
    
    static final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
	h++;
	int i_5_ = 0;
	int i_6_ = i_0_;
	int i_7_ = i_1_ * i_1_;
	int i_8_ = i_0_ * i_0_;
	int i_9_ = i_8_ << 1;
	int i_10_ = i_7_ << 1;
	int i_11_ = i_0_ << 1;
	int i_12_ = i_7_ * (1 - i_11_) + i_9_;
	if (i != 1641)
	    e = -28;
	int i_13_ = i_8_ - (i_11_ - 1) * i_10_;
	int i_14_ = i_7_ << 2;
	int i_15_ = i_8_ << 2;
	int i_16_ = ((i_5_ << 1) + 3) * i_9_;
	int i_17_ = i_10_ * ((i_6_ << 1) - 3);
	int i_18_ = i_15_ * (i_5_ + 1);
	int i_19_ = (i_6_ - 1) * i_14_;
	kg.a(i_4_ - i_1_, wh.O[i_3_], i_2_, i_4_ + i_1_, 106);
	while (i_6_ > 0) {
	    if (i_12_ < 0) {
		while (i_12_ < 0) {
		    i_12_ += i_16_;
		    i_13_ += i_18_;
		    i_16_ += i_15_;
		    i_5_++;
		    i_18_ += i_15_;
		}
	    }
	    if (i_13_ < 0) {
		i_12_ += i_16_;
		i_13_ += i_18_;
		i_18_ += i_15_;
		i_16_ += i_15_;
		i_5_++;
	    }
	    i_13_ -= i_17_;
	    i_12_ -= i_19_;
	    i_17_ -= i_14_;
	    i_19_ -= i_14_;
	    i_6_--;
	    int i_20_ = i_3_ - i_6_;
	    int i_21_ = i_3_ + i_6_;
	    int i_22_ = i_4_ + i_5_;
	    int i_23_ = i_4_ - i_5_;
	    kg.a(i_23_, wh.O[i_20_], i_2_, i_22_, 104);
	    kg.a(i_23_, wh.O[i_21_], i_2_, i_22_, -113);
	}
    }
    
    static final int a(int i, int i_24_) {
	if (i != -21557)
	    a(98, 81, -64, -49, 24, 30);
	f++;
	return i_24_ >>> 8;
    }
}
