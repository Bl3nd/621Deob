/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;
import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference
{
    PeerReference a;
    private long peer;
    PeerReference b;
    
    final boolean a(byte i) {
	if (i != -77)
	    b((byte) 18);
	return peer != 0L;
    }
    
    protected abstract long releasePeer(long l);
    
    PeerReference(Peer peer, am var_am) {
	super(peer, var_am.c);
	var_am.a(this, (byte) 126);
    }
    
    final void setPeer(long l) {
	b((byte) 82);
	peer = l;
    }
    
    final long b(byte i) {
	if (i < 73)
	    b((byte) 72);
	long l;
	if (peer != 0L) {
	    l = releasePeer(peer);
	    peer = 0L;
	} else
	    l = 0L;
	return l;
    }
}
