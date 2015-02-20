/* gba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

import jaggl.OpenGL;

final class gba extends rg
{
    private int s = -1;
    static tb t = new tb(4);
    static int u;
    static int v;
    static int w;
    int x;
    static int y;
    static int z;
    static int A;
    int B;
    int D;
    static gl E;
    private int F = -1;
    static int G;
    static int[] outScreenPlayerIDs = new int[2048];
    /*synthetic*/ static Class I;
    
    static final boolean a(byte[] is, int i) {
	w++;
	BytesParser var_es = new BytesParser(is);
	int i_0_ = var_es.readUnsignedByte(-9268);
	if (i_0_ != 2)
	    return false;
	boolean bool = (var_es.readUnsignedByte(-9268) ^ 0xffffffff) == i;
	if (bool)
	    jba.a(112, var_es);
	hl.a(var_es, 6130);
	return true;
    }
    
    gba(qj var_qj, int i, int i_1_, int i_2_, int i_3_) {
	super(var_qj, 32879, i, i_3_ * (i_1_ * i_2_), false);
	((gba) this).B = i_3_;
	((gba) this).x = i_2_;
	((gba) this).D = i_1_;
	((rg) this).o.a(this, -2);
	OpenGL.glTexImage3Dub(((rg) this).i, 0, ((rg) this).k, ((gba) this).D,
			      ((gba) this).x, ((gba) this).B, 0,
			      ek.b(((rg) this).k, (byte) 29), 5121, null, 0);
	this.b(true, 17137);
    }
    
    static final void a(Player var_qi, int i) {
	z++;
	ql var_ql = (ql) gl.O.a(-32748, (long) ((Entity) var_qi).lb);
	if (var_ql == null)
	    kg.a(-119, var_qi, null, 0, null, ((Entity) var_qi).regionLocalX[0],
		 ((Entity) var_qi).regionLocalY[0], ((Animable) var_qi).height);
	else
	    var_ql.a((byte) -99);
	int i_4_ = -2 / ((-46 - i) / 63);
    }
    
    public final void a(int i) {
	OpenGL.glFramebufferTexture3DEXT(s, F, ((rg) this).i, 0, 0, 0);
	v++;
	s = -1;
	F = -1;
	if (i != 29468)
	    E = null;
    }
    
    public static void d(int i) {
	E = null;
	if (i != -1)
	    t = null;
	t = null;
	outScreenPlayerIDs = null;
    }
    
    final void a(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
		 int i_10_, int i_11_) {
	((rg) this).o.a(this, -2);
	A++;
	OpenGL.glCopyTexSubImage3D(((rg) this).i, i_11_, i_8_, i, i_6_, i_10_,
				   i_9_, i_5_, i_7_);
	OpenGL.glFlush();
    }
    
    static final void a(int i, boolean bool, File file) {
	if (fn.l == null)
	    er.a(-30983);
	u++;
	try {
	    if (i == -4496) {
		Class var_class
		    = (Class.forName
		       ("com.sun.management.HotSpotDiagnosticMXBean"));
		Method method
		    = (var_class.getDeclaredMethod
		       ("dumpHeap",
			(new Class[]
			 { I != null ? I : (I = a("java.lang.String")),
			   Boolean.TYPE })));
		method.invoke(fn.l, new Object[] { file.getAbsolutePath(),
						   new Boolean(bool) });
	    }
	} catch (Exception exception) {
	    System.out.println("HeapDump error:");
	    exception.printStackTrace();
	}
    }
    
    gba(qj var_qj, int i, int i_12_, int i_13_, int i_14_, byte[] is,
	int i_15_) {
	super(var_qj, 32879, i, i_14_ * i_12_ * i_13_, false);
	((gba) this).B = i_14_;
	((gba) this).D = i_12_;
	((gba) this).x = i_13_;
	((rg) this).o.a(this, -2);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((rg) this).i, 0, ((rg) this).k, ((gba) this).D,
			      ((gba) this).x, ((gba) this).B, 0, i_15_, 5121,
			      is, 0);
	OpenGL.glPixelStorei(3317, 4);
	this.b(true, 17137);
    }
    
    /*synthetic*/ static Class a(String string) {
	try {
	    return Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
