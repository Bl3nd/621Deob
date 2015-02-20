/* ParameterizedTarget - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.security;

public class ParameterizedTarget extends UserTarget
{
    protected ParameterizedTarget() {
	/* empty */
    }
    
    public ParameterizedTarget(String string, Principal principal,
			       String string_0_, String string_1_,
			       String string_2_, String string_3_) {
	super(string, principal, string_0_, string_1_, string_2_, string_3_);
    }
    
    public String getDetailedInfo(Object object) {
	return null;
    }
    
    public Privilege enablePrivilege(Principal principal, Object object) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.enablePrivilege(this, principal, object);
	return null;
    }
    
    public Privilege checkPrivilegeEnabled(Principal[] principals,
					   Object object) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.checkPrivilegeEnabled(this, object);
	return null;
    }
}
