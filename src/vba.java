/* vba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vba
{
    int a;
    int[] b;
    int c;
    int[] d;
    
    vba() {
	go.c(16);
	((vba) this).a = go.b() != 0 ? go.c(4) + 1 : 1;
	if (go.b() != 0)
	    go.c(8);
	go.c(2);
	if (((vba) this).a > 1)
	    ((vba) this).c = go.c(4);
	((vba) this).d = new int[((vba) this).a];
	((vba) this).b = new int[((vba) this).a];
	for (int i = 0; i < ((vba) this).a; i++) {
	    go.c(8);
	    ((vba) this).d[i] = go.c(8);
	    ((vba) this).b[i] = go.c(8);
	}
    }
}
