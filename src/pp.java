/* pp - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class pp extends Node
{
    static int k;
    long l;
    static fe[] m;
    pp var_n;
    pp o;
    static int p;
    static int q = 0;
    static int r;
    
    public static void b(int i) {
	m = null;
	if (i >= -115)
	    b(119);
    }
    
    public pp() {
	/* empty */
    }
    
    final boolean c(int i) {
	p++;
	int i_0_ = -39 / ((i + 52) / 56);
	if (((pp) this).o == null)
	    return false;
	return true;
    }
    
    final void a(byte i) {
	k++;
	if (((pp) this).o != null) {
	    ((pp) ((pp) this).o).var_n = ((pp) this).var_n;
	    if (i >= -48)
		c(-5);
	    ((pp) ((pp) this).var_n).o = ((pp) this).o;
	    ((pp) this).var_n = null;
	    ((pp) this).o = null;
	}
    }
}
