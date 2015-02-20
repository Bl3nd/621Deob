/* JSUtil - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package netscape.javascript;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

public class JSUtil
{
    public static String getStackTrace(Throwable throwable) {
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream();
	PrintWriter printwriter = new PrintWriter(bytearrayoutputstream);
	throwable.printStackTrace(printwriter);
	printwriter.flush();
	return bytearrayoutputstream.toString();
    }
}
