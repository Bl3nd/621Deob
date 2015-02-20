/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class h extends ha implements p
{
    long nativeid;
    
    protected final void finalize() {
	if (((h) this).nativeid != 0L)
	    iba.a(this, (byte) -81);
    }
    
    h(l class_l) {
	/* empty */
    }
    
    public final native void UA(boolean bool);
}
