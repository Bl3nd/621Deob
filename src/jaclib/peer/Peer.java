/* Peer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

abstract class Peer {

    protected PeerReference reference;
    /*synthetic*/ static Class peerReference;

    private static native void init(Class class_);

    protected long a() {
        return reference.b();
    }

    public final boolean a(int i) {
        if (i != 8108) {//Remove once renamed
            a();
        }
        return reference.isPeer();
    }

    protected Peer() {
    /* empty */
    }

    /*synthetic*/
    private static Class getClassByName(String string) {
        Class class_;
        try {
            class_ = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
        return class_;
    }

    static {
        init(peerReference == null ? peerReference = getClassByName("jaclib.peer.PeerReference") : peerReference);
    }
}
