/* IDirect3DEventQuery - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.am;

public class IDirect3DEventQuery extends IUnknown {

    IDirect3DEventQuery(am am) {
	super(am);
    }
    
    public final native int Issue();
    
    public final native int IsSignaled();
}
