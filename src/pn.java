/* pn - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class pn extends Node
{
    int k;
    volatile boolean l = true;
    pn m;
    bo n;
    
    abstract pn a();
    
    abstract void a(int i);
    
    final void a(int[] is, int i, int i_0_) {
	if (((pn) this).l)
	    b(is, i, i_0_);
	else
	    a(i_0_);
    }
    
    abstract void b(int[] is, int i, int i_1_);
    
    abstract pn b();
    
    int c() {
	return 255;
    }
    
    public pn() {
	/* empty */
    }
    
    abstract int d();
}
