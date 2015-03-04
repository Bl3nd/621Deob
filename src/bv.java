/* bv - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

class bv
{
    Buffer a;
    private qj b;
    
    final void a(byte[] is, int i) {
	if (((bv) this).a == null || ((bv) this).a.getSize() < i)
	    ((bv) this).a = ((qj) b).ne.a(i, false);
	((bv) this).a.put(is, 0, 0, i);
    }
    
    bv(qj var_qj, byte[] is, int i) {
	b = var_qj;
	((bv) this).a = ((qj) b).ne.a(i, false);
	if (is != null)
	    ((bv) this).a.put(is, 0, 0, i);
    }
    
    bv(qj var_qj, Buffer buffer) {
	b = var_qj;
	((bv) this).a = buffer;
    }
}
