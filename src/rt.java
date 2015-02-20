/* rt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;

public final class rt implements rl
{
    private DirectSoundBuffer[] a = new DirectSoundBuffer[2];
    private boolean[] b = new boolean[2];
    private int[] c;
    private int[] d;
    private int e;
    private int[] f = new int[2];
    private byte[][] g;
    private DirectSound h;
    private int i;
    private int j;
    private DSBufferDesc[] k;
    private DSCursors[] l;
    private WaveFormatEx m;
    
    public final int c(int i, int i_0_) {
	if (!b[i_0_])
	    return 0;
	a[i_0_].getCurrentPosition(l[i_0_]);
	int i_1_ = l[i_0_].write / e;
	if (i <= 57)
	    return 16;
	int i_2_ = f[i_0_] - i_1_ & 0xffff;
	if (i_2_ > d[i_0_]) {
	    for (int i_3_ = i_1_ - f[i_0_] & 0xffff; i_3_ > 0; i_3_ -= 256)
		a(i_0_, c);
	    i_2_ = 0xffff & f[i_0_] - i_1_;
	}
	return i_2_;
    }
    
    public final void b(int i, int i_4_) {
    	try {
    		a[i].stop();
    	} catch(com.ms.com.ComFailException e) {
    		e.printStackTrace();
    	}
	if (i_4_ > 91) {
	    b[i] = false;
	    a[i].setCurrentPosition(0);
	    f[i] = 0;
	}
    }
    
    public final void a(int i, int i_5_) {
	if (i <= -118) {
	    if (a[i_5_] != null) {
		try {
		    a[i_5_].stop();
		} catch (com.ms.com.ComFailException comfailexception) {
		    /* empty */
		}
		a[i_5_] = null;
	    }
	}
    }
    
    public final void a(int i, int[] is) {
	int i_6_ = is.length;
	if (i_6_ != 256 * j)
	    throw new IllegalArgumentException();
	int i_7_ = f[i] * e;
	for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
	    int i_9_ = is[i_8_];
	    if ((i_9_ + 8388608 & ~0xffffff) != 0)
		i_9_ = 0x7fffff ^ i_9_ >> 31;
	    g[i][i_7_ + i_8_ * 2] = (byte) (i_9_ >> 8);
	    g[i][i_7_ + i_8_ * 2 + 1] = (byte) (i_9_ >> 16);
	}
	a[i].writeBuffer(i_7_, i_6_ * 2, g[i], 0);
	f[i] = f[i] + i_6_ / j & 0xffff;
	if (!b[i]) {
	    a[i].play(1);
	    b[i] = true;
	}
    }
    
    public final void a(boolean bool, int i, int i_10_) throws Exception {
	if (this.i == 0 || a[i_10_] != null)
	    throw new IllegalStateException();
	int i_11_ = 65536 * e;
	if (g[i_10_] == null || i_11_ != g[i_10_].length) {
	    g[i_10_] = new byte[i_11_];
	    k[i_10_].bufferBytes = i_11_;
	}
	a[i_10_] = h.createSoundBuffer(k[i_10_], m);
	b[i_10_] = bool;
	f[i_10_] = 0;
	d[i_10_] = i;
    }
    
    public final void a
	(Component component, int i, boolean bool, int i_12_)
	throws Exception {
	if ((this.i ^ 0xffffffff) == i_12_) {
	    if (i < 8000 || i > 48000)
		throw new IllegalArgumentException();
	    j = bool ? 2 : 1;
	    e = !bool ? 2 : 4;
	    c = new int[j * 256];
	    h.initialize(null);
	    h.setCooperativeLevel(component, 2);
	    for (int i_13_ = 0; i_13_ < 2; i_13_++)
		k[i_13_].flags = 16384;
	    this.i = i;
	    m.avgBytesPerSec = e * i;
	    m.channels = j;
	    m.blockAlign = e;
	    m.samplesPerSec = i;
	    m.formatTag = 1;
	    m.bitsPerSample = 16;
	}
    }
    
    public rt() throws Exception {
	d = new int[2];
	k = new DSBufferDesc[2];
	l = new DSCursors[2];
	g = new byte[2][];
	h = new DirectSound();
	m = new WaveFormatEx();
	for (int i = 0; i < 2; i++)
	    k[i] = new DSBufferDesc();
	for (int i = 0; i < 2; i++)
	    l[i] = new DSCursors();
    }
}
