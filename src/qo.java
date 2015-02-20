/* qo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;

abstract class qo
{
    mv a = dda.d;
    boolean b;
    gaa c;
    bt d;
    Class_ec e;
    
    abstract IDirect3DBaseTexture c(int i);
    
    void a(mv var_mv, int i) {
	((qo) this).a = var_mv;
	if (i != 15590)
	    a(null, -51);
    }
    
    qo(gaa var_gaa, Class_ec class_ec, bt var_bt, boolean bool, int i) {
	((qo) this).c = var_gaa;
	((qo) this).b = bool;
	((qo) this).e = class_ec;
	((qo) this).d = var_bt;
    }
}
