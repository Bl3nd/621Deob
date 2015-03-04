/* dm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class dm extends IOException
{
    static float a;
    static int b;
    static GameOutPacket outgoingPacket52 = new GameOutPacket(52, 4);
    static boolean d = false;
    
    static final void setItemOnInterface(int dummy, boolean split, int itemID, int itemIndex, int amount, int itemContainerIndex) {
		b++;
		long l = (long) (itemContainerIndex | (split ? -2147483648 : 0));
		hg var_hg = (hg) vj.s.a(-32748, l);
		int i_4_ = -101 % (dummy / 47);
		if (var_hg == null) {
		    var_hg = new hg();
		    vj.s.a(var_hg, (byte) -72, l);
		}
		if (itemIndex >= ((hg) var_hg).itemIDs.length) {
		    int[] is = new int[itemIndex + 1];
		    int[] is_5_ = new int[itemIndex + 1];
		    for (int loopID = 0; loopID < ((hg) var_hg).itemIDs.length; loopID++) {
				is[loopID] = ((hg) var_hg).itemIDs[loopID];
				is_5_[loopID] = ((hg) var_hg).amounts[loopID];
		    }
		    for (int loopID = ((hg) var_hg).itemIDs.length; loopID < itemIndex; loopID++) {
				is[loopID] = -1;
				is_5_[loopID] = 0;
		    }
		    ((hg) var_hg).itemIDs = is;
		    ((hg) var_hg).amounts = is_5_;
		}
		((hg) var_hg).itemIDs[itemIndex] = itemID;
		((hg) var_hg).amounts[itemIndex] = amount;
    }
    
    dm(String string) {
	super(string);
    }
    
    public static void a(boolean bool) {
	outgoingPacket52 = null;
	if (bool != false)
	    a(false);
    }
}
