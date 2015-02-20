/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference
{
    NativeHeapPeerReference(pa var_pa, am var_am) {
	super((Peer) var_pa, var_am);
    }
    
    protected final native long releasePeer(long l);
}
