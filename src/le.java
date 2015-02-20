/* le - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class le
{
    private static int a;
    private static boolean b = false;
    private static Hashtable c = new Hashtable(16);
    private static String d;
    private static String e;
    
    public static File a(String string, String string_0_, byte i, int i_1_) {
	if (!b)
	    throw new RuntimeException("");
	File file = (File) c.get(string);
	if (i < 31)
	    e = null;
	if (file != null)
	    return file;
	String[] strings = { "nullLoader:/rscache/", "/rscache/", "nullLoader:/windows/",
			     "nullLoader:/winnt/", "nullLoader:/", d, "/tmp/", "" };
	String[] strings_2_
	    = { ".jagex_cache_" + i_1_, ".file_store_" + i_1_ };
	for (int i_3_ = 0; i_3_ < 2; i_3_++) {
	    for (int i_4_ = 0; i_4_ < strings_2_.length; i_4_++) {
		for (int i_5_ = 0; strings.length > i_5_; i_5_++) {
		    String string_6_
			= (strings[i_5_] + strings_2_[i_4_] + "/"
			   + (string_0_ == null ? "" : string_0_ + "/")
			   + string);
		    RandomAccessFile randomaccessfile = null;
		    try {
			File file_7_ = new File(string_6_);
			if (i_3_ != 0 || file_7_.exists()) {
			    String string_8_ = strings[i_5_];
			    if (i_3_ != 1 || string_8_.length() <= 0
				|| new File(string_8_).exists()) {
				new File(strings[i_5_] + strings_2_[i_4_])
				    .mkdir();
				if (string_0_ != null)
				    new File(strings[i_5_] + strings_2_[i_4_]
					     + "/" + string_0_).mkdir();
				randomaccessfile
				    = new RandomAccessFile(file_7_, "rw");
				int i_9_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_9_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				c.put(string, file_7_);
				return file_7_;
			    }
			}
		    } catch (Exception exception) {
			try {
			    if (randomaccessfile != null) {
				randomaccessfile.close();
				Object object = null;
			    }
			} catch (Exception exception_10_) {
			    /* empty */
			}
		    }
		}
	    }
	}
	throw new RuntimeException();
    }
    
    public static File a(String string, byte i) {
	if (i != -106)
	    a(null, null, (byte) -2, 22);
	return a(string, e, (byte) 102, a);
    }
    
    public static void a(int i, int i_11_, String string) {
	a = i;
	e = string;
	try {
	    d = System.getProperty("user.home");
	    if (d != null)
		d += "/";
	} catch (Exception exception) {
	    /* empty */
	}
	b = true;
	if (i_11_ != 0)
	    d = null;
	if (d == null)
	    d = "~/";
    }
}
