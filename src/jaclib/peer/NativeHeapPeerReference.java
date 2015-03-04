/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference {

    public NativeHeapPeerReference(pa pa, am am) {
        super(pa, am);
    }

    protected final native long releasePeer(long peer);
}
