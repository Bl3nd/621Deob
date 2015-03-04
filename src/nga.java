/* nga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;

final class nga extends Class_r
{
    private boolean o = false;
    private Canvas p;
    private int q;
    private boolean r = false;
    private nc s;
    private il t = new il(4);
    int u;
    int v;
    int w;
    int x;
    int y;
    private int z;
    int A;
    int B;
    int C;
    private tb D;
    int E;
    private lfa[] F;
    int G;
    int[] H;
    private boolean I = false;
    private tb J;
    private int K;
    int L;
    int M;
    private int N;
    int O;
    int P;
    int Q;
    int R;
    private int S;
    private int T;
    int[] U;
    int V;
    int W;
    int X;
    int Y;
    private f Z;
    int ab;
    rd bb;
    int cb;
    private f db;
    private int eb;
    
    final la a(sa var_sa, aga[] var_agas, boolean bool) {
	int[] is = new int[var_agas.length];
	int[] is_0_ = new int[var_agas.length];
	boolean bool_1_ = false;
	for (int i = 0; i < var_agas.length; i++) {
	    is[i] = ((aga) var_agas[i]).b;
	    is_0_[i] = ((aga) var_agas[i]).d;
	    if (((aga) var_agas[i]).f != null)
		bool_1_ = true;
	}
	if (bool) {
	    if (bool_1_)
		return new tk(this, var_sa, var_agas, is, is_0_);
	    return new np(this, var_sa, var_agas, is, is_0_);
	}
	if (bool_1_)
	    throw new IllegalArgumentException("");
	return new rs(this, var_sa, var_agas, is, is_0_);
    }
    
    final int c() {
	return 0;
    }
    
    final jt d(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
	return null;
    }
    
    final boolean O(int i, int i_7_, int i_8_, int i_9_, int i_10_,
		    int i_11_) {
	float f = (((rd) ((nga) this).bb).q * (float) i
		   + ((rd) ((nga) this).bb).M * (float) i_7_
		   + ((rd) ((nga) this).bb).C * (float) i_8_
		   + ((rd) ((nga) this).bb).B);
	if (f < 1.0F)
	    f = 1.0F;
	float f_12_ = (((rd) ((nga) this).bb).q * (float) i_9_
		       + ((rd) ((nga) this).bb).M * (float) i_10_
		       + ((rd) ((nga) this).bb).C * (float) i_11_
		       + ((rd) ((nga) this).bb).B);
	if (f_12_ < 1.0F)
	    f_12_ = 1.0F;
	if (f < (float) ((nga) this).M && f_12_ < (float) ((nga) this).M
	    || f > (float) ((nga) this).W && f_12_ > (float) ((nga) this).W)
	    return false;
	int i_13_ = (int) ((float) ((nga) this).L
			   * (((rd) ((nga) this).bb).z * (float) i
			      + ((rd) ((nga) this).bb).m * (float) i_7_
			      + ((rd) ((nga) this).bb).s * (float) i_8_
			      + ((rd) ((nga) this).bb).v)
			   / f);
	int i_14_ = (int) ((float) ((nga) this).L
			   * (((rd) ((nga) this).bb).z * (float) i_9_
			      + ((rd) ((nga) this).bb).m * (float) i_10_
			      + ((rd) ((nga) this).bb).s * (float) i_11_
			      + ((rd) ((nga) this).bb).v)
			   / f_12_);
	if (i_13_ < ((nga) this).v && i_14_ < ((nga) this).v
	    || i_13_ > ((nga) this).E && i_14_ > ((nga) this).E)
	    return false;
	int i_15_ = (int) ((float) ((nga) this).O
			   * (((rd) ((nga) this).bb).i * (float) i
			      + ((rd) ((nga) this).bb).k * (float) i_7_
			      + ((rd) ((nga) this).bb).w * (float) i_8_
			      + ((rd) ((nga) this).bb).o)
			   / f);
	int i_16_ = (int) ((float) ((nga) this).O
			   * (((rd) ((nga) this).bb).i * (float) i_9_
			      + ((rd) ((nga) this).bb).k * (float) i_10_
			      + ((rd) ((nga) this).bb).w * (float) i_11_
			      + ((rd) ((nga) this).bb).o)
			   / f_12_);
	if (i_15_ < ((nga) this).ab && i_16_ < ((nga) this).ab
	    || i_15_ > ((nga) this).P && i_16_ > ((nga) this).P)
	    return false;
	return true;
    }
    
    final void e(int i, int i_17_, int i_18_, int i_19_, int i_20_) {
	if (i_18_ < 0)
	    i_18_ = -i_18_;
	int i_21_ = i_17_ - i_18_;
	if (i_21_ < ((nga) this).u)
	    i_21_ = ((nga) this).u;
	int i_22_ = i_17_ + i_18_ + 1;
	if (i_22_ > ((nga) this).cb)
	    i_22_ = ((nga) this).cb;
	int i_23_ = i_21_;
	int i_24_ = i_18_ * i_18_;
	int i_25_ = 0;
	int i_26_ = i_17_ - i_23_;
	int i_27_ = i_26_ * i_26_;
	int i_28_ = i_27_ - i_26_;
	if (i_17_ > i_22_)
	    i_17_ = i_22_;
	int i_29_ = i_19_ >>> 24;
	if (i_20_ == 0 || i_20_ == 1 && i_29_ == 255) {
	    while (i_23_ < i_17_) {
		for (/**/; i_28_ <= i_24_ || i_27_ <= i_24_;
		     i_28_ += i_25_++ + i_25_)
		    i_27_ += i_25_ + i_25_;
		int i_30_ = i - i_25_ + 1;
		if (i_30_ < ((nga) this).Y)
		    i_30_ = ((nga) this).Y;
		int i_31_ = i + i_25_;
		if (i_31_ > ((nga) this).B)
		    i_31_ = ((nga) this).B;
		int i_32_ = i_30_ + i_23_ * ((nga) this).C;
		for (int i_33_ = i_30_; i_33_ < i_31_; i_33_++)
		    ((nga) this).H[i_32_++] = i_19_;
		i_23_++;
		i_27_ -= i_26_-- + i_26_;
		i_28_ -= i_26_ + i_26_;
	    }
	    i_25_ = i_18_;
	    i_26_ = i_23_ - i_17_;
	    i_28_ = i_26_ * i_26_ + i_24_;
	    i_27_ = i_28_ - i_25_;
	    i_28_ -= i_26_;
	    while (i_23_ < i_22_) {
		for (/**/; i_28_ > i_24_ && i_27_ > i_24_;
		     i_27_ -= i_25_ + i_25_)
		    i_28_ -= i_25_-- + i_25_;
		int i_34_ = i - i_25_;
		if (i_34_ < ((nga) this).Y)
		    i_34_ = ((nga) this).Y;
		int i_35_ = i + i_25_;
		if (i_35_ > ((nga) this).B - 1)
		    i_35_ = ((nga) this).B - 1;
		int i_36_ = i_34_ + i_23_ * ((nga) this).C;
		for (int i_37_ = i_34_; i_37_ <= i_35_; i_37_++)
		    ((nga) this).H[i_36_++] = i_19_;
		i_23_++;
		i_28_ += i_26_ + i_26_;
		i_27_ += i_26_++ + i_26_;
	    }
	} else if (i_20_ == 1) {
	    i_19_
		= (((i_19_ & 0xff00ff) * i_29_ >> 8 & 0xff00ff)
		   + ((i_19_ & 0xff00) * i_29_ >> 8 & 0xff00) + (i_29_ << 24));
	    int i_38_ = 256 - i_29_;
	    while (i_23_ < i_17_) {
		for (/**/; i_28_ <= i_24_ || i_27_ <= i_24_;
		     i_28_ += i_25_++ + i_25_)
		    i_27_ += i_25_ + i_25_;
		int i_39_ = i - i_25_ + 1;
		if (i_39_ < ((nga) this).Y)
		    i_39_ = ((nga) this).Y;
		int i_40_ = i + i_25_;
		if (i_40_ > ((nga) this).B)
		    i_40_ = ((nga) this).B;
		int i_41_ = i_39_ + i_23_ * ((nga) this).C;
		for (int i_42_ = i_39_; i_42_ < i_40_; i_42_++) {
		    int i_43_ = ((nga) this).H[i_41_];
		    i_43_ = (((i_43_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff)
			     + ((i_43_ & 0xff00) * i_38_ >> 8 & 0xff00));
		    ((nga) this).H[i_41_++] = i_19_ + i_43_;
		}
		i_23_++;
		i_27_ -= i_26_-- + i_26_;
		i_28_ -= i_26_ + i_26_;
	    }
	    i_25_ = i_18_;
	    i_26_ = -i_26_;
	    i_28_ = i_26_ * i_26_ + i_24_;
	    i_27_ = i_28_ - i_25_;
	    i_28_ -= i_26_;
	    while (i_23_ < i_22_) {
		for (/**/; i_28_ > i_24_ && i_27_ > i_24_;
		     i_27_ -= i_25_ + i_25_)
		    i_28_ -= i_25_-- + i_25_;
		int i_44_ = i - i_25_;
		if (i_44_ < ((nga) this).Y)
		    i_44_ = ((nga) this).Y;
		int i_45_ = i + i_25_;
		if (i_45_ > ((nga) this).B - 1)
		    i_45_ = ((nga) this).B - 1;
		int i_46_ = i_44_ + i_23_ * ((nga) this).C;
		for (int i_47_ = i_44_; i_47_ <= i_45_; i_47_++) {
		    int i_48_ = ((nga) this).H[i_46_];
		    i_48_ = (((i_48_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff)
			     + ((i_48_ & 0xff00) * i_38_ >> 8 & 0xff00));
		    ((nga) this).H[i_46_++] = i_19_ + i_48_;
		}
		i_23_++;
		i_28_ += i_26_ + i_26_;
		i_27_ += i_26_++ + i_26_;
	    }
	} else if (i_20_ == 2) {
	    while (i_23_ < i_17_) {
		for (/**/; i_28_ <= i_24_ || i_27_ <= i_24_;
		     i_28_ += i_25_++ + i_25_)
		    i_27_ += i_25_ + i_25_;
		int i_49_ = i - i_25_ + 1;
		if (i_49_ < ((nga) this).Y)
		    i_49_ = ((nga) this).Y;
		int i_50_ = i + i_25_;
		if (i_50_ > ((nga) this).B)
		    i_50_ = ((nga) this).B;
		int i_51_ = i_49_ + i_23_ * ((nga) this).C;
		for (int i_52_ = i_49_; i_52_ < i_50_; i_52_++) {
		    int i_53_ = ((nga) this).H[i_51_];
		    int i_54_ = i_19_ + i_53_;
		    int i_55_ = (i_19_ & 0xff00ff) + (i_53_ & 0xff00ff);
		    i_53_ = (i_55_ & 0x1000100) + (i_54_ - i_55_ & 0x10000);
		    ((nga) this).H[i_51_++]
			= i_54_ - i_53_ | i_53_ - (i_53_ >>> 8);
		}
		i_23_++;
		i_27_ -= i_26_-- + i_26_;
		i_28_ -= i_26_ + i_26_;
	    }
	    i_25_ = i_18_;
	    i_26_ = -i_26_;
	    i_28_ = i_26_ * i_26_ + i_24_;
	    i_27_ = i_28_ - i_25_;
	    i_28_ -= i_26_;
	    while (i_23_ < i_22_) {
		for (/**/; i_28_ > i_24_ && i_27_ > i_24_;
		     i_27_ -= i_25_ + i_25_)
		    i_28_ -= i_25_-- + i_25_;
		int i_56_ = i - i_25_;
		if (i_56_ < ((nga) this).Y)
		    i_56_ = ((nga) this).Y;
		int i_57_ = i + i_25_;
		if (i_57_ > ((nga) this).B - 1)
		    i_57_ = ((nga) this).B - 1;
		int i_58_ = i_56_ + i_23_ * ((nga) this).C;
		for (int i_59_ = i_56_; i_59_ <= i_57_; i_59_++) {
		    int i_60_ = ((nga) this).H[i_58_];
		    int i_61_ = i_19_ + i_60_;
		    int i_62_ = (i_19_ & 0xff00ff) + (i_60_ & 0xff00ff);
		    i_60_ = (i_62_ & 0x1000100) + (i_61_ - i_62_ & 0x10000);
		    ((nga) this).H[i_58_++]
			= i_61_ - i_60_ | i_60_ - (i_60_ >>> 8);
		}
		i_23_++;
		i_28_ += i_26_ + i_26_;
		i_27_ += i_26_++ + i_26_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    final jt a(jt var_jt, jt var_jt_63_, float f, jt var_jt_64_) {
	return null;
    }
    
    private final void D() {
	for (int i = 0; i < ((nga) this).V; i++)
	    F[i].a((int) 117);
	JA();
    }
    
    final int b(int i, int i_65_) {
	i |= 0x20800;
	return i & i_65_ ^ i_65_;
    }
    
    final void b(boolean bool) {
	I = bool;
	D.a(18385);
    }
    
    final void da(int i, int i_66_, int i_67_, int i_68_) {
	if (i < 0)
	    i = 0;
	if (i_66_ < 0)
	    i_66_ = 0;
	if (i_67_ > ((nga) this).C)
	    i_67_ = ((nga) this).C;
	if (i_68_ > z)
	    i_68_ = z;
	((nga) this).Y = i;
	((nga) this).B = i_67_;
	((nga) this).u = i_66_;
	((nga) this).cb = i_68_;
	F();
    }
    
    final void f(int i) {
	F[i].a(Thread.currentThread(), 105);
    }
    
    final void JA() {
	((nga) this).Y = 0;
	((nga) this).u = 0;
	((nga) this).B = ((nga) this).C;
	((nga) this).cb = z;
	F();
    }
    
    final void AA(int i, int i_69_, int i_70_, int[] is) {
	float f = (((rd) ((nga) this).bb).B
		   + (((rd) ((nga) this).bb).q * (float) i
		      + ((rd) ((nga) this).bb).M * (float) i_69_
		      + ((rd) ((nga) this).bb).C * (float) i_70_));
	if (f < (float) ((nga) this).M || f > (float) ((nga) this).W)
	    is[0] = is[1] = is[2] = -1;
	else {
	    int i_71_
		= (int) ((float) ((nga) this).L
			 * (((rd) ((nga) this).bb).v
			    + (((rd) ((nga) this).bb).z * (float) i
			       + ((rd) ((nga) this).bb).m * (float) i_69_
			       + ((rd) ((nga) this).bb).s * (float) i_70_))
			 / f);
	    int i_72_
		= (int) ((float) ((nga) this).O
			 * (((rd) ((nga) this).bb).o
			    + (((rd) ((nga) this).bb).i * (float) i
			       + ((rd) ((nga) this).bb).k * (float) i_69_
			       + ((rd) ((nga) this).bb).w * (float) i_70_))
			 / f);
	    if (i_71_ >= ((nga) this).v && i_71_ <= ((nga) this).E
		&& i_72_ >= ((nga) this).ab && i_72_ <= ((nga) this).P) {
		is[0] = i_71_ - ((nga) this).v;
		is[1] = i_72_ - ((nga) this).ab;
		is[2] = (int) f;
	    } else
		is[0] = is[1] = is[2] = -1;
	}
    }
    
    final f a(aga var_aga, boolean bool) {
	int[] is = ((aga) var_aga).i;
	byte[] is_73_ = ((aga) var_aga).c;
	int i = ((aga) var_aga).b;
	int i_74_ = ((aga) var_aga).d;
	qp var_qp;
	if (bool && ((aga) var_aga).f == null) {
	    int[] is_75_ = new int[is.length];
	    byte[] is_76_ = new byte[i * i_74_];
	    for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
		int i_78_ = i_77_ * i;
		for (int i_79_ = 0; i_79_ < i; i_79_++)
		    is_76_[i_78_ + i_79_] = is_73_[i_78_ + i_79_];
	    }
	    for (int i_80_ = 0; i_80_ < is.length; i_80_++)
		is_75_[i_80_] = is[i_80_];
	    var_qp = new lga(this, is_76_, is_75_, i, i_74_);
	} else {
	    int[] is_81_ = new int[i * i_74_];
	    byte[] is_82_ = ((aga) var_aga).f;
	    if (is_82_ != null) {
		for (int i_83_ = 0; i_83_ < i_74_; i_83_++) {
		    int i_84_ = i_83_ * i;
		    for (int i_85_ = 0; i_85_ < i; i_85_++)
			is_81_[i_84_ + i_85_]
			    = (is[is_73_[i_84_ + i_85_] & 0xff]
			       | is_82_[i_84_ + i_85_] << 24);
		}
		var_qp = new bp(this, is_81_, i, i_74_);
	    } else {
		for (int i_86_ = 0; i_86_ < i_74_; i_86_++) {
		    int i_87_ = i_86_ * i;
		    for (int i_88_ = 0; i_88_ < i; i_88_++) {
			int i_89_ = is[is_73_[i_87_ + i_88_] & 0xff];
			is_81_[i_87_ + i_88_]
			    = i_89_ != 0 ? ~0xffffff | i_89_ : 0;
		    }
		}
		var_qp = new TransparentSprite(this, is_81_, i, i_74_);
	    }
	}
	var_qp.Q(((aga) var_aga).e, ((aga) var_aga).g, ((aga) var_aga).a,
		 ((aga) var_aga).h);
	return var_qp;
    }
    
    final void a(ir var_ir) {
	lfa var_lfa = a(Thread.currentThread());
	Class_wb class_wb = ((nr) ((ir) var_ir).a).j;
	for (Class_wb class_wb_90_ = ((Class_wb) class_wb).h;
	     class_wb_90_ != class_wb;
	     class_wb_90_ = ((Class_wb) class_wb_90_).h) {
	    mm var_mm = (mm) class_wb_90_;
	    int i = ((mm) var_mm).w >> 12;
	    int i_91_ = ((mm) var_mm).t >> 12;
	    int i_92_ = ((mm) var_mm).r >> 12;
	    float f = (((rd) ((nga) this).bb).B
		       + (((rd) ((nga) this).bb).q * (float) i
			  + ((rd) ((nga) this).bb).M * (float) i_91_
			  + ((rd) ((nga) this).bb).C * (float) i_92_));
	    if (!(f < (float) ((nga) this).M)
		&& !(f > (float) ((lfa) var_lfa).a)) {
		int i_93_
		    = (((nga) this).X
		       + (int) ((float) ((nga) this).L
				* (((rd) ((nga) this).bb).v
				   + (((rd) ((nga) this).bb).z * (float) i
				      + (((rd) ((nga) this).bb).m
					 * (float) i_91_)
				      + (((rd) ((nga) this).bb).s
					 * (float) i_92_)))
				/ f));
		int i_94_
		    = (((nga) this).y
		       + (int) ((float) ((nga) this).O
				* (((rd) ((nga) this).bb).o
				   + (((rd) ((nga) this).bb).i * (float) i
				      + (((rd) ((nga) this).bb).k
					 * (float) i_91_)
				      + (((rd) ((nga) this).bb).w
					 * (float) i_92_)))
				/ f));
		if (i_93_ >= ((nga) this).Y && i_93_ <= ((nga) this).B
		    && i_94_ >= ((nga) this).u && i_94_ <= ((nga) this).cb) {
		    if (f == 0.0F)
			f = 1.0F;
		    a(var_mm, i_93_, i_94_, (int) f,
		      (int) ((float) (((mm) var_mm).o * ((nga) this).L >> 12)
			     / f));
		}
	    }
	}
    }
    
    final void u() throws uo {
	if (p == null || s == null)
	    throw new IllegalStateException("off");
	try {
	    Graphics graphics = p.getGraphics();
	    s.a(0, 0, graphics, (byte) -20);
	} catch (Exception exception) {
	    p.repaint();
	}
    }
    
    final boolean f() {
	return false;
    }
    
    final void a(int[] is) {
	is[0] = ((nga) this).C;
	is[1] = z;
    }
    
    final void b(Canvas canvas) {
	nc var_nc = (nc) t.a(-32748, (long) canvas.hashCode());
	if (var_nc != null) {
	    var_nc.unlink(-86);
	    var_nc = ol.a(256, canvas);
	    t.a(var_nc, (byte) -65, (long) canvas.hashCode());
	    if (p == canvas && Z == null) {
		s = var_nc;
		((nga) this).H = ((nc) var_nc).k;
		((nga) this).C = ((nc) var_nc).p;
		z = ((nc) var_nc).q;
		if (((nga) this).C != N || z != K) {
		    N = ((nga) this).C;
		    K = z;
		    ((nga) this).U = new int[N * K];
		}
		D();
	    }
	}
    }
    
    final void V(int i, int i_95_, int i_96_, int i_97_) {
	if (((nga) this).Y < i)
	    ((nga) this).Y = i;
	if (((nga) this).u < i_95_)
	    ((nga) this).u = i_95_;
	if (((nga) this).B > i_96_)
	    ((nga) this).B = i_96_;
	if (((nga) this).cb > i_97_)
	    ((nga) this).cb = i_97_;
	F();
    }
    
    final void a(Canvas canvas) {
	if (canvas != null) {
	    nc var_nc = (nc) t.a(-32748, (long) canvas.hashCode());
	    if (var_nc != null) {
		p = canvas;
		s = var_nc;
		if (Z == null) {
		    ((nga) this).H = ((nc) var_nc).k;
		    ((nga) this).C = ((nc) var_nc).p;
		    z = ((nc) var_nc).q;
		    if (((nga) this).C != N || z != K) {
			N = ((nga) this).C;
			K = z;
			((nga) this).U = new int[N * K];
		    }
		    D();
		}
	    }
	} else {
	    p = null;
	    s = null;
	    if (Z == null) {
		((nga) this).H = null;
		((nga) this).C = z = 1;
		N = K = 1;
		D();
	    }
	}
    }
    
    final boolean E() {
	return o;
    }
    
    final void ra(float f) {
	((nga) this).A = (int) (f * 65535.0F);
    }
    
    final void a(int i, int i_98_, int i_99_, int i_100_, int i_101_,
		 int i_102_, ua var_ua, int i_103_, int i_104_) {
	nu var_nu = (nu) var_ua;
	int[] is = ((nu) var_nu).g;
	int[] is_105_ = ((nu) var_nu).k;
	int i_106_ = ((nga) this).u > i_104_ ? ((nga) this).u : i_104_;
	int i_107_ = (((nga) this).cb < i_104_ + is.length ? ((nga) this).cb
		      : i_104_ + is.length);
	i_99_ -= i;
	i_100_ -= i_98_;
	if (i_99_ + i_100_ < 0) {
	    i += i_99_;
	    i_99_ = -i_99_;
	    i_98_ += i_100_;
	    i_100_ = -i_100_;
	}
	if (i_99_ > i_100_) {
	    i_98_ <<= 16;
	    i_98_ += 32768;
	    i_100_ <<= 16;
	    int i_108_
		= (int) Math.floor((double) i_100_ / (double) i_99_ + 0.5);
	    i_99_ += i;
	    if (i < ((nga) this).Y) {
		i_98_ += i_108_ * (((nga) this).Y - i);
		i = ((nga) this).Y;
	    }
	    if (i_99_ >= ((nga) this).B)
		i_99_ = ((nga) this).B - 1;
	    int i_109_ = i_101_ >>> 24;
	    if (i_102_ == 0 || i_102_ == 1 && i_109_ == 255) {
		for (/**/; i <= i_99_; i++) {
		    int i_110_ = i_98_ >> 16;
		    int i_111_ = i_110_ - i_104_;
		    if (i_110_ >= i_106_ && i_110_ < i_107_) {
			int i_112_ = i_103_ + is[i_111_];
			if (i >= i_112_ && i < i_112_ + is_105_[i_111_])
			    ((nga) this).H[i + i_110_ * ((nga) this).C]
				= i_101_;
		    }
		    i_98_ += i_108_;
		}
		return;
	    }
	    if (i_102_ == 1) {
		i_101_ = (((i_101_ & 0xff00ff) * i_109_ >> 8 & 0xff00ff)
			  + ((i_101_ & 0xff00) * i_109_ >> 8 & 0xff00)
			  + (i_109_ << 24));
		int i_113_ = 256 - i_109_;
		for (/**/; i <= i_99_; i++) {
		    int i_114_ = i_98_ >> 16;
		    int i_115_ = i_114_ - i_104_;
		    if (i_114_ >= i_106_ && i_114_ < i_107_) {
			int i_116_ = i_103_ + is[i_115_];
			if (i >= i_116_ && i < i_116_ + is_105_[i_115_]) {
			    int i_117_ = i + i_114_ * ((nga) this).C;
			    int i_118_ = ((nga) this).H[i_117_];
			    i_118_ = (((i_118_ & 0xff00ff) * i_113_ >> 8
				       & 0xff00ff)
				      + ((i_118_ & 0xff00) * i_113_ >> 8
					 & 0xff00));
			    ((nga) this).H[i_117_] = i_101_ + i_118_;
			}
		    }
		    i_98_ += i_108_;
		}
		return;
	    }
	    if (i_102_ == 2) {
		for (/**/; i <= i_99_; i++) {
		    int i_119_ = i_98_ >> 16;
		    int i_120_ = i_119_ - i_104_;
		    if (i_119_ >= i_106_ && i_119_ < i_107_) {
			int i_121_ = i_103_ + is[i_120_];
			if (i >= i_121_ && i < i_121_ + is_105_[i_120_]) {
			    int i_122_ = i + i_119_ * ((nga) this).C;
			    int i_123_ = ((nga) this).H[i_122_];
			    int i_124_ = i_101_ + i_123_;
			    int i_125_
				= (i_101_ & 0xff00ff) + (i_123_ & 0xff00ff);
			    i_123_ = (i_125_ & 0x1000100) + (i_124_ - i_125_
							     & 0x10000);
			    ((nga) this).H[i_122_]
				= i_124_ - i_123_ | i_123_ - (i_123_ >>> 8);
			}
		    }
		    i_98_ += i_108_;
		}
		return;
	    }
	    throw new IllegalArgumentException();
	}
	i <<= 16;
	i += 32768;
	i_99_ <<= 16;
	int i_126_ = (int) Math.floor((double) i_99_ / (double) i_100_ + 0.5);
	i_100_ += i_98_;
	if (i_98_ < i_106_) {
	    i += i_126_ * (i_106_ - i_98_);
	    i_98_ = i_106_;
	}
	if (i_100_ >= i_107_)
	    i_100_ = i_107_ - 1;
	int i_127_ = i_101_ >>> 24;
	if (i_102_ == 0 || i_102_ == 1 && i_127_ == 255) {
	    for (/**/; i_98_ <= i_100_; i_98_++) {
		int i_128_ = i >> 16;
		int i_129_ = i_98_ - i_104_;
		int i_130_ = i_103_ + is[i_129_];
		if (i_128_ >= ((nga) this).Y && i_128_ < ((nga) this).B
		    && i_128_ >= i_130_ && i_128_ < i_130_ + is_105_[i_129_])
		    ((nga) this).H[i_128_ + i_98_ * ((nga) this).C] = i_101_;
		i += i_126_;
	    }
	} else if (i_102_ == 1) {
	    i_101_ = (((i_101_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff)
		      + ((i_101_ & 0xff00) * i_127_ >> 8 & 0xff00)
		      + (i_127_ << 24));
	    int i_131_ = 256 - i_127_;
	    for (/**/; i_98_ <= i_100_; i_98_++) {
		int i_132_ = i >> 16;
		int i_133_ = i_98_ - i_104_;
		int i_134_ = i_103_ + is[i_133_];
		if (i_132_ >= ((nga) this).Y && i_132_ < ((nga) this).B
		    && i_132_ >= i_134_ && i_132_ < i_134_ + is_105_[i_133_]) {
		    int i_135_ = i_132_ + i_98_ * ((nga) this).C;
		    int i_136_ = ((nga) this).H[i_135_];
		    i_136_ = (((i_136_ & 0xff00ff) * i_131_ >> 8 & 0xff00ff)
			      + ((i_136_ & 0xff00) * i_131_ >> 8 & 0xff00));
		    ((nga) this).H[i_132_ + i_98_ * ((nga) this).C]
			= i_101_ + i_136_;
		}
		i += i_126_;
	    }
	} else if (i_102_ == 2) {
	    for (/**/; i_98_ <= i_100_; i_98_++) {
		int i_137_ = i >> 16;
		int i_138_ = i_98_ - i_104_;
		int i_139_ = i_103_ + is[i_138_];
		if (i_137_ >= ((nga) this).Y && i_137_ < ((nga) this).B
		    && i_137_ >= i_139_ && i_137_ < i_139_ + is_105_[i_138_]) {
		    int i_140_ = i_137_ + i_98_ * ((nga) this).C;
		    int i_141_ = ((nga) this).H[i_140_];
		    int i_142_ = i_101_ + i_141_;
		    int i_143_ = (i_101_ & 0xff00ff) + (i_141_ & 0xff00ff);
		    i_141_
			= (i_143_ & 0x1000100) + (i_142_ - i_143_ & 0x10000);
		    ((nga) this).H[i_140_]
			= i_142_ - i_141_ | i_141_ - (i_141_ >>> 8);
		}
		i += i_126_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    final void a(ir var_ir, int i) {
	lfa var_lfa = a(Thread.currentThread());
	Class_wb class_wb = ((nr) ((ir) var_ir).a).j;
	for (Class_wb class_wb_144_ = ((Class_wb) class_wb).h;
	     class_wb_144_ != class_wb;
	     class_wb_144_ = ((Class_wb) class_wb_144_).h) {
	    mm var_mm = (mm) class_wb_144_;
	    int i_145_ = ((mm) var_mm).w >> 12;
	    int i_146_ = ((mm) var_mm).t >> 12;
	    int i_147_ = ((mm) var_mm).r >> 12;
	    float f = (((rd) ((nga) this).bb).B
		       + (((rd) ((nga) this).bb).q * (float) i_145_
			  + ((rd) ((nga) this).bb).M * (float) i_146_
			  + ((rd) ((nga) this).bb).C * (float) i_147_));
	    if (!(f < (float) ((nga) this).M)
		&& !(f > (float) ((lfa) var_lfa).a)) {
		int i_148_
		    = (((nga) this).X
		       + (int) ((float) ((nga) this).L
				* (((rd) ((nga) this).bb).v
				   + (((rd) ((nga) this).bb).z * (float) i_145_
				      + (((rd) ((nga) this).bb).m
					 * (float) i_146_)
				      + (((rd) ((nga) this).bb).s
					 * (float) i_147_)))
				/ (float) i));
		int i_149_
		    = (((nga) this).y
		       + (int) ((float) ((nga) this).O
				* (((rd) ((nga) this).bb).o
				   + (((rd) ((nga) this).bb).i * (float) i_145_
				      + (((rd) ((nga) this).bb).k
					 * (float) i_146_)
				      + (((rd) ((nga) this).bb).w
					 * (float) i_147_)))
				/ (float) i));
		if (i_148_ >= ((nga) this).Y && i_148_ <= ((nga) this).B
		    && i_149_ >= ((nga) this).u && i_149_ <= ((nga) this).cb) {
		    if (f == 0.0F)
			f = 1.0F;
		    a(var_mm, i_148_, i_149_, (int) f,
		      (((mm) var_mm).o * ((nga) this).L >> 12) / i);
		}
	    }
	}
    }
    
    final void GA(int i, int i_150_) {
	lfa var_lfa = a(Thread.currentThread());
	((nga) this).M = i;
	((nga) this).W = i_150_;
	((lfa) var_lfa).a = ((nga) this).W - 255;
    }
    
    final void oa(int[] is) {
	is[0] = ((nga) this).Y;
	is[1] = ((nga) this).u;
	is[2] = ((nga) this).B;
	is[3] = ((nga) this).cb;
    }
    
    final f a(int i, int i_151_, int i_152_, int i_153_, boolean bool) {
	int[] is = new int[i_152_ * i_153_];
	int i_154_ = i_151_ * ((nga) this).C + i;
	int i_155_ = ((nga) this).C - i_152_;
	for (int i_156_ = 0; i_156_ < i_153_; i_156_++) {
	    int i_157_ = i_156_ * i_152_;
	    for (int i_158_ = 0; i_158_ < i_152_; i_158_++)
		is[i_157_ + i_158_] = ((nga) this).H[i_154_++];
	    i_154_ += i_155_;
	}
	if (bool)
	    return new bp(this, is, i_152_, i_153_);
	return new TransparentSprite(this, is, i_152_, i_153_);
    }
    
    final void a(int i, int i_159_, int i_160_, int i_161_, int i_162_,
		 int i_163_, int i_164_, int i_165_, int i_166_, int i_167_) {
	lfa var_lfa = a(Thread.currentThread());
	jea var_jea = ((lfa) var_lfa).Q;
	((jea) var_jea).c = false;
	i -= ((nga) this).v;
	i_160_ -= ((nga) this).v;
	i_162_ -= ((nga) this).v;
	i_159_ -= ((nga) this).ab;
	i_161_ -= ((nga) this).ab;
	i_163_ -= ((nga) this).ab;
	((jea) var_jea).o = (i < 0 || i > ((jea) var_jea).b || i_160_ < 0
			     || i_160_ > ((jea) var_jea).b || i_162_ < 0
			     || i_162_ > ((jea) var_jea).b);
	((jea) var_jea).j = true;
	int i_168_ = i_164_ >>> 24;
	if (i_167_ == 0 || i_167_ == 1 && i_168_ == 255) {
	    ((jea) var_jea).q = 0;
	    ((jea) var_jea).k = false;
	    var_jea.b(i_159_, i_161_, i_163_, i, i_160_, i_162_, 0, 0, 0,
		      i_164_, i_165_, i_166_);
	} else if (i_167_ == 1) {
	    ((jea) var_jea).q = 255 - i_168_;
	    ((jea) var_jea).k = false;
	    var_jea.b(i_159_, i_161_, i_163_, i, i_160_, i_162_, 0, 0, 0,
		      i_164_, i_165_, i_166_);
	} else if (i_167_ == 2) {
	    ((jea) var_jea).q = 128;
	    ((jea) var_jea).k = true;
	    var_jea.b(i_159_, i_161_, i_163_, i, i_160_, i_162_, 0, 0, 0,
		      i_164_, i_165_, i_166_);
	} else
	    throw new IllegalArgumentException();
	((jea) var_jea).c = true;
	((jea) var_jea).j = false;
    }
    
    final void getTexSize(int size) {
	/* empty */
    }
    
    final void FA(int i, ua var_ua, int i_169_, int i_170_) {
	nu var_nu = (nu) var_ua;
	int[] is = ((nu) var_nu).g;
	int[] is_171_ = ((nu) var_nu).k;
	int i_172_;
	if (((nga) this).cb < i_170_ + is.length)
	    i_172_ = ((nga) this).cb - i_170_;
	else
	    i_172_ = is.length;
	int i_173_;
	if (((nga) this).u > i_170_) {
	    i_173_ = ((nga) this).u - i_170_;
	    i_170_ = ((nga) this).u;
	} else
	    i_173_ = 0;
	if (i_172_ - i_173_ > 0) {
	    int i_174_ = i_170_ * ((nga) this).C;
	    for (int i_175_ = i_173_; i_175_ < i_172_; i_175_++) {
		int i_176_ = i_169_ + is[i_175_];
		int i_177_ = is_171_[i_175_];
		if (((nga) this).Y > i_176_) {
		    i_177_ -= ((nga) this).Y - i_176_;
		    i_176_ = ((nga) this).Y;
		}
		if (((nga) this).B < i_176_ + i_177_)
		    i_177_ = ((nga) this).B - i_176_;
		i_176_ += i_174_;
		for (int i_178_ = -i_177_; i_178_ < 0; i_178_++)
		    ((nga) this).H[i_176_++] = i;
		i_174_ += ((nga) this).C;
	    }
	}
    }
    
    final void a() {
	/* empty */
    }
    
    final boolean i(int i) {
	return ((vca) ((Class_r) this).j.a(i, (byte) 86)).e;
    }
    
    final void a(int i, gga[] var_ggas) {
	/* empty */
    }
    
    final boolean m() {
	return true;
    }
    
    final da a(eg var_eg, int i, int i_179_, int i_180_, int i_181_) {
	return new rw(this, var_eg, i, i_180_, i_181_, i_179_);
    }
    
    final boolean g() {
	return false;
    }
    
    nga(Canvas canvas, fa var_fa) {
	this(var_fa);
	d(canvas);
	a(canvas);
    }
    
    final void s() {
	/* empty */
    }
    
    final GraphicsCard y() {
	return new GraphicsCard(0, "Pure Java", 1, "CPU", 0L);
    }
    
    final void g(int i) {
	((nga) this).V = i;
	F = new lfa[((nga) this).V];
	for (int i_182_ = 0; i_182_ < ((nga) this).V; i_182_++)
	    F[i_182_] = new lfa(this);
    }
    
    final void a(int i, int i_183_, int i_184_, int i_185_) {
	/* empty */
    }
    
    final boolean bloom() {
	return false;
    }
    
    final boolean x() {
	return false;
    }
    
    final int j(int i) {
	return ((vca) ((Class_r) this).j.a(i, (byte) 86)).v & 0xffff;
    }
    
    final void b(int i, int i_186_, int i_187_, int i_188_, int i_189_,
		 int i_190_, int i_191_, int i_192_, int i_193_, int i_194_) {
	if (i_188_ != 0 && i_189_ != 0) {
	    if (i_191_ != 65535
		&& !((vca) ((Class_r) this).j.a(i_191_, (byte) 86)).u) {
		if (eb != i_191_) {
		    f var_f = (f) J.get((long) i_191_, (byte) 100);
		    if (var_f == null) {
			int[] is = k(i_191_);
			if (is == null)
			    return;
			int i_195_ = m(i_191_) ? 64 : 128;
			var_f = a(is, 0, i_195_, i_195_, i_195_);
			J.put((long) i_191_, var_f, 1);
		    }
		    eb = i_191_;
		    db = var_f;
		}
		((qp) db).a(i - i_188_, i_186_ - i_189_, i_187_, i_188_ << 1,
			    i_189_ << 1, i_193_, i_192_, i_194_, 1);
	    } else
		g(i, i_186_, i_187_, i_188_, i_192_, i_194_);
	}
    }
    
    final void w() {
	D.a(18385);
	J.a(18385);
    }
    
    final boolean h() {
	return true;
    }
    
    final int[] h(int i, int i_196_, int i_197_, int i_198_) {
	int[] is = new int[i_197_ * i_198_];
	int i_199_ = 0;
	for (int i_200_ = 0; i_200_ < i_198_; i_200_++) {
	    int i_201_ = (i_196_ + i_200_) * ((nga) this).C + i;
	    for (int i_202_ = 0; i_202_ < i_197_; i_202_++)
		is[i_199_++] = ((nga) this).H[i_201_ + i_202_];
	}
	return is;
    }
    
    final lfa a(Runnable runnable) {
	for (int i = 0; i < ((nga) this).V; i++) {
	    if (((lfa) F[i]).o == runnable)
		return F[i];
	}
	return null;
    }
    
    private final int[] k(int i) {
	jca var_jca;
	synchronized (D) {
	    var_jca = (jca) D.get((long) i, (byte) 100);
	    if (var_jca == null) {
		if (!((Class_r) this).j.a(false, i))
		    return null;
		vca var_vca = ((Class_r) this).j.a(i, (byte) 86);
		int i_203_ = ((vca) var_vca).p || I ? 64 : 128;
		var_jca
		    = new jca(i, i_203_,
			      ((Class_r) this).j.a(0.7F, i_203_, (byte) 102,
						   true, i_203_, i),
			      ((vca) var_vca).h);
		D.put((long) i, var_jca, 1);
	    }
	}
	((jca) var_jca).k = true;
	return var_jca.b();
    }
    
    final void va(int i) {
	/* empty */
    }
    
    final void IA(int i, int i_204_, int i_205_, int i_206_, int i_207_,
		  int i_208_, byte[] is, int i_209_, int i_210_) {
	if (i_205_ > 0 && i_206_ > 0) {
	    int i_211_ = 0;
	    int i_212_ = 0;
	    int i_213_ = (i_209_ << 16) / i_205_;
	    int i_214_ = (is.length / i_209_ << 16) / i_206_;
	    int i_215_ = i + i_204_ * ((nga) this).C;
	    int i_216_ = ((nga) this).C - i_205_;
	    if (i_204_ + i_206_ > ((nga) this).cb)
		i_206_ -= i_204_ + i_206_ - ((nga) this).cb;
	    if (i_204_ < ((nga) this).u) {
		int i_217_ = ((nga) this).u - i_204_;
		i_206_ -= i_217_;
		i_215_ += i_217_ * ((nga) this).C;
		i_212_ += i_214_ * i_217_;
	    }
	    if (i + i_205_ > ((nga) this).B) {
		int i_218_ = i + i_205_ - ((nga) this).B;
		i_205_ -= i_218_;
		i_216_ += i_218_;
	    }
	    if (i < ((nga) this).Y) {
		int i_219_ = ((nga) this).Y - i;
		i_205_ -= i_219_;
		i_215_ += i_219_;
		i_211_ += i_213_ * i_219_;
		i_216_ += i_219_;
	    }
	    int i_220_ = i_207_ >>> 24;
	    int i_221_ = i_208_ >>> 24;
	    if (i_210_ == 0 || i_210_ == 1 && i_220_ == 255 && i_221_ == 255) {
		int i_222_ = i_211_;
		for (int i_223_ = -i_206_; i_223_ < 0; i_223_++) {
		    int i_224_ = (i_212_ >> 16) * i_209_;
		    for (int i_225_ = -i_205_; i_225_ < 0; i_225_++) {
			if (is[(i_211_ >> 16) + i_224_] != 0)
			    ((nga) this).H[i_215_++] = i_208_;
			else
			    ((nga) this).H[i_215_++] = i_207_;
			i_211_ += i_213_;
		    }
		    i_212_ += i_214_;
		    i_211_ = i_222_;
		    i_215_ += i_216_;
		}
	    } else if (i_210_ == 1) {
		int i_226_ = i_211_;
		for (int i_227_ = -i_206_; i_227_ < 0; i_227_++) {
		    int i_228_ = (i_212_ >> 16) * i_209_;
		    for (int i_229_ = -i_205_; i_229_ < 0; i_229_++) {
			int i_230_ = i_207_;
			if (is[(i_211_ >> 16) + i_228_] != 0)
			    i_230_ = i_208_;
			int i_231_ = i_230_ >>> 24;
			int i_232_ = 255 - i_231_;
			int i_233_ = ((nga) this).H[i_215_];
			((nga) this).H[i_215_++]
			    = ((((i_230_ & 0xff00ff) * i_231_
				 + (i_233_ & 0xff00ff) * i_232_)
				& ~0xff00ff)
			       + (((i_230_ & 0xff00) * i_231_
				   + (i_233_ & 0xff00) * i_232_)
				  & 0xff0000)) >> 8;
			i_211_ += i_213_;
		    }
		    i_212_ += i_214_;
		    i_211_ = i_226_;
		    i_215_ += i_216_;
		}
	    } else if (i_210_ == 2) {
		int i_234_ = i_211_;
		for (int i_235_ = -i_206_; i_235_ < 0; i_235_++) {
		    int i_236_ = (i_212_ >> 16) * i_209_;
		    for (int i_237_ = -i_205_; i_237_ < 0; i_237_++) {
			int i_238_ = i_207_;
			if (is[(i_211_ >> 16) + i_236_] != 0)
			    i_238_ = i_208_;
			if (i_238_ != 0) {
			    int i_239_ = ((nga) this).H[i_215_];
			    int i_240_ = i_238_ + i_239_;
			    int i_241_
				= (i_238_ & 0xff00ff) + (i_239_ & 0xff00ff);
			    i_239_ = (i_241_ & 0x1000100) + (i_240_ - i_241_
							     & 0x10000);
			    ((nga) this).H[i_215_++]
				= i_240_ - i_239_ | i_239_ - (i_239_ >>> 8);
			} else
			    i_215_++;
			i_211_ += i_213_;
		    }
		    i_212_ += i_214_;
		    i_211_ = i_234_;
		    i_215_ += i_216_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    final void a(IncomingPackets incomingPackets) {
	/* empty */
    }
    
    final boolean B() {
	return true;
    }
    
    final void d(Canvas canvas) {
	nc var_nc = (nc) t.a(-32748, (long) canvas.hashCode());
	if (var_nc == null) {
	    var_nc = ol.a(256, canvas);
	    t.a(var_nc, (byte) -51, (long) canvas.hashCode());
	}
    }
    
    final void MA(int i, int i_242_, int i_243_, int[] is) {
	float f = (((rd) ((nga) this).bb).B
		   + (((rd) ((nga) this).bb).q * (float) i
		      + ((rd) ((nga) this).bb).M * (float) i_242_
		      + ((rd) ((nga) this).bb).C * (float) i_243_));
	if (f < (float) ((nga) this).M || f > (float) ((nga) this).W)
	    is[0] = is[1] = is[2] = -1;
	else {
	    int i_244_
		= (int) ((float) ((nga) this).L
			 * (((rd) ((nga) this).bb).v
			    + (((rd) ((nga) this).bb).z * (float) i
			       + ((rd) ((nga) this).bb).m * (float) i_242_
			       + ((rd) ((nga) this).bb).s * (float) i_243_))
			 / f);
	    int i_245_
		= (int) ((float) ((nga) this).O
			 * (((rd) ((nga) this).bb).o
			    + (((rd) ((nga) this).bb).i * (float) i
			       + ((rd) ((nga) this).bb).k * (float) i_242_
			       + ((rd) ((nga) this).bb).w * (float) i_243_))
			 / f);
	    is[0] = i_244_ - ((nga) this).v;
	    is[1] = i_245_ - ((nga) this).ab;
	    is[2] = (int) f;
	}
    }
    
    private final void a(mm var_mm, int i, int i_246_, int i_247_,
			 int i_248_) {
	int i_249_ = ((mm) var_mm).C;
	int i_250_ = i_248_;
	i_248_ <<= 1;
	if (i_249_ == -1)
	    g(i, i_246_, i_247_, i_250_, ((mm) var_mm).p, 1);
	else {
	    if (eb != i_249_) {
		f var_f = (f) J.get((long) i_249_, (byte) 100);
		if (var_f == null) {
		    int[] is = k(i_249_);
		    if (is != null) {
			int i_251_ = m(i_249_) ? 64 : 128;
			var_f = a(is, 0, i_251_, i_251_, i_251_);
			J.put((long) i_249_, var_f, 1);
		    } else
			return;
		}
		eb = i_249_;
		db = var_f;
	    }
	    i_248_++;
	    ((qp) db).a(i - i_250_, i_246_ - i_250_, i_247_, i_248_, i_248_, 0,
			((mm) var_mm).p, 1, 1);
	}
    }
    
    final void a(Class_q class_q) {
	((nga) this).bb = (rd) class_q;
    }
    
    final Class_q p() {
	lfa var_lfa = a(Thread.currentThread());
	return ((lfa) var_lfa).d;
    }
    
    final void ZA(boolean bool) {
	lfa var_lfa = a(Thread.currentThread());
	((lfa) var_lfa).i = bool;
    }
    
    final f a(int[] is, int i, int i_252_, int i_253_, int i_254_) {
	boolean bool = false;
	int i_255_ = i;
    while_104_:
	for (int i_256_ = 0; i_256_ < i_254_; i_256_++) {
	    for (int i_257_ = 0; i_257_ < i_253_; i_257_++) {
		int i_258_ = is[i_255_++] >>> 24;
		if (i_258_ != 0 && i_258_ != 255) {
		    bool = true;
		    break while_104_;
		}
	    }
	}
	if (bool)
	    return new bp(this, is, i, i_252_, i_253_, i_254_);
	return new TransparentSprite(this, is, i, i_252_, i_253_, i_254_);
    }
    
    final void d(int i) {
	F[i].a(null, -126);
    }
    
    final void a(f var_f, boolean bool) {
	if (var_f instanceof TransparentSprite) {
	    TransparentSprite var_wfa = (TransparentSprite) var_f;
	    ((nga) this).C = ((qp) var_wfa).k;
	    z = ((qp) var_wfa).o;
	    ((nga) this).H = ((TransparentSprite) var_wfa).H;
	    Z = var_f;
	} else if (var_f instanceof bp) {
	    bp var_bp = (bp) var_f;
	    ((nga) this).C = ((qp) var_bp).k;
	    z = ((qp) var_bp).o;
	    ((nga) this).H = ((bp) var_bp).H;
	    Z = var_f;
	} else
	    throw new RuntimeException();
	D();
    }
    
    final int a(int i, int i_259_) {
	return i | i_259_;
    }
    
    final void k() {
	/* empty */
    }
    
    final void YA(int i, int i_260_, int i_261_, int i_262_) {
	lfa var_lfa = a(Thread.currentThread());
	((lfa) var_lfa).g = i;
	((lfa) var_lfa).s = i_260_;
	((lfa) var_lfa).n = i_261_;
    }
    
    final int[] l(int i) {
	jca var_jca;
	synchronized (D) {
	    var_jca = (jca) D.get((long) i, (byte) 100);
	    if (var_jca == null) {
		if (!((Class_r) this).j.a(false, i))
		    return null;
		vca var_vca = ((Class_r) this).j.a(i, (byte) 86);
		int i_263_ = ((vca) var_vca).p || I ? 64 : 128;
		var_jca = new jca(i, i_263_,
				  ((Class_r) this).j.a(i, 0.7F, true, i_263_,
						       -5969, i_263_),
				  ((vca) var_vca).h);
		D.put((long) i, var_jca, 1);
	    }
	}
	((jca) var_jca).k = true;
	return var_jca.b();
    }
    
    final void J(int i, int i_264_, int i_265_, int i_266_, int i_267_,
		 int i_268_) {
	if (i < ((nga) this).Y) {
	    i_265_ -= ((nga) this).Y - i;
	    i = ((nga) this).Y;
	}
	if (i_264_ < ((nga) this).u) {
	    i_266_ -= ((nga) this).u - i_264_;
	    i_264_ = ((nga) this).u;
	}
	if (i + i_265_ > ((nga) this).B)
	    i_265_ = ((nga) this).B - i;
	if (i_264_ + i_266_ > ((nga) this).cb)
	    i_266_ = ((nga) this).cb - i_264_;
	if (i_265_ > 0 && i_266_ > 0 && i <= ((nga) this).B
	    && i_264_ <= ((nga) this).cb) {
	    int i_269_ = ((nga) this).C - i_265_;
	    int i_270_ = i + i_264_ * ((nga) this).C;
	    int i_271_ = i_267_ >>> 24;
	    if (i_268_ == 0 || i_268_ == 1 && i_271_ == 255) {
		int i_272_ = i_265_ >> 3;
		int i_273_ = i_265_ & 0x7;
		i_265_ = i_270_ - 1;
		for (int i_274_ = -i_266_; i_274_ < 0; i_274_++) {
		    if (i_272_ > 0) {
			i = i_272_;
			do {
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			    ((nga) this).H[++i_265_] = i_267_;
			} while (--i > 0);
		    }
		    if (i_273_ > 0) {
			i = i_273_;
			do
			    ((nga) this).H[++i_265_] = i_267_;
			while (--i > 0);
		    }
		    i_265_ += i_269_;
		}
	    } else if (i_268_ == 1) {
		i_267_
		    = (((i_267_ & 0xff00ff) * i_271_ >> 8 & 0xff00ff)
		       + (((i_267_ & ~0xff00ff) >>> 8) * i_271_ & ~0xff00ff));
		int i_275_ = 256 - i_271_;
		for (int i_276_ = 0; i_276_ < i_266_; i_276_++) {
		    for (int i_277_ = -i_265_; i_277_ < 0; i_277_++) {
			int i_278_ = ((nga) this).H[i_270_];
			i_278_
			    = (((i_278_ & 0xff00ff) * i_275_ >> 8 & 0xff00ff)
			       + (((i_278_ & ~0xff00ff) >>> 8) * i_275_
				  & ~0xff00ff));
			((nga) this).H[i_270_++] = i_267_ + i_278_;
		    }
		    i_270_ += i_269_;
		}
	    } else if (i_268_ == 2) {
		for (int i_279_ = 0; i_279_ < i_266_; i_279_++) {
		    for (int i_280_ = -i_265_; i_280_ < 0; i_280_++) {
			int i_281_ = ((nga) this).H[i_270_];
			int i_282_ = i_267_ + i_281_;
			int i_283_ = (i_267_ & 0xff00ff) + (i_281_ & 0xff00ff);
			i_281_ = (i_283_ & 0x1000100) + (i_282_ - i_283_
							 & 0x10000);
			((nga) this).H[i_270_++]
			    = i_282_ - i_281_ | i_281_ - (i_281_ >>> 8);
		    }
		    i_270_ += i_269_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    final void j() {
	/* empty */
    }
    
    final int BA() {
	return ((nga) this).M;
    }
    
    final int T() {
	int i = S;
	S = 0;
	return i;
    }
    
    final Class_q t() {
	return ((nga) this).bb;
    }
    
    final void c(int i, int i_284_, int i_285_, int i_286_, int i_287_,
		 int i_288_) {
	XA(i, i_284_, i_285_, i_287_, i_288_);
	XA(i, i_284_ + i_286_ - 1, i_285_, i_287_, i_288_);
	m(i, i_284_ + 1, i_286_ - 2, i_287_, i_288_);
	m(i + i_285_ - 1, i_284_ + 1, i_286_ - 2, i_287_, i_288_);
    }
    
    final boolean m(int i) {
	if (I || ((vca) ((Class_r) this).j.a(i, (byte) 86)).p)
	    return true;
	return false;
    }
    
    final boolean o() {
	return false;
    }
    
    private final void F() {
	((nga) this).v = ((nga) this).Y - ((nga) this).X;
	((nga) this).E = ((nga) this).B - ((nga) this).X;
	((nga) this).ab = ((nga) this).u - ((nga) this).y;
	((nga) this).P = ((nga) this).cb - ((nga) this).y;
	for (int i = 0; i < ((nga) this).V; i++) {
	    jea var_jea = ((lfa) F[i]).Q;
	    ((jea) var_jea).i = ((nga) this).X - ((nga) this).Y;
	    ((jea) var_jea).l = ((nga) this).y - ((nga) this).u;
	    ((jea) var_jea).b = ((nga) this).B - ((nga) this).Y;
	    ((jea) var_jea).r = ((nga) this).cb - ((nga) this).u;
	}
	int i = ((nga) this).u * ((nga) this).C + ((nga) this).Y;
	for (int i_289_ = ((nga) this).u; i_289_ < ((nga) this).cb; i_289_++) {
	    for (int i_290_ = 0; i_290_ < ((nga) this).V; i_290_++)
		((jea) ((lfa) F[i_290_]).Q).h[i_289_ - ((nga) this).u] = i;
	    i += ((nga) this).C;
	}
    }
    
    final void ja(int i) {
	J(0, 0, ((nga) this).C, z, i, 0);
    }
    
    final int b() {
	return 0;
    }
    
    final void m(int i, int i_291_, int i_292_, int i_293_, int i_294_) {
	if (i >= ((nga) this).Y && i < ((nga) this).B) {
	    if (i_291_ < ((nga) this).u) {
		i_292_ -= ((nga) this).u - i_291_;
		i_291_ = ((nga) this).u;
	    }
	    if (i_291_ + i_292_ > ((nga) this).cb)
		i_292_ = ((nga) this).cb - i_291_;
	    int i_295_ = i + i_291_ * ((nga) this).C;
	    int i_296_ = i_293_ >>> 24;
	    if (i_294_ == 0 || i_294_ == 1 && i_296_ == 255) {
		for (int i_297_ = 0; i_297_ < i_292_; i_297_++)
		    ((nga) this).H[i_295_ + i_297_ * ((nga) this).C] = i_293_;
	    } else if (i_294_ == 1) {
		i_293_ = (((i_293_ & 0xff00ff) * i_296_ >> 8 & 0xff00ff)
			  + ((i_293_ & 0xff00) * i_296_ >> 8 & 0xff00)
			  + (i_296_ << 24));
		int i_298_ = 256 - i_296_;
		for (int i_299_ = 0; i_299_ < i_292_; i_299_++) {
		    int i_300_ = i_295_ + i_299_ * ((nga) this).C;
		    int i_301_ = ((nga) this).H[i_300_];
		    i_301_ = (((i_301_ & 0xff00ff) * i_298_ >> 8 & 0xff00ff)
			      + ((i_301_ & 0xff00) * i_298_ >> 8 & 0xff00));
		    ((nga) this).H[i_300_] = i_293_ + i_301_;
		}
	    } else if (i_294_ == 2) {
		for (int i_302_ = 0; i_302_ < i_292_; i_302_++) {
		    int i_303_ = i_295_ + i_302_ * ((nga) this).C;
		    int i_304_ = ((nga) this).H[i_303_];
		    int i_305_ = i_293_ + i_304_;
		    int i_306_ = (i_293_ & 0xff00ff) + (i_304_ & 0xff00ff);
		    i_304_
			= (i_306_ & 0x1000100) + (i_305_ - i_306_ & 0x10000);
		    ((nga) this).H[i_303_]
			= i_305_ - i_304_ | i_304_ - (i_304_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    private final void g(int i, int i_307_, int i_308_, int i_309_, int i_310_,
			 int i_311_) {
	if (i_309_ < 0)
	    i_309_ = -i_309_;
	i_308_ <<= 8;
	int i_312_ = i_307_ - i_309_;
	if (i_312_ < ((nga) this).u)
	    i_312_ = ((nga) this).u;
	int i_313_ = i_307_ + i_309_ + 1;
	if (i_313_ > ((nga) this).cb)
	    i_313_ = ((nga) this).cb;
	int i_314_ = i_312_;
	int i_315_ = i_309_ * i_309_;
	int i_316_ = 0;
	int i_317_ = i_307_ - i_314_;
	int i_318_ = i_317_ * i_317_;
	int i_319_ = i_318_ - i_317_;
	if (i_307_ > i_313_)
	    i_307_ = i_313_;
	int i_320_ = i_310_ >>> 24;
	if (i_311_ == 0 || i_311_ == 1 && i_320_ == 255) {
	    while (i_314_ < i_307_) {
		for (/**/; i_319_ <= i_315_ || i_318_ <= i_315_;
		     i_319_ += i_316_++ + i_316_)
		    i_318_ += i_316_ + i_316_;
		int i_321_ = i - i_316_ + 1;
		if (i_321_ < ((nga) this).Y)
		    i_321_ = ((nga) this).Y;
		int i_322_ = i + i_316_;
		if (i_322_ > ((nga) this).B)
		    i_322_ = ((nga) this).B;
		int i_323_ = i_321_ + i_314_ * ((nga) this).C;
		for (int i_324_ = i_321_; i_324_ < i_322_; i_324_++) {
		    if (i_308_ < ((nga) this).U[i_323_])
			((nga) this).H[i_323_] = i_310_;
		    i_323_++;
		}
		i_314_++;
		i_318_ -= i_317_-- + i_317_;
		i_319_ -= i_317_ + i_317_;
	    }
	    i_316_ = i_309_;
	    i_317_ = i_314_ - i_307_;
	    i_319_ = i_317_ * i_317_ + i_315_;
	    i_318_ = i_319_ - i_316_;
	    i_319_ -= i_317_;
	    while (i_314_ < i_313_) {
		for (/**/; i_319_ > i_315_ && i_318_ > i_315_;
		     i_318_ -= i_316_ + i_316_)
		    i_319_ -= i_316_-- + i_316_;
		int i_325_ = i - i_316_;
		if (i_325_ < ((nga) this).Y)
		    i_325_ = ((nga) this).Y;
		int i_326_ = i + i_316_;
		if (i_326_ > ((nga) this).B - 1)
		    i_326_ = ((nga) this).B - 1;
		int i_327_ = i_325_ + i_314_ * ((nga) this).C;
		for (int i_328_ = i_325_; i_328_ <= i_326_; i_328_++) {
		    if (i_308_ < ((nga) this).U[i_327_])
			((nga) this).H[i_327_] = i_310_;
		    i_327_++;
		}
		i_314_++;
		i_319_ += i_317_ + i_317_;
		i_318_ += i_317_++ + i_317_;
	    }
	} else if (i_311_ == 1) {
	    i_310_ = (((i_310_ & 0xff00ff) * i_320_ >> 8 & 0xff00ff)
		      + ((i_310_ & 0xff00) * i_320_ >> 8 & 0xff00)
		      + (i_320_ << 24));
	    int i_329_ = 256 - i_320_;
	    while (i_314_ < i_307_) {
		for (/**/; i_319_ <= i_315_ || i_318_ <= i_315_;
		     i_319_ += i_316_++ + i_316_)
		    i_318_ += i_316_ + i_316_;
		int i_330_ = i - i_316_ + 1;
		if (i_330_ < ((nga) this).Y)
		    i_330_ = ((nga) this).Y;
		int i_331_ = i + i_316_;
		if (i_331_ > ((nga) this).B)
		    i_331_ = ((nga) this).B;
		int i_332_ = i_330_ + i_314_ * ((nga) this).C;
		for (int i_333_ = i_330_; i_333_ < i_331_; i_333_++) {
		    if (i_308_ < ((nga) this).U[i_332_]) {
			int i_334_ = ((nga) this).H[i_332_];
			i_334_
			    = (((i_334_ & 0xff00ff) * i_329_ >> 8 & 0xff00ff)
			       + ((i_334_ & 0xff00) * i_329_ >> 8 & 0xff00));
			((nga) this).H[i_332_] = i_310_ + i_334_;
		    }
		    i_332_++;
		}
		i_314_++;
		i_318_ -= i_317_-- + i_317_;
		i_319_ -= i_317_ + i_317_;
	    }
	    i_316_ = i_309_;
	    i_317_ = -i_317_;
	    i_319_ = i_317_ * i_317_ + i_315_;
	    i_318_ = i_319_ - i_316_;
	    i_319_ -= i_317_;
	    while (i_314_ < i_313_) {
		for (/**/; i_319_ > i_315_ && i_318_ > i_315_;
		     i_318_ -= i_316_ + i_316_)
		    i_319_ -= i_316_-- + i_316_;
		int i_335_ = i - i_316_;
		if (i_335_ < ((nga) this).Y)
		    i_335_ = ((nga) this).Y;
		int i_336_ = i + i_316_;
		if (i_336_ > ((nga) this).B - 1)
		    i_336_ = ((nga) this).B - 1;
		int i_337_ = i_335_ + i_314_ * ((nga) this).C;
		for (int i_338_ = i_335_; i_338_ <= i_336_; i_338_++) {
		    if (i_308_ < ((nga) this).U[i_337_]) {
			int i_339_ = ((nga) this).H[i_337_];
			i_339_
			    = (((i_339_ & 0xff00ff) * i_329_ >> 8 & 0xff00ff)
			       + ((i_339_ & 0xff00) * i_329_ >> 8 & 0xff00));
			((nga) this).H[i_337_] = i_310_ + i_339_;
		    }
		    i_337_++;
		}
		i_314_++;
		i_319_ += i_317_ + i_317_;
		i_318_ += i_317_++ + i_317_;
	    }
	} else if (i_311_ == 2) {
	    while (i_314_ < i_307_) {
		for (/**/; i_319_ <= i_315_ || i_318_ <= i_315_;
		     i_319_ += i_316_++ + i_316_)
		    i_318_ += i_316_ + i_316_;
		int i_340_ = i - i_316_ + 1;
		if (i_340_ < ((nga) this).Y)
		    i_340_ = ((nga) this).Y;
		int i_341_ = i + i_316_;
		if (i_341_ > ((nga) this).B)
		    i_341_ = ((nga) this).B;
		int i_342_ = i_340_ + i_314_ * ((nga) this).C;
		for (int i_343_ = i_340_; i_343_ < i_341_; i_343_++) {
		    if (i_308_ < ((nga) this).U[i_342_]) {
			int i_344_ = ((nga) this).H[i_342_];
			int i_345_ = i_310_ + i_344_;
			int i_346_ = (i_310_ & 0xff00ff) + (i_344_ & 0xff00ff);
			i_344_ = (i_346_ & 0x1000100) + (i_345_ - i_346_
							 & 0x10000);
			((nga) this).H[i_342_]
			    = i_345_ - i_344_ | i_344_ - (i_344_ >>> 8);
		    }
		    i_342_++;
		}
		i_314_++;
		i_318_ -= i_317_-- + i_317_;
		i_319_ -= i_317_ + i_317_;
	    }
	    i_316_ = i_309_;
	    i_317_ = -i_317_;
	    i_319_ = i_317_ * i_317_ + i_315_;
	    i_318_ = i_319_ - i_316_;
	    i_319_ -= i_317_;
	    while (i_314_ < i_313_) {
		for (/**/; i_319_ > i_315_ && i_318_ > i_315_;
		     i_318_ -= i_316_ + i_316_)
		    i_319_ -= i_316_-- + i_316_;
		int i_347_ = i - i_316_;
		if (i_347_ < ((nga) this).Y)
		    i_347_ = ((nga) this).Y;
		int i_348_ = i + i_316_;
		if (i_348_ > ((nga) this).B - 1)
		    i_348_ = ((nga) this).B - 1;
		int i_349_ = i_347_ + i_314_ * ((nga) this).C;
		for (int i_350_ = i_347_; i_350_ <= i_348_; i_350_++) {
		    if (i_308_ < ((nga) this).U[i_349_]) {
			int i_351_ = ((nga) this).H[i_349_];
			int i_352_ = i_310_ + i_351_;
			int i_353_ = (i_310_ & 0xff00ff) + (i_351_ & 0xff00ff);
			i_351_ = (i_353_ & 0x1000100) + (i_352_ - i_353_
							 & 0x10000);
			((nga) this).H[i_349_]
			    = i_352_ - i_351_ | i_351_ - (i_351_ >>> 8);
		    }
		    i_349_++;
		}
		i_314_++;
		i_319_ += i_317_ + i_317_;
		i_318_ += i_317_++ + i_317_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    final f a(int i, int i_354_, boolean bool) {
	if (bool)
	    return new bp(this, i, i_354_);
	return new TransparentSprite(this, i, i_354_);
    }
    
    final int U() {
	return ((nga) this).W;
    }
    
    final Class_i a(int i, int i_355_, int[][] is, int[][] is_356_, int i_357_,
		    int i_358_, int i_359_) {
	return new eu(this, i_358_, i_359_, i, i_355_, is, is_356_, i_357_);
    }
    
    final void pa(int i, int i_360_, int i_361_) {
	for (int i_362_ = 0; i_362_ < F.length; i_362_++) {
	    lfa var_lfa = F[i_362_];
	    ((lfa) var_lfa).s = i & 0xffffff;
	    int i_363_ = ((lfa) var_lfa).s >>> 16 & 0xff;
	    if (i_363_ < 2)
		i_363_ = 2;
	    int i_364_ = ((lfa) var_lfa).s >> 8 & 0xff;
	    if (i_364_ < 2)
		i_364_ = 2;
	    int i_365_ = ((lfa) var_lfa).s & 0xff;
	    if (i_365_ < 2)
		i_365_ = 2;
	    ((lfa) var_lfa).s = i_363_ << 16 | i_364_ << 8 | i_365_;
	    if (i_360_ < 0)
		((lfa) var_lfa).j = false;
	    else
		((lfa) var_lfa).j = true;
	}
    }
    
    final void renderProfile(boolean profile) {
	/* empty */
    }
    
    final boolean n(int i) {
	return ((Class_r) this).j.a(false, i);
    }
    
    final void A() {
	if (r) {
	    lea.a(false, true, false);
	    r = false;
	}
	s = null;
	p = null;
	t = null;
	o = true;
    }
    
    final boolean d() {
	return false;
    }
    
    final boolean i() {
	return false;
    }
    
    final void L() {
	for (int i = 0; i < F.length; i++) {
	    ((lfa) F[i]).s = ((lfa) F[i]).b;
	    ((lfa) F[i]).m = false;
	}
    }
    
    final boolean l() {
	return false;
    }
    
    final void VA(int i, float f, float f_366_, float f_367_, float f_368_,
		  float f_369_) {
	((nga) this).R = (int) (f * 65535.0F);
	((nga) this).Q = (int) (f_366_ * 65535.0F);
	float f_370_
	    = (float) Math.sqrt((double) (f_367_ * f_367_ + f_368_ * f_368_
					  + f_369_ * f_369_));
	((nga) this).x = (int) (f_367_ * 65535.0F / f_370_);
	((nga) this).w = (int) (f_368_ * 65535.0F / f_370_);
	((nga) this).G = (int) (f_369_ * 65535.0F / f_370_);
    }
    
    final void a(Rectangle[] rectangles, int i) throws uo {
	if (p == null || s == null)
	    throw new IllegalStateException("off");
	try {
	    Graphics graphics = p.getGraphics();
	    for (int i_371_ = 0; i_371_ < i; i_371_++) {
		Rectangle rectangle = rectangles[i_371_];
		if (rectangle.x <= ((nga) this).C && rectangle.y <= z
		    && rectangle.x + rectangle.width > 0
		    && rectangle.y + rectangle.height > 0)
		    s.a(rectangle.y, rectangle.x, rectangle.width, graphics,
			(byte) -124, rectangle.height);
	    }
	} catch (Exception exception) {
	    p.repaint();
	}
    }
    
    private nga(fa var_fa) {
	super(var_fa);
	((nga) this).u = 0;
	((nga) this).L = 512;
	((nga) this).R = 45823;
	((nga) this).A = 75518;
	((nga) this).Q = 78642;
	((nga) this).O = 512;
	((nga) this).Y = 0;
	((nga) this).M = 50;
	((nga) this).B = 0;
	S = 0;
	((nga) this).W = 3500;
	T = 0;
	((nga) this).cb = 0;
	J = new tb(16);
	eb = -1;
	D = new tb(256);
	((nga) this).bb = new rd();
	g(1);
	f(0);
	gda.a(true, false, (byte) 88);
	r = true;
	q = (int) us.getCurrentTime(112);
    }
    
    final int DA() {
	int i = T;
	T = 0;
	return i;
    }
    
    final void ya() {
	if (((nga) this).Y == 0 && ((nga) this).B == ((nga) this).C
	    && ((nga) this).u == 0 && ((nga) this).cb == z) {
	    int i = ((nga) this).U.length;
	    int i_372_ = i - i & 0x7;
	    int i_373_ = 0;
	    while (i_373_ < i_372_) {
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
		((nga) this).U[i_373_++] = 2147483647;
	    }
	    while (i_373_ < i)
		((nga) this).U[i_373_++] = 2147483647;
	} else {
	    int i = ((nga) this).B - ((nga) this).Y;
	    int i_374_ = ((nga) this).cb - ((nga) this).u;
	    int i_375_ = ((nga) this).C - i;
	    int i_376_ = ((nga) this).Y + ((nga) this).u * ((nga) this).C;
	    int i_377_ = i >> 3;
	    int i_378_ = i & 0x7;
	    i = i_376_ - 1;
	    for (int i_379_ = -i_374_; i_379_ < 0; i_379_++) {
		if (i_377_ > 0) {
		    int i_380_ = i_377_;
		    do {
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
			((nga) this).U[++i] = 2147483647;
		    } while (--i_380_ > 0);
		}
		if (i_378_ > 0) {
		    int i_381_ = i_378_;
		    do
			((nga) this).U[++i] = 2147483647;
		    while (--i_381_ > 0);
		}
		i += i_375_;
	    }
	}
    }
    
    final void a(int i, int i_382_, int i_383_, int i_384_, int i_385_,
		 int i_386_, int i_387_) {
	lfa var_lfa = a(Thread.currentThread());
	jea var_jea = ((lfa) var_lfa).Q;
	int i_388_ = i_383_ - i;
	int i_389_ = i_384_ - i_382_;
	int i_390_ = i_388_ >= 0 ? i_388_ : -i_388_;
	int i_391_ = i_389_ >= 0 ? i_389_ : -i_389_;
	int i_392_ = i_390_;
	if (i_392_ < i_391_)
	    i_392_ = i_391_;
	if (i_392_ != 0) {
	    int i_393_ = (i_388_ << 16) / i_392_;
	    int i_394_ = (i_389_ << 16) / i_392_;
	    i_388_ += i_393_ >> 16;
	    i_389_ += i_394_ >> 16;
	    if (i_394_ <= i_393_)
		i_393_ = -i_393_;
	    else
		i_394_ = -i_394_;
	    int i_395_ = i_386_ * i_394_ >> 17;
	    int i_396_ = i_386_ * i_394_ + 1 >> 17;
	    int i_397_ = i_386_ * i_393_ >> 17;
	    int i_398_ = i_386_ * i_393_ + 1 >> 17;
	    i -= var_jea.a();
	    i_382_ -= var_jea.b();
	    int i_399_ = i + i_395_;
	    int i_400_ = i - i_396_;
	    int i_401_ = i + i_388_ - i_396_;
	    int i_402_ = i + i_388_ + i_395_;
	    int i_403_ = i_382_ + i_397_;
	    int i_404_ = i_382_ - i_398_;
	    int i_405_ = i_382_ + i_389_ - i_398_;
	    int i_406_ = i_382_ + i_389_ + i_397_;
	    if (i_387_ == 0)
		((jea) var_jea).q = 0;
	    else if (i_387_ == 1)
		((jea) var_jea).q = 255 - (i_385_ >>> 24);
	    else
		throw new IllegalArgumentException();
	    ZA(false);
	    ((jea) var_jea).o = (i_399_ < 0 || i_399_ > ((jea) var_jea).b
				 || i_400_ < 0 || i_400_ > ((jea) var_jea).b
				 || i_401_ < 0 || i_401_ > ((jea) var_jea).b);
	    var_jea.a(i_403_, i_404_, i_405_, i_399_, i_400_, i_401_, 100, 100,
		      100, i_385_);
	    ((jea) var_jea).o = (i_399_ < 0 || i_399_ > ((jea) var_jea).b
				 || i_401_ < 0 || i_401_ > ((jea) var_jea).b
				 || i_402_ < 0 || i_402_ > ((jea) var_jea).b);
	    var_jea.a(i_403_, i_405_, i_406_, i_399_, i_401_, i_402_, 100, 100,
		      100, i_385_);
	    ZA(true);
	}
    }
    
    final void a(jt var_jt) {
	/* empty */
    }
    
    final void a(int i, int i_407_, int i_408_, int i_409_, int i_410_,
		 int i_411_) {
	i_408_ -= i;
	i_409_ -= i_407_;
	if (i_409_ == 0) {
	    if (i_408_ >= 0)
		XA(i, i_407_, i_408_ + 1, i_410_, i_411_);
	    else
		XA(i + i_408_, i_407_, -i_408_ + 1, i_410_, i_411_);
	} else if (i_408_ == 0) {
	    if (i_409_ >= 0)
		m(i, i_407_, i_409_ + 1, i_410_, i_411_);
	    else
		m(i, i_407_ + i_409_, -i_409_ + 1, i_410_, i_411_);
	} else {
	    if (i_408_ + i_409_ < 0) {
		i += i_408_;
		i_408_ = -i_408_;
		i_407_ += i_409_;
		i_409_ = -i_409_;
	    }
	    if (i_408_ > i_409_) {
		i_407_ <<= 16;
		i_407_ += 32768;
		i_409_ <<= 16;
		int i_412_ = (int) Math.floor((double) i_409_ / (double) i_408_
					      + 0.5);
		i_408_ += i;
		if (i < ((nga) this).Y) {
		    i_407_ += i_412_ * (((nga) this).Y - i);
		    i = ((nga) this).Y;
		}
		if (i_408_ >= ((nga) this).B)
		    i_408_ = ((nga) this).B - 1;
		int i_413_ = i_410_ >>> 24;
		if (i_411_ == 0 || i_411_ == 1 && i_413_ == 255) {
		    for (/**/; i <= i_408_; i++) {
			int i_414_ = i_407_ >> 16;
			if (i_414_ >= ((nga) this).u
			    && i_414_ < ((nga) this).cb)
			    ((nga) this).H[i + i_414_ * ((nga) this).C]
				= i_410_;
			i_407_ += i_412_;
		    }
		    return;
		}
		if (i_411_ == 1) {
		    i_410_ = (((i_410_ & 0xff00ff) * i_413_ >> 8 & 0xff00ff)
			      + ((i_410_ & 0xff00) * i_413_ >> 8 & 0xff00)
			      + (i_413_ << 24));
		    int i_415_ = 256 - i_413_;
		    for (/**/; i <= i_408_; i++) {
			int i_416_ = i_407_ >> 16;
			if (i_416_ >= ((nga) this).u
			    && i_416_ < ((nga) this).cb) {
			    int i_417_ = i + i_416_ * ((nga) this).C;
			    int i_418_ = ((nga) this).H[i_417_];
			    i_418_ = (((i_418_ & 0xff00ff) * i_415_ >> 8
				       & 0xff00ff)
				      + ((i_418_ & 0xff00) * i_415_ >> 8
					 & 0xff00));
			    ((nga) this).H[i_417_] = i_410_ + i_418_;
			}
			i_407_ += i_412_;
		    }
		    return;
		}
		if (i_411_ == 2) {
		    for (/**/; i <= i_408_; i++) {
			int i_419_ = i_407_ >> 16;
			if (i_419_ >= ((nga) this).u
			    && i_419_ < ((nga) this).cb) {
			    int i_420_ = i + i_419_ * ((nga) this).C;
			    int i_421_ = ((nga) this).H[i_420_];
			    int i_422_ = i_410_ + i_421_;
			    int i_423_
				= (i_410_ & 0xff00ff) + (i_421_ & 0xff00ff);
			    i_421_ = (i_423_ & 0x1000100) + (i_422_ - i_423_
							     & 0x10000);
			    ((nga) this).H[i_420_]
				= i_422_ - i_421_ | i_421_ - (i_421_ >>> 8);
			}
			i_407_ += i_412_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    i <<= 16;
	    i += 32768;
	    i_408_ <<= 16;
	    int i_424_
		= (int) Math.floor((double) i_408_ / (double) i_409_ + 0.5);
	    i_409_ += i_407_;
	    if (i_407_ < ((nga) this).u) {
		i += i_424_ * (((nga) this).u - i_407_);
		i_407_ = ((nga) this).u;
	    }
	    if (i_409_ >= ((nga) this).cb)
		i_409_ = ((nga) this).cb - 1;
	    int i_425_ = i_410_ >>> 24;
	    if (i_411_ == 0 || i_411_ == 1 && i_425_ == 255) {
		for (/**/; i_407_ <= i_409_; i_407_++) {
		    int i_426_ = i >> 16;
		    if (i_426_ >= ((nga) this).Y && i_426_ < ((nga) this).B)
			((nga) this).H[i_426_ + i_407_ * ((nga) this).C]
			    = i_410_;
		    i += i_424_;
		}
	    } else if (i_411_ == 1) {
		i_410_ = (((i_410_ & 0xff00ff) * i_425_ >> 8 & 0xff00ff)
			  + ((i_410_ & 0xff00) * i_425_ >> 8 & 0xff00)
			  + (i_425_ << 24));
		int i_427_ = 256 - i_425_;
		for (/**/; i_407_ <= i_409_; i_407_++) {
		    int i_428_ = i >> 16;
		    if (i_428_ >= ((nga) this).Y && i_428_ < ((nga) this).B) {
			int i_429_ = i_428_ + i_407_ * ((nga) this).C;
			int i_430_ = ((nga) this).H[i_429_];
			i_430_
			    = (((i_430_ & 0xff00ff) * i_427_ >> 8 & 0xff00ff)
			       + ((i_430_ & 0xff00) * i_427_ >> 8 & 0xff00));
			((nga) this).H[i_428_ + i_407_ * ((nga) this).C]
			    = i_410_ + i_430_;
		    }
		    i += i_424_;
		}
	    } else if (i_411_ == 2) {
		for (/**/; i_407_ <= i_409_; i_407_++) {
		    int i_431_ = i >> 16;
		    if (i_431_ >= ((nga) this).Y && i_431_ < ((nga) this).B) {
			int i_432_ = i_431_ + i_407_ * ((nga) this).C;
			int i_433_ = ((nga) this).H[i_432_];
			int i_434_ = i_410_ + i_433_;
			int i_435_ = (i_410_ & 0xff00ff) + (i_433_ & 0xff00ff);
			i_433_ = (i_435_ & 0x1000100) + (i_434_ - i_435_
							 & 0x10000);
			((nga) this).H[i_432_]
			    = i_434_ - i_433_ | i_433_ - (i_433_ >>> 8);
		    }
		    i += i_424_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    final void CA(int i, int i_436_, int i_437_, int i_438_) {
	for (int i_439_ = 0; i_439_ < F.length; i_439_++) {
	    ((lfa) F[i_439_]).b = ((lfa) F[i_439_]).s;
	    ((lfa) F[i_439_]).g = i;
	    ((lfa) F[i_439_]).s = i_436_;
	    ((lfa) F[i_439_]).n = i_437_;
	    ((lfa) F[i_439_]).m = true;
	}
    }
    
    final void q() {
	if (p != null) {
	    ((nga) this).H = ((nc) s).k;
	    ((nga) this).C = ((nc) s).p;
	    z = ((nc) s).q;
	} else {
	    ((nga) this).C = 1;
	    z = 1;
	    ((nga) this).H = null;
	}
	Z = null;
	D();
    }
    
    final void a(int i) {
	int i_440_ = i - q;
	for (Object object = D.a(true); object != null; object = D.d(-26973)) {
	    jca var_jca = (jca) object;
	    if (((jca) var_jca).k) {
		((jca) var_jca).n += i_440_;
		int i_441_ = ((jca) var_jca).n / 20;
		if (i_441_ > 0) {
		    vca var_vca
			= ((Class_r) this).j.a(((jca) var_jca).o, (byte) 86);
		    var_jca.a(((vca) var_vca).n * i_440_ * 50 / 1000,
			      ((vca) var_vca).c * i_440_ * 50 / 1000);
		    ((jca) var_jca).n -= i_441_ * 20;
		}
		((jca) var_jca).k = false;
	    }
	}
	q = i;
	J.a(true, 5);
	D.a(true, 5);
    }
    
    final boolean r() {
	return false;
    }
    
    final Class_q C() {
	return new rd();
    }
    
    final void c(Canvas canvas) {
	if (p == canvas)
	    a((Canvas) null);
	nc var_nc = (nc) t.a(-32748, (long) canvas.hashCode());
	if (var_nc != null)
	    var_nc.unlink(-125);
    }
    
    final void XA(int i, int i_442_, int i_443_, int i_444_, int i_445_) {
	if (i_442_ >= ((nga) this).u && i_442_ < ((nga) this).cb) {
	    if (i < ((nga) this).Y) {
		i_443_ -= ((nga) this).Y - i;
		i = ((nga) this).Y;
	    }
	    if (i + i_443_ > ((nga) this).B)
		i_443_ = ((nga) this).B - i;
	    int i_446_ = i + i_442_ * ((nga) this).C;
	    int i_447_ = i_444_ >>> 24;
	    if (i_445_ == 0 || i_445_ == 1 && i_447_ == 255) {
		for (int i_448_ = 0; i_448_ < i_443_; i_448_++)
		    ((nga) this).H[i_446_ + i_448_] = i_444_;
	    } else if (i_445_ == 1) {
		i_444_ = (((i_444_ & 0xff00ff) * i_447_ >> 8 & 0xff00ff)
			  + ((i_444_ & 0xff00) * i_447_ >> 8 & 0xff00)
			  + (i_447_ << 24));
		int i_449_ = 256 - i_447_;
		for (int i_450_ = 0; i_450_ < i_443_; i_450_++) {
		    int i_451_ = ((nga) this).H[i_446_ + i_450_];
		    i_451_ = (((i_451_ & 0xff00ff) * i_449_ >> 8 & 0xff00ff)
			      + ((i_451_ & 0xff00) * i_449_ >> 8 & 0xff00));
		    ((nga) this).H[i_446_ + i_450_] = i_444_ + i_451_;
		}
	    } else if (i_445_ == 2) {
		for (int i_452_ = 0; i_452_ < i_443_; i_452_++) {
		    int i_453_ = ((nga) this).H[i_446_ + i_452_];
		    int i_454_ = i_444_ + i_453_;
		    int i_455_ = (i_444_ & 0xff00ff) + (i_453_ & 0xff00ff);
		    i_453_
			= (i_455_ & 0x1000100) + (i_454_ - i_455_ & 0x10000);
		    ((nga) this).H[i_446_ + i_452_]
			= i_454_ - i_453_ | i_453_ - (i_453_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    final IncomingPackets c(int i) {
	return null;
    }
    
    final boolean e() {
	return true;
    }
    
    final boolean n() {
	return false;
    }
    
    final ua a(int i, int i_456_, int[] is, int[] is_457_) {
	return new nu(i, i_456_, is, is_457_);
    }
    
    final void a(float f, float f_458_, float f_459_) {
	/* empty */
    }
    
    final int[] v() {
	return new int[] { ((nga) this).X, ((nga) this).y, ((nga) this).L,
			   ((nga) this).O };
    }
    
    final gga a(int i, int i_460_, int i_461_, int i_462_, int i_463_,
		float f) {
	return null;
    }
    
    final void la(int i, int i_464_, int i_465_, int i_466_) {
	((nga) this).X = i;
	((nga) this).y = i_464_;
	((nga) this).L = i_465_;
	((nga) this).O = i_466_;
	F();
    }
}
