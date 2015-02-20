/* pfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;

final class pfa
{
    static int a;
    static fa b;
    static Hashtable c = new Hashtable();
    static ida d;
    static int e = 0;
    static int f;
    
    static final String a(Throwable throwable, byte i) throws IOException {
	int i_0_ = 68 / ((-36 - i) / 52);
	f++;
	String string;
	if (!(throwable instanceof mba))
	    string = "";
	else {
	    mba var_mba = (mba) throwable;
	    throwable = ((mba) var_mba).b;
	    string = ((mba) var_mba).d + " | ";
	}
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_1_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_1_));
	String string_2_ = bufferedreader.readLine();
	for (;;) {
	    String string_3_ = bufferedreader.readLine();
	    if (string_3_ == null)
		break;
	    int i_4_ = string_3_.indexOf('(');
	    int i_5_ = string_3_.indexOf(')', i_4_ + 1);
	    String string_6_;
	    if ((i_4_ ^ 0xffffffff) == 0)
		string_6_ = string_3_;
	    else
		string_6_ = string_3_.substring(0, i_4_);
	    string_6_ = string_6_.trim();
	    string_6_ = string_6_.substring(string_6_.lastIndexOf(' ') + 1);
	    string_6_ = string_6_.substring(string_6_.lastIndexOf('\t') + 1);
	    string += string_6_;
	    if ((i_4_ ^ 0xffffffff) != 0 && i_5_ != -1) {
		int i_7_ = string_3_.indexOf(".java:", i_4_);
		if (i_7_ >= 0)
		    string += string_3_.substring(i_7_ + 5, i_5_);
	    }
	    string += ' ';
	}
	string += "| " + (String) string_2_;
	return string;
    }
    
    static final void a(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_, int i_13_, int i_14_, int i_15_,
			int i_16_) {
	a++;
	if (i_16_ < 512 || i_8_ < 512 || Class_hc.e * 512 - 1024 < i_16_
	    || (bw.v - 2) * 512 < i_8_)
	    lt.h[0] = lt.h[1] = -1;
	else if (i_10_ <= -100) {
	    int i_17_ = Class_u.b(i_16_, i_13_, -20214, i_8_) - i;
	    tg.G.U(i_9_, 0, 0);
	    lg.r.a(tg.G);
	    lg.r.AA(i_16_, i_17_, i_8_, lt.h);
	    tg.G.U(-i_9_, 0, 0);
	    lg.r.a(tg.G);
	}
    }
    
    public static void a(byte i) {
	c = null;
	b = null;
	if (i != 113)
	    d = null;
	d = null;
    }
}
