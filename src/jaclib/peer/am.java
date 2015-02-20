/* am - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;
import java.lang.ref.ReferenceQueue;

public final class am
{
    private PeerReference a;
    private PeerReference b;
    ReferenceQueue c = new ReferenceQueue();
    
    public final void a(byte i) {
	if (i < -50)
	    a((int) 119);
    }
    
    final void a(PeerReference peerreference, byte i) {
	peerreference.b = b;
	peerreference.a = null;
	if (a != null)
	    b.a = peerreference;
	else
	    a = peerreference;
	if (i >= 119)
	    b = peerreference;
    }
    
    private final void b(PeerReference peerreference, byte i) {
	peerreference.b((byte) 101);
	if (peerreference == b)
	    b = peerreference.b;
	if (i == -26) {
	    if (a == peerreference)
		a = peerreference.a;
	    if (peerreference.a != null)
		peerreference.a.b = peerreference.b;
	    if (peerreference.b != null)
		peerreference.b.a = peerreference.a;
	}
    }
    
    public final void b(byte i) {
	a((int) 117);
	while (b != null)
	    b(b, (byte) -26);
	if (i >= -5)
	    a((int) -7);
	a((int) 90);
    }
    
    private final void a(int i) {
	if (i <= 56)
	    a = null;
	for (;;) {
	    java.lang.ref.Reference reference = c.poll();
	    if (reference == null)
		break;
	    PeerReference peerreference = (PeerReference) reference;
	    b(peerreference, (byte) -26);
	}
    }
}
