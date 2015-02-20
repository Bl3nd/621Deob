/* Class_eb - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class_eb extends bm
{
    static World world;
    private qj l;
    static int m;
    static int n;
    private waa o;
    static cp p;
    static int q = 0;
    static int r;
    static float s;
    
    final int b(int i) {
	if (i != 30576)
	    q = -93;
	r++;
	return ((waa) o).s;
    }
    
    final boolean a(boolean bool, waa var_waa, waa var_waa_0_, float f) {
	if (bool != true)
	    return false;
	n++;
	boolean bool_1_ = true;
	qk var_qk = ((qj) l).tf;
	l.oa(da.j);
	l.JA();
	l.B(-13);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glPushAttrib(2048);
	OpenGL.glViewport(0, 0, ((waa) o).s, ((waa) o).s);
	l.a(false, (byte) -114);
	l.a((byte) 103, false);
	l.a((int) 122, false);
	l.a(false, (int) 127);
	l.b((int) -2, (byte) -58);
	l.b((int) 1, true);
	l.a(0.0F, 0.0F, f, -23119, 0.0F);
	l.a(34165, -465309136, 34165);
	l.a(var_waa, -2);
	l.b((int) 0, true);
	l.c(false, 1);
	l.a(var_waa_0_, -2);
	l.b(255, var_qk);
	for (int i = 0; i < 6; i++) {
	    int i_2_ = i + 34069;
	    var_qk.a(0, (byte) -64, o, i_2_);
	    var_qk.a(0, true);
	    if (var_qk.a(false)) {
		OpenGL.glBegin(7);
		int i_3_ = i_2_;
	    while_30_:
		do {
		while_29_:
		    do {
		    while_28_:
			do {
			while_27_:
			    do {
				do {
				    if (i_3_ != 34069) {
					if (i_3_ != 34070) {
					    if (i_3_ != 34071) {
						if (i_3_ != 34072) {
						    if (i_3_ != 34073) {
							if (i_3_ != 34074)
							    break while_30_;
						    } else
							break while_28_;
						    break while_29_;
						}
					    } else
						break;
					    break while_27_;
					}
				    } else {
					OpenGL.glTexCoord3i(65535, 65534,
							    65534);
					OpenGL.glMultiTexCoord3i(33985, 65535,
								 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534,
							    -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535,
								 65534,
								 -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534,
							    -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535,
								 -65534,
								 -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534,
							    65534);
					OpenGL.glMultiTexCoord3i(33985, 65535,
								 -65534,
								 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break while_30_;
				    }
				    OpenGL.glTexCoord3i(-65535, 65534, -65534);
				    OpenGL.glMultiTexCoord3i(33985, -65535,
							     65534, -65534);
				    OpenGL.glVertex2f(0.0F, 0.0F);
				    OpenGL.glTexCoord3i(-65535, 65534, 65534);
				    OpenGL.glMultiTexCoord3i(33985, -65535,
							     65534, 65534);
				    OpenGL.glVertex2f(1.0F, 0.0F);
				    OpenGL.glTexCoord3i(-65535, -65534, 65534);
				    OpenGL.glMultiTexCoord3i(33985, -65535,
							     -65534, 65534);
				    OpenGL.glVertex2f(1.0F, 1.0F);
				    OpenGL.glTexCoord3i(-65535, -65534,
							-65534);
				    OpenGL.glMultiTexCoord3i(33985, -65535,
							     -65534, -65534);
				    OpenGL.glVertex2f(0.0F, 1.0F);
				    break while_30_;
				} while (false);
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535,
							 -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535,
							 -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535,
							 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535,
							 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
				break while_30_;
			    } while (false);
			    OpenGL.glTexCoord3i(-65534, -65535, 65534);
			    OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
						     65534);
			    OpenGL.glVertex2f(0.0F, 0.0F);
			    OpenGL.glTexCoord3i(65534, -65535, 65534);
			    OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
						     65534);
			    OpenGL.glVertex2f(1.0F, 0.0F);
			    OpenGL.glTexCoord3i(65534, -65535, -65534);
			    OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
						     -65534);
			    OpenGL.glVertex2f(1.0F, 1.0F);
			    OpenGL.glTexCoord3i(-65534, -65535, -65534);
			    OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
						     -65534);
			    OpenGL.glVertex2f(0.0F, 1.0F);
			    break while_30_;
			} while (false);
			OpenGL.glTexCoord3i(-65534, 65534, 65535);
			OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
			OpenGL.glVertex2f(0.0F, 0.0F);
			OpenGL.glTexCoord3i(65534, 65534, 65535);
			OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
			OpenGL.glVertex2f(1.0F, 0.0F);
			OpenGL.glTexCoord3i(65534, -65534, 65535);
			OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
			OpenGL.glVertex2f(1.0F, 1.0F);
			OpenGL.glTexCoord3i(-65534, -65534, 65535);
			OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
			OpenGL.glVertex2f(0.0F, 1.0F);
			break while_30_;
		    } while (false);
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		} while (false);
		OpenGL.glEnd();
	    } else {
		bool_1_ = false;
		break;
	    }
	}
	var_qk.a((int) 0, 1);
	l.a(-109, var_qk);
	l.b((int) 1, true);
	l.a((rg) null, -2);
	l.a(8448, -465309136, 8448);
	l.b((int) 0, bool);
	l.a((rg) null, -2);
	OpenGL.glPopAttrib();
	l.da(da.j[0], da.j[1], da.j[2], da.j[3]);
	if (bool_1_ && !((qj) l).hf)
	    o.c(9566);
	return bool_1_;
    }
    
    public static void c(int i) {
	if (i == 0) {
	    world = null;
	    p = null;
	}
    }
    
    final waa b(byte i) {
	m++;
	if (i != 37)
	    s = -0.4473071F;
	return o;
    }
    
    Class_eb(qj var_qj, int i) {
	l = var_qj;
	o = new waa(var_qj, 6408, i);
    }
}
