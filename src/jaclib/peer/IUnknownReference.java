/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends PeerReference {

    protected final native long releasePeer(long peer);

    public IUnknownReference(IUnknown iunknown, am am) {
        super(iunknown, am);
    }
}
