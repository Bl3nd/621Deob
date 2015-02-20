/* oaa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class oaa extends bo
{
    byte[] l;
    int m;
    int n;
    int o;
    boolean p;
    
    final oaa a(ui var_ui) {
	((oaa) this).l = var_ui.a(false, ((oaa) this).l);
	((oaa) this).n = var_ui.a(((oaa) this).n, -55);
	if (((oaa) this).m == ((oaa) this).o)
	    ((oaa) this).m = ((oaa) this).o
		= var_ui.a((byte) -99, ((oaa) this).m);
	else {
	    ((oaa) this).m = var_ui.a((byte) -111, ((oaa) this).m);
	    ((oaa) this).o = var_ui.a((byte) -111, ((oaa) this).o);
	    if (((oaa) this).m == ((oaa) this).o)
		((oaa) this).m--;
	}
	return this;
    }
    
    oaa(int i, byte[] is, int i_0_, int i_1_) {
	((oaa) this).n = i;
	((oaa) this).l = is;
	((oaa) this).m = i_0_;
	((oaa) this).o = i_1_;
    }
    
    oaa(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
	((oaa) this).n = i;
	((oaa) this).l = is;
	((oaa) this).m = i_2_;
	((oaa) this).o = i_3_;
	((oaa) this).p = bool;
    }
}
