/* pba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class pba extends Interactable
{
    int g;
    boolean h = false;
    int i;
    int j;
    int k;
    int l;
    
    final boolean a(int i, int i_0_) {
	if (!((pba) this).h)
	    return false;
	int i_1_ = ((pba) this).l - ((pba) this).k;
	int i_2_ = ((pba) this).i - ((pba) this).g;
	int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
	int i_4_ = (i * i_1_ + i_0_ * i_2_
		    - (((pba) this).k * i_1_ + ((pba) this).g * i_2_));
	if (i_4_ <= 0) {
	    int i_5_ = ((pba) this).k - i;
	    int i_6_ = ((pba) this).g - i_0_;
	    if (i_5_ * i_5_ + i_6_ * i_6_ >= ((pba) this).j * ((pba) this).j)
		return false;
	    return true;
	}
	if (i_4_ > i_3_) {
	    int i_7_ = ((pba) this).l - i;
	    int i_8_ = ((pba) this).i - i_0_;
	    if (i_7_ * i_7_ + i_8_ * i_8_ >= ((pba) this).j * ((pba) this).j)
		return false;
	    return true;
	}
	i_4_ = (i_4_ << 10) / i_3_;
	int i_9_ = ((pba) this).k + (i_1_ * i_4_ >> 10) - i;
	int i_10_ = ((pba) this).g + (i_2_ * i_4_ >> 10) - i_0_;
	if (i_9_ * i_9_ + i_10_ * i_10_ >= ((pba) this).j * ((pba) this).j)
	    return false;
	return true;
    }
    
    public pba() {
	/* empty */
    }
}
