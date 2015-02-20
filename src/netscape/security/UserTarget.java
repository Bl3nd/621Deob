/* UserTarget - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.security;

public class UserTarget extends Target
{
    public UserTarget() {
	/* empty */
    }
    
    public UserTarget(String string, Principal principal, String string_0_,
		      String string_1_, String string_2_, String string_3_) {
	super(string, principal, string_0_, string_1_, string_2_, string_3_);
    }
    
    public UserTarget(String string, Principal principal, String string_4_,
		      String string_5_, String string_6_, String string_7_,
		      Target[] targets) {
	super(string, principal, string_4_, string_5_, string_6_, string_7_,
	      targets);
    }
    
    public Privilege enablePrivilege(Principal principal, Object object) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.enablePrivilege(this, principal, object);
	return null;
    }
}
