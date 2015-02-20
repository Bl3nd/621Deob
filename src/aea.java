/* aea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

final class aea extends tm
{
    static GameInPacket incomingPacket99 = new GameInPacket(99, 7);
    static int B;
    static int C;
    int D;
    static il E = new il(512);
    static bc F;
    static int G = 0;
    static Hashtable H = new Hashtable();
    
    aea(ct var_ct, rc var_rc, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
	int i_11_, int i_12_) {
	super(var_ct, var_rc, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_,
	      i_7_, i_8_, i_9_, i_10_, i_11_);
	((aea) this).D = i_12_;
    }
    
    static final char a(byte i, char c) {
	C++;
	if (i > -29)
	    a((byte) 26, '\uff9b');
	char c_13_ = c;
    while_11_:
	do {
	while_10_:
	    do {
	    while_9_:
		do {
		while_8_:
		    do {
		    while_7_:
			do {
			while_6_:
			    do {
			    while_5_:
				do {
				while_4_:
				    do {
				    while_3_:
					do {
					    do {
						if (c_13_ != ' '
						    && c_13_ != '\u00a0'
						    && c_13_ != '_'
						    && c_13_ != '-') {
						    if (c_13_ != '['
							&& c_13_ != ']'
							&& c_13_ != '#') {
							if (c_13_ != '\u00e0'
							    && (c_13_
								!= '\u00e1')
							    && (c_13_
								!= '\u00e2')
							    && (c_13_
								!= '\u00e4')
							    && (c_13_
								!= '\u00e3')
							    && (c_13_
								!= '\u00c0')
							    && (c_13_
								!= '\u00c1')
							    && (c_13_
								!= '\u00c2')
							    && (c_13_
								!= '\u00c4')
							    && (c_13_
								!= '\u00c3')) {
							    if ((c_13_
								 != '\u00e8')
								&& (c_13_
								    != '\u00e9')
								&& (c_13_
								    != '\u00ea')
								&& (c_13_
								    != '\u00eb')
								&& (c_13_
								    != '\u00c8')
								&& (c_13_
								    != '\u00c9')
								&& (c_13_
								    != '\u00ca')
								&& (c_13_
								    != '\u00cb')) {
								if ((c_13_
								     != '\u00ed')
								    && (c_13_
									!= '\u00ee')
								    && (c_13_
									!= '\u00ef')
								    && (c_13_
									!= '\u00cd')
								    && (c_13_
									!= '\u00ce')
								    && (c_13_
									!= '\u00cf')) {
								    if ((c_13_
									 != '\u00f2')
									&& (c_13_
									    != '\u00f3')
									&& (c_13_
									    != '\u00f4')
									&& (c_13_
									    != '\u00f6')
									&& (c_13_
									    != '\u00f5')
									&& (c_13_
									    != '\u00d2')
									&& (c_13_
									    != '\u00d3')
									&& (c_13_
									    != '\u00d4')
									&& (c_13_
									    != '\u00d6')
									&& (c_13_
									    != '\u00d5')) {
									if ((c_13_
									     != '\u00f9')
									    && c_13_ != '\u00fa'
									    && c_13_ != '\u00fb'
									    && c_13_ != '\u00fc'
									    && c_13_ != '\u00d9'
									    && c_13_ != '\u00da'
									    && c_13_ != '\u00db'
									    && c_13_ != '\u00dc') {
									    if (c_13_ != '\u00e7' && c_13_ != '\u00c7') {
										if (c_13_ != '\u00ff' && c_13_ != '\u0178') {
										    if (c_13_ != '\u00f1' && c_13_ != '\u00d1') {
											if (c_13_ == '\u00df')
											    break while_10_;
											break while_11_;
										    }
										} else
										    break while_8_;
										break while_9_;
									    }
									} else
									    break while_6_;
									break while_7_;
								    }
								} else
								    break while_4_;
								break while_5_;
							    }
							} else
							    break;
							break while_3_;
						    }
						} else
						    return '_';
						return c;
					    } while (false);
					    return 'a';
					} while (false);
					return 'e';
				    } while (false);
				    return 'i';
				} while (false);
				return 'o';
			    } while (false);
			    return 'u';
			} while (false);
			return 'c';
		    } while (false);
		    return 'y';
		} while (false);
		return 'n';
	    } while (false);
	    return 'b';
	} while (false);
	return Character.toLowerCase(c);
    }
    
    public static void e(int i) {
	E = null;
	if (i != -236)
	    e(-24);
	incomingPacket99 = null;
	H = null;
	F = null;
    }
    
    public final wea a(int i) {
	if (i <= 38)
	    G = 49;
	B++;
	return ha.s;
    }
}
