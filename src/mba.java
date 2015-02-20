/* mba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mba extends RuntimeException
{
    static String[] a = new String[100];
    Throwable b;
    static int[] c = new int[2];
    String d;
    static int e;
    
    public static void a(boolean bool) {
	if (bool == false) {
	    a = null;
	    c = null;
	}
    }
    
    mba(Throwable throwable, String string) {
	((mba) this).b = throwable;
	((mba) this).d = string;
    }
}
