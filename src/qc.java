/* qc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class qc
{
    static wa[] a = new wa[14];
    String b;
    static int c;
    int d;
    static int e;
    
    final Socket a(boolean bool) throws IOException {
	if (bool != false)
	    a((int) 74);
	c++;
	return new Socket(((qc) this).b, ((qc) this).d);
    }
    
    static final void a(int i) {
	e++;
	tn.a(kr.a, 1023);
	ada.H++;
	if (!bm.h || !wd.f) {
	    if (ada.H > 1)
		kr.a = null;
	} else {
	    int i_0_ = Class_md.e.d(2000);
	    int i_1_ = Class_md.e.b((int) 124);
	    i_0_ -= pea.c;
	    i_1_ -= mm.q;
	    if (pv.x_ > i_0_)
		i_0_ = pv.x_;
	    if (ur.y_ > i_1_)
		i_1_ = ur.y_;
	    if (((Interface) kr.a).minHScroll + i_0_ > ((Interface) rca.e).minHScroll + pv.x_)
		i_0_ = pv.x_ + ((Interface) rca.e).minHScroll - ((Interface) kr.a).minHScroll;
	    if (ur.y_ + ((Interface) rca.e).minVScroll < i_1_ + ((Interface) kr.a).minVScroll)
		i_1_ = ur.y_ - ((Interface) kr.a).minVScroll + ((Interface) rca.e).minVScroll;
	    int i_2_ = i_0_ + (-pv.x_ + ((Interface) rca.e).hScroll);
	    int i_3_ = i_1_ + (-ur.y_ + ((Interface) rca.e).vScroll);
	    if (i == 7129) {
		if (Class_md.e.a((byte) 9)) {
		    if (ada.H > ((Interface) kr.a).lb) {
			int i_4_ = i_0_ - hga.x;
			int i_5_ = i_1_ - il.y;
			if (i_4_ > ((Interface) kr.a).x || -((Interface) kr.a).x > i_4_
			    || i_5_ > ((Interface) kr.a).x || i_5_ < -((Interface) kr.a).x)
			    fj.z = true;
		    }
		    if (((Interface) kr.a).L != null && fj.z) {
			ClientScript var_mea = new ClientScript();
			((ClientScript) var_mea).objects = ((Interface) kr.a).L;
			((ClientScript) var_mea)._x = i_2_;
			((ClientScript) var_mea).interface_ = kr.a;
			((ClientScript) var_mea)._y = i_3_;
			ClientScriptHandler.activateClientScript(var_mea);
		    }
		} else {
		    if (fj.z) {
			vo.c((byte) 31);
			if (((Interface) kr.a).gd != null) {
			    ClientScript var_mea = new ClientScript();
			    ((ClientScript) var_mea).objects = ((Interface) kr.a).gd;
			    ((ClientScript) var_mea).interface_1 = bw.u;
			    ((ClientScript) var_mea)._y = i_3_;
			    ((ClientScript) var_mea)._x = i_2_;
			    ((ClientScript) var_mea).interface_ = kr.a;
			    ClientScriptHandler.activateClientScript(var_mea);
			}
			if (bw.u != null && client.a(kr.a) != null)
			    da.a(bw.u, (byte) -65, kr.a);
		    } else if (ik.r != 1 && !pl.c(false) || mu.j <= 2) {
			if (gs.e(i - 7129))
			    kga.b(hga.x + pea.c, i ^ 0x1b82, il.y + mm.q);
		    } else
			kga.b(hga.x + pea.c, 120, mm.q + il.y);
		    kr.a = null;
		}
	    }
	}
    }
    
    public static void a(byte i) {
	a = null;
	int i_6_ = 4 % ((3 - i) / 47);
    }
    
    abstract Socket b(int i) throws IOException;
    
    public qc() {
	/* empty */
    }
}
