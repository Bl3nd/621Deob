/* mt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class mt extends pp
{
    int s;
    int t;
    int u;
    vj v;
    static int w;
    qg x;
    int y;
    int z;
    
    final void b(byte i) {
	((mt) this).u = ((qg) ((mt) this).x).l;
	((mt) this).s = ((qg) ((mt) this).x).m;
	w++;
	((mt) this).z = ((qg) ((mt) this).x).f;
	if (((qg) ((mt) this).x).p != null)
	    ((qg) ((mt) this).x).p.wa(((vj) ((mt) this).v).n,
				      ((vj) ((mt) this).v).o,
				      ((vj) ((mt) this).v).d, hea.f);
	((mt) this).y = hea.f[0];
	if (i <= 6)
	    ((mt) this).z = 126;
	((mt) this).t = hea.f[2];
    }
    
    mt(qg var_qg, tq var_tq) {
	((mt) this).x = var_qg;
	((mt) this).v = ((mt) this).x.b(126);
	b((byte) 80);
    }
}
