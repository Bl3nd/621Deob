/* am - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.ReferenceQueue;

public final class am {

    private PeerReference peerReference;
    private PeerReference peerReference1;
    ReferenceQueue instance = new ReferenceQueue();

    public final void a(byte b) {
        if (b < -50) {
            a(119);
        }
    }

    public final void a(PeerReference peerreference) {
        peerreference.peerReference1 = peerReference1;
        peerreference.peerReference = null;
        if (peerReference != null) {
            peerReference1.peerReference = peerreference;
        } else {
            peerReference = peerreference;
        }
    }

    private void b(PeerReference peerreference) {
        peerreference.b();
        if (peerreference == peerReference1) {
            peerReference1 = peerreference.peerReference1;
        }
        if (peerReference == peerreference) {
            peerReference = peerreference.peerReference;
        }
        if (peerreference.peerReference != null) {
            peerreference.peerReference.peerReference1 = peerreference.peerReference1;
        }
        if (peerreference.peerReference1 != null) {
            peerreference.peerReference1.peerReference = peerreference.peerReference;
        }
    }

    public final void b(byte b) {
        a(117);
        while (peerReference1 != null) {
            b(peerReference1);
        }
        if (b >= -5) {
            a(-7);
        }
        a(90);
    }

    private void a(int i) {
        if (i <= 56) {
            peerReference = null;
        }
        for (; ; ) {
            java.lang.ref.Reference reference = instance.poll();
            if (reference == null) {
                break;
            }
            PeerReference peerreference = (PeerReference) reference;
            b(peerreference);
        }
    }
}
