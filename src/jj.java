/* jj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class jj extends Node
{
    int[] k;
    static long[] l = new long[10];
    static pl m;
    int n;
    boolean[] o;
    int p;
    int[] q;
    static int r;
    int[][] s;
    static int t;
    
    static final char a(int i, boolean bool, char c) {
	t++;
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if (c == '\u00dd')
		return 'Y';
	    if (c == '\u00df')
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if (c == '\u00e7')
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if (c == '\u00fd' || c == '\u00ff')
		return 'y';
	}
	if (bool != true)
	    a(-21, true, 'h');
	if (c == '\u0152')
	    return 'O';
	if (c == '\u0153')
	    return 'o';
	if (c == '\u0178')
	    return 'Y';
	return c;
    }
    
    public static void a(int i) {
	if (i == 18354) {
	    l = null;
	    m = null;
	}
    }
    
    jj(int i, byte[] is) {
	((jj) this).p = i;
	BytesParser var_es = new BytesParser(is);
	((jj) this).n = var_es.readUnsignedByte(-9268);
	((jj) this).k = new int[((jj) this).n];
	((jj) this).s = new int[((jj) this).n][];
	((jj) this).o = new boolean[((jj) this).n];
	((jj) this).q = new int[((jj) this).n];
	for (int i_0_ = 0; ((jj) this).n > i_0_; i_0_++) {
	    ((jj) this).k[i_0_] = var_es.readUnsignedByte(-9268);
	    if (((jj) this).k[i_0_] == 6)
		((jj) this).k[i_0_] = 2;
	}
	for (int i_1_ = 0; i_1_ < ((jj) this).n; i_1_++)
	    ((jj) this).o[i_1_] = var_es.readUnsignedByte(-9268) == 1;
	for (int i_2_ = 0; ((jj) this).n > i_2_; i_2_++)
	    ((jj) this).q[i_2_] = var_es.readShort(13111);
	for (int i_3_ = 0; i_3_ < ((jj) this).n; i_3_++)
	    ((jj) this).s[i_3_] = new int[var_es.readUnsignedByte(-9268)];
	for (int i_4_ = 0; ((jj) this).n > i_4_; i_4_++) {
	    for (int i_5_ = 0; ((jj) this).s[i_4_].length > i_5_; i_5_++)
		((jj) this).s[i_4_][i_5_] = var_es.readUnsignedByte(-9268);
	}
    }
}
