/* ih - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class ih
{
    static int a;
    static int b;
    static int c;
    static int d;
    private tb e = new tb(64);
    static int f;
    static sfa g = new sfa();
    private pl h;
    static int i;
    static int j;
    static int k;
    static int l;
    static boolean m;
    static int n = -1;
    
    static final void a(String string, File file, int i) {
	k++;
	aea.hashtable.put(string, file);
	int i_0_ = -114 / ((i + 57) / 62);
    }
    
    static final boolean a(int i, int i_1_, int i_2_) {
	if (i_1_ != -1)
	    n = 51;
	j++;
	return ((dk.a(33, i, i_2_) | Class_db.a(i_2_, i, false)
		 | dga.b(i_1_ - 41, i, i_2_))
		& fn.a(-44, i, i_2_));
    }
    
    static final boolean a(byte i, int i_3_, int i_4_) {
	d++;
	if (i < 25)
	    m = false;
	if ((0x10 & i_3_) == 0)
	    return false;
	return true;
    }
    
    final void a(int i) {
	if (i == 16) {
	    synchronized (e) {
		e.a(18385);
	    }
	    c++;
	}
    }
    
    final void a(byte i, int i_5_) {
	synchronized (e) {
	    if (i >= -21)
		return;
	    e.a(true, i_5_);
	}
	b++;
    }
    
    final void b(int i) {
	a++;
	if (i == 35) {
	    synchronized (e) {
		e.c((byte) -118);
	    }
	}
    }
    
    final ru b(byte i, int i_6_) {
	l++;
	ru var_ru;
	synchronized (e) {
	    var_ru = (ru) e.get((long) i_6_, (byte) 100);
	}
	if (var_ru != null)
	    return var_ru;
	byte[] is;
	synchronized (h) {
	    is = h.b(i_6_, 31, 35);
	}
	var_ru = new ru();
	if (i != 0)
	    a((String) null, null, -84);
	if (is != null)
	    var_ru.a(true, new BytesParser(is));
	var_ru.b(1);
	synchronized (e) {
	    e.put((long) i_6_, var_ru, 1);
	}
	return var_ru;
    }
    
    ih(Class_rf class_rf, int i, pl var_pl) {
	h = var_pl;
	if (h != null)
	    h.a(35, true);
    }
    
    public static void a(byte i) {
	if (i > -55)
	    a((byte) 69, 30, -98);
	g = null;
    }
}
