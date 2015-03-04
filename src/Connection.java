/* rfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

@SuppressWarnings("ALL")
public final class Connection implements Runnable {

	public static dt dt;
    public static int finalizeCount;
    public static int c;
    public static int readCount;
	private vfa vfa;
    public static vfa vfa_;
	private boolean g = false;
    public static int write;
	private Signlink signLink;
	private InputStream inputStream;
    public static int setStreamsToSubs;
    public static int availableSkips;
    public static int m;
	private int off = 0;
    public static int o;
    public static wea wea = new wea(0, 1);
	private int offset;
    public static cv[] cvs = new cv[35];
	private boolean cannotWriteOrFlush = false;
    public static tw tw;
    public static int u;
    public static int read;
	private OutputStream outputStream;
	private byte[] buf;
    public static int killThread;
	private Socket sock;

	public static void a(int xPos, int yPos, int dummy) {
		o++;
		int option = dca.R.a((byte) 99, GameText.chooseOptionText.getString(cba.languageID));
		for (bfa bfa = (bfa) oba.I.a(dummy + 11488); bfa != null; bfa = (bfa) oba.I.b((byte) 88)) {
			int option_ = hv.a(dummy + 36709, bfa);
			if (option_ > option) {
				option = option_;
			}
		}
		option += 8;
		int j1 = 16 * mu.j + 21;
		int x = xPos - option / 2;
		if (option + x > ff.width) {
			x = ff.width - option;
		}
		if (x < 0) {
			x = 0;
		}
		int y = yPos;
		if (eh.height < y + j1) {
			y = eh.height - j1;
		}
		mr.x_ = x;
		if (y < 0) {
			y = 0;
		}
		aw.option = option;
		lfa.r = (!lq.hb ? 22 : mu.j * 16) + 26;
		gea.n = true;
		hn.y_ = y;
	}

	public final int read() throws IOException {
        System.out.println("[Connection] Reading!");
		readCount++;
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
					if (this.offset == off) {
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
					if (this.offset >= off) {
						length = this.offset - off;
					} else {
						length = 5000 - off;
					}
				}
				if (length > 0) {
					try {
						outputStream.write(buf, offset, length);
					} catch (IOException ioexception) {
						cannotWriteOrFlush = true;
					}
					off = (off + length) % 5000;
					try {
						if (this.offset == off) {
							outputStream.flush();
						}
					} catch (IOException ioexception) {
						cannotWriteOrFlush = true;
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

	public final void setStreamsToSubs() {
		setStreamsToSubs++;
		if (!g) {
			inputStream = new InputStreamSub();
			outputStream = new OutputStreamSub();
		}
	}

	public static void a(int i, long l) {
		u++;
		if (l > 0L) {
			if (l % 10L != 0L) {
				he.a(l, (byte) -90);
			} else {
				he.a(l - 1L, (byte) -103);
				he.a(1L, (byte) -122);
			}
		}
	}

	@Override
    protected final void finalize() {
		killThread((byte) 61);
		finalizeCount++;
	}

	public final void read(int offset, byte[] buf, int length) throws IOException {
        System.out.println("[Connection] " + offset + ", " + Arrays.toString(buf) + ", " + length);
		read++;
		if (!g) {
			int read;
			for (/**/; length > 0; length -= read) {
				read = inputStream.read(buf, offset, length);
				if (read <= 0) {
					throw new EOFException();
				}
				offset += read;
			}/*
			if (i != 14216) {
				sock = null;
			}*/
		}
	}

	public static void nullLoader() {
		wea = null;
		vfa_ = null;
		dt = null;
		tw = null;
		cvs = null;
	}

	public final void write(int i, int j, byte[] buffer) throws IOException {
		write++;
		if (!g) {
			if (cannotWriteOrFlush) {
				cannotWriteOrFlush = false;
				throw new IOException();
			}
			if (buf == null) {
				buf = new byte[5000];
			}
			synchronized (this) {
                System.out.println("[Connection] " + i + ", " + j);
				for (int k = 0; k < i; k++) {
					buf[offset] = buffer[j + k];
					offset = (offset + 1) % 5000;
					if (offset == (off + 4900) % 5000) {
						throw new IOException();
					}
				}
				if (vfa == null) {
					vfa = this.signLink.a(3, this, 0);
				}
				this.notifyAll();
			}
		}
	}

	public final void killThread(byte b) {
		killThread++;
		if (!g) {
			synchronized (this) {
				g = true;
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

	public final void b() throws IOException {
		m++;
		if (!g) {
			if (cannotWriteOrFlush) {
				cannotWriteOrFlush = false;
				throw new IOException();
			}
		}
	}

	public final int availableSkips() throws IOException {
		availableSkips++;
		if (g) {
			return 0;
		}
		return inputStream.available();
	}

	public Connection(Socket socket, Signlink sign) throws IOException {
		offset = 0;
		signLink = sign;
		sock = socket;
		sock.setSoTimeout(30000);
		sock.setTcpNoDelay(true);
		inputStream = sock.getInputStream();
		outputStream = sock.getOutputStream();
	}
}
