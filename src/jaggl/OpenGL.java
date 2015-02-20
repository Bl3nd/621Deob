/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;
import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL
{
    long peer;
    private static Hashtable a = new Hashtable();
    private Hashtable b;
    private Thread c;
    
    public final synchronized boolean a() {
	Thread thread = Thread.currentThread();
	if (attachPeer()) {
	    OpenGL opengl_0_ = (OpenGL) a.put(thread, this);
	    if (opengl_0_ != null)
		opengl_0_.c = null;
	    c = thread;
	    return true;
	}
	return false;
    }
    
    public static final native void glFrustum(double d, double d_1_,
					      double d_2_, double d_3_,
					      double d_4_, double d_5_);
    
    public static final native void glTexEnvf(int i, int i_6_, float f);
    
    public static final native void glNormalPointer(int i, int i_7_, long l);
    
    public static final native void glGenerateMipmapEXT(int i);
    
    public static final native String glGetString(int i);
    
    public static final native void glGenFramebuffersEXT(int i, int[] is,
							 int i_8_);
    
    public static final native void glGenBuffersARB(int i, int[] is, int i_9_);
    
    public static final native void glTexImage2Dub
	(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
	 int i_15_, int i_16_, byte[] is, int i_17_);
    
    public static final native void glCopyTexImage2D
	(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_,
	 int i_23_, int i_24_);
    
    public static final native void glCopyTexSubImage3D
	(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_,
	 int i_30_, int i_31_, int i_32_);
    
    public static final native void glPushAttrib(int i);
    
    public static final native void glPopAttrib();
    
    public static final native void glEnableClientState(int i);
    
    public static final native void glPopMatrix();
    
    public static final native void glDisableClientState(int i);
    
    public static final native void glRenderbufferStorageEXT
	(int i, int i_33_, int i_34_, int i_35_);
    
    public static final native void glDeleteFramebuffersEXT(int i, int[] is,
							    int i_36_);
    
    public static final native void glProgramStringARB(int i, int i_37_,
						       String string);
    
    public static final native void glPushMatrix();
    
    public static final native void glColor3ub(byte i, byte i_38_, byte i_39_);
    
    public static final native void glShaderSourceRawARB(long l, byte[] is);
    
    private final native boolean attachPeer();
    
    public static final native int glGenProgramARB();
    
    public static final native void glVertex3f(float f, float f_40_,
					       float f_41_);
    
    public static final native void glLightf(int i, int i_42_, float f);
    
    public static final native void glGetObjectParameterivARB
	(long l, int i, int[] is, int i_43_);
    
    public static final native void glCallList(int i);
    
    public static final native int glGetUniformLocationARB(long l,
							   String string);
    
    public final native long init(Canvas canvas, int i, int i_44_, int i_45_,
				  int i_46_, int i_47_, int i_48_);
    
    public static final native void glLightfv(int i, int i_49_, float[] fs,
					      int i_50_);
    
    public static final native void glGenRenderbuffersEXT(int i, int[] is,
							  int i_51_);
    
    public static final native void glDrawBuffer(int i);
    
    public static final native void glDisable(int i);
    
    public static final native void glProgramRawARB(int i, int i_52_,
						    byte[] is);
    
    public static final native void glDeleteProgramARB(int i);
    
    public static final native void glTexImage2Df
	(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_,
	 int i_58_, int i_59_, float[] fs, int i_60_);
    
    public static final native void glPolygonMode(int i, int i_61_);
    
    public static final native void glDrawElements(int i, int i_62_, int i_63_,
						   long l);
    
    public static final native void glEnd();
    
    public static final native void glBlitFramebufferEXT
	(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_,
	 int i_69_, int i_70_, int i_71_, int i_72_);
    
    public static final native void glTexCoord3i(int i, int i_73_, int i_74_);
    
    public static final native void glGetInfoLogARB
	(long l, int i, int[] is, int i_75_, byte[] is_76_, int i_77_);
    
    public static final native void glTexEnvfv(int i, int i_78_, float[] fs,
					       int i_79_);
    
    public static final native void glUniform1iARB(int i, int i_80_);
    
    public static final native void glPixelTransferf(int i, float f);
    
    public static final native void glFogf(int i, float f);
    
    public static final native void glPixelStorei(int i, int i_81_);
    
    public static final native long glCreateProgramObjectARB();
    
    public static final native void glMultiTexCoord3i(int i, int i_82_,
						      int i_83_, int i_84_);
    
    public static final native void glScalef(float f, float f_85_,
					     float f_86_);
    
    public static final native void glTexCoord3f(float f, float f_87_,
						 float f_88_);
    
    public static final native void glHint(int i, int i_89_);
    
    public static final native int glCheckFramebufferStatusEXT(int i);
    
    public static final native void glCullFace(int i);
    
    public static final native void glTexCoord2f(float f, float f_90_);
    
    public static final native void glStencilOp(int i, int i_91_, int i_92_);
    
    public static final native void glBlendFunc(int i, int i_93_);
    
    public static final native void glStencilFunc(int i, int i_94_, int i_95_);
    
    public static final native void glFogi(int i, int i_96_);
    
    public static final native void glTexImage3Dub
	(int i, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_,
	 int i_102_, int i_103_, int i_104_, byte[] is, int i_105_);
    
    public static final native void glFramebufferRenderbufferEXT
	(int i, int i_106_, int i_107_, int i_108_);
    
    public static final native void glColorPointer(int i, int i_109_,
						   int i_110_, long l);
    
    public static final native void glTexParameterf(int i, int i_111_,
						    float f);
    
    public final native void setSwapInterval(int i);
    
    public static final native void glRasterPos2i(int i, int i_112_);
    
    public static final native void glBindBufferARB(int i, int i_113_);
    
    public static final native void glBufferSubDataARBub
	(int i, int i_114_, int i_115_, byte[] is, int i_116_);
    
    public static final native void glUniformMatrix2fvARB
	(int i, int i_117_, boolean bool, float[] fs, int i_118_);
    
    public final native boolean setSurface(long l);
    
    public final native void setPbuffer(long l);
    
    public static final native void glAlphaFunc(int i, float f);
    
    public static final native void glMultiTexCoord2f(int i, float f,
						      float f_119_);
    
    public static final native void glUniformMatrix4fvARB
	(int i, int i_120_, boolean bool, float[] fs, int i_121_);
    
    public static final native void glFinish();
    
    public static final native void glEndList();
    
    public static final native void glClientActiveTexture(int i);
    
    public static final native void glColor4f(float f, float f_122_,
					      float f_123_, float f_124_);
    
    public final native void releasePbuffer(long l);
    
    public static final native void glVertexPointer(int i, int i_125_,
						    int i_126_, long l);
    
    public static final native void glGetFloatv(int i, float[] fs, int i_127_);
    
    public static final native void glColor3f(float f, float f_128_,
					      float f_129_);
    
    public static final native void glShaderSourceARB(long l, String string);
    
    public static final native void glTexGeni(int i, int i_130_, int i_131_);
    
    public static final native void glClearDepth(float f);
    
    public static final native void glGetIntegerv(int i, int[] is, int i_132_);
    
    public static final native int glGenLists(int i);
    
    public static final native void glVertex2f(float f, float f_133_);
    
    public static final native void glMatrixMode(int i);
    
    public static final native void glColor4ub(byte i, byte i_134_,
					       byte i_135_, byte i_136_);
    
    static final native long glMapBufferARB(int i, int i_137_);
    
    public static final native void glCopyPixels(int i, int i_138_, int i_139_,
						 int i_140_, int i_141_);
    
    public static final native void glBufferDataARBa(int i, int i_142_, long l,
						     int i_143_);
    
    public final native void release();
    
    public static final native void glDetachObjectARB(long l, long l_144_);
    
    public static final native void glLoadIdentity();
    
    public static final native void glGenTextures(int i, int[] is, int i_145_);
    
    public static final native void glPixelZoom(float f, float f_146_);
    
    public final native void releaseSurface(Canvas canvas, long l);
    
    public static final native void glClear(int i);
    
    public static final native void glLightModelfv(int i, float[] fs,
						   int i_147_);
    
    public static final native void glGetTexImagei
	(int i, int i_148_, int i_149_, int i_150_, int[] is, int i_151_);
    
    public static final native void glCopyTexSubImage2D
	(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_,
	 int i_157_, int i_158_);
    
    public final native long prepareSurface(Canvas canvas);
    
    public static final native void glTexSubImage2Dub
	(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_,
	 int i_164_, int i_165_, byte[] is, int i_166_);
    
    public final native void surfaceResized(long l);
    
    private final native void detachPeer();
    
    public static final native void glMultMatrixf(float[] fs, int i);
    
    public static final native void glClearColor(float f, float f_167_,
						 float f_168_, float f_169_);
    
    public static final native void glTexCoordPointer(int i, int i_170_,
						      int i_171_, long l);
    
    public static final native void glLinkProgramARB(long l);
    
    public static final native void glMultiTexCoord2i(int i, int i_172_,
						      int i_173_);
    
    public static final native void glUseProgramObjectARB(long l);
    
    public static final native void glAttachObjectARB(long l, long l_174_);
    
    public static final native void glGetProgramivARB(int i, int i_175_,
						      int[] is, int i_176_);
    
    public static final native void glOrtho(double d, double d_177_,
					    double d_178_, double d_179_,
					    double d_180_, double d_181_);
    
    public static final native void glProgramLocalParameter4fARB
	(int i, int i_182_, float f, float f_183_, float f_184_, float f_185_);
    
    public static final native void glDepthMask(boolean bool);
    
    public static final native void glUniform1fARB(int i, float f);
    
    public final native long createPbuffer(int i, int i_186_);
    
    public static final native void glLoadMatrixf(float[] fs, int i);
    
    public static final native int glGetError();
    
    public final native void swapBuffers();
    
    public static final native void glUniformMatrix3fvARB
	(int i, int i_187_, boolean bool, float[] fs, int i_188_);
    
    public static final native void glShadeModel(int i);
    
    public static final native void glBufferSubDataARBa(int i, int i_189_,
							int i_190_, long l);
    
    public static final native void glDeleteLists(int i, int i_191_);
    
    public static final native void glActiveTexture(int i);
    
    public static final native void glRotatef(float f, float f_192_,
					      float f_193_, float f_194_);
    
    public static final native void glGetTexImageub
	(int i, int i_195_, int i_196_, int i_197_, byte[] is, int i_198_);
    
    public static final native void glReadPixelsub
	(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_,
	 byte[] is, int i_204_);
    
    public static final native void glVertex2i(int i, int i_205_);
    
    public static final native void glBindFramebufferEXT(int i, int i_206_);
    
    public static final native void glTranslatef(float f, float f_207_,
						 float f_208_);
    
    public static final native void glBegin(int i);
    
    public static final native void glDeleteObjectARB(long l);
    
    public static final native void glPointSize(float f);
    
    public static final native void glScissor(int i, int i_209_, int i_210_,
					      int i_211_);
    
    public static final native void glTexEnvi(int i, int i_212_, int i_213_);
    
    public final boolean a(String string) {
	if (b == null) {
	    b = new Hashtable();
	    String string_214_ = glGetString(7939);
	    int i = 0;
	    for (;;) {
		int i_215_ = string_214_.indexOf(' ', i);
		if ((i_215_ ^ 0xffffffff) == 0)
		    break;
		String string_216_ = string_214_.substring(i, i_215_).trim();
		i = i_215_ + 1;
		if (string_216_.length() != 0)
		    b.put(string_216_, string_216_);
	    }
	    String string_217_ = string_214_.substring(i).trim();
	    if (string_217_.length() != 0)
		b.put(string_217_, string_217_);
	}
	return b.containsKey(string);
    }
    
    public static final native void glDrawArrays(int i, int i_218_,
						 int i_219_);
    
    public static final native void glUniform4fARB
	(int i, float f, float f_220_, float f_221_, float f_222_);
    
    public static final native void glFramebufferTexture3DEXT
	(int i, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_);
    
    public static final native void glTexCoord2i(int i, int i_228_);
    
    public final native boolean arePbuffersAvailable();
    
    public static final native void glTexImage2Di
	(int i, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_,
	 int i_234_, int i_235_, int[] is, int i_236_);
    
    public static final native void glFogfv(int i, float[] fs, int i_237_);
    
    public static final native void glDeleteRenderbuffersEXT(int i, int[] is,
							     int i_238_);
    
    public static final native void glDeleteBuffersARB(int i, int[] is,
						       int i_239_);
    
    public static final native void glNormal3f(float f, float f_240_,
					       float f_241_);
    
    public static final native void glTexGenfv(int i, int i_242_, float[] fs,
					       int i_243_);
    
    public static final native void glDepthFunc(int i);
    
    public static final native void glBindTexture(int i, int i_244_);
    
    public static final native void glDrawPixelsi
	(int i, int i_245_, int i_246_, int i_247_, int[] is, int i_248_);
    
    public static final native void glBufferDataARBub
	(int i, int i_249_, byte[] is, int i_250_, int i_251_);
    
    public static final native void glRenderbufferStorageMultisampleEXT
	(int i, int i_252_, int i_253_, int i_254_, int i_255_);
    
    public static final native void glBindRenderbufferEXT(int i, int i_256_);
    
    public static final native void glCompileShaderARB(long l);
    
    public static final native void glProgramLocalParameter4fvARB
	(int i, int i_257_, float[] fs, int i_258_);
    
    public static final native void glNewList(int i, int i_259_);
    
    public static final native void glTexImage1Dub
	(int i, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_,
	 int i_265_, byte[] is, int i_266_);
    
    public static final native void glLineWidth(float f);
    
    public static final native void glMaterialfv(int i, int i_267_, float[] fs,
						 int i_268_);
    
    public static final native void glDrawPixelsub
	(int i, int i_269_, int i_270_, int i_271_, byte[] is, int i_272_);
    
    public static final native void glDrawBuffersARB(int i, int[] is,
						     int i_273_);
    
    public static final native void glReadPixelsi
	(int i, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_,
	 int[] is, int i_279_);
    
    public static final native void glFramebufferTexture2DEXT
	(int i, int i_280_, int i_281_, int i_282_, int i_283_);
    
    public final synchronized boolean b() {
	if (c != Thread.currentThread())
	    return false;
	detachPeer();
	a.remove(c);
	c = null;
	return true;
    }
    
    public static final native void glDeleteTextures(int i, int[] is,
						     int i_284_);
    
    public static final native void glBindProgramARB(int i, int i_285_);
    
    static final native boolean glUnmapBufferARB(int i);
    
    public static final native void glUniform2fARB(int i, float f,
						   float f_286_);
    
    public static final native void glColorMaterial(int i, int i_287_);
    
    public static final native void glEnable(int i);
    
    public static final native long glCreateShaderObjectARB(int i);
    
    public static final native void glReadBuffer(int i);
    
    public static final native void glFlush();
    
    public static final native void glTexParameteri(int i, int i_288_,
						    int i_289_);
    
    public static final native void glColorMask
	(boolean bool, boolean bool_290_, boolean bool_291_,
	 boolean bool_292_);
    
    public static final native void glTexSubImage2Df
	(int i, int i_293_, int i_294_, int i_295_, int i_296_, int i_297_,
	 int i_298_, int i_299_, float[] fs, int i_300_);
    
    public static final native void glViewport(int i, int i_301_, int i_302_,
					       int i_303_);
    
    public static final native void glTexSubImage2Di
	(int i, int i_304_, int i_305_, int i_306_, int i_307_, int i_308_,
	 int i_309_, int i_310_, int[] is, int i_311_);
    
    public static final native void glUniform3fARB(int i, float f,
						   float f_312_, float f_313_);
}
