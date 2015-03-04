/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference {

    PeerReference peerReference;
    private long peer;
    PeerReference peerReference1;

    public final boolean isPeer() {
        return peer != 0L;
    }

    protected abstract long releasePeer(long peer);

    public PeerReference(Peer peer, am am) {
        super(peer, am.instance);
        am.a(this);
    }

    public final void setPeer(long peer_) {
        b();
        peer = peer_;
    }

    public final long b() {
        long peer_;
        if (peer != 0L) {
            peer_ = releasePeer(peer);
            peer = 0L;
        } else {
            peer_ = 0L;
        }
        return peer_;
    }
}
