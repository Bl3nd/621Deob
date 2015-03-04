/* cu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings("ALL")
public final class FileOnDisk {
	
	private File file;
    public static int getFiles;
    public static int writes;
    public static int d;
    public static int reads;
    public static int getLengths;
	private RandomAccessFile raf;
    public static int h;
	private long pos;
    public static int seeks;
    public static int k;
    public static int closes;
    public static int finalizes;
	private long length;

	public final void close() throws IOException {
		if (raf != null) {
			raf.close();
			raf = null;
		}
		closes++;
	}

	public final long getLength() throws IOException {
		getLengths++;
		return raf.length();
	}

	public final void write(int offset, int lengthToWrite, byte[] data) throws IOException {
		writes++;
		if (length < (long) lengthToWrite + this.pos) {
			raf.seek(length);
			raf.write(1);
			throw new EOFException();
		}
		raf.write(data, offset, lengthToWrite);
		this.pos += (long) lengthToWrite;
	}

	public final File getFile() {
		getFiles++;
		return file;
	}

	@Override
    protected final void finalize() throws Throwable {
		finalizes++;
		if (raf != null) {
			System.out.println("Warning! fileondisk " + file + " not closed correctly using close(). Auto-closing instead. ");
			close();
		}
	}

	public final int read(int offset, byte[] buf, int length) throws IOException {
		reads++;
		int data = raf.read(buf, offset, length);
		if (data > 0) {
			this.pos += (long) data;
		}
		return data;
	}

	public static void c() {
		for (int index = 0; index < 5; index++) {
			Class_ug.W[index] = false;
		}
		d++;
		ja.Cc = dj.o = -1;
		pi.n = -1;
		li.z = 0;
		mg.t = -1;
		ll.x = 1;
		hp.z = 0;
	}

	public final void seek(long pos) throws IOException {
		seeks++;
		raf.seek(pos);
		this.pos = pos;
	}

	public static int a(int i, int j) {
		h++;
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
		int whatToWrite = raf.read();
		if ((~whatToWrite) != 0 && !string.equals("r")) {
			raf.seek(0L);
			raf.write(whatToWrite);
		}
		raf.seek(0L);
	}
}
