/* JSException - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.javascript;

public class JSException extends RuntimeException
{
    public static final int anInt4526 = -1;
    public static final int anInt4527 = 0;
    public static final int anInt4528 = 1;
    public static final int anInt4529 = 2;
    public static final int anInt4530 = 3;
    public static final int anInt4531 = 4;
    public static final int anInt4532 = 5;
    public static final int anInt4533 = 6;
    protected String aString4534 = null;
    protected String aString4535 = null;
    protected int anInt4536 = -1;
    protected String aString4537 = null;
    protected int anInt4538 = -1;
    private int anInt4539 = -1;
    private Object anObject4540 = null;
    
    public JSException() {
	this((String) null);
    }
    
    public JSException(String string) {
	this(string, null, -1, null, -1);
    }
    
    public JSException(String string, String string_0_, int i,
		       String string_1_, int i_2_) {
	super(string);
	aString4534 = string;
	aString4535 = string_0_;
	anInt4536 = i;
	aString4537 = string_1_;
	anInt4538 = i_2_;
	anInt4539 = -1;
    }
    
    public JSException(int i, Object object) {
	this();
	anInt4539 = i;
	anObject4540 = object;
    }
    
    public int getWrappedExceptionType() {
	return anInt4539;
    }
    
    public Object getWrappedException() {
	return anObject4540;
    }
}
