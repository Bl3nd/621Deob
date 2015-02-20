/* ru - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Calendar;
import java.util.TimeZone;

final class ru
{
    int a = -1;
    private il b;
    private String[] c;
    private int[] d;
    static int e;
    private int[] f;
    static Canvas canvas;
    private int[] h;
    private int[] i;
    private int[][] j;
    private String[] k;
    private int[][] l;
    private int[][] m;
    private String n;
    static int o;
    private int[] p;
    private int[] q;
    private int[] r;
    static Calendar gmtCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static int[][] t;
    private String u;
    static int v;
    static int w;
    static int x;
    private int[] y;
    
    static final void a(int i, boolean bool, int[] is, long[] ls, int i_0_) {
	if (i_0_ < i) {
	    int i_1_ = (i + i_0_) / 2;
	    int i_2_ = i_0_;
	    long l = ls[i_1_];
	    ls[i_1_] = ls[i];
	    ls[i] = l;
	    int i_3_ = is[i_1_];
	    is[i_1_] = is[i];
	    is[i] = i_3_;
	    int i_4_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_5_ = i_0_; i_5_ < i; i_5_++) {
		if (l + (long) (i_4_ & i_5_) > ls[i_5_]) {
		    long l_6_ = ls[i_5_];
		    ls[i_5_] = ls[i_2_];
		    ls[i_2_] = l_6_;
		    int i_7_ = is[i_5_];
		    is[i_5_] = is[i_2_];
		    is[i_2_++] = i_7_;
		}
	    }
	    ls[i] = ls[i_2_];
	    ls[i_2_] = l;
	    is[i] = is[i_2_];
	    is[i_2_] = i_3_;
	    a(i_2_ - 1, false, is, ls, i_0_);
	    a(i, bool, is, ls, i_2_ + 1);
	}
	w++;
	if (bool != false)
	    a(-57, true, null, null, 101);
    }
    
    public static void a(int i) {
	if (i != -8)
	    a(-128, false, null, null, -12);
	gmtCalendar = null;
	t = null;
	canvas = null;
    }
    
    final void a(boolean bool, BytesParser var_es) {
	for (;;) {
	    int i = var_es.readUnsignedByte(-9268);
	    if (i == 0)
		break;
	    a(var_es, i, -32723);
	}
	if (bool != true)
	    a(6);
	o++;
    }
    
    final void b(int i) {
	x++;
	if (n == null)
	    n = u;
	if (i != 1)
	    l = null;
    }
    
    private final void a(BytesParser var_es, int i, int i_8_) {
	if (i != 1) {
	    if (i != 2) {
		if (i != 3) {
		    if (i == 4) {
			int i_9_ = var_es.readUnsignedByte(-9268);
			j = new int[i_9_][3];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			    j[i_10_][0] = var_es.readShort(i_8_ + 45834);
			    j[i_10_][1] = var_es.readInt(98);
			    j[i_10_][2] = var_es.readInt(mv.a(i_8_, -32675));
			}
		    } else if (i == 5)
			var_es.readShort(13111);
		    else if (i == 6)
			var_es.readUnsignedByte(-9268);
		    else if (i != 7) {
			if (i != 8) {
			    if (i != 9) {
				if (i != 10) {
				    if (i != 12) {
					if (i != 13) {
					    if (i != 14) {
						if (i != 15) {
						    if (i != 17) {
							if (i != 18) {
							    if (i == 19) {
								int i_11_
								    = (var_es.readUnsignedByte
								       (-9268));
								this.i
								    = (new int
								       [i_11_]);
								y = (new int
								     [i_11_]);
								c = (new String
								     [i_11_]);
								q = (new int
								     [i_11_]);
								for (int i_12_
									 = 0;
								     (i_12_
								      < i_11_);
								     i_12_++) {
								    q[i_12_]
									= (var_es.readInt
									   (i_8_
									    + 32800));
								    this.i
									[i_12_]
									= (var_es.readInt
									   (123));
								    y[i_12_]
									= (var_es.readInt
									   (88));
								    c[i_12_]
									= (var_es.readString
									   ((byte) 119));
								}
							    } else if (i
								       == 249) {
								int i_13_
								    = (var_es.readUnsignedByte
								       (-9268));
								if (b
								    == null) {
								    int i_14_
									= (dfa.a
									   (i_13_,
									    128));
								    b = (new il
									 (i_14_));
								}
								for (int i_15_
									 = 0;
								     (i_13_
								      > i_15_);
								     i_15_++) {
								    boolean bool
									= ((var_es.readUnsignedByte
									    (-9268))
									   == 1);
								    int i_16_
									= (var_es.readTribyte
									   (-1));
								    Node class_d;
								    if (bool)
									class_d
									    = new aa(var_es.readString((byte) 121));
								    else
									class_d
									    = new GameInPacketHandler(var_es.readInt(i_8_ ^ ~0x7fb8));
								    b.a(class_d,
									(byte) -64,
									(long) i_16_);
								}
							    }
							} else {
							    int i_17_
								= (var_es.readUnsignedByte
								   (-9268));
							    f = new int[i_17_];
							    k = (new String
								 [i_17_]);
							    p = new int[i_17_];
							    h = new int[i_17_];
							    for (int i_18_ = 0;
								 i_17_ > i_18_;
								 i_18_++) {
								h[i_18_]
								    = (var_es.readInt
								       (mv.a
									(i_8_,
									 -32692)));
								f[i_18_]
								    = (var_es.readInt
								       (mv.a
									(i_8_,
									 -32683)));
								p[i_18_]
								    = (var_es.readInt
								       (68));
								k[i_18_]
								    = (var_es.readString
								       ((byte) 118));
							    }
							}
						    } else
							((ru) this).a
							    = var_es.readShort(13111);
						} else
						    var_es.readShort(i_8_ ^ ~0x4ce5);
					    } else {
						int i_19_
						    = var_es.readUnsignedByte(i_8_ ^ 0x5be1);
						m = new int[i_19_][2];
						for (int i_20_ = 0;
						     i_19_ > i_20_; i_20_++) {
						    m[i_20_][0]
							= var_es.readUnsignedByte(-9268);
						    m[i_20_][1]
							= var_es.readUnsignedByte(-9268);
						}
					    }
					} else {
					    int i_21_ = var_es.readUnsignedByte(-9268);
					    d = new int[i_21_];
					    for (int i_22_ = 0; i_21_ > i_22_;
						 i_22_++)
						d[i_22_] = var_es.readShort(13111);
					}
				    } else
					var_es.readInt(71);
				} else {
				    int i_23_ = var_es.readUnsignedByte(-9268);
				    r = new int[i_23_];
				    for (int i_24_ = 0; i_23_ > i_24_; i_24_++)
					r[i_24_] = var_es.readInt(62);
				}
			    } else
				var_es.readUnsignedByte(-9268);
			}
		    } else
			var_es.readUnsignedByte(-9268);
		} else {
		    int i_25_ = var_es.readUnsignedByte(-9268);
		    l = new int[i_25_][3];
		    for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			l[i_26_][0] = var_es.readShort(i_8_ + 45834);
			l[i_26_][1] = var_es.readInt(76);
			l[i_26_][2] = var_es.readInt(117);
		    }
		}
	    } else
		n = var_es.readString2(-1);
	} else
	    u = var_es.readString2(-1);
	e++;
	if (i_8_ != -32723)
	    a(null, 115, -110);
    }
    
    public ru() {
	/* empty */
    }
}
