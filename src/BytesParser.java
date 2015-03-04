/* es - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class BytesParser extends Node {
	
	static int readShortReverseds;
	static int writeShortReverseds;
	static int readUnsignedNegativeBytes;
	static int readLongs;
	static int readBytes;
	static int writeAmountOfBytess;
	static int readTribyteReverseds;
	static int applyRSAEncryptions;
	static int readUnsignedByteMinus128s;
	static int writeTribytes;
	static int u = 0;
	static int v;
	static int readSmarts;
	static int writeShortSecondBytePlusArg1s;
	static int writeBytes;
	static int writeLengthInts;
	static int readIntShiftsInOrder_16_24_0_8s;
	static int decryptXTEAs;
	static int writeLengthBytes;
	static int D;
	static int writeIntShiftsInOrder_16_24_0_8s;
	static int readTribyte2s;
	static int readStrings;
	static int readByteMinus128s;
	static int readBytes2s;
	static int readString3s;
	static int writeIntReverseds;
	static int readBytess;
	static int M;
	byte[] bytes;
	static int writeBytess;
	static int readShortReversedFirstByteMinus128s;
	static int readBytePlus128s;
	static int writeNegativeBytes;
	static int S;
	static int readShorts;
	static int readIntReversed2s;
	int pos;
	static int readNegativeBytes;
	static int writeStrings;
	static int readShortSecondByteMinus128s;
	static int Z;
	static int thisPlayersRegionY;
	static int readSmart2s;
	static int writeIntShiftsInOrder_8_0_24_16s;
	static int writeBytePlus128s;
	static int eb;
	static int writeShortReversedPlus128s;
	static int writeInts;
	static int writeIntReversed2s;
	static int readIntShiftsInOrder_8_0_24_16s;
	static int readTribytes;
	static int readIntReverseds;
	static int lb;
	static int writeString2s;
	static int writeNegativeBytePlus128;
	static int ob;
	static int readUTF8s;
	static int writeShortReversed2s;
	static int readString2s;
	static int readInts;
	static int writeLengthShorts;
	static int readShortReversedFirstByteMinus128_2s;
	static int readUnsignedNegativeBytePlus128s;
	static int[] maxLevels = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
			99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	static int writeLongs;
	static int yb;
	static int readShort2s;
	static int writeShorts;
	static int readUnsignedBytes;
	static int Cb;

	final int a(int i, int i_0_) {
		ob++;
		int i_1_ = oea.a(255, i_0_, ((BytesParser) this).bytes,
				((BytesParser) this).pos);
		writeInt(i_1_, (int) -98);
		// int i_2_ = 68 % ((61 - previous) / 42);
		return i_1_;
	}

	final void b(int i, int i_3_) {
		M++;
        System.out.println("[BytesParser] nullLoader: " + i_3_);
		if (i_3_ >= 0 && i_3_ < 128)
			writeByte(i_3_, (byte) -120);
		else if (i_3_ >= 0 && i_3_ < 32768)
			writeShort(32768 + i_3_, 13469);
		else {
			if (i != -139194328)
				readString((byte) -77);
			throw new IllegalArgumentException();
		}
	}

	final int readIntShiftsInOrder_8_0_24_16(int i) {
		((BytesParser) this).pos += 4;
		if (i != 4087)
			return 16;
		readIntShiftsInOrder_8_0_24_16s++;
		return ((((BytesParser) this).bytes[((BytesParser) this).pos - 3] & 0xff)
				+ (((BytesParser) this).bytes[((BytesParser) this).pos - 2] << 24 & ~0xffffff)
				+ (((BytesParser) this).bytes[((BytesParser) this).pos - 1] << 16 & 0xff0000) + ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 4]) << 8));
	}

	final void writeInt(int value, int dummy) {
		writeInts++;
		if (dummy >= -93)
			readString3((int) -69);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 24);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 16);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
	}

	final int readSmart(int dummy) {
		readSmarts++;
		int firstByte = ((BytesParser) this).bytes[((BytesParser) this).pos] & 0xff;
		if (dummy != -9561)
			thisPlayersRegionY = 70;
		if (firstByte < 128)
			return readUnsignedByte(dummy ^ 0x16b) - 64;
		return readShort(13111) - 49152;
	}

	final void writeShortReversed(int i, int dummy) {
		if (i > 94) {
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) dummy;
			writeShortReverseds++;
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (dummy >> 8);
		}
	}

	final int readShortSecondByteMinus128(byte i) {
		if (i != -80)
			maxLevels = null;
		readShortSecondByteMinus128s++;
		((BytesParser) this).pos += 2;
		return ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 1] - 128) + ((((BytesParser) this).bytes[((BytesParser) this).pos - 2] & 0xff) << 8));
	}

	final void e(int i, int i_7_) {
		if (i > -60)
			readSmart((int) -59);
		eb++;
		if ((i_7_ & ~0x7f) != 0) {
			if ((i_7_ & ~0x3fff) != 0) {
				if ((i_7_ & ~0x1fffff) != 0) {
					if ((i_7_ & ~0xfffffff) != 0)
						writeByte(0x80 | i_7_ >>> 28, (byte) -121);
                        System.out.println("[BytesParser] e: " + i_7_);
					writeByte((0x100a2a03 | i_7_) >>> 21, (byte) -111);
                    System.out.println("[BytesParser] e: " + i_7_);
				}
				writeByte((0x2021fc | i_7_) >>> 14, (byte) -123);
                System.out.println("[BytesParser] e: " + i_7_);
			}
			writeByte(0x80 | i_7_ >>> 7, (byte) -112);
            System.out.println("[BytesParser] e: " + i_7_);
		}
		writeByte(0x7f & i_7_, (byte) -115);
        System.out.println("[BytesParser] e: " + i_7_);
	}

	final int b(byte i) {
		D++;
		int i_8_ = oea.a(255, 0, ((BytesParser) this).bytes,
				((BytesParser) this).pos);
		writeInt(i_8_, (int) -103);
		// int i_9_ = -121 / ((-4 - previous) / 61);
		return i_8_;
	}

	final int readShort(int i) {
		((BytesParser) this).pos += 2;
		if (i != 13111)
			writeBytePlus128((byte) -115, (int) -41);
		readShorts++;
		return ((((BytesParser) this).bytes[((BytesParser) this).pos - 1] & 0xff) + (((BytesParser) this).bytes[((BytesParser) this).pos - 2] << 8 & 0xff00));
	}

	final void readBytes2(byte[] is, int i_9_, int length, int i_11_) {
		readBytes2s++;
		for (int i_12_ = length + i_11_ + i_9_; i_11_ <= i_12_; i_12_--)
			is[i_12_] = ((BytesParser) this).bytes[((BytesParser) this).pos++];
	}

	final void writeIntReversed(int dummy, int value) {
		writeIntReverseds++;
		if (dummy != 13412)
			((BytesParser) this).bytes = null;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 16);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 24);
	}

	final String readString3(int dummy) {
		readString3s++;
		if (dummy != 9283)
			readTribyte2((byte) 107);
		if (((BytesParser) this).bytes[((BytesParser) this).pos] == 0) {
			((BytesParser) this).pos++;
			return null;
		}
		return readString((byte) 121);
	}

	// READINTREVERSED
	final int readIntReversed2(int dummy) {
		((BytesParser) this).pos += 4;
		readIntReversed2s++;
		// int i_14_ = 13 % ((-55 - dummy) / 51);
		return (((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 3]) << 8) + (((((BytesParser) this).bytes[((BytesParser) this).pos - 2] & 0xff) << 16) + ((~0xffffff & ((BytesParser) this).bytes[((BytesParser) this).pos - 1] << 24) + (0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 4]))));
	}

	final void writeBytes(int dummy, int length, int offset, byte[] is) {
		writeBytess++;
		if (dummy == 65536) {
			for (int arrayIndex = offset; arrayIndex < length + offset; arrayIndex++)
				((BytesParser) this).bytes[((BytesParser) this).pos++] = is[arrayIndex];
		}
	}

	final void writeString2(String string, int i) {
		writeString2s++;
		// int i_18_ = -18 % ((-69 - previous) / 46);
		int i_19_ = dp.a(15895, string);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) 0;
		e(-127, i_19_);
		((BytesParser) this).pos += hi.a(string, ((BytesParser) this).bytes,
				((BytesParser) this).pos, true);
	}

	final void applyRSAEncryption(BigInteger key, int dummy, BigInteger modulus) {
		applyRSAEncryptions++;
		int i_21_ = ((BytesParser) this).pos;
		((BytesParser) this).pos = 0;
		byte[] is = new byte[i_21_];
		readBytes(is, true, i_21_, 0);
		BigInteger biginteger_22_ = new BigInteger(is);
		// int i_23_ = -26 / ((dummy - 16) / 62);
		BigInteger biginteger_24_ = biginteger_22_.modPow(key, modulus);
		byte[] is_25_ = biginteger_24_.toByteArray();
		((BytesParser) this).pos = 0;
		writeShort(is_25_.length, 13469);
		writeBytes(65536, is_25_.length, 0, is_25_);
	}

	final void writeAmountOfBytes(int amount, int dummy, long data) {
		writeAmountOfBytess++;
		amount--;
		// int i_27_ = 76 % ((dummy - 46) / 38);
		if (amount < 0 || amount > 7)
			throw new IllegalArgumentException();
		for (int shiftAmount = 8 * amount; shiftAmount >= 0; shiftAmount -= 8)
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (data >> shiftAmount);
	}

	final int readTribyteReversed(boolean dummy) {
		readTribyteReverseds++;
		if (dummy != false)
			maxLevels = null;
		((BytesParser) this).pos += 3;
		return ((((BytesParser) this).bytes[((BytesParser) this).pos - 3] & 0xff)
				+ (((BytesParser) this).bytes[((BytesParser) this).pos - 1] << 16 & 0xff0000) + (((BytesParser) this).bytes[((BytesParser) this).pos - 2] << 8 & 0xff00));
	}

	final byte readByte(int dummy) {
		readBytes++;
		if (dummy != -20933)
			return (byte) -119;
		return ((BytesParser) this).bytes[((BytesParser) this).pos++];
	}

	final void writeLengthShort(int value, boolean dummy) {
		((BytesParser) this).bytes[((BytesParser) this).pos - value - 2] = (byte) (value >> 8);
		writeLengthShorts++;
		if (dummy != false)
			writeBytes(-59, 98, -95, null);
		((BytesParser) this).bytes[((BytesParser) this).pos - value - 1] = (byte) value;
	}

	final int readShortReversedFirstByteMinus128_2(boolean dummy) {
		((BytesParser) this).pos += 2;
		readShortReversedFirstByteMinus128_2s++;
		if (dummy != true)
			return -107;
		return ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 2] - 128) + (((BytesParser) this).bytes[((BytesParser) this).pos - 1] << 8 & 0xff00));
	}

	final int readInt(int dummy) {
		((BytesParser) this).pos += 4;
		readInts++;
		if (dummy < 56)
			writeIntReversed(113, (int) 12);
		return ((((BytesParser) this).bytes[((BytesParser) this).pos - 2] << 8 & 0xff00)
				+ ((((BytesParser) this).bytes[((BytesParser) this).pos - 4] & 0xff) << 24)
				+ ((((BytesParser) this).bytes[((BytesParser) this).pos - 3] & 0xff) << 16) + (0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 1]));
	}

	final void writeShortReversed2(int value, byte dummy) {
		if (dummy != 0)
			((BytesParser) this).pos = 58;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
		writeShortReversed2s++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
	}

	final byte readByteMinus128(byte dummy) {
		if (dummy != -51)
			writeLengthInt(-55, -93);
		readByteMinus128s++;
		return (byte) (((BytesParser) this).bytes[((BytesParser) this).pos++] - 128);
	}

	final int readIntShiftsInOrder_16_24_0_8(int dummy) {
		((BytesParser) this).pos += 4;
		if (dummy > -66)
			return 88;
		readIntShiftsInOrder_16_24_0_8s++;
		return ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 2])
				+ (((((BytesParser) this).bytes[((BytesParser) this).pos - 1] & 0xff) << 8) + (((BytesParser) this).bytes[((BytesParser) this).pos - 4] << 16 & 0xff0000)) + ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 3]) << 24));
	}

	final void writeLengthByte(int value, int dummy) {
		((BytesParser) this).bytes[((BytesParser) this).pos - value - 1] = (byte) value;
		writeLengthBytes++;
		if (dummy != 2105852)
			((BytesParser) this).pos = -71;
	}

	final void d(byte i) {
		Z++;
		if (i > -114)
			b((int) 46, (int) 76);
		if (((BytesParser) this).bytes != null)
			fk.a(((BytesParser) this).bytes, -13476);
		((BytesParser) this).bytes = null;
	}

	final void writeString(String value, int dummy) {
		if (dummy < -16) {
			writeStrings++;
			int i_31_ = value.indexOf('\0');
			if (i_31_ >= 0)
				throw new IllegalArgumentException("NUL character at " + i_31_
						+ " - cannot pjstr");
			((BytesParser) this).pos += lu.a(0, value.length(),
					((BytesParser) this).bytes, (byte) -58,
					((BytesParser) this).pos, value);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) 0;
		}
	}

	final int readIntReversed(int dummy) {
		((BytesParser) this).pos += 4;
		readIntReverseds++;
		if (dummy > -45)
			((BytesParser) this).pos = -8;
		return ((((BytesParser) this).bytes[((BytesParser) this).pos - 4] & 0xff)
				+ (((BytesParser) this).bytes[((BytesParser) this).pos - 2] << 16 & 0xff0000) + ((((BytesParser) this).bytes[((BytesParser) this).pos - 1] << 24 & ~0xffffff) + (((BytesParser) this).bytes[((BytesParser) this).pos - 3] << 8 & 0xff00)));
	}

	final int c(boolean bool) {
		S++;
		int i = ((BytesParser) this).bytes[((BytesParser) this).pos++];
		if (bool != false)
			b((byte) 53);
		int i_32_ = 0;
		for (/**/; i < 0; i = ((BytesParser) this).bytes[((BytesParser) this).pos++])
			i_32_ = (i_32_ | 0x7f & i) << 7;
		return i | i_32_;
	}

	final void writeIntShiftsInOrder_8_0_24_16(int value, int dummy) {
		if (dummy <= 121)
			readString2(-49);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		writeIntShiftsInOrder_8_0_24_16s++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 24);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 16);
	}

	final int readShortReversedFirstByteMinus128(int dummy) {
		readShortReversedFirstByteMinus128s++;
		if (dummy != -49)
			u = 41;
		((BytesParser) this).pos += 2;
		int i_34_ = ((((BytesParser) this).bytes[((BytesParser) this).pos - 2] - 128 & 0xff) + (0xff00 & ((BytesParser) this).bytes[((BytesParser) this).pos - 1] << 8));
		if (i_34_ > 32767)
			i_34_ -= 65536;
		return i_34_;
	}

	final void writeLong(long l, int i) {
		if (i == -16719) {
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 56);
			writeLongs++;
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 48);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 40);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 32);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 24);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 16);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) (l >> 8);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (int) l;
		}
	}

	final byte readNegativeByte(boolean dummy) {
		if (dummy != false)
			return (byte) 90;
		readNegativeBytes++;
		return (byte) -((BytesParser) this).bytes[((BytesParser) this).pos++];
	}

	final void decryptXTEA(int amount, int[] decryptionKey, int dummy,
			int offset) {
		decryptXTEAs++;
		int oldPos = ((BytesParser) this).pos;
		((BytesParser) this).pos = offset;
		int maxLoops = (amount - offset) / 8;
		int loopIndex = 0;
		if (dummy != -957401312)
			writeLong(-114L, -119);
		for (/**/; loopIndex < maxLoops; loopIndex++) {
			int key1 = readInt(111);
			int key2 = readInt(dummy ^ ~0x3910c883);
			int sum = -957401312;
			int delta = -1640531527;
			int numRounds = 32;
			while (numRounds-- > 0) {
				key2 -= (decryptionKey[sum >>> 11 & ~0x6f3ffffc] + sum ^ key1
						+ (key1 >>> 5 ^ key1 << 4));
				sum -= delta;
				key1 -= decryptionKey[sum & 0x3] + sum ^ key2
						+ (key2 << 4 ^ key2 >>> 5);
			}
			((BytesParser) this).pos -= 8;
			writeInt(key1, (int) -103);
			writeInt(key2, (int) -114);
		}
		((BytesParser) this).pos = oldPos;
	}

	final String readString2(int i) {
		readString2s++;
		byte prefixZero = ((BytesParser) this).bytes[((BytesParser) this).pos++];
		if (prefixZero != 0)
			throw new IllegalStateException("Bad version number in gjstr2");
		int startPos = ((BytesParser) this).pos;
		while (((BytesParser) this).bytes[((BytesParser) this).pos++] != 0) {
			/* empty */
		}
		int stringLength = ((BytesParser) this).pos - 1 - startPos;
		if (i == (stringLength ^ 0xffffffff))
			return "";
		return cea.bytesToString(i + 26145, stringLength,
				((BytesParser) this).bytes, startPos);
	}

	final int readUnsignedNegativeBytePlus128(int i) {
		if (i != 255)
			return 104;
		readUnsignedNegativeBytePlus128s++;
		return -((BytesParser) this).bytes[((BytesParser) this).pos++] + 128 & 0xff;
	}

	final int readUnsignedByteMinus128(int i) {
		readUnsignedByteMinus128s++;
		if (i > -87)
			writeInt((int) 98, (int) -10);
		return ((BytesParser) this).bytes[((BytesParser) this).pos++] - 128 & 0xff;
	}

	final String readString(byte i) {
		readStrings++;
		int startPos = ((BytesParser) this).pos;
		if (i <= 114)
			return null;
		while (((BytesParser) this).bytes[((BytesParser) this).pos++] != 0) {
			/* empty */
		}
		int stringLength = ((BytesParser) this).pos - startPos - 1;
		if (stringLength == 0)
			return "";
		return cea.bytesToString(26144, stringLength,
				((BytesParser) this).bytes, startPos);
	}

	final int readUnsignedByte(int i) {
		readUnsignedBytes++;
		if (i != -9268)
			return -14;
		return ((BytesParser) this).bytes[((BytesParser) this).pos++] & 0xff;
	}

	final void writeIntShiftsInOrder_16_24_0_8(int value, int dummy) {
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 16);
		writeIntShiftsInOrder_16_24_0_8s++;
		if (dummy <= -88) {
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 24);
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		}
	}

	public static void resetMaxLevels(byte dummy) {
		if (dummy == -114)
			maxLevels = null;
	}

	final int readSmart2(int dummy) {
		if (dummy != -13829)
			((BytesParser) this).bytes = null;
		readSmart2s++;
		int i_51_ = 0xff & ((BytesParser) this).bytes[((BytesParser) this).pos];
		if (i_51_ < 128)
			return readUnsignedByte(dummy ^ 0x1237);
		return readShort(13111) - 32768;
	}

	final void writeShortReversedPlus128(int dummy, int value) {
		writeShortReversedPlus128s++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value + 128);
		// int i_53_ = -83 / ((-68 - dummy) / 38);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
	}

	final void writeShortSecondBytePlusArg1(int i, int value) {
		writeShortSecondBytePlusArg1s++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value + i);
	}

	final String readUTF8(byte dummy) {
		if (dummy <= 108)
			((BytesParser) this).bytes = null;
		readUTF8s++;
		byte i_55_ = ((BytesParser) this).bytes[((BytesParser) this).pos++];
		if (i_55_ != 0)
			throw new IllegalStateException("Bad version number in gUTF8");
		int i_56_ = c(false);
		if (((BytesParser) this).bytes.length < ((BytesParser) this).pos
				+ i_56_)
			throw new IllegalStateException(
					"Length of string is longer than available data");
		String string = ci.a(((BytesParser) this).bytes,
				((BytesParser) this).pos, -241, i_56_);
		((BytesParser) this).pos += i_56_;
		return string;
	}

	BytesParser(int size) {
		((BytesParser) this).bytes = fk.a((byte) 90, size);
		((BytesParser) this).pos = 0;
        System.out.println("Size: " + size);
	}

	BytesParser(byte[] is) {
		((BytesParser) this).pos = 0;
		((BytesParser) this).bytes = is;
	}

	static final void b(int i, byte i_57_) {
		if (i_57_ != 51)
			u = -59;
		lb++;
		kr.f = i;
		bl.v.a(18385);
	}

	final void writeByte(int value, byte dummy) {
        System.out.println("[BytesParser] WriteByte: " + value);
		writeBytes++;
		if (dummy < -107)
			((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
	}

	final int readShort2(int dummy) {
		((BytesParser) this).pos += 2;
		readShort2s++;
		int i_59_ = ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 1]) + (((BytesParser) this).bytes[((BytesParser) this).pos - 2] << 8 & 0xff00));
		if (dummy <= 15)
			((BytesParser) this).bytes = null;
		if (i_59_ > 32767)
			i_59_ -= 65536;
		return i_59_;
	}

	final long a(byte i, int i_60_) {
		i_60_--;
		// int i_61_ = -30 / ((50 - previous) / 47);
		Cb++;
		if (i_60_ < 0 || i_60_ > 7)
			throw new IllegalArgumentException();
		int i_62_ = i_60_ * 8;
		long l = 0L;
		for (/**/; i_62_ >= 0; i_62_ -= 8)
			l |= (0xffL & (long) ((BytesParser) this).bytes[((BytesParser) this).pos++]) << i_62_;
		return l;
	}

	final void writeNegativeBytePlus128(int value, byte dummy) {
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (-value + 128);
		writeNegativeBytePlus128++;
		if (dummy != 7)
			d((byte) 55);
	}

	final void writeLengthInt(int value, int dummy) {
		writeLengthInts++;
		if (dummy >= -4)
			((BytesParser) this).bytes = null;
		((BytesParser) this).bytes[-value - 4 + ((BytesParser) this).pos] = (byte) (value >> 24);
		((BytesParser) this).bytes[((BytesParser) this).pos - value - 3] = (byte) (value >> 16);
		((BytesParser) this).bytes[((BytesParser) this).pos - value - 2] = (byte) (value >> 8);
		((BytesParser) this).bytes[((BytesParser) this).pos - value - 1] = (byte) value;
	}

	final int readUnsignedNegativeByte(byte dummy) {
		readUnsignedNegativeBytes++;
		if (dummy != -18)
			b((byte) 58);
		return 0xff & -((BytesParser) this).bytes[((BytesParser) this).pos++];
	}

	final void writeTribyte(int value, byte dummy) {
		if (dummy != -22)
			maxLevels = null;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 16);
		writeTribytes++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
	}

	final int i(byte i) {
		v++;
		int i_66_ = 0;
		if (i != -16)
			((BytesParser) this).pos = 126;
		int i_67_;
		for (i_67_ = readSmart2(-13829); i_67_ == 32767; i_67_ = readSmart2(i - 13813))
			i_66_ += 32767;
		i_66_ += i_67_;
		return i_66_;
	}

	final int readTribyte(int dummy) {
		readTribytes++;
		if (dummy != -1)
			maxLevels = null;
		((BytesParser) this).pos += 3;
		return (((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 3]) << 16) + (((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 2]) << 8) + (0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 1])));
	}

	final void writeBytePlus128(byte dummy, int value) {
		writeBytePlus128s++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value + 128);
		if (dummy != -72)
			readUnsignedByte(28);
	}

	final int readShortReversed(byte dummy) {
		((BytesParser) this).pos += 2;
		readShortReverseds++;
		if (dummy <= 101)
			writeLong(62L, 44);
		return (((((BytesParser) this).bytes[((BytesParser) this).pos - 1] & 0xff) << 8) + (((BytesParser) this).bytes[((BytesParser) this).pos - 2] & 0xff));
	}

	final byte readBytePlus128(int dummy) {
		if (dummy != 16436)
			thisPlayersRegionY = -82;
		readBytePlus128s++;
		return (byte) (-((BytesParser) this).bytes[((BytesParser) this).pos++] + 128);
	}

	final boolean x(int i) {
		yb++;
		((BytesParser) this).pos -= 4;
		int i_69_ = oea.a(255, 0, ((BytesParser) this).bytes,
				((BytesParser) this).pos);
		int i_70_ = readInt(108);
		if (i_69_ == i_70_)
			return true;
		if (i != 9182)
			thisPlayersRegionY = -99;
		return false;
	}

	final void readBytes(byte[] is, boolean dummy, int length, int offset) {
		readBytess++;
		if (dummy == true) {
			for (int arrayIndex = offset; arrayIndex < offset + length; arrayIndex++)
				is[arrayIndex] = ((BytesParser) this).bytes[((BytesParser) this).pos++];
		}
	}

	final void writeIntReversed2(int value, byte dummy) {
		writeIntReversed2s++;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		if (dummy < 32)
			thisPlayersRegionY = -33;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 16);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 24);
	}

	final int readTribyte2(byte dummy) {
		if (dummy > -39)
			writeNegativeByte((byte) -100, (int) 122);
		readTribyte2s++;
		((BytesParser) this).pos += 3;
		int value = ((((BytesParser) this).bytes[((BytesParser) this).pos - 1] & 0xff)
				+ ((((BytesParser) this).bytes[((BytesParser) this).pos - 3] & 0xff) << 16) + ((0xff & ((BytesParser) this).bytes[((BytesParser) this).pos - 2]) << 8));
		if (value > 8388607)
			value -= 16777216;
		return value;
	}

	final void writeNegativeByte(byte dummy, int value) {
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) -value;
		if (dummy == 125)
			writeNegativeBytes++;
	}

	final void writeShort(int value, int dummy) {
		writeShorts++;
		if (dummy != 13469)
			maxLevels = null;
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) (value >> 8);
		((BytesParser) this).bytes[((BytesParser) this).pos++] = (byte) value;
	}

	final long readLong(boolean dummy) {
		readLongs++;
		long half1 = 0xffffffffL & (long) readInt(120);
		if (dummy != false)
			return 68L;
		long half2 = 0xffffffffL & (long) readInt(110);
		return (half1 << 32) + half2;
	}
}
