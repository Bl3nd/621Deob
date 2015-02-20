/* PrivilegeTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.security;
import java.util.Enumeration;
import java.util.Hashtable;

public class PrivilegeTable
{
    Hashtable aHashtable3064 = new Hashtable();
    
    public int size() {
	return aHashtable3064.size();
    }
    
    public boolean isEmpty() {
	return aHashtable3064.isEmpty();
    }
    
    public Enumeration keys() {
	return aHashtable3064.keys();
    }
    
    public Enumeration elements() {
	return aHashtable3064.elements();
    }
    
    public Privilege get(Object object) {
	return (Privilege) aHashtable3064.get(object);
    }
    
    public Privilege get(Target target) {
	return get((Object) target);
    }
    
    public Privilege put(Object object, Privilege privilege) {
	return (Privilege) aHashtable3064.put(object, privilege);
    }
    
    public Privilege put(Target target, Privilege privilege) {
	return (Privilege) aHashtable3064.put(target, privilege);
    }
    
    public Privilege remove(Object object) {
	return (Privilege) aHashtable3064.remove(object);
    }
    
    public Privilege remove(Target target) {
	return (Privilege) aHashtable3064.remove(target);
    }
    
    public void clear() {
	aHashtable3064.clear();
    }
}
