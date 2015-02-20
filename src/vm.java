/* vm - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class vm extends Node
{
    static int k = 0;
    static int l;
    volatile String m;
    static int n;
    volatile int o = -1;
    static int p;
    static int q;
    static boolean r = false;
    
    static final void a(boolean bool, boolean bool_0_, boolean bool_1_,
			tt var_tt) {
	if (bool_1_ != false)
	    r = true;
	q++;
	int i = ((tt) var_tt).l;
	int i_2_ = (int) ((Node) var_tt).nodeID;
	var_tt.unlink(-86);
	if (bool_0_)
	    li.a(i, (int) 0);
	lt.a((byte) 79, i);
	Interface var_kp = efa.a(-1018745488, i_2_);
	if (var_kp != null)
	    tn.a(var_kp, 1023);
	in.b((byte) 108);
	if (!bool && (Class_vb.u ^ 0xffffffff) != 0)
	    cea.b(-1630137275, Class_vb.u, 1);
	ufa var_ufa = new ufa(ida.l);
	for (tt var_tt_3_ = (tt) var_ufa.a((byte) -120); var_tt_3_ != null;
	     var_tt_3_ = (tt) var_ufa.a((int) 1)) {
	    if (!var_tt_3_.g(-95)) {
		var_tt_3_ = (tt) var_ufa.a((byte) -121);
		if (var_tt_3_ == null)
		    break;
	    }
	    if (((tt) var_tt_3_).k == 3) {
		int i_4_ = (int) ((Node) var_tt_3_).nodeID;
		if (i_4_ >>> 16 == i)
		    a(bool, true, false, var_tt_3_);
	    }
	}
    }
    
    static final int a(byte i, int i_5_) {
	l++;
	int i_6_ = -69 % ((i - 7) / 62);
	return 0xff & i_5_;
    }
    
    static final tl a(byte i, BytesParser var_es) {
	n++;
	int i_7_ = var_es.readInt(74);
	if (i <= 17)
	    a(-57, -16, 124, -39, 4, 24, 85, 76, -3);
	return new tl(i_7_);
    }
    
    static final void a(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_, int i_13_, int i_14_, int i_15_) {
	p++;
	if (i_12_ != 14557)
	    a(94, -116, -79, -9, -49, -120, -76, -105, 18);
	ui.n[cda.b++] = new hv(i_9_, i_8_, i, i_13_, i_13_, i, i_14_, i_15_,
			       i_15_, i_14_, i_11_, i_11_, i_10_, i_10_);
    }
    
    vm(String string) {
	((vm) this).m = string;
    }
}
