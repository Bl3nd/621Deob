/* Class_r - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

abstract class Class_r
{
    static GameInPacket bigInterfaceConfigGameInPacket = new GameInPacket(34, 8);
    int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    fa j;
    static int k;
    static int l;
    static int m;
    static int n;
    
    abstract void IA(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		     byte[] is, int i_5_, int i_6_);
    
    abstract void JA();
    
    abstract void da(int i, int i_7_, int i_8_, int i_9_);
    
    abstract boolean O(int i, int i_10_, int i_11_, int i_12_, int i_13_,
		       int i_14_);
    
    abstract int[] v();
    
    abstract void AA(int i, int i_15_, int i_16_, int[] is);
    
    abstract void a();
    
    abstract int c();
    
    abstract void L();
    
    abstract boolean d();
    
    abstract boolean e();
    
    abstract void a(int i, gga[] var_ggas);
    
    final void a(int i, byte i_17_, int i_18_, int i_19_, int i_20_) {
	l++;
	if (i_17_ == 4)
	    m(i, i_20_, i_19_, i_18_, 1);
    }
    
    abstract void a(int i, int i_21_, int i_22_, int i_23_, int i_24_,
		    int i_25_);
    
    abstract da a(eg var_eg, int i, int i_26_, int i_27_, int i_28_);
    
    abstract boolean f();
    
    abstract void a(ir var_ir);
    
    abstract void ZA(boolean bool);
    
    abstract boolean g();
    
    abstract Class_i a(int i, int i_29_, int[][] is, int[][] is_30_, int i_31_,
		       int i_32_, int i_33_);
    
    abstract boolean h();
    
    abstract boolean i();
    
    abstract void CA(int i, int i_34_, int i_35_, int i_36_);
    
    abstract void j();
    
    abstract void a(boolean bool);
    
    final void b(int i, int i_37_, int i_38_, int i_39_, int i_40_,
		 int i_41_) {
	if (i_40_ == 20822) {
	    c(i_39_, i_37_, i, i_38_, i_41_, 1);
	    e++;
	}
    }
    
    abstract void a(Canvas canvas);
    
    abstract void a(Rectangle[] rectangles, int i) throws uo;
    
    abstract void k();
    
    abstract void pa(int i, int i_42_, int i_43_);
    
    abstract f a(int i, int i_44_, boolean bool);
    
    abstract void ya();
    
    abstract void a(int i);
    
    abstract boolean l();
    
    abstract void e(int i, int i_45_, int i_46_, int i_47_, int i_48_);
    
    abstract void GA(int i, int i_49_);
    
    abstract void b(Canvas canvas);
    
    abstract boolean m();
    
    abstract gga a(int i, int i_50_, int i_51_, int i_52_, int i_53_, float f);
    
    abstract int BA();
    
    abstract jt a(jt var_jt, jt var_jt_54_, float f, jt var_jt_55_);
    
    abstract void a(int[] is);
    
    abstract void la(int i, int i_56_, int i_57_, int i_58_);
    
    abstract int[] h(int i, int i_59_, int i_60_, int i_61_);
    
    abstract void c(int i, int i_62_, int i_63_, int i_64_, int i_65_,
		    int i_66_);
    
    static final synchronized Class_r a(int i, int i_67_, fa var_fa,
					Canvas canvas, pl var_pl, int i_68_) {
	n++;
	if (i_67_ == 0)
	    return wea.a(var_fa, canvas, (byte) -25);
	if (i_67_ == 2)
	    return ee.a(canvas, (byte) 105, var_fa);
	if (i_67_ == 1)
	    return pg.a(i, canvas, var_fa, 191);
	if (i_67_ == 5)
	    return aa.a(var_fa, canvas, i, (byte) -94, var_pl);
	if (i_68_ != -19464)
	    bigInterfaceConfigGameInPacket = null;
	if (i_67_ == 3)
	    return aq.a(-110, var_pl, canvas, var_fa, i);
	throw new IllegalArgumentException("UM");
    }
    
    abstract jt d(int i, int i_69_, int i_70_, int i_71_, int i_72_,
		  int i_73_);
    
    abstract int a(int i, int i_74_);
    
    abstract void m(int i, int i_75_, int i_76_, int i_77_, int i_78_);
    
    abstract int T();
    
    abstract int b(int i, int i_79_);
    
    abstract void a(Class_q class_q);
    
    abstract boolean n();
    
    abstract boolean o();
    
    abstract void a(int i, int i_80_, int i_81_, int i_82_, int i_83_,
		    int i_84_, int i_85_, int i_86_, int i_87_, int i_88_);
    
    final void a(f var_f, int i) {
	if (i != 5)
	    d();
	a(var_f, true);
	h++;
    }
    
    abstract int b();
    
    abstract Class_q p();
    
    abstract void XA(int i, int i_89_, int i_90_, int i_91_, int i_92_);
    
    abstract void a(Class_e class_e);
    
    final void e(int i, int i_93_, int i_94_, int i_95_, int i_96_,
		 int i_97_) {
	a(i_96_, i_93_, i_97_, i_95_, i_94_, i);
	c++;
    }
    
    abstract la a(sa var_sa, aga[] var_agas, boolean bool);
    
    abstract f a(int[] is, int i, int i_98_, int i_99_, int i_100_);
    
    abstract void c(Canvas canvas);
    
    abstract void q();
    
    abstract void b(int i);
    
    abstract boolean r();
    
    abstract void MA(int i, int i_101_, int i_102_, int[] is);
    
    abstract void s();
    
    abstract void oa(int[] is);
    
    abstract void ja(int i);
    
    final void b(int i, byte i_103_, int i_104_, int i_105_, int i_106_) {
	if (i_103_ != 11)
	    d(97);
	f++;
	XA(i_104_, i, i_105_, i_106_, 1);
    }
    
    abstract void a(int i, int i_107_, int i_108_, int i_109_);
    
    abstract void V(int i, int i_110_, int i_111_, int i_112_);
    
    abstract Class_e c(int i);
    
    abstract Class_q t();
    
    abstract void J(int i, int i_113_, int i_114_, int i_115_, int i_116_,
		    int i_117_);
    
    abstract f a(int i, int i_118_, int i_119_, int i_120_, boolean bool);
    
    abstract void YA(int i, int i_121_, int i_122_, int i_123_);
    
    abstract void a(f var_f, boolean bool);
    
    abstract void u() throws uo;
    
    abstract void d(int i);
    
    abstract ua a(int i, int i_124_, int[] is, int[] is_125_);
    
    abstract void a(int i, int i_126_, int i_127_, int i_128_, int i_129_,
		    int i_130_, int i_131_);
    
    abstract void b(boolean bool);
    
    public static void e(int i) {
	if (i != -2)
	    bigInterfaceConfigGameInPacket = null;
	bigInterfaceConfigGameInPacket = null;
    }
    
    abstract void f(int i);
    
    abstract void w();
    
    abstract boolean x();
    
    abstract GraphicsCard y();
    
    abstract boolean z();
    
    abstract void g(int i);
    
    abstract void A();
    
    abstract void d(Canvas canvas);
    
    Class_r(fa var_fa) {
	((Class_r) this).j = var_fa;
	int i = -1;
	for (int i_132_ = 0; i_132_ < 8; i_132_++) {
	    if (!ea.M[i_132_]) {
		i = i_132_;
		ea.M[i_132_] = true;
		break;
	    }
	}
	if (i == -1)
	    throw new IllegalStateException("NFTI");
	((Class_r) this).b = i;
    }
    
    abstract int U();
    
    abstract void a(jt var_jt);
    
    abstract void va(int i);
    
    static final void a(int i, int i_133_, int i_134_, int i_135_,
			byte i_136_) {
	Class_r.i++;
	tba var_tba = gr.b(-98);
        System.out.println("[Class_r");
	((tba) var_tba).loginStream.writeByte(((SpecialOutPacket) hea.l).packetID, (byte) -122);
	((tba) var_tba).loginStream.writeByte(i, (byte) -116);
	((tba) var_tba).loginStream.writeByte(i_135_, (byte) -113);
	((tba) var_tba).loginStream.writeShort(i_134_, 13469);
	int i_137_ = 95 % ((-43 - i_136_) / 42);
	((tba) var_tba).loginStream.writeShort(i_133_, 13469);
	ud.a(var_tba, (byte) -36);
	Class_eb.q = 1;
	lr.j = 0;
	tfa.u = 0;
	jp.s = -3;
    }
    
    abstract void VA(int i, float f, float f_138_, float f_139_, float f_140_,
		     float f_141_);
    
    abstract boolean B();
    
    final void a(int i, int i_142_, int i_143_, int i_144_, int i_145_) {
	int i_146_ = 46 % ((67 - i) / 33);
	e(i_143_, i_144_, i_145_, i_142_, 1);
	k++;
    }
    
    abstract f a(aga var_aga, boolean bool);
    
    protected void finalize() {
	h(1);
	m++;
    }
    
    abstract void a(ir var_ir, int i);
    
    abstract int DA();
    
    abstract Class_q C();
    
    abstract void ra(float f);
    
    abstract void a(int i, int i_147_, int i_148_, int i_149_, int i_150_,
		    int i_151_, ua var_ua, int i_152_, int i_153_);
    
    abstract void a(float f, float f_154_, float f_155_);
    
    abstract void FA(int i, ua var_ua, int i_156_, int i_157_);
    
    final void f(int i, int i_158_, int i_159_, int i_160_, int i_161_,
		 int i_162_) {
	J(i_158_, i_159_, i_162_, i_161_, i, i_160_);
	d++;
    }
    
    final void h(int i) {
	if (i == 1) {
	    g++;
	    ea.M[((Class_r) this).b] = false;
	    A();
	}
    }
}
