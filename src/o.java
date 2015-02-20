/* o - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class o extends ah
{
    private AudioFormat F;
    private int G;
    private boolean H = false;
    private SourceDataLine I;
    private byte[] J;
    static Class K;
    
    final void d(int i) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((K == null ? K = a("javax.sound.sampled.SourceDataLine")
		     : K),
		    F, i << (wq.p ? 2 : 1)));
	    I = (SourceDataLine) AudioSystem.getLine(info);
	    I.open();
	    I.start();
	    G = i;
	} catch (LineUnavailableException lineunavailableexception) {
	    if (mfa.a(-125, i) != 1)
		d(dfa.a(i, 128));
	    else {
		I = null;
		throw lineunavailableexception;
	    }
	}
    }
    
    final void a(Component component) {
	Mixer.Info[] infos = AudioSystem.getMixerInfo();
	if (infos != null) {
	    Mixer.Info[] infos_0_ = infos;
	    for (int i = 0; i < infos_0_.length; i++) {
		Mixer.Info info = infos_0_[i];
		if (info != null) {
		    String string = info.getName();
		    if (string != null
			&& 0 <= string.toLowerCase().indexOf("soundmax"))
			H = true;
		}
	    }
	}
	F = new AudioFormat((float) gba.G, 16, !wq.p ? 1 : 2, true, false);
	J = new byte[256 << (!wq.p ? 1 : 2)];
    }
    
    final void c() throws LineUnavailableException {
	I.flush();
	if (H) {
	    I.close();
	    I = null;
	    DataLine.Info info
		= (new DataLine.Info
		   ((K == null ? K = a("javax.sound.sampled.SourceDataLine")
		     : K),
		    F, G << (wq.p ? 2 : 1)));
	    I = (SourceDataLine) AudioSystem.getLine(info);
	    I.open();
	    I.start();
	}
    }
    
    final void d() {
	int i = 256;
	if (wq.p)
	    i <<= 1;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = ((o) this).k[i_1_];
	    if ((i_2_ + 8388608 & ~0xffffff) != 0)
		i_2_ = 0x7fffff ^ i_2_ >> 31;
	    J[i_1_ * 2] = (byte) (i_2_ >> 8);
	    J[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
	}
	I.write(J, 0, i << 1);
    }
    
    final void a() {
	if (null != I) {
	    I.close();
	    I = null;
	}
    }
    
    final int b() {
	return G - (I.available() >> (!wq.p ? 1 : 2));
    }
    
    static Class a(String string) {
	Class var_class;
	try {
	    var_class = Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    //throw new NoClassDefFoundError().initCause(classnotfoundexception);
		classnotfoundexception.printStackTrace();
		return null;
	}
	return var_class;
    }
}
