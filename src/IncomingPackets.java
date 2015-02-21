/* Class_e - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

public abstract class IncomingPackets extends Node {

    static BigInteger k = (new BigInteger("b41869dac93c680e2294f33f689d50d8b5bbd5e4c608d6a66cab11c93380172e91189dc67ce59a6a51b7fc832cf1f0ac8e48e70b7db0f542076de4b546ac52ab862704a36c6aeca609cd3c2934aa8d5650414f33e8e23f34a8a4060f27ce96a9efeea42ec4443bafa8d9a43448957811b1c312fa040cae201f0a465b45fc5c48889d34151830377e77941a392759e0595a13b1ae676eb2286626d96b47d85a4bc1585160311316a754a5842ce0bf5e5bd63e7509bd89a81658ae5ac8561f182291e20451df6e4bf0dbbd5c3e28a4043f6febf98a09b24552266fc8f74d980e8070f5a35c1d5687499620b96a56b11fa8d333905301b1009a532c6aa99bce8535ef33537bf7b20dab84f411179b9a9a44ea34a38480e901a05b562eaaa048adbde36a9373a0d1f95327898f30481475718366c9b69cbd4256cb71c33250aa577e2b6da13750585a88d59c8f389cfee8cb5d5e95e09f24f5650a746d28150067f75f9747a2f0f2920827ae733c7629d3b5acf2fba65b5c213809921bb3edae3a29c63fd896132380875a057e4e23230dcc1f136b5283e36af56b68ce8f47f5d159393036e1244e70fd64ccb4eece2adaf1c8ad6da1d39cbc2eafdb8fe5d5f46af1e0039ab4127bb3b1d1c1229b84d86c4b918998c05b3d6c209bacecc5daaedcd25922637276d8d73026c898951631495d3f981acf7b1c1911b9644882f4af5e1d",
            16));
    static int getIncomingPacketsCounter;
    static lea lea = new lea();

    public IncomingPackets() {
    /* empty */
    }

    protected static int a(int i, int j) {
        if (of.b != null) {
            return of.b[i][j] & 0xffffff;
        }
        return 0;
    }

    public static void nullLoader(boolean bool) {
        k = null;
        lea = null;
        if (bool) {
            getGameInPackets((byte) 53);
        }
    }

    public static GameInPacket[] getGameInPackets(byte i) {
        getIncomingPacketsCounter++;
        return (new GameInPacket[] {pg.sendWorldListGameInPacket, fj.incomingPacket1, hi.incomingPacket2, an.incomingPacket3, qd.incomingPacket4, dfa.incomingPacket5, fh.incomingPacket6, pj.incomingPacket7, wa.incomingPacket8, ow.incomingPacket9,
                        vo.incomingPacket10, lf.incomingPacket11, ao.incomingPacket12, mh.incomingPacket13, sea.smallInterfaceConfigGameInPacket, tda.incomingPacket15, bh.incomingPacket16, Login.incomingPacket17, ida.incomingPacket18,
                        Class_ae.clanChatGameInPacket, ji.setPlayerOptionGameInPacket, Class_ic.incomingPacket21, Interface.incomingPacket22, hp.incomingPacket23, lu.incomingPacket24, daa.incomingPacket25, ak.incomingPacket26,
                        qg.incomingPacket27, dk.incomingPacket28, sj.incomingPacket29, sca.incomingPacket30, ko.incomingPacket31, aaa.incomingPacket32, LoginStream.addToIgnoreGameInPacket, Class_r.bigInterfaceConfigGameInPacket,
                        rba.smallConfigPacket, ua.incomingPacket36, iu.incomingPacket37, nh.incomingPacket38, lh.incomingPacket39, js.incomingPacket40, ge.incomingPacket41, dk.incomingPacket42, dq.incomingPacket43, tfa.incomingPacket44,
                        it.incomingPacket45, GameOutPacket.incomingPacket46, ek.clientScriptGameInPacket, qt.incomingPacket48, bh.sendStringGameInPacket, dp.incomingPacket50, bf.sendInterfaceGameInPacket, qaa.incomingPacket52, ItemDefLoader.incomingPacket53, jn.incomingPacket54,
                        jq.incomingPacket55, il.sendLobbyStringGameInPacket, cba.incomingPacket57, hi.incomingPacket58, GameOutPacket.incomingPacket59, Class_ab.incomingPacket60, wg.playerUpdateGameInPacket, faa.incomingPacket62,
                        te.incomingPacket63, ifa.incomingPacket64, br.incomingPacket65, bf.incomingPacket66, ke.incomingPacket67, oe.npcUpdateGameInPacket, Class_qb.incomingPacket69, Player.incomingPacket70,
                        Class_fb.incomingPacket71, di.incomingPacket72, aaa.incomingPacket73, pi.incomingPacket_74, ut.logoutToLobbyGameInPacket, Class_is.updateNPCInPacket, cj.incomingPacket77, Player.incomingPacket78,
                        pw.incomingPacket79, kea.incomingPacket80, an.incomingPacket81, nh.setItemsByIndexGameInPacket, os.incomingPacket83, od.incomingPacket84, sj.incomingPacket85, Class_pd.incomingPacket86,
                        Class_ef.incomingPacket87, lm.incomingPacket88, td.incomingPacket89, sv.completeLogoutGameInPacket, ws.incomingPacket91, hs.incomingPacket92, Node.bigConfigPacket, efa.incomingPacket94,
                        dk.sendIgnoreListGameInPacket, kba.incomingPacket96, sca.incomingPacket97, sa.incomingPacket98, aea.incomingPacket99, ku.incomingPacket100, nn.incomingPacket101, GameOutPacket.incomingPacket102, ql.incomingPacket103,
                        uba.incomingPacket104, ns.accessMaskGameInPacket, bl.incomingPacket106, lda.incomingPacket107, nj.incomingPacket108, ro.incomingPacket109, dk.incomingPacket110, lr.incomingPacket111, pr.incomingPacket112, aa.incomingPacket113,
                        hu.incomingPacket114, bw.incomingPacket115, sv.lobbyConnectionAliveGameInPacket});
    }
}
