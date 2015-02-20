/* Target - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.security;

public class Target
{
    private String aString3065 = null;
    private Principal aPrincipal3066 = null;
    private String aString3067 = null;
    private String aString3068 = null;
    private String aString3069 = null;
    private String aString3070 = null;
    private Target[] aTargetArray3071 = null;
    
    protected Target() {
	this(null, null, null, null, null, null, null);
    }
    
    public Target(String string, Principal principal) {
	this(string, principal, null, null, null, null, null);
    }
    
    public Target(String string) {
	this(string, null, null, null, null, null, null);
    }
    
    public Target(String string, Principal principal, Target[] targets) {
	this(string, principal, null, null, null, null, targets);
    }
    
    public Target(String string, Principal principal, String string_0_,
		  String string_1_, String string_2_, String string_3_) {
	this(string, principal, string_0_, string_1_, string_2_, string_3_,
	     null);
    }
    
    public Target(String string, Principal principal, String string_4_,
		  String string_5_, String string_6_, String string_7_,
		  Target[] targets) {
	aString3065 = string;
	aPrincipal3066 = principal;
	aString3067 = string_4_;
	aString3068 = string_5_;
	aString3069 = string_6_;
	aString3070 = string_7_;
	aTargetArray3071 = targets;
    }
    
    public final Target registerTarget() {
	return this;
    }
    
    public static Target findTarget(String string) {
	return new Target(string);
    }
    
    public static Target findTarget(String string, Principal principal) {
	return new Target(string, principal);
    }
    
    public static Target findTarget(Target target) {
	return target;
    }
    
    public Privilege checkPrivilegeEnabled(Principal[] principals,
					   Object object) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.checkPrivilegeEnabled(this, object);
	return null;
    }
    
    public Privilege checkPrivilegeEnabled(Principal[] principals) {
	return checkPrivilegeEnabled(principals, null);
    }
    
    public Privilege checkPrivilegeEnabled(Principal principal,
					   Object object) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.checkPrivilegeEnabled(this, object);
	return null;
    }
    
    public Privilege enablePrivilege(Principal principal, Object object) {
	PrivilegeManager privilegemanager
	    = PrivilegeManager.getPrivilegeManager();
	privilegemanager.enablePrivilege(this, principal, object);
	return null;
    }
    
    public String getRisk() {
	return aString3067;
    }
    
    public String getRiskColor() {
	return aString3068;
    }
    
    public String getDescription() {
	return aString3069;
    }
    
    public static Target getTargetFromDescription(String string) {
	return null;
    }
    
    public String getHelpUrl() {
	return aString3070;
    }
    
    public String getDetailedInfo(Object object) {
	return null;
    }
}
