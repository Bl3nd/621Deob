/* rfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {
	
	static dt dt;
	static int finalizeCount;
	static int c;
	static int d;
	private vfa vfa;
	static vfa vfa_;
	private boolean g = false;
	static int h;
	private Signlink signLink;
	private InputStream inputStream;
	static int k;
	static int l;
	static int m;
	private int off = 0;
	static int o;
	static wea wea = new wea(0, 1);
	private int q;
	static cv[] cvs = new cv[35];
	private boolean s = false;
	static tw tw;
	static int u;
	static int v;
	private OutputStream outputStream;
	private byte[] buf;
	static int y;
	private Socket sock;

	public static void a(int i, int j, int k) {
		o++;
		int i1 = dca.R.a((byte) 99, GameText.chooseOptionText.getString((byte) 71, cba.languageID));
		for (bfa bfa = (bfa) oba.I.a(k + 11488); bfa != null; bfa = (bfa) oba.I.b((byte) 88)) {
			int j1 = hv.a(k + 36709, bfa);
			if (j1 > i1) {
				i1 = j1;
			}
		}
		i1 += 8;
		if (k != -11387) {
			cvs = null;
		}
		int j1 = 16 * mu.j + 21;
		int x = i - i1 / 2;
		if (i1 + x > ff.width) {
			x = ff.width - i1;
		}
		if (x < 0) {
			x = 0;
		}
		int y = j;
		if (eh.height < y + j1) {
			y = eh.height - j1;
		}
		mr.a = x;
		if (y < 0) {
			y = 0;
		}
		aw.l = i1;
		lfa.r = (!lq.hb ? 22 : mu.j * 16) + 26;
		gea.n = true;
		hn.b = y;
	}

	public final int read(int i) throws IOException {
		d++;
		if (i != 12410) {
			outputStream = null;
		}
		if (g) {
			return 0;
		}
		return inputStream.read();
	}

	public final void run() {
		try {
			for (;;) {
				int offset;
				int length;
				synchronized (this) {
					if (q == off) {
						if (g) {
							break;
						}
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					offset = off;
					if (q >= off) {
						length = q - off;
					} else {
						length = 5000 - off;
					}
				}
				if (length > 0) {
					try {
						outputStream.write(buf, offset, length);
					} catch (IOException ioexception) {
						s = true;
					}
					off = (off + length) % 5000;
					try {
						if (q == off) {
							outputStream.flush();
						}
					} catch (IOException ioexception) {
						s = true;
					}
				}
			}
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
				if (sock != null) {
					sock.close();
				}
			} catch (IOException ioexception) {
				/* empty */
			}
			buf = null;
		} catch (Exception exception) {
			cea.a(null, -2, exception);
		}
		c++;
	}

	public final void b(int i) {
		k++;
		if (!g) {
			inputStream = new uu();
			if (i != 35) {
				tw = null;
			}
			outputStream = new na();
		}
	}

	public static final void a(int i, long l) {
		u++;
		if (l > 0L) {
			if (l % 10L != 0L) {
				he.a(l, (byte) -90);
			} else {
				he.a(l - 1L, (byte) -103);
				he.a(1L, (byte) -122);
			}
			if (i != -28448) {
				nullLoader(49);
			}
		}
	}

	protected final void finalize() {
		a((byte) 61);
		finalizeCount++;
	}

	public final void a(int offset, byte[] buf, int length, int i) throws IOException {
		v++;
		if (!g) {
			int j;
			for (/**/; length > 0; length -= j) {
				j = inputStream.read(buf, offset, length);
				if (j <= 0) {
					throw new EOFException();
				}
				offset += j;
			}
			if (i != 14216) {
				sock = null;
			}
		}
	}

	public static void nullLoader(int i) {
		wea = null;
		if (i != 0) {
			a(-8, -40, 90);
		}
		vfa_ = null;
		dt = null;
		tw = null;
		cvs = null;
	}

	public final void a(int i, int j, byte b, byte[] buffer) throws IOException {
		h++;
		if (!g) {
			if (s) {
				s = false;
				throw new IOException();
			}
			if (buf == null) {
				buf = new byte[5000];
			}
			synchronized (this) {
                System.out.println("[Connection] " + i + ", " + j);
				for (int k = 0; k < i; k++) {
					buf[q] = buffer[j + k];
					q = (q + 1) % 5000;
					if (q == (off + 4900) % 5000) {
						throw new IOException();
					}
				}
				if (b > -36) {
					finalize();
				}
				if (vfa == null) {
					vfa = this.signLink.a(3, this, 0);
				}
				this.notifyAll();
			}
		}
	}

	public final void a(byte b) {
		y++;
		if (!g) {
			synchronized (this) {
				g = true;
				if (b != 61) {
					return;
				}
				this.notifyAll();
			}
			if (vfa != null) {
				while (vfa.f == 0) {
					a(-28448, 1L);
				}
				if (vfa.f == 1) {
					try {
						((Thread) vfa.hostName).join();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			vfa = null;
		}
	}

	public final void b(byte b) throws IOException {
		if (b != 17) {
			buf = null;
		}
		m++;
		if (!g) {
			if (s) {
				s = false;
				throw new IOException();
			}
		}
	}

	public final int availableSkips(int i) throws IOException {
		l++;
		if (g) {
			return 0;
		}
		if (i != -22874) {
			return 112;
		}
		return inputStream.available();
	}

	public Connection(Socket socket, Signlink sign) throws IOException {
		q = 0;
		signLink = sign;
		sock = socket;
		sock.setSoTimeout(30000);
		sock.setTcpNoDelay(true);
		inputStream = sock.getInputStream();
		outputStream = sock.getOutputStream();
	}
}
