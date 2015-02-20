/* m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class m extends IncomingPackets implements p
{
    long nativeid;
    
    protected final void finalize() {
	if (((m) this).nativeid != 0L)
	    iba.a(this, (byte) 43);
    }
    
    final native void Z();
    
    m(l class_l, int i) {
	MA(class_l, i);
    }
    
    public final native void UA(boolean bool);
    
    private final native void MA(l class_l, int i);
    
    final native void D();
}
