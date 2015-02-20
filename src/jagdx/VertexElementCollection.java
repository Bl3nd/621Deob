/* VertexElementCollection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.am;
import jaclib.peer.pa;

public class VertexElementCollection extends pa
{
    public final native void finish();
    
    public final native void addElement(int i, int i_0_, int i_1_, int i_2_,
					int i_3_, int i_4_);
    
    public VertexElementCollection(am var_am) {
	super(var_am);
	init();
    }
    
    private final native void init();
    
    public final native void reset();
}
