/* JSObject - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.javascript;
import java.applet.Applet;

public abstract class JSObject
{
    protected JSObject() {
	throw new Error
		  ("Unresolved compilation problems: \n\tThe import sun.plugin cannot be resolved\n\tJSContext cannot be resolved to nullLoader type\n\tJSContext cannot be resolved to nullLoader type\n\tJSContext cannot be resolved to nullLoader type\n");
    }
    
    public abstract Object call(String string, Object[] objects)
	throws JSException;
    
    public abstract Object eval(String string) throws JSException;
    
    public abstract Object getMember(String string) throws JSException;
    
    public abstract void setMember(String string, Object object)
	throws JSException;
    
    public abstract void removeMember(String string) throws JSException;
    
    public abstract Object getSlot(int i) throws JSException;
    
    public abstract void setSlot(int i, Object object) throws JSException;
    
    public static JSObject getWindow(Applet applet) throws JSException {
	throw new Error
		  ("Unresolved compilation problems: \n\tJSContext cannot be resolved to nullLoader type\n\tJSContext cannot be resolved to nullLoader type\n\tJSContext cannot be resolved to nullLoader type\n");
    }
}
