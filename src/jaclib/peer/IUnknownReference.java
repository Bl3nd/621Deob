/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends PeerReference
{
    protected final native long releasePeer(long l);
    
    IUnknownReference(IUnknown iunknown, am var_am) {
	super((Peer) iunknown, var_am);
    }
}
