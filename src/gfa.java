/* gfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;

final class gfa implements aca
{
    private int a;
    private Font b;
    private int c;
    private int d;
    private int e;
    static int f;
    static int g;
    private boolean h;
    private int i;
    static int j;
    static int[] npcIndices = new int[1024];
    static int l;
    private Color m;
    static int n;
    private Image o;
    static int p;
    static int q;
    private Image r;
    private int s;
    private Image t;
    private FontMetrics u;
    private Image v;
    private Image w;
    static int x;
    static int y;
    static float[] z = new float[16];
    private int A;
    private Image B;
    static int C;
    private Image D;
    private boolean E;
    private int F;
    private int H;
    static int I;
    private Image J;
    static int K;
    private boolean L;
    static int M;
    static int N;
    private Image O;
    private Image P;
    static int Q;
    static int R;
    
    public final boolean a(long l, int i) {
	K++;
	if (i != 21336)
	    return false;
	return true;
    }
    
    private final int a(int i, int i_0_) {
	N++;
	if (i != 0)
	    return 68;
	if (L)
	    return (ff.width - i_0_) / 2;
	return 0;
    }
    
    private final void b(int i)
	throws IllegalAccessException, NoSuchFieldException {
	g++;
	Class var_class = vj.applet.getClass();
	v = (Image) a((byte) -101, "bar", var_class);
	B = (Image) a((byte) -101, "background", var_class);
	P = (Image) a((byte) -101, "left", var_class);
	o = (Image) a((byte) -101, "right", var_class);
	D = (Image) a((byte) -101, "top", var_class);
	t = (Image) a((byte) -101, "bottom", var_class);
	w = (Image) a((byte) -101, "bodyLeft", var_class);
	r = (Image) a((byte) -101, "bodyRight", var_class);
	J = (Image) a((byte) -101, "bodyFill", var_class);
	b = (Font) a((byte) -101, "bf", var_class);
	u = (FontMetrics) a((byte) -101, "bfm", var_class);
	m = (Color) a((byte) -101, "colourtext", var_class);
	Object object = a((byte) -101, "lb", var_class);
	Class var_class_1_ = object.getClass();
	L = a(var_class_1_, object, true, "xMiddle");
	E = a(var_class_1_, object, true, "yMiddle");
	H = a(var_class_1_, object, "xOffset", i - 12077);
	if (i == 0) {
	    a = a(var_class_1_, object, "yOffset", i ^ ~0x2f2c);
	    this.i = a(var_class_1_, object, "width", -12077);
	    F = a(var_class_1_, object, "height", -12077);
	    e = a(var_class_1_, object, "boxXOffset", -12077);
	    A = a(var_class_1_, object, "boxYOffset", -12077);
	    d = a(var_class_1_, object, "boxWidth", -12077);
	    c = a(var_class_1_, object, "textYOffset", -12077);
	    s = a(var_class_1_, object, "offsetPerTenCycles", -12077);
	}
    }
    
    public final void a(byte b) {
	tn.a((byte) 114);
	if (b != -22)
	    F = 56;
	y++;
    }
    
    public final int b(byte b) {
	q++;
	if (b < 74)
	    a((byte) 69);
	return 100;
    }
    
    static final float[] a(int i, float[] fs, int i_2_) {
	I++;
	float[] fs_3_ = new float[i_2_];
	co.a(fs, i, fs_3_, 0, i_2_);
	return fs_3_;
    }
    
    private final void c(int i) {
	l++;
	ii.a(Class_ub.W.d((byte) 86), Class_ub.W.e((byte) -29), uca.a[jr.colourId],
	     fh.a[jr.colourId], os.i[jr.colourId], 3);
	if (i != 0)
	    m = null;
    }
    
    public final void a(int i) {
	f++;
	if (i < 74)
	    a(55, null, -97);
    }
    
    public static void d(byte i) {
	z = null;
	if (i < 7)
	    npcIndices = null;
	npcIndices = null;
    }
    
    public final void a(boolean bool, boolean bool1) {
	n++;
	if (!h) {
	    if (vj.applet != null) {
		if (b == null) {
		    try {
			b((int) 0);
		    } catch (Exception exception) {
			h = true;
		    }
		}
	    } else
		h = true;
	}
	if (bool != true)
	    F = -79;
	if (h)
	    c((int) 0);
	else {
	    Graphics graphics = ru.canvas.getGraphics();
	    if (graphics == null)
		ru.canvas.repaint();
	    else {
		try {
		    int i = Class_ub.W.e((byte) -29);
		    String string = Class_ub.W.d((byte) 86);
		    if (dc.b == null)
			dc.b = ru.canvas.createImage(ff.width, eh.height);
		    Graphics graphics_5_ = dc.b.getGraphics();
		    int i_6_ = w.getWidth(null);
		    int i_7_ = r.getWidth(null);
		    int i_8_ = J.getWidth(null);
		    int i_9_ = w.getHeight(null);
		    int i_10_ = r.getHeight(null);
		    int i_11_ = J.getHeight(null);
		    graphics_5_.drawImage(w, a(0, i_6_) + e - d / 2,
					  a(i_9_, (byte) 104) + A, null);
		    int i_12_ = e - (d / 2 - i_6_);
		    int i_13_ = e + d / 2 - i_7_;
		    for (int i_14_ = i_12_; i_13_ >= i_14_; i_14_ += i_8_)
			graphics_5_.drawImage(J, a(0, i_6_) - (-e - i_14_),
					      a(i_11_, (byte) 104) + A, null);
		    graphics_5_.drawImage(r, a(0, i_7_) + e + d / 2,
					  a(i_10_, (byte) 104) + A, null);
		    int i_15_ = P.getWidth(null);
		    int i_16_ = P.getHeight(null);
		    int i_17_ = o.getWidth(null);
		    int i_18_ = o.getHeight(null);
		    int i_19_ = t.getHeight(null);
		    int i_20_ = D.getWidth(null);
		    int i_21_ = D.getHeight(null);
		    int i_22_ = t.getWidth(null);
		    int i_23_ = v.getWidth(null);
		    int i_24_ = B.getWidth(null);
		    int i_25_ = a(0, this.i) + H;
		    int i_26_ = a(F, (byte) 104) + a;
		    graphics_5_.drawImage(P, i_25_, i_26_ + (F - i_16_) / 2,
					  null);
		    graphics_5_.drawImage(o, this.i + i_25_ - i_17_,
					  (F - i_18_) / 2 + i_26_, null);
		    if (O == null)
			O = ru.canvas.createImage(this.i - i_15_ - i_17_, F);
		    Graphics graphics_27_ = O.getGraphics();
		    for (int i_28_ = 0; i_28_ < this.i - i_15_ - i_17_;
			 i_28_ += i_20_)
			graphics_27_.drawImage(D, i_28_, 0, null);
		    for (int i_29_ = 0; this.i - (i_15_ + i_17_) > i_29_;
			 i_29_ += i_22_)
			graphics_27_.drawImage(t, i_29_, F - i_19_, null);
		    int i_30_ = i * (this.i - i_17_ - i_15_) / 100;
		    if (i_30_ > 0) {
			Image image
			    = ru.canvas.createImage(i_30_, F - i_21_ - i_19_);
			int i_31_ = image.getWidth(null);
			Graphics graphics_32_ = image.getGraphics();
			int i_33_ = s * tda.a(783) / 10 % i_23_;
			for (int i_34_ = i_33_ - i_23_; i_31_ > i_34_;
			     i_34_ += i_23_)
			    graphics_32_.drawImage(v, i_34_, 0, null);
			graphics_27_.drawImage(image, 0, i_21_, null);
		    }
		    int i_35_ = i_30_;
		    i_30_ = this.i - i_15_ - i_17_ - i_30_;
		    if (i_30_ > 0) {
			Image image
			    = ru.canvas.createImage(i_30_, F - i_21_ - i_19_);
			int i_36_ = image.getWidth(null);
			Graphics graphics_37_ = image.getGraphics();
			for (int i_38_ = 0; i_38_ < i_36_; i_38_ += i_24_)
			    graphics_37_.drawImage(B, i_38_, 0, null);
			graphics_27_.drawImage(image, i_35_, i_21_, null);
		    }
		    graphics_5_.drawImage(O, i_15_ + i_25_, i_26_, null);
		    graphics_5_.setFont(b);
		    graphics_5_.setColor(m);
		    graphics_5_.drawString(string,
					   ((this.i - u.stringWidth(string))
					    / 2) + i_25_,
					   F / 2 + i_26_ + c + 4);
		    graphics.drawImage(dc.b, 0, 0, null);
		} catch (Exception exception) {
		    h = true;
		}
	    }
	}
    }
    
    private final int a
	(Class var_class, Object object, String string, int i)
	throws IllegalAccessException, NoSuchFieldException {
	if (i != -12077)
	    t = null;
	x++;
	Field field = var_class.getDeclaredField(string);
	return field.getInt(object);
    }
    
    private final int a(int i, byte i_39_) {
	p++;
	if (E)
	    return (eh.height - i) / 2;
	if (i_39_ != 104)
	    a((byte) 43);
	return 0;
    }
    
    private final boolean a
	(Class var_class, Object object, boolean bool, String string)
	throws IllegalAccessException, NoSuchFieldException {
	Q++;
	if (bool != true)
	    return true;
	Field field = var_class.getDeclaredField(string);
	return field.getBoolean(object);
    }
    
    private final Object a(byte i, String string, Class var_class)
	throws IllegalAccessException, NoSuchFieldException {
	j++;
	if (i != -101)
	    d((byte) -76);
	Field field = var_class.getDeclaredField(string);
	Object object = field.get(vj.applet);
	field.set(vj.applet, null);
	return object;
    }
    
    public gfa() {
	/* empty */
    }
    
    public final int c(byte b) {
	R++;
	if (b > -88)
	    return 55;
	return 0;
    }
}
