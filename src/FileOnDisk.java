/* cu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk {
	
	private File file;
	static int getFiles;
	static int writes;
	static int d;
	static int reads;
	static int getLengths;
	private RandomAccessFile raf;
	static int h;
	private long pos;
	static int seeks;
	static int k;
	static int closes;
	static int finalizes;
	private long length;

	public final void close(byte b) throws IOException {
		if (b < -126) {
			if (raf != null) {
				raf.close();
				raf = null;
			}
			closes++;
		}
	}

	public final long getLength(int i) throws IOException {
		if (i != 0) {
			file = null;
		}
		getLengths++;
		return raf.length();
	}

	public final void write(int offset, byte dummy, int lengthToWrite, byte[] data) throws IOException {
		writes++;
		if (length < (long) lengthToWrite + this.pos) {
			raf.seek(length);
			raf.write(1);
			throw new EOFException();
		}
		raf.write(data, offset, lengthToWrite);
		this.pos += (long) lengthToWrite;
	}

	public final File getFile(byte b) {
		getFiles++;
		if (b >= -112) {
			return null;
		}
		return file;
	}

	@Override
    protected final void finalize() throws Throwable {
		finalizes++;
		if (raf != null) {
			System.out.println("Warning! fileondisk " + file + " not closed correctly using close(). Auto-closing instead. ");
			close((byte) -128);
		}
	}

	public final int read(int offset, byte[] buf, int length, int i) throws IOException {
		reads++;
		int data = raf.read(buf, offset, length);
		if (i != 3) {
			raf = null;
		}
		if (data > 0) {
			this.pos += (long) data;
		}
		return data;
	}

	public static void c(byte b) {
		for (int index = 0; index < 5; index++) {
			Class_ug.W[index] = false;
		}
		d++;
		ja.Cc = dj.o = -1;
		pi.n = -1;
		li.z = 0;
		mg.t = -1;
		ll.x = 1;
		if (b != -110) {
			a(-94, -127, (byte) -72);
		}
		hp.z = 0;
	}

	public final void seek(long pos, int i) throws IOException {
		seeks++;
		raf.seek(pos);
		this.pos = pos;
		if (i != -1) {
			a(-31, -89, (byte) 71);
		}
	}

	public static int a(int i, int j, byte b) {
		h++;
		if (b > -126) {
			k = -72;
		}
		if (j == 1 || j == 3) {
			return wk.j[0x3 & i];
		}
		return im.r[i & 0x3];
	}

	public FileOnDisk(File file, String string, long len) throws IOException {
		if (len == -1L) {
			len = 9223372036854775807L;
		}
		if (file.length() > len) {
			file.delete();
		}
		raf = new RandomAccessFile(file, string);
		this.pos = 0L;
		length = len;
		this.file = file;
		int i = raf.read();
		if ((~i) != 0 && !string.equals("r")) {
			raf.seek(0L);
			raf.write(i);
		}
		raf.seek(0L);
	}
}
