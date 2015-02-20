/* un - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class un extends uc
{
    private bj i;
    static int j;
    static int k;
    static int l;
    private boolean m;
    static int var_n;
    static int o;
    private bj p;
    static int q;
    private bj r;
    private boolean s;
    static int t;
    static int u;
    static GameOutPacket v = new GameOutPacket(44, 3);
    static int w;
    private boolean x;
    private bj y;
    private pm z;
    static int[] A = new int[16];
    static wea B = new wea(2, 2);
    
    final void a(int i, int i_0_, int i_1_) {
	if (i_0_ != 50)
	    m = true;
	l++;
    }
    
    final void d(byte i) {
	o++;
	Class_db class_db = ((qj) ((uc) this).h).Ve;
	if (!x)
	    OpenGL.glBindProgramARB(34336,
				    (((qj) ((uc) this).h).Nf != 2147483647
				     ? ((bj) r).c : ((bj) p).c));
	else
	    OpenGL.glBindProgramARB(34336,
				    (((qj) ((uc) this).h).Nf != 2147483647
				     ? ((bj) y).c : ((bj) this.i).c));
	class_db.a((byte) 24, -1.0F, 0.0F, 0.0F, Class_is.j,
		   (float) ((qj) ((uc) this).h).Nf);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, Class_is.j[0],
					    Class_is.j[1], Class_is.j[2],
					    Class_is.j[3]);
	OpenGL.glEnable(34336);
	if (i < 50)
	    A = null;
	m = true;
	b((int) 117);
    }
    
    final void a(int i) {
	if (m) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    m = false;
	}
	if (i != 1268)
	    A = null;
	var_n++;
	((uc) this).h.b((int) 1, true);
	((uc) this).h.a((rg) null, -2);
	((uc) this).h.a(8448, -465309136, 8448);
	((uc) this).h.b(0, 768, 768, 5890);
	((uc) this).h.b(2, 770, 768, 34166);
	((uc) this).h.a(5890, 770, 0, true);
	((uc) this).h.b((int) 0, true);
	((uc) this).h.b(0, 768, 768, 5890);
	((uc) this).h.a(5890, 770, 0, true);
    }
    
    static final void a(int i, int i_2_, bfa var_bfa, int i_3_) {
	t++;
	if (var_bfa != null && var_bfa != ((Class_ae) oba.I).o && i == 0) {
	    int i_4_ = ((bfa) var_bfa).r;
	    int i_5_ = ((bfa) var_bfa).q;
	    int i_6_ = ((bfa) var_bfa).v;
	    int i_7_ = (int) ((bfa) var_bfa).n;
	    long l = ((bfa) var_bfa).n;
	    if (i_6_ >= 2000)
		i_6_ -= 2000;
	    if (i_6_ == 16) {
		nm.s = 2;
		uda.g++;
		to.h = 0;
		fm.a = i_2_;
		hv.q = i_3_;
		tba var_tba = jga.sendGameOutPacket(naa.K, pca.isaac, (byte) -91);
		((tba) var_tba).loginStream.writeNegativeBytePlus128(!uc.c.a((byte) -68, (int) 82) ? 0 : 1,
				    (byte) 7);
		((tba) var_tba).loginStream.writeShortReversedPlus128(-117, i_4_ + bfa.thisPlayersRegionX);
		((tba) var_tba).loginStream.writeShort(i_5_ + BytesParser.thisPlayersRegionY, 13469);
		((tba) var_tba).loginStream.writeShort(i_7_, 13469);
		ud.a(var_tba, (byte) -36);
		ee.a((byte) -67, i_4_, i_5_);
	    }
	    if (i_6_ == 1012 || i_6_ == 1007 || i_6_ == 1010 || i_6_ == 1002
		|| i_6_ == 1006)
		gg.a(i ^ ~0x3f4, i_6_, i_4_, i_7_);
	    if (i_6_ == 1009) {
		nm.s = 2;
		fm.a = i_2_;
		to.h = 0;
		mca.k++;
		hv.q = i_3_;
		tba var_tba = jga.sendGameOutPacket(fr.y, pca.isaac, (byte) 85);
		((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_5_ + BytesParser.thisPlayersRegionY);
		((tba) var_tba).loginStream.writeNegativeByte((byte) 125,
				    (int) (uc.c.a((byte) -68, (int) 82) ? 1
					   : 0));
		((tba) var_tba).loginStream.writeShort(i_4_ + bfa.thisPlayersRegionX, 13469);
		((tba) var_tba).loginStream.writeShort(0x7fffffff & (int) (l >>> 32), i + 13469);
		ud.a(var_tba, (byte) -36);
		td.a(i_4_, (byte) -42, l, i_5_);
	    }
	    if (i_6_ == 6) {
		hv.q = i_3_;
		to.h = 0;
		fm.a = i_2_;
		nm.s = 2;
		uq.J++;
		tba var_tba = jga.sendGameOutPacket(dea.a, pca.isaac, (byte) 127);
		((tba) var_tba).loginStream.writeShortReversed(112, i_7_);
		((tba) var_tba).loginStream.writeShortReversedPlus128(58, bfa.thisPlayersRegionX + i_4_);
		((tba) var_tba).loginStream.writeNegativeBytePlus128(!uc.c.a((byte) -68, (int) 82) ? 0 : 1,
				    (byte) 7);
		((tba) var_tba).loginStream.writeShort(i_5_ + BytesParser.thisPlayersRegionY, 13469);
		ud.a(var_tba, (byte) -36);
		ee.a((byte) -67, i_4_, i_5_);
	    }
	    if (i_6_ == 21) {
		if (hv.thisPlayersRights <= 0 || !uc.c.a((byte) -68, (int) 82)
		    || !uc.c.a((byte) -68, (int) 81)) {
		    hv.q = i_3_;
		    nm.s = 1;
		    en.Uc++;
		    fm.a = i_2_;
		    to.h = 0;
		    tba var_tba = jga.sendGameOutPacket(tda.g, pca.isaac, (byte) -98);
		    ((tba) var_tba).loginStream.writeShort(BytesParser.thisPlayersRegionY + i_5_, i ^ 0x349d);
		    ((tba) var_tba).loginStream.writeShortReversed(103, i_4_ + bfa.thisPlayersRegionX);
		    ud.a(var_tba, (byte) -36);
		} else
		    mca.teleport(i ^ 0x3d16dbc6, ((Animable) up.thisPlayer).height, i_5_ + BytesParser.thisPlayersRegionY,
                    bfa.thisPlayersRegionX + i_4_);
	    }
	    if (i_6_ == 1004) {
		fm.a = i_2_;
		hv.q = i_3_;
		to.h = 0;
		nm.s = 2;
		aj.c++;
		tba var_tba = jga.sendGameOutPacket(ng.t, pca.isaac, (byte) -83);
		((tba) var_tba).loginStream.writeShort(i_7_, 13469);
		ud.a(var_tba, (byte) -36);
	    }
	    if (i_6_ == 22) {
		hv.q = i_3_;
		to.h = 0;
		daa.o++;
		fm.a = i_2_;
		nm.s = 2;
		tba var_tba = jga.sendGameOutPacket(ej.o, pca.isaac, (byte) -73);
		((tba) var_tba).loginStream.writeShortReversedPlus128(-107, 0x7fffffff & (int) (l >>> 32));
		((tba) var_tba).loginStream.writeShort(BytesParser.thisPlayersRegionY + i_5_, i ^ 0x349d);
		((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_4_ + bfa.thisPlayersRegionX);
		((tba) var_tba).loginStream.writeNegativeBytePlus128(!uc.c.a((byte) -68, (int) 82) ? 0 : 1,
				    (byte) 7);
		ud.a(var_tba, (byte) -36);
		td.a(i_4_, (byte) -42, l, i_5_);
	    }
	    if (i_6_ == 57) {
		Interface var_kp = ida.a(i_5_, i_4_, (byte) 64);
		if (var_kp != null) {
		    vo.c((byte) 31);
		    nm var_nm = client.c(var_kp);
		    ega.a(0, var_kp, var_nm.a(-1035661311), ((nm) var_nm).q);
		    Class_kd.b = tg.a(var_kp, (byte) -105);
		    if (Class_kd.b == null)
			Class_kd.b = "Null";
		    Class_ag.k = ((Interface) var_kp).itemName + "<col=ffffff>";
		}
	    } else {
		if (i_6_ == 12) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			fm.a = i_2_;
			to.h = 0;
			hv.q = i_3_;
			nm.s = 2;
			taa.a++;
			tba var_tba = jga.sendGameOutPacket(sj.q, pca.isaac, (byte) 114);
			((tba) var_tba).loginStream.writeNegativeBytePlus128((!uc.c.a((byte) -68, (int) 82) ? 0
					     : 1),
					    (byte) 7);
			((tba) var_tba).loginStream.writeShort(i_7_, 13469);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, var_qi.i(-1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(i ^ 0xffffffff));
		    }
		}
		if (i_6_ == 47) {
		    ww.K++;
		    to.h = 0;
		    nm.s = 2;
		    fm.a = i_2_;
		    hv.q = i_3_;
		    tba var_tba = jga.sendGameOutPacket(kq.O, pca.isaac, (byte) -113);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(10, i_5_ + BytesParser.thisPlayersRegionY);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(-23, 0x7fffffff & (int) (l >>> 32));
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_4_ + bfa.thisPlayersRegionX);
		    ((tba) var_tba).loginStream.writeNegativeBytePlus128(uc.c.a((byte) -68, (int) 82) ? 1 : 0,
					(byte) 7);
		    ud.a(var_tba, (byte) -36);
		    td.a(i_4_, (byte) -42, l, i_5_);
		}
		if (i_6_ == 17) {
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_7_);
		    if (var_mi != null) {
			fm.a = i_2_;
			cc.h++;
			nm.s = 2;
			to.h = 0;
			NPC class_ac = ((NPCNode) var_mi).l;
			hv.q = i_3_;
			tba var_tba = jga.sendGameOutPacket(eq.G, pca.isaac, (byte) -98);
			((tba) var_tba).loginStream.writeShort(i_7_, i ^ 0x349d);
			((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1),
					    (byte) -109);
			ud.a(var_tba, (byte) -36);
			la.a(i + 1, 0, -2, class_ac.i((int) -1), 0, true,
			     ((Entity) class_ac).regionLocalX[0], ((Entity) class_ac).regionLocalY[0],
			     class_ac.i((int) -1));
		    }
		}
		if (i_6_ == 2) {
		    pi.o++;
		    fm.a = i_2_;
		    to.h = 0;
		    hv.q = i_3_;
		    nm.s = 2;
		    tba var_tba = jga.sendGameOutPacket(vj.u, pca.isaac, (byte) 94);
		    ((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68, (int) 82)
					       ? 0 : 1),
					(byte) -111);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, qda.G);
		    ((tba) var_tba).loginStream.writeIntShiftsInOrder_8_0_24_16(tm.t, 123);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, th.i);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(i ^ 0x80, ((Entity) up.thisPlayer).lb);
		    ud.a(var_tba, (byte) -36);
		}
		if (i_6_ == 45) {
		    Interface var_kp = ida.a(i_5_, i_4_, (byte) 86);
		    if (var_kp != null)
			qd.a(var_kp, 23687);
		}
		if (i_6_ == 30) {
		    hv.q = i_3_;
		    nm.s = 1;
		    fm.a = i_2_;
		    hu.e++;
		    to.h = 0;
		    tba var_tba = jga.sendGameOutPacket(de.a, pca.isaac, (byte) 80);
		    ((tba) var_tba).loginStream.writeShortReversed(104, th.i);
		    ((tba) var_tba).loginStream.writeShort(BytesParser.thisPlayersRegionY + i_5_, 13469);
		    ((tba) var_tba).loginStream.writeShort(qda.G, 13469);
		    ((tba) var_tba).loginStream.writeShort(i_4_ + bfa.thisPlayersRegionX, 13469);
		    ((tba) var_tba).loginStream.writeIntShiftsInOrder_16_24_0_8(tm.t, -119);
		    ud.a(var_tba, (byte) -36);
		    la.a(i ^ 0x1, 0, -4, 1, 0, true, i_4_, i_5_, 1);
		}
		if (i_6_ == 9) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			n.g++;
			hv.q = i_3_;
			fm.a = i_2_;
			to.h = 0;
			nm.s = 2;
			tba var_tba = jga.sendGameOutPacket(kea.f, pca.isaac, (byte) -101);
			((tba) var_tba).loginStream.writeBytePlus128((byte) -72,
					    (int) (uc.c.a((byte) -68, (int) 82)
						   ? 1 : 0));
			((tba) var_tba).loginStream.writeShortReversedPlus128(-126, i_7_);
			ud.a(var_tba, (byte) -36);
			la.a(i ^ 0x1, 0, -2, var_qi.i(-1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(-1));
		    }
		}
		if (i_6_ == 1008) {
		    fm.a = i_2_;
		    hv.q = i_3_;
		    to.h = 0;
		    ou.c++;
		    nm.s = 2;
		    tba var_tba = jga.sendGameOutPacket(ho.objectExamineGameOutPacket, pca.isaac, (byte) 108);
		    ((tba) var_tba).loginStream.writeShort(i_7_, 13469);
		    ud.a(var_tba, (byte) -36);
		}
		if (i_6_ == 50 && rd.D == null) {
		    NPCDef.a(0, i_4_, i_5_);
		    rd.D = ida.a(i_5_, i_4_, (byte) 66);
		    tn.a(rd.D, i ^ 0x3ff);
		}
		if (i_6_ == 58) {
		    NPCNode var_mi = (NPCNode) uo.a.a(i - 32748, (long) i_7_);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			fm.a = i_2_;
			pg.g++;
			nm.s = 2;
			hv.q = i_3_;
			to.h = 0;
			tba var_tba = jga.sendGameOutPacket(Class_ag.j, pca.isaac, (byte) 79);
			((tba) var_tba).loginStream.writeBytePlus128((byte) -72,
					    (int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1));
			((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ 0x58, i_7_);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, class_ac.i((int) -1), 0, true,
			     ((Entity) class_ac).regionLocalX[0], ((Entity) class_ac).regionLocalY[0],
			     class_ac.i((int) -1));
		    }
		}
		if (i_6_ == 1001) {
		    nm.s = 2;
		    fm.a = i_2_;
		    hv.q = i_3_;
		    to.h = 0;
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_7_);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			NPCDef var_du = ((NPC) class_ac).npcDef;
			if (((NPCDef) var_du).L != null)
			    var_du = var_du.a(-4261, cp.e);
			if (var_du != null) {
			    qw.r++;
			    tba var_tba = jga.sendGameOutPacket(oca.n, pca.isaac, (byte) -85);
			    ((tba) var_tba).loginStream.writeShort(((NPCDef) var_du).npcID, i + 13469);
			    ud.a(var_tba, (byte) -36);
			}
		    }
		}
		if (i_6_ == 15) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			hv.q = i_3_;
			to.h = 0;
			Class_md.j++;
			nm.s = 2;
			fm.a = i_2_;
			tba var_tba = jga.sendGameOutPacket(v, pca.isaac, (byte) 118);
			((tba) var_tba).loginStream.writeShortReversedPlus128(-109, i_7_);
			((tba) var_tba).loginStream.writeNegativeByte((byte) 125,
					    (int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1));
			ud.a(var_tba, (byte) -36);
			la.a(i + 1, 0, -2, var_qi.i(-1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(i - 1));
		    }
		}
		if (i_6_ == 5) {
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_7_);
		    if (var_mi != null) {
			hv.q = i_3_;
			av.d++;
			NPC class_ac = ((NPCNode) var_mi).l;
			nm.s = 2;
			to.h = 0;
			fm.a = i_2_;
			tba var_tba = jga.sendGameOutPacket(ss.c, pca.isaac, (byte) -93);
			((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1),
					    (byte) -119);
			((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_7_);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, class_ac.i((int) -1), 0, true,
			     ((Entity) class_ac).regionLocalX[0], ((Entity) class_ac).regionLocalY[0],
			     class_ac.i(i - 1));
		    }
		}
		if (i_6_ == 8) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			to.h = 0;
			iga.b++;
			fm.a = i_2_;
			nm.s = 2;
			hv.q = i_3_;
			tba var_tba = jga.sendGameOutPacket(kea.g, pca.isaac, (byte) 124);
			((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ 0x62, i_7_);
			((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1),
					    (byte) -120);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, var_qi.i(i - 1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(-1));
		    }
		}
		if (i_6_ == 46) {
		    eaa.y++;
		    hv.q = i_3_;
		    to.h = 0;
		    fm.a = i_2_;
		    nm.s = 2;
		    tba var_tba = jga.sendGameOutPacket(mca.outgoingPacket54, pca.isaac, (byte) -55);
		    ((tba) var_tba).loginStream.writeShort(i_4_ + bfa.thisPlayersRegionX, 13469);
		    ((tba) var_tba).loginStream.writeBytePlus128((byte) -72,
					(int) (uc.c.a((byte) -68, (int) 82) ? 1
					       : 0));
		    ((tba) var_tba).loginStream.writeShortReversed(120, BytesParser.thisPlayersRegionY + i_5_);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(i + 128, i_7_);
		    ud.a(var_tba, (byte) -36);
		    ee.a((byte) -67, i_4_, i_5_);
		}
		if (i_6_ == 25) {
		    df.c++;
		    fm.a = i_2_;
		    to.h = 0;
		    hv.q = i_3_;
		    nm.s = 2;
		    tba var_tba = jga.sendGameOutPacket(hj.j, pca.isaac, (byte) 85);
		    ((tba) var_tba).loginStream.writeShortReversed(125, i_7_);
		    ((tba) var_tba).loginStream.writeShortReversed(119, BytesParser.thisPlayersRegionY + i_5_);
		    ((tba) var_tba).loginStream.writeNegativeBytePlus128(!uc.c.a((byte) -68, (int) 82) ? 0 : 1,
					(byte) 7);
		    ((tba) var_tba).loginStream.writeShort(bfa.thisPlayersRegionX + i_4_, 13469);
		    ud.a(var_tba, (byte) -36);
		    ee.a((byte) -67, i_4_, i_5_);
		}
		if (i_6_ == 23) {
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_7_);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			hv.q = i_3_;
			to.h = 0;
			fm.a = i_2_;
			tl.c++;
			nm.s = 2;
			tba var_tba = jga.sendGameOutPacket(mo.y, pca.isaac, (byte) -112);
			((tba) var_tba).loginStream.writeShortReversed(108, i_7_);
			((tba) var_tba).loginStream
			    .writeNegativeBytePlus128(uc.c.a((byte) -68, (int) 82) ? 1 : 0, (byte) 7);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, class_ac.i((int) -1), 0, true,
			     ((Entity) class_ac).regionLocalX[0], ((Entity) class_ac).regionLocalY[0],
			     class_ac.i(i ^ 0xffffffff));
		    }
		}
		if (i_6_ == 48) {
		    nm.s = 2;
		    fm.a = i_2_;
		    mv.c++;
		    to.h = 0;
		    hv.q = i_3_;
		    tba var_tba = jga.sendGameOutPacket(ck.I, pca.isaac, (byte) -110);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, th.i);
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_7_);
		    ((tba) var_tba).loginStream.writeNegativeBytePlus128(!uc.c.a((byte) -68, (int) 82) ? 0 : 1,
					(byte) 7);
		    ((tba) var_tba).loginStream.writeInt(tm.t, i - 105);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(81, BytesParser.thisPlayersRegionY + i_5_);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(-20, qda.G);
		    ((tba) var_tba).loginStream.writeShortReversed(118, i_4_ + bfa.thisPlayersRegionX);
		    ud.a(var_tba, (byte) -36);
		    ee.a((byte) -67, i_4_, i_5_);
		}
		if (i_6_ == 60 || i_6_ == 1011)
		    cda.a(i_4_, 18365, i_7_, ((bfa) var_bfa).p, i_5_);
		if (i_6_ == 13) {
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_7_);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			hv.q = i_3_;
			to.h = 0;
			fm.a = i_2_;
			nm.s = 2;
			qg.i++;
			tba var_tba = jga.sendGameOutPacket(iv.n, pca.isaac, (byte) 89);
			((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1),
					    (byte) -110);
			((tba) var_tba).loginStream.writeShortReversedPlus128(-113, i_7_);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, class_ac.i(i - 1), 0, true,
			     ((Entity) class_ac).regionLocalX[0], ((Entity) class_ac).regionLocalY[0],
			     class_ac.i((int) -1));
		    }
		}
		if (i_6_ == 10) {
		    if (hv.thisPlayersRights > 0 && uc.c.a((byte) -68, (int) 82)
			&& uc.c.a((byte) -68, (int) 81))
			mca.teleport(1024908230, ((Animable) up.thisPlayer).height, i_5_ + BytesParser.thisPlayersRegionY,
                    bfa.thisPlayersRegionX + i_4_);
		    else {
			tba var_tba = uaa.a(true, i_4_, i_5_, i_7_);
			if (i_7_ == 1) {
			    ((tba) var_tba).loginStream.writeByte((int) -1, (byte) -111);
			    ((tba) var_tba).loginStream.writeByte((int) -1, (byte) -127);
			    ((tba) var_tba).loginStream.writeShort((int) qw.n, 13469);
			    ((tba) var_tba).loginStream.writeByte((int) 57, (byte) -126);
			    ((tba) var_tba).loginStream.writeByte(pt.b, (byte) -119);
			    ((tba) var_tba).loginStream.writeByte(vd.N, (byte) -109);
			    ((tba) var_tba).loginStream.writeByte((int) 89, (byte) -113);
			    ((tba) var_tba).loginStream.writeShort(((Animable) up.thisPlayer).locX, 13469);
			    ((tba) var_tba).loginStream.writeShort(((Animable) up.thisPlayer).locY, 13469);
			    ((tba) var_tba).loginStream.writeByte((int) 63, (byte) -123);
			} else {
			    to.h = 0;
			    hv.q = i_3_;
			    fm.a = i_2_;
			    nm.s = 1;
			}
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -4, 1, 0, true, i_4_, i_5_, 1);
		    }
		}
		if (i_6_ == 19) {
		    ku.f++;
		    fm.a = i_2_;
		    hv.q = i_3_;
		    nm.s = 2;
		    to.h = 0;
		    tba var_tba = jga.sendGameOutPacket(Class_mb.V, pca.isaac, (byte) -121);
		    ((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68, (int) 82)
					       ? 0 : 1),
					(byte) -126);
		    ((tba) var_tba).loginStream.writeIntShiftsInOrder_16_24_0_8(tm.t, -112);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ 0xffffffff, qda.G);
		    ((tba) var_tba).loginStream.writeShortReversed(i + 110, th.i);
		    ((tba) var_tba).loginStream.writeShortReversed(i + 105, i_4_ + bfa.thisPlayersRegionX);
		    ((tba) var_tba).loginStream.writeShort(0x7fffffff & (int) (l >>> 32), 13469);
		    ((tba) var_tba).loginStream.writeShortReversed(i + 125, BytesParser.thisPlayersRegionY + i_5_);
		    ud.a(var_tba, (byte) -36);
		    td.a(i_4_, (byte) -42, l, i_5_);
		}
		if (i_6_ == 20) {
		    NPCNode var_mi = (NPCNode) uo.a.a(-32748, (long) i_7_);
		    if (var_mi != null) {
			NPC class_ac = ((NPCNode) var_mi).l;
			to.h = 0;
			Class_kf.D++;
			hv.q = i_3_;
			fm.a = i_2_;
			nm.s = 2;
			tba var_tba = jga.sendGameOutPacket(gr.c, pca.isaac, (byte) 95);
			((tba) var_tba).loginStream.writeIntShiftsInOrder_16_24_0_8(tm.t, -121);
			((tba) var_tba).loginStream.writeShort(qda.G, 13469);
			((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_7_);
			((tba) var_tba).loginStream.writeByte((int) (uc.c.a((byte) -68, (int) 82)
						   ? 1 : 0),
					    (byte) -121);
			((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ ~0x7d, th.i);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, class_ac.i((int) -1), 0, true,
			     ((Entity) class_ac).regionLocalX[0], ((Entity) class_ac).regionLocalY[0],
			     class_ac.i((int) -1));
		    }
		}
		if (i_6_ == 3) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			to.h = 0;
			tt.m++;
			fm.a = i_2_;
			nm.s = 2;
			hv.q = i_3_;
			tba var_tba = jga.sendGameOutPacket(bt.l, pca.isaac, (byte) -90);
			((tba) var_tba).loginStream.writeNegativeByte((byte) 125,
					    (int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1));
			((tba) var_tba).loginStream.writeShortReversedPlus128(75, i_7_);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, var_qi.i(-1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(i - 1));
		    }
		}
		if (i_6_ == 51) {
		    nm.s = 2;
		    hl.a++;
		    fm.a = i_2_;
		    hv.q = i_3_;
		    to.h = 0;
		    tba var_tba = jga.sendGameOutPacket(gn.S, pca.isaac, (byte) 85);
		    ((tba) var_tba).loginStream.writeShortReversed(i + 102,
					0x7fffffff & (int) (l >>> 32));
		    ((tba) var_tba).loginStream.writeNegativeByte((byte) 125,
					(int) (!uc.c.a((byte) -68, (int) 82)
					       ? 0 : 1));
		    ((tba) var_tba).loginStream.writeShort(bfa.thisPlayersRegionX + i_4_, 13469);
		    ((tba) var_tba).loginStream.writeShortReversed(i + 120, i_5_ + BytesParser.thisPlayersRegionY);
		    ud.a(var_tba, (byte) -36);
		    td.a(i_4_, (byte) -42, l, i_5_);
		}
		if (i_6_ == 59) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			fm.a = i_2_;
			lfa.e++;
			hv.q = i_3_;
			to.h = 0;
			nm.s = 2;
			tba var_tba = jga.sendGameOutPacket(Class_jc.G, pca.isaac, (byte) 105);
			((tba) var_tba).loginStream.writeShortReversed(111, i_7_);
			((tba) var_tba).loginStream.writeNegativeBytePlus128((!uc.c.a((byte) -68, (int) 82) ? 0
					     : 1),
					    (byte) 7);
			ud.a(var_tba, (byte) -36);
			la.a(i + 1, 0, -2, var_qi.i(i ^ 0xffffffff), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(-1));
		    }
		}
		if (i_6_ == 49) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			fm.a = i_2_;
			to.h = 0;
			nm.s = 2;
			kj.a++;
			hv.q = i_3_;
			tba var_tba = jga.sendGameOutPacket(Class_vb.q, pca.isaac, (byte) -124);
			((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_7_);
			((tba) var_tba).loginStream
			    .writeNegativeBytePlus128(uc.c.a((byte) -68, (int) 82) ? 1 : 0, (byte) 7);
			ud.a(var_tba, (byte) -36);
			la.a(i + 1, 0, -2, var_qi.i(-1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(-1));
		    }
		}
		if (i_6_ == 18) {
		    hv.q = i_3_;
		    fm.a = i_2_;
		    nm.s = 2;
		    to.h = 0;
		    ji.e++;
		    tba var_tba = jga.sendGameOutPacket(PlayerDef.i, pca.isaac, (byte) 77);
		    ((tba) var_tba).loginStream.writeShortReversed(108, 0x7fffffff & (int) (l >>> 32));
		    ((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68, (int) 82)
					       ? 0 : 1),
					(byte) -111);
		    ((tba) var_tba).loginStream.writeShortReversed(96, i_5_ + BytesParser.thisPlayersRegionY);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ 0x36, bfa.thisPlayersRegionX + i_4_);
		    ud.a(var_tba, (byte) -36);
		    td.a(i_4_, (byte) -42, l, i_5_);
		}
		if (i_6_ == 11) {
		    GameText.i++;
		    to.h = 0;
		    nm.s = 2;
		    hv.q = i_3_;
		    fm.a = i_2_;
		    tba var_tba = jga.sendGameOutPacket(Player.Xc, pca.isaac, (byte) 98);
		    ((tba) var_tba).loginStream.writeShort(bfa.thisPlayersRegionX + i_4_, 13469);
		    ((tba) var_tba).loginStream.writeShortReversedPlus128(i ^ 0x15, i_5_ + BytesParser.thisPlayersRegionY);
		    ((tba) var_tba).loginStream.writeNegativeByte((byte) 125,
					(int) (!uc.c.a((byte) -68, (int) 82)
					       ? 0 : 1));
		    ((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_7_);
		    ud.a(var_tba, (byte) -36);
		    ee.a((byte) -67, i_4_, i_5_);
		}
		if (i_6_ == 4) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			to.h = 0;
			pi.o++;
			fm.a = i_2_;
			nm.s = 2;
			hv.q = i_3_;
			tba var_tba = jga.sendGameOutPacket(vj.u, pca.isaac, (byte) -127);
			((tba) var_tba).loginStream.writeByte((int) (!uc.c.a((byte) -68,
							   (int) 82)
						   ? 0 : 1),
					    (byte) -118);
			((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, qda.G);
			((tba) var_tba).loginStream.writeIntShiftsInOrder_8_0_24_16(tm.t, 124);
			((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(i ^ 0x80, th.i);
			((tba) var_tba).loginStream.writeShortSecondBytePlusArg1(128, i_7_);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, var_qi.i(-1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(-1));
		    }
		}
		if (i_6_ == 44) {
		    Player var_qi = Class_fc.playersInScreen[i_7_];
		    if (var_qi != null) {
			Class_ae.f++;
			to.h = 0;
			nm.s = 2;
			fm.a = i_2_;
			hv.q = i_3_;
			tba var_tba = jga.sendGameOutPacket(mca.outgoingPacket13, pca.isaac, (byte) 109);
			((tba) var_tba).loginStream.writeShortReversedPlus128(i - 121, i_7_);
			((tba) var_tba).loginStream
			    .writeNegativeBytePlus128(uc.c.a((byte) -68, (int) 82) ? 1 : 0, (byte) 7);
			ud.a(var_tba, (byte) -36);
			la.a(1, 0, -2, var_qi.i(i - 1), 0, true,
			     ((Entity) var_qi).regionLocalX[0], ((Entity) var_qi).regionLocalY[0],
			     var_qi.i(i ^ 0xffffffff));
		    }
		}
		if (ba.c)
		    vo.c((byte) 31);
		if (vv.i != null && WorldSub.n == 0)
		    tn.a(vv.i, i ^ 0x3ff);
	    }
	}
    }
    
    final void a(int i, boolean bool) {
	u++;
	if (i > -64)
	    a((byte) 8);
    }
    
    final void b(int i, boolean bool) {
	k++;
	x = bool;
	((uc) this).h.b((int) 1, true);
	((uc) this).h.a(z, -2);
	((uc) this).h.a(34165, -465309136, 7681);
	((uc) this).h.b(0, 768, 768, 34166);
	((uc) this).h.b(2, 770, 768, 5890);
	((uc) this).h.a(34168, 770, 0, true);
	((uc) this).h.b((int) 0, true);
	int i_8_ = 113 % ((65 - i) / 60);
	d((byte) 88);
    }
    
    final boolean a(byte i) {
	if (i >= -93)
	    return true;
	j++;
	return s;
    }
    
    public static void e(byte i) {
	if (i != -20)
	    a(111, -124, (bfa) null, 98);
	B = null;
	A = null;
	v = null;
    }
    
    final void b(int i) {
	q++;
	int i_9_ = -68 % ((i - 59) / 57);
	if (m) {
	    int i_10_ = ((uc) this).h.U();
	    int i_11_ = ((uc) this).h.BA();
	    float f = (float) i_10_ - (float) (i_10_ - i_11_) * 0.125F;
	    float f_12_ = (float) i_10_ - 0.25F * (float) (i_10_ - i_11_);
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_12_, f, 1.0F / (float) ((qj) ((uc) this).h).sg,
		 (float) ((qj) ((uc) this).h).yf / 255.0F);
	    ((uc) this).h.b((int) 1, true);
	    ((uc) this).h.e(-29455, ((qj) ((uc) this).h).ah);
	    ((uc) this).h.b((int) 0, true);
	}
    }
    
    final void a(int i, int i_13_, rg var_rg) {
	if (i_13_ == 7) {
	    if (var_rg != null) {
		((uc) this).h.a(var_rg, i_13_ - 9);
		((uc) this).h.c(false, i);
	    } else {
		((uc) this).h.a(((qj) ((uc) this).h).Yf, -2);
		((uc) this).h.c(false, 1);
		((uc) this).h.b(0, 768, i_13_ ^ 0x307, 34168);
		((uc) this).h.a(34168, 770, 0, true);
	    }
	    w++;
	}
    }
    
    un(qj var_qj) {
	super(var_qj);
	if (!((qj) ((uc) this).h).ef)
	    s = false;
	else {
	    p = (ur.a
		 ("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
		  -65536, 34336, ((uc) this).h));
	    i = (ur.a
		 ("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
		  -65536, 34336, ((uc) this).h));
	    r = (ur.a
		 ("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
		  -65536, 34336, ((uc) this).h));
	    y = (ur.a
		 ("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
		  -65536, 34336, ((uc) this).h));
	    if (y != null & (p != null & i != null & r != null)) {
		z = new pm(var_qj, 3553, 6406, 2, 1, false,
			   new byte[] { 0, -1 }, 6406, false);
		z.a(false, (byte) -117, false);
		s = true;
	    } else
		s = false;
	}
    }
}
