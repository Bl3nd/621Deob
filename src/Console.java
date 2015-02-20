public class Console {

	public static boolean printPacketData = true;
	public static boolean printPacketIDs = true;

	public static void printPacketData(String msg) {
		if (printPacketData) {
			System.out.println(msg);
		}
	}

	public static void printPacketActivation(String msg) {
		if (printPacketIDs) {
			System.out.println(msg);
		}
	}
}
