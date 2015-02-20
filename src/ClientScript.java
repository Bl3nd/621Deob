/* mea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public final class ClientScript extends Node {
	
	static int k;
	Interface interface_;
	static boolean[][] m = { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true },
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
	Interface interface_1;
	int o;
	int p;
	int q;
	static int r;
	boolean s;
	String t;
	int u;
	static ki ki = new ki();
	Object[] objects;
	int x;
	static GameInPacket gameInPacket;
	static long z;
	int A;

	public static void a(pl pl) {
		od.smallFont = pl.a("p11_full", (int) 50);
		r++;
		iq.plainFont = pl.a("p12_full", (int) 119);
		la.boldFont = pl.a("b12_full", (int) -119);
	}

	public static void a(boolean bool) {
		k++;
		uc.c.c((byte) 29);
		Class_md.e.b((byte) 118);
		po.c.c((byte) 88);
		ru.canvas.setBackground(Color.black);
		jk.m = -1;
		uc.c = ItemDef.a(ru.canvas, 10);
		Class_md.e = qca.a(ru.canvas, 6611, bool);
	}

	public static void nullLoader() {
		gameInPacket = null;
		m = null;
		ki = null;
	}

	public ClientScript() {
		/* empty */
	}
}
