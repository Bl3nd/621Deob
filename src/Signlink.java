/* rj - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@SuppressWarnings("rawtypes")
public final class Signlink implements Runnable {
	
	FileOnDisk main_File_Cache_idx_225;
	static String osArch;
	static String osVersion;
	static String javaVendor;
	boolean e = false;
	private Object rt;
	private static String game;
	FileOnDisk random_Dat;
	private static volatile long currentTime = 0L;
	static String osNameLowerCase;
	private boolean k;
	static Method setFocusCycleRoot;
	private static String userHome;
	private Object qv;
	private Object wv;
	private hca hca;
	FileOnDisk main_File_Cache_Dat2 = null;
	boolean r;
	EventQueue eventQueue;
	private vfa vfa_;
	private Thread thread;
	FileOnDisk[] main_File_Cache_idx;
	private static String osName;
	static String javaVersion;
	private ib ib;
	private static int z;
	private vfa vfa_1;
	static Method setFocusTraversalKeysEnabled;
	/* synthetic */ static Class awtComponent;
	/* synthetic */static Class D;
	/* synthetic */static Class awtPoint;
	/* synthetic */static Class awtFrame;

	public final vfa a(URL url, int i) {
		if (i != 4851) {
			thread = null;
		}
		return a(url, 0, -32698, 4, 0);
	}

	public final boolean writeFileOutputStream(int i, File file, byte[] buf) {
		try {
			FileOutputStream fileoutputstream = new FileOutputStream(file);
			fileoutputstream.write(buf, 0, buf.length);
			fileoutputstream.close();
			if (i <= 45) {
				this.main_File_Cache_Dat2 = null;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public final vfa a(int priority, Runnable runnable, int j) {
		if (j != 0) {
			z = 109;
		}
		return a(runnable, priority, -32698, 2, 0);
	}

	public final void getCurrentTime(int time) {
		currentTime = us.getCurrentTime(124) + (long) time;
	}

	public final vfa a(int priority, byte b) {
		if (b != 116) {
			return null;
		}
		return a(null, priority, b - 32814, 3, 0);
	}

	private static FileOnDisk createDatFile(int i, String number, String game, byte b) {
		String datFile;
		if (i == 33) {
			datFile = "jagex_" + game + "_preferences" + number + "_rc.dat";
		} else if (i == 34) {
			datFile = "jagex_" + game + "_preferences" + number + "_wip.dat";
		} else {
			datFile = "jagex_" + game + "_preferences" + number + ".dat";
		}
		String[] paths = { "c:/rscache/", "/rscache/", userHome, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		int index = 0;
		if (b != 35) {
			createDatFile(-3, null, null, (byte) 55);
		}
		for (/**/; index < paths.length; index++) {
			String parentFile = paths[index];
			if (parentFile.length() <= 0 || new File(parentFile).exists()) {
				try {
					FileOnDisk fileOnDisk = new FileOnDisk(new File(parentFile, datFile), "rw", 10000L);
					return fileOnDisk;
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		return null;
	}

	public final vfa a(byte b) {
		if (b >= -2) {
			thread = null;
		}
		return a(null, 0, -32698, 5, 0);
	}

	public static FileOnDisk createDatFile(String number, byte b) {
		if (b != -101) {
			Signlink.currentTime = 113L;
		}
		return createDatFile(z, number, game, (byte) 35);
	}

	public final vfa a(int i, String string) {
		if (i != 0) {
			return null;
		}
		return a(string, 0, -32698, 16, 0);
	}

	public final void run() {
		for (;;) {
			vfa vfa;
			synchronized (this) {
				for (;;) {
					if (k) {
						return;
					}
					if (vfa_ != null) {
						vfa = vfa_;
						vfa_ = vfa_.a;
						if (vfa_ == null) {
							vfa_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				int i = vfa.worldPort;
				if (i != 1) {
					if (i != 22) {
						if (i != 2) {
							if (i == 4) {
								if (Signlink.currentTime > us.getCurrentTime(102)) {
									throw new IOException();
								}
								vfa.hostName = new DataInputStream(((URL) vfa.number).openStream());
							} else if (i == 8) {
								Object[] objects = (Object[]) vfa.number;
								if (this.r && (((Class) objects[0]).getClassLoader() == null)) {
									throw new SecurityException();
								}
								vfa.hostName = (((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
							} else if (i == 9) {
								Object[] objects = (Object[]) vfa.number;
								if (this.r && (((Class) objects[0]).getClassLoader() == null)) {
									throw new SecurityException();
								}
								vfa.hostName = (((Class) objects[0]).getDeclaredField((String) objects[1]));
							} else if (i == 18) {
								Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
								vfa.hostName = clipboard.getContents(null);
							} else if (i == 19) {
								Transferable transferable = (Transferable) vfa.number;
								Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
								clipboard.setContents(transferable, null);
							} else if (this.r) {
								if (i == 3) {
									if (us.getCurrentTime(96) < Signlink.currentTime) {
										throw new IOException();
									}
									String string = (String.valueOf(vfa.priority >> 24 & 0xff) + "." + (0xff & vfa.priority >> 16) + "."
											+ ((0xffa8 & vfa.priority) >> 8) + "." + (vfa.priority & 0xff));
									vfa.hostName = InetAddress.getByName(string).getHostName();
								} else if (i != 21) {
									if (i == 5) {
										if (!this.e) {
											vfa.hostName = (Class.forName("wv").getMethod("listmodes", new Class[0]).invoke(wv));
										} else {
											vfa.hostName = hca.a(-111);
										}
									} else if (i != 6) {
										if (i == 7) {
											if (!this.e) {
												Class.forName("wv").getMethod("exit", new Class[0]).invoke(wv);
											} else {
												hca.a((Frame) vfa.number, false);
											}
										} else if (i == 12) {
											FileOnDisk fileOnDisk = createDatFile(z, (String) vfa.number, game, (byte) 35);
											vfa.hostName = fileOnDisk;
										} else if (i == 13) {
											FileOnDisk fileOnDisk = createDatFile(z, (String) vfa.number, "", (byte) 35);
											vfa.hostName = fileOnDisk;
										} else if (!this.r || i != 14) {
											if (this.r && i == 15) {
                                                System.out.println("I == 15");
												boolean bool = vfa.priority != 0;
												Component component = ((Component) vfa.number);
												if (!this.e) {
													Class.forName("qv").getDeclaredMethod("showcursor", (new Class[] { 
															(awtComponent != null ? awtComponent : (awtComponent = getClassByName("java.awt.Component"))), 
															Boolean.TYPE })).invoke(qv, (new Object[] { component, (new Boolean(bool)) }));
												} else {
													ib.a(component, (byte) -112, bool);
												}
											} else if (!this.e && i == 17) {
												Object[] objects = ((Object[]) vfa.number);
												Class.forName("qv").getDeclaredMethod("setcustomcursor", (new Class[] {
														(awtComponent != null ? awtComponent : (awtComponent = getClassByName("java.awt.Component"))),
														(D != null ? D : (D = getClassByName("[I"))), Integer.TYPE, Integer.TYPE, 
														(awtPoint != null ? awtPoint : (awtPoint = getClassByName("java.awt.Point"))) 
														})).invoke(qv, (new Object[] { (Component) objects[0], (int[]) objects[1], 
																new Integer(vfa.priority), new Integer(vfa.lobbyAddress),
																(Point) objects[2] }));
											} else {
												if (i != 16) {
													throw new Exception("");
												}
												try {
													if (!osNameLowerCase.startsWith("win")) {
														throw new Exception();
													}
													String number = ((String) vfa.number);
													if (!(number.startsWith("http://")) && !(number.startsWith("https://"))) {
														throw new Exception();
													}
													String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
													for (int index = 0; (index < number.length()); index++) {
														if ((validChars.indexOf(number.charAt(index))) == -1) {
															throw new Exception();
														}
													}
													Runtime.getRuntime().exec("cmd /c start \"j\" \"" + number + "\"");
													vfa.hostName = null;
												} catch (Exception exception) {
													vfa.hostName = exception;
													throw exception;
												}
											}
										} else {
											int j = vfa.priority;
											int k = vfa.lobbyAddress;
											if (!this.e) {
												Class.forName("qv").getDeclaredMethod("movemouse", (new Class[] { Integer.TYPE, 
														Integer.TYPE })).invoke(qv, (new Object[] { new Integer(j), new Integer(k) }));
											} else {
												ib.a(k, (byte) -128, j);
											}
										}
									} else {
										Frame frame = new Frame("Jagex Full Screen");
										vfa.hostName = frame;
										frame.setResizable(false);
										if (this.e) {
											hca.a(frame, 0xffff & vfa.priority, true, vfa.lobbyAddress >> 16, 0xffff & vfa.lobbyAddress, vfa.priority >>> 16);
										} else
											Class.forName("wv").getMethod("enter", (new Class[] { 
													(awtFrame != null ? awtFrame : (awtFrame = getClassByName("java.awt.Frame"))), Integer.TYPE,
													Integer.TYPE, Integer.TYPE, Integer.TYPE })).invoke(wv, (new Object[] { frame,
													new Integer(vfa.priority >>> 16), new Integer(0xffff & vfa.priority), 
													new Integer(vfa.lobbyAddress >> 16), new Integer(0xffff & (vfa.lobbyAddress)) }));
									}
								} else {
									if (Signlink.currentTime > us.getCurrentTime(97)) {
										throw new IOException();
									}
									vfa.hostName = InetAddress.getByName((String) vfa.number).getAddress();
								}
							} else {
								throw new Exception("");
							}
						} else {
							Thread thread = new Thread((Runnable) vfa.number);
							thread.setDaemon(true);
							thread.start();
							thread.setPriority(vfa.priority);
							vfa.hostName = thread;
						}
					} else {
						if (Signlink.currentTime > us.getCurrentTime(107)) {
							throw new IOException();
						}
						try {
							vfa.hostName = uba.a(vfa.priority, 101, (String) vfa.number).b(-123);
						} catch (dm dm) {
							vfa.hostName = dm.getMessage();
							throw dm;
						}
					}
				} else {
					if (Signlink.currentTime > us.getCurrentTime(101)) {
						throw new IOException();
					}
					vfa.hostName = new Socket(InetAddress.getByName((String) vfa.number), vfa.priority);
				}
				vfa.f = 1;
			} catch (Throwable throwable) {
				vfa.f = 2;
			}
			synchronized (vfa) {
				vfa.notify();
			}
		}
	}

	private vfa a(Object address, int priority, int i, int worldPort, int lobbyAddress) {
		vfa vfa = new vfa();
		vfa.number = address;
		if (i != -32698) {
			javaVendor = null;
		}
		vfa.worldPort = worldPort;
		vfa.priority = priority;
		vfa.lobbyAddress = lobbyAddress;
		synchronized (this) {
			if (vfa_1 != null) {
				vfa_1.a = vfa;
				vfa_1 = vfa;
			} else {
                vfa_1 = vfa_ = vfa;
            }
			this.notify();
		}
		return vfa;
	}

	public final vfa a(Class class_, String string, Class[] classes, int i) {
		if (i != 1727313032) {
			this.r = false;
		}
		return a(new Object[] { class_, string, classes }, 0, i - 1727345730, 8, 0);
	}

	public final boolean a(boolean bool) {
		if (!this.r) {
			return false;
		}
		if (bool) {
			a(false);
		}
		if (!this.e) {
			if (wv == null) {
				return false;
			}
			return true;
		}
		if (hca == null) {
			return false;
		}
		return true;
	}

	public final vfa a(int priority, byte b, boolean isWorldPort, String lobbyAddress) {
		return a(lobbyAddress, priority, -32698, isWorldPort ? 22 : 1, 0);
	}

	public final Object b(byte b) {
		if (b >= -84) {
			osArch = null;
		}
		return rt;
	}

	public final vfa a(String string, Class class_, int i) {
		if (i != 0) {
			return null;
		}
		return a(new Object[] { class_, string }, 0, -32698, 9, 0);
	}

	public final vfa a(int[] buf, Point point, int priority, int i, boolean bool, Component component) {
		if (!bool) {
			Signlink.currentTime = -80L;
		}
		return a(new Object[] { component, buf, point }, priority, -32698, 17, i);
	}

	public final void b(int i) {
		synchronized (this) {
			k = true;
			this.notifyAll();
		}
		try {
			thread.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		if (this.main_File_Cache_Dat2 != null) {
			try {
				this.main_File_Cache_Dat2.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (this.main_File_Cache_idx_225 != null) {
			try {
				this.main_File_Cache_idx_225.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (this.main_File_Cache_idx != null) {
			for (int index = 0; index < this.main_File_Cache_idx.length; index++) {
				if (this.main_File_Cache_idx[index] != null) {
					try {
						this.main_File_Cache_idx[index].close();
					} catch (IOException ioexception) {
						/* empty */
					}
				}
			}
		}
		if (i > -117) {
			this.e = true;
		}
		do {
			if (this.random_Dat != null) {
				try {
					this.random_Dat.close();
				} catch (IOException ioexception) {
					break;
				}
				break;
			}
		} while (false);
	}

	public final vfa a(String string, byte b, boolean bool) {
		if (b != -28) {
			javaVersion = null;
		}
		if (bool) {
			return a(string, 0, -32698, 12, 0);
		}
		return a(string, 0, -32698, 13, 0);
	}

	public final vfa a(int i, int j, byte b, int k, int i1) {
		return a(null, i1 + (k << 16), -32698, 6, i + (j << 16));
	}

	public final vfa a(Frame frame, byte b) {
		if (b != -36) {
			return null;
		}
		return a(frame, 0, -32698, 7, 0);
	}

	public Signlink(int i, String game_, int j, boolean bool) throws Exception {
		this.main_File_Cache_idx_225 = null;
		this.r = false;
		vfa_ = null;
		this.random_Dat = null;
		k = false;
		vfa_1 = null;
		game = game_;
		javaVendor = "Unknown";
		javaVersion = "1.1";
		this.r = bool;
		z = i;
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		if ((~javaVendor.toLowerCase().indexOf("microsoft")) != 0) {
			this.e = true;
		}
		try {
			osName = System.getProperty("os.name");
		} catch (Exception exception) {
			osName = "Unknown";
		}
		osNameLowerCase = osName.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			osVersion = "";
		}
		try {
			userHome = System.getProperty("user.home");
			if (userHome != null)
				userHome += "/";
		} catch (Exception exception) {
			/* empty */
		}
		if (userHome == null)
			userHome = "~/";
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		if (!this.e) {
			try {
				setFocusTraversalKeysEnabled = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled",
                        Boolean.TYPE));
			} catch (Exception exception) {
				/* empty */
			}
			try {
				setFocusCycleRoot = (Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE));
			} catch (Exception exception) {
				/* empty */
			}
		}
		le.a(z, 0, game);
		if (this.r) {
			this.random_Dat = new FileOnDisk(le.a("random.dat", null, (byte) 33, z), "rw", 25L);
			this.main_File_Cache_Dat2 = new FileOnDisk(le.a("main_file_cache.dat2", (byte) -106), "rw", 209715200L);
			this.main_File_Cache_idx_225 = new FileOnDisk(le.a("main_file_cache.idx255", (byte) -106), "rw", 1048576L);
			this.main_File_Cache_idx = new FileOnDisk[j];
			for (int index = 0; j > index; index++) {
				this.main_File_Cache_idx[index] = new FileOnDisk(le.a("main_file_cache.idx" + index, (byte) -106), "rw", 1048576L);
			}
			if (this.e) {
				try {
					rt = Class.forName("rt").newInstance();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			try {
				if (!this.e) {
					wv = Class.forName("wv").newInstance();
				} else {
					hca = new hca();
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				if (!this.e) {
					qv = Class.forName("qv").newInstance();
				} else {
					ib = new ib();
				}
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (this.r && !this.e) {
			ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
			for (ThreadGroup threadgroup_ = threadgroup.getParent(); threadgroup_ != null; threadgroup_ = threadgroup.getParent()) {
				threadgroup = threadgroup_;
			}
			Thread[] threads = new Thread[1000];
			threadgroup.enumerate(threads);
			for (int index = 0; index < threads.length; index++) {
				if (threads[index] != null && threads[index].getName().startsWith("AWT")) {
					threads[index].setPriority(1);
				}
			}
		}
		k = false;
		thread = new Thread(this);
		thread.setPriority(10);
		thread.setDaemon(true);
		thread.start();
	}

	public /* synthetic */static Class getClassByName(String name) {
		try {
			return Class.forName(name);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
