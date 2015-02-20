/* ge - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ge extends mca
{
    static int I;
    static int K;
    static int L;
    private int M = 3072;
    static int N;
    static GameInPacket O;
    static int[] P = new int[2];
    static int Q;
    static int R;
    private int S = 1024;
    private int T = 2048;
    static int U;
    
    final int[][] a(int i, boolean bool) {
	N++;
	int[][] is = ((mca) this).B.a(i, -55);
	if (bool != true)
	    M = -57;
	if (((td) ((mca) this).B).p) {
	    int[][] is_0_ = this.a(0, i, 0);
	    int[] is_1_ = is_0_[0];
	    int[] is_2_ = is_0_[1];
	    int[] is_3_ = is_0_[2];
	    int[] is_4_ = is[0];
	    int[] is_5_ = is[1];
	    int[] is_6_ = is[2];
	    for (int i_7_ = 0; fr.v > i_7_; i_7_++) {
		is_4_[i_7_] = (T * is_1_[i_7_] >> 12) + S;
		is_5_[i_7_] = S + (T * is_2_[i_7_] >> 12);
		is_6_[i_7_] = (T * is_3_[i_7_] >> 12) + S;
	    }
	}
	return is;
    }
    
    static final void b(int i, byte i_8_, int i_9_) {
	L++;
	if (i_8_ != 15)
	    P = null;
	qba var_qba = ofa.a(7, i, (byte) -61);
	var_qba.c((byte) 11);
	((qba) var_qba).v = i_9_;
    }
    
    static final void a(int i, int i_10_, String string) {
	if (i != -8)
	    O = null;
	Q++;
	int i_11_ = oca.inScreenPlayers;
	int[] is = vd.inScreenPlayerIDs;
	boolean bool = false;
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
	    Player var_qi = Class_fc.playersInScreen[is[i_12_]];
	    if (var_qi != null && up.thisPlayer != var_qi && ((Player) var_qi).displayName != null
		&& ((Player) var_qi).displayName.equalsIgnoreCase(string)) {
		if (i_10_ == 1) {
		    iga.b++;
		    tba var_tba = jga.sendGameOutPacket(kea.g, pca.isaac, (byte) 103);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(-122, is[i_12_]);
		    ((tba) var_tba).loginStream.writeByte((int) 0, (byte) -110);
		    ud.a(var_tba, (byte) -36);
		} else if (i_10_ != 4) {
		    if (i_10_ == 5) {
			Class_md.j++;
			tba var_tba = jga.sendGameOutPacket(un.v, pca.isaac, (byte) -101);
			((tba) var_tba).loginStream.writeShortReversedPlus128(26, is[i_12_]);
			((tba) var_tba).loginStream.writeNegativeByte((byte) 125, (int) 0);
			ud.a(var_tba, (byte) -36);
		    } else if (i_10_ == 6) {
			tt.m++;
			tba var_tba = jga.sendGameOutPacket(bt.l, pca.isaac, (byte) -122);
			((tba) var_tba).loginStream.writeNegativeByte((byte) 125, (int) 0);
			((tba) var_tba).loginStream.writeShortReversedPlus128(64, is[i_12_]);
			ud.a(var_tba, (byte) -36);
		    } else if (i_10_ == 7) {
			n.g++;
			tba var_tba = jga.sendGameOutPacket(kea.f, pca.isaac, (byte) 106);
			((tba) var_tba).loginStream.writeBytePlus128((byte) -72, (int) 0);
			((tba) var_tba).loginStream.writeShortReversedPlus128(90, is[i_12_]);
			ud.a(var_tba, (byte) -36);
		    }
		} else {
		    lfa.e++;
		    tba var_tba = jga.sendGameOutPacket(Class_jc.G, pca.isaac, (byte) 91);
		    ((tba) var_tba).loginStream.writeShortReversed(120, is[i_12_]);
		    ((tba) var_tba).loginStream.writeNegativeBytePlus128(0, (byte) 7);
		    ud.a(var_tba, (byte) -36);
		}
		bool = true;
		break;
	    }
	}
	if (!bool)
	    cba.a(4, false, GameText.D.getString((byte) -74, cba.languageID) + string);
    }
    
    public ge() {
	super(1, false);
    }
    
    final void a(int i, BytesParser bytesParser, int j) {
	int i_14_ = j;
    while_45_:
	do {
	    do {
		if (i_14_ != 0) {
		    if (i_14_ != 1) {
			if (i_14_ == 2)
			    break;
			break while_45_;
		    }
		} else {
		    S = bytesParser.readShort(13111);
		    break while_45_;
		}
		M = bytesParser.readShort(i + 13110);
		break while_45_;
	    } while (false);
	    ((mca) this).m = bytesParser.readUnsignedByte(-9268) == 1;
	} while (false);
	if (i != 1)
	    i(-111);
	R++;
    }
    
    final void b(int i) {
	T = M - S;
	I++;
	int i_15_ = -128 % ((i - 64) / 60);
    }
    
    final int[] a(int i, int j) {
	K++;
	int[] is = ((mca) this).s.a(j, true);
	if (((oca) ((mca) this).s).o) {
	    int[] is_17_ = this.a(j, false, 0);
	    for (int i_18_ = 0; fr.v > i_18_; i_18_++)
		is[i_18_] = S + (is_17_[i_18_] * T >> 12);
	}
	int i_19_ = -106 % ((81 - i) / 36);
	return is;
    }
    
    public static void i(int i) {
	if (i != 0)
	    O = null;
	O = null;
	P = null;
    }
    
    static {
	O = new GameInPacket(41, 3);
	U = 1339;
    }
}
