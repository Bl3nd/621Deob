/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream
{
    private int a;
    private byte[] b;
    private int c;
    private Buffer d;
    private int e;
    
    public Stream(Buffer buffer, int i, int i_0_) {
	this(buffer.getSize() >= 4096 ? 4096 : buffer.getSize());
	a(buffer, i, i_0_);
    }
    
    public final void a(float f) {
	if (c + 3 >= b.length)
	    c();
	int i = floatToRawIntBits(f);
	b[c++] = (byte) (i >> 24);
	b[c++] = (byte) (i >> 16);
	b[c++] = (byte) (i >> 8);
	b[c++] = (byte) i;
    }
    
    public final void a(int i) {
	if (c + 3 >= b.length)
	    c();
	b[c++] = (byte) (i >> 16);
	b[c++] = (byte) (i >> 8);
	b[c++] = (byte) i;
	b[c++] = (byte) (i >> 24);
    }
    
    public static final boolean a() {
	if (getLSB(-65536) != -1)
	    return false;
	return true;
    }
    
    public Stream() {
	this(4096);
    }
    
    public final void b(int i) {
	c();
	a = i;
    }
    
    public Stream(Buffer buffer) {
	this(buffer, 0, buffer.getSize());
    }
    
    public final void c(int i) {
	if (c + 1 >= b.length)
	    c();
	b[c++] = (byte) (i >> 8);
	b[c++] = (byte) i;
    }
    
    public final int b() {
	return a + c;
    }
    
    public final void c() {
	if (c > 0) {
	    if (a + c > e)
		throw new RuntimeException();
	    d.a(b, 0, a, c);
	    a += c;
	    c = 0;
	}
    }
    
    public final void a(int i, int i_1_, int i_2_, int i_3_) {
	if (b.length <= c + 3)
	    c();
	b[c++] = (byte) i;
	b[c++] = (byte) i_1_;
	b[c++] = (byte) i_2_;
	b[c++] = (byte) i_3_;
    }
    
    public final void d(int i) {
	if (c >= b.length)
	    c();
	b[c++] = (byte) i;
    }
    
    public final void b(float f) {
	if (b.length <= c + 3)
	    c();
	int i = floatToRawIntBits(f);
	b[c++] = (byte) i;
	b[c++] = (byte) (i >> 8);
	b[c++] = (byte) (i >> 16);
	b[c++] = (byte) (i >> 24);
    }
    
    public static final native int floatToRawIntBits(float f);
    
    public final void a(Buffer buffer) {
	a(buffer, 0, buffer.getSize());
    }
    
    private static final native byte getLSB(int i);
    
    public final void b(int i, int i_4_, int i_5_, int i_6_) {
	if (b.length <= c + 3)
	    c();
	b[c++] = (byte) i_5_;
	b[c++] = (byte) i_4_;
	b[c++] = (byte) i;
	b[c++] = (byte) i_6_;
    }
    
    public final void e(int i) {
	if (c + 1 >= b.length)
	    c();
	b[c++] = (byte) i;
	b[c++] = (byte) (i >> 8);
    }
    
    private final void a(Buffer buffer, int i, int i_7_) {
	c();
	d = buffer;
	e = i_7_ + i;
	a = i;
	if (e > buffer.getSize())
	    throw new RuntimeException();
    }
    
    private Stream(int i) {
	b = new byte[i];
    }
    
    public final void f(int i) {
	if (c + 3 >= b.length)
	    c();
	b[c++] = (byte) i;
	b[c++] = (byte) (i >> 8);
	b[c++] = (byte) (i >> 16);
	b[c++] = (byte) (i >> 24);
    }
}
