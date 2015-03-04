/* mea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public final class ClientScript extends Node {

    public static int k;
    public Interface interface_;
    public static boolean[][] booleans = { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true },
			{ true, true, true, true, true, true, false, false, false, false, false, false, false },
			{ true, true, true, false, false, true, true, true, false, false, false, false, false },
			{ true, false, false, false, false, true, true, true, false, false, false, false, false },
			{ false, false, true, true, true, true, false, false, false, false, false, false, false },
			{ false, true, true, true, true, true, false, false, false, false, false, false, true },
			{ false, true, true, true, true, true, true, true, false, false, false, false, true },
			{ true, true, false, false, false, false, false, true, false, false, false, false, false },
			{ true, true, true, true, true, false, false, false, true, true, false, false, false },
			{ true, false, false, false, true, true, true, true, true, true, false, false, false },
			{ true, false, true, true, true, true, true, true, false, false, true, true, false },
			{ true, true, true, true, true, true, true, true, true, true, true, true, true },
			new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
    public Interface interface_1;
    public int o;
    public int _y;
    public int _x;
    public static int getFonts;
    public boolean s;
    public String t;
    public int u;
    public static ki ki = new ki();
    public Object[] objects;
    public int x;
    public static GameInPacket gameInPacket;
    public static long currentTime;
    public int A;

	public static void getFonts(pl pl) {
		od.smallFont = pl.a("p11_full", 50);
		getFonts++;
		iq.plainFont = pl.a("p12_full", 119);
		la.boldFont = pl.a("b12_full", -119);
	}

	public static void a(boolean bool) {
		k++;
		uc.c.c((byte) 29);
		Class_md.e.b((byte) 118);
		po.c.setCanvas((byte) 88);
		ru.canvas.setBackground(Color.black);
		jk.m = -1;
		uc.c = ItemDef.a(ru.canvas, 10);
		Class_md.e = qca.a(ru.canvas, 6611, bool);
	}

	public static void nullLoader() {
		gameInPacket = null;
		booleans = null;
		ki = null;
	}

	public ClientScript() {
		/* empty */
	}
}
