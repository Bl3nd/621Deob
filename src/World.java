/* jda - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class World {

    public String lobbyAddress;
    public static float b;
    public static int c;
    public static int rotateConnectionMethods;
    public static int isWorld;
    public int worldID;
    public int worldPort = 443;
    private boolean isWorldPort = false;
    public int mainPort = 43594;
    private boolean isMainPort = false;
    public static int[] k = new int[5];
    public static int l;

    public static int a(String string) {
        l++;
        int length = string.length();
        int j = 0;
        for (int index = 0; length > index; index++) {
            j = (j << 5) - j + ou.a((byte) 99, string.charAt(index));
        }
        return j;
    }

    public final vfa a(Signlink signlink) {
        c++;
        return signlink.a(!isMainPort ? this.mainPort : this.worldPort, (byte) -73, isWorldPort, this.lobbyAddress);
    }

    public static void nullLoader() {
        k = null;
    }

    /**
     * Is world?
     * @param world The world to be questioned.
     * @return true if so.
     */
    public final boolean isWorld(World world) {
        isWorld++;
        if (world == null) {
            return false;
        }
        if (world.worldID != this.worldID || !this.lobbyAddress.equals(world.lobbyAddress)) {
            return false;
        }
        return true;
    }

    /**
     * Rotates the connect methods. Called by the command (rotateconnectmethods).
     * @param i
     */
    public final void rotateConnectionMethods(int i) {
        if (i == 0) {
            if (isMainPort) {
                if (isWorldPort) {
                    isWorldPort = false;
                } else {
                    isMainPort = false;
                }
            } else {
                isWorldPort = true;
                isMainPort = true;
            }
            rotateConnectionMethods++;
        }
    }

    public World() {
		/* empty */
    }
}
