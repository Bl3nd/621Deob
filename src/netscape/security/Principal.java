/* Principal - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.security;
import java.net.URL;

public final class Principal
{
    public static final int anInt3042 = 1;
    public static final int anInt3043 = 2;
    public static final int anInt3044 = 3;
    public static final int anInt3045 = 4;
    public static final int anInt3046 = 5;
    private int anInt3047 = 3;
    private URL anURL3048 = null;
    
    public Principal() {
	/* empty */
    }
    
    public Principal(URL url) {
	anURL3048 = url;
    }
    
    public Principal(int i, String string) {
	anInt3047 = i;
    }
    
    public Principal(int i, byte[] is) {
	anInt3047 = i;
    }
    
    public Principal(int i, byte[] is, Class var_class) {
	anInt3047 = i;
    }
    
    public boolean isCodebase() {
	if (!isCodebaseExact() && !isCodebaseRegexp())
	    return false;
	return true;
    }
    
    public boolean isCodebaseExact() {
	if (anInt3047 == 1)
	    return true;
	return false;
    }
    
    public boolean isCodebaseRegexp() {
	if (anInt3047 == 2)
	    return true;
	return false;
    }
    
    public boolean isCert() {
	if (anInt3047 == 3)
	    return true;
	return false;
    }
    
    public boolean isCertFingerprint() {
	if (anInt3047 == 4)
	    return true;
	return false;
    }
    
    public String toVerboseString() {
	return this.toString();
    }
    
    public String getVendor() {
	return null;
    }
    
    public String toVerboseHtml() {
	return null;
    }
    
    public String getNickname() {
	return null;
    }
    
    public boolean isSystemPrincipal() {
	return false;
    }
    
    public static int getZigPtr(Class var_class) {
	return -1;
    }
}
