/* Privilege - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.security;

public final class Privilege
{
    public static final int anInt3049 = 15;
    public static final int anInt3050 = 0;
    public static final int anInt3051 = 1;
    public static final int anInt3052 = 2;
    public static final int anInt3053 = 240;
    public static final int anInt3054 = 16;
    public static final int anInt3055 = 32;
    public static final int anInt3056 = 64;
    private int anInt3057 = 0;
    private int anInt3058 = 16;
    
    Privilege(int i, int i_0_) {
	anInt3057 = i;
	anInt3058 = i_0_;
    }
    
    public static Privilege findPrivilege(int i, int i_1_) {
	return new Privilege(i, i_1_);
    }
    
    public static int add(int i, int i_2_) {
	if (i == 0 || i_2_ == 0)
	    return 0;
	if (i == 2)
	    return i_2_;
	if (i_2_ == 2)
	    return i;
	if (i == 1 || i_2_ == 1)
	    return 1;
	return 2;
    }
    
    public static Privilege add(Privilege privilege, Privilege privilege_3_) {
	int i = add(privilege.getPermission(), privilege_3_.getPermission());
	return new Privilege(i, privilege.getDuration());
    }
    
    public boolean samePermission(Privilege privilege_4_) {
	return samePermission(privilege_4_.getPermission());
    }
    
    public boolean samePermission(int i) {
	if (anInt3057 == i)
	    return true;
	return false;
    }
    
    public boolean sameDuration(Privilege privilege_5_) {
	return sameDuration(privilege_5_.getDuration());
    }
    
    public boolean sameDuration(int i) {
	if (anInt3058 == i)
	    return true;
	return false;
    }
    
    public boolean isAllowed() {
	if (anInt3057 == 1)
	    return true;
	return false;
    }
    
    public boolean isForbidden() {
	if (anInt3057 == 0)
	    return true;
	return false;
    }
    
    public boolean isBlank() {
	if (anInt3057 == 2)
	    return true;
	return false;
    }
    
    public int getPermission() {
	return anInt3057;
    }
    
    public int getDuration() {
	return anInt3058;
    }
    
    public boolean equals(Object object) {
	if (object instanceof Privilege) {
	    Privilege privilege_6_ = (Privilege) object;
	    if (anInt3057 == privilege_6_.getPermission()
		&& anInt3058 == privilege_6_.getDuration())
		return true;
	    return false;
	}
	return false;
    }
}
