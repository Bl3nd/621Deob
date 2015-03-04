/* aga - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class aga {

    int a;
    int b;
    byte[] c;
    int d;
    int e;
    byte[] f;
    int g;
    int h;
    int[] i;

    public final void a() {
        byte[] buf = this.c;
        if (this.f == null) {
            for (int i = this.d - 1; i >= 0; i--) {
                int j = i * this.b;
                for (int k = (i + 1) * this.b; j < k; j++) {
                    k--;
                    byte b = buf[j];
                    buf[j] = buf[k];
                    buf[k] = b;
                }
            }
        } else {
            byte[] buf1 = this.f;
            for (int i = this.d - 1; i >= 0; i--) {
                int j = i * this.b;
                for (int k = (i + 1) * this.b; j < k; j++) {
                    k--;
                    byte b = buf[j];
                    buf[j] = buf[k];
                    buf[k] = b;
                    b = buf1[j];
                    buf1[j] = buf1[k];
                    buf1[k] = b;
                }
            }
        }
        int i = this.e;
        this.e = this.a;
        this.a = i;
    }

    public static aga a(pl pl, int id, int j) {
        byte[] buf = pl.b(j, 45, id);
        if (buf == null) {
            return null;
        }
        return a(buf)[0];
    }

    public static aga[] a(pl pl, int i) {
        byte[] buf = pl.a(95, i);
        if (buf == null) {
            return null;
        }
        return a(buf);
    }

    public final void b() {
        int i = c();
        int j = d();
        if (this.b != i || this.d != j) {
            byte[] buf = new byte[i * j];
            if (this.f != null) {
                byte[] buf1 = new byte[i * j];
                for (int k = 0; k < this.d; k++) {
                    int i1 = k * this.b;
                    int j1 = (k + this.g) * i + this.e;
                    for (int k1 = 0; k1 < this.b; k1++) {
                        buf[j1] = this.c[i1];
                        buf1[j1++] = this.f[i1++];
                    }
                }
                this.f = buf1;
            } else {
                for (int k = 0; k < this.d; k++) {
                    int i1 = k * this.b;
                    int j1 = (k + this.g) * i + this.e;
                    for (int k1 = 0; k1 < this.b; k1++) {
                        buf[j1++] = this.c[i1++];
                    }
                }
            }
            this.e = this.a = this.g = this.h = 0;
            this.b = i;
            this.d = j;
            this.c = buf;
        }
    }

    protected final int c() {
        return this.b + this.e + this.a;
    }

    private static aga[] a(byte[] buf) {
        BytesParser bytesParser = new BytesParser(buf);
        bytesParser.pos = buf.length - 2;
        int i = bytesParser.readShort(13111);
        aga[] agas = new aga[i];
        for (int index = 0; index < i; index++) {
            agas[index] = new aga();
        }
        bytesParser.pos = buf.length - 7 - i * 8;
        int j = bytesParser.readShort(13111);
        int k = bytesParser.readShort(13111);
        int i1 = (bytesParser.readUnsignedByte(-9268) & 0xff) + 1;
        for (int index = 0; index < i; index++) {
            agas[index].e = bytesParser.readShort(13111);
        }
        for (int index = 0; index < i; index++) {
            agas[index].g = bytesParser.readShort(13111);
        }
        for (int index = 0; index < i; index++) {
            agas[index].b = bytesParser.readShort(13111);
        }
        for (int index = 0; index < i; index++) {
            agas[index].d = bytesParser.readShort(13111);
        }
        for (int index = 0; index < i; index++) {
            aga aga = agas[index];
            aga.a = j - aga.b - aga.e;
            aga.h = k - aga.d - aga.g;
        }
        bytesParser.pos = buf.length - 7 - i * 8 - (i1 - 1) * 3;
        int[] ints = new int[i1];
        for (int index = 1; index < i1; index++) {
            ints[index] = bytesParser.readTribyte(-1);
            if (ints[index] == 0) {
                ints[index] = 1;
            }
        }
        for (int index = 0; index < i; index++) {
            agas[index].i = ints;
        }
        bytesParser.pos = 0;
        for (int j1 = 0; j1 < i; j1++) {
            aga aga = agas[j1];
            int k1 = aga.b * aga.d;
            aga.c = new byte[k1];
            int mask = bytesParser.readUnsignedByte(-9268);
            if ((mask & 0x2) == 0) {
                if ((mask & 0x1) == 0) {
                    for (int index = 0; index < k1; index++) {
                        aga.c[index] = bytesParser.readByte(-20933);
                    }
                } else {
                    for (int i2 = 0; i2 < aga.b; i2++) {
                        for (int j2 = 0; j2 < aga.d; j2++) {
                            aga.c[(i2 + j2 * aga.b)] = bytesParser.readByte(-20933);
                        }
                    }
                }
            } else {
                boolean bool = false;
                aga.f = new byte[k1];
                if ((mask & 0x1) == 0) {
                    for (int index = 0; index < k1; index++) {
                        aga.c[index] = bytesParser.readByte(-20933);
                    }
                    for (int index = 0; index < k1; index++) {
                        byte b = aga.f[index] = bytesParser.readByte(-20933);
                        bool = bool | b != -1;
                    }
                } else {
                    for (int i2 = 0; i2 < aga.b; i2++) {
                        for (int j2 = 0; j2 < aga.d; j2++) {
                            aga.c[(i2 + j2 * aga.b)] = bytesParser.readByte(-20933);
                        }
                    }
                    for (int i2 = 0; i2 < aga.b; i2++) {
                        for (int j2 = 0; j2 < aga.d; j2++) {
                            byte b = (aga.f[i2 + j2 * aga.b] = bytesParser.readByte(-20933));
                            bool = bool | b != -1;
                        }
                    }
                }
                if (!bool) {
                    aga.f = null;
                }
            }
        }
        return agas;
    }

    protected final int d() {
        return this.d + this.g + this.h;
    }

    public static aga b(pl pl, int i) {
        byte[] buf = pl.a(102, i);
        if (buf == null) {
            return null;
        }
        return a(buf)[0];
    }

    public static aga[] b(pl pl, int fontId, int j) {
        byte[] buf = pl.b(j, 66, fontId);
        if (buf == null) {
            return null;
        }
        return a(buf);
    }

    public final void a(int i) {
        int length = -1;
        if (this.i.length < 255) {
            for (int index = 0; index < this.i.length; index++) {
                if (this.i[index] == i) {
                    length = index;
                    break;
                }
            }
            if (length == -1) {
                length = this.i.length;
                int[] buf = new int[this.i.length + 1];
                co.a(this.i, 0, buf, 0, this.i.length);
                this.i = buf;
                buf[length] = i;
            }
        } else {
            int j = 2147483647;
            int k = i >> 16 & 0xff;
            int i1 = i >> 8 & 0xff;
            int j1 = i & 0xff;
            for (int k1 = 0; k1 < this.i.length; k1++) {
                int i2 = this.i[k1];
                int j2 = i2 >> 16 & 0xff;
                int k2 = i2 >> 8 & 0xff;
                int i3 = i2 & 0xff;
                int j3 = k - j2;
                if (j3 < 0) {
                    j3 = -j3;
                }
                int k3 = i1 - k2;
                if (k3 < 0) {
                    k3 = -k3;
                }
                int i4 = j1 - i3;
                if (i4 < 0) {
                    i4 = -i4;
                }
                int j4 = j3 + k3 + i4;
                if (j4 < j) {
                    j = j4;
                    length = k1;
                }
            }
        }
        int j = 0;
        byte[] buf = new byte[this.b * this.d];
        for (int k = 0; k < this.d; k++) {
            for (int i1 = 0; i1 < this.b; i1++) {
                int j1 = this.c[j] & 0xff;
                if (this.i[j1] == 0) {
                    if (i1 > 0 && (this.i[this.c[j - 1] & 0xff] != 0)) {
                        j1 = length;
                    } else if (k > 0 && (this.i[(this.c[j - this.b] & 0xff)]) != 0) {
                        j1 = length;
                    } else if (i1 < this.b - 1 && (this.i[this.c[j + 1] & 0xff]) != 0) {
                        j1 = length;
                    } else if (k < this.d - 1 && (this.i[(this.c[j + this.b] & 0xff)]) != 0) {
                        j1 = length;
                    }
                }
                buf[j++] = (byte) j1;
            }
        }
        this.c = buf;
    }

    public final void e() {
        byte[] buf = new byte[this.b * this.d];
        int i = 0;
        if (this.f == null) {
            for (int j = 0; j < this.b; j++) {
                for (int k = this.d - 1; k >= 0; k--) {
                    buf[i++] = this.c[j + k * this.b];
                }
            }
            this.c = buf;
        } else {
            byte[] buf1 = new byte[this.b * this.d];
            for (int j = 0; j < this.b; j++) {
                for (int k = this.d - 1; k >= 0; k--) {
                    buf[i] = this.c[j + k * this.b];
                    buf1[i++] = this.f[j + k * this.b];
                }
            }
            this.c = buf;
            this.f = buf1;
        }
        int j = this.g;
        this.g = this.e;
        this.e = this.h;
        this.h = this.a;
        this.a = this.g;
        j = this.d;
        this.d = this.b;
        this.b = j;
    }

    public final int[] f() {
        int i = c();
        int[] buf = new int[i * d()];
        if (this.f != null) {
            for (int j = 0; j < this.d; j++) {
                int k = j * this.b;
                int i1 = this.e + (j + this.g) * i;
                for (int count = 0; count < this.b; count++) {
                    buf[i1++] = (this.f[k] << 24 | this.i[this.c[k] & 0xff]);
                    k++;
                }
            }
        } else {
            for (int j = 0; j < this.d; j++) {
                int k = j * this.b;
                int i1 = this.e + (j + this.g) * i;
                for (int count = 0; count < this.b; count++) {
                    int j1 = this.i[this.c[k++] & 0xff];
                    if (j1 != 0) {
                        buf[i1++] = ~0xffffff | j1;
                    } else {
                        buf[i1++] = 0;
                    }
                }
            }
        }
        return buf;
    }

    public final void g() {
        byte[] buf = this.c;
        if (this.f == null) {
            for (int i = (this.d >> 1) - 1; i >= 0; i--) {
                int j = i * this.b;
                int k = (this.d - i - 1) * this.b;
                for (int count = -this.b; count < 0; count++) {
                    byte b = buf[j];
                    buf[j] = buf[k];
                    buf[k] = b;
                    j++;
                    k++;
                }
            }
        } else {
            byte[] buf1 = this.f;
            for (int i = (this.d >> 1) - 1; i >= 0; i--) {
                int j = i * this.b;
                int k = (this.d - i - 1) * this.b;
                for (int count = -this.b; count < 0; count++) {
                    byte b = buf[j];
                    buf[j] = buf[k];
                    buf[k] = b;
                    b = buf1[j];
                    buf1[j] = buf1[k];
                    buf1[k] = b;
                    j++;
                    k++;
                }
            }
        }
        int i = this.g;
        this.g = this.h;
        this.h = i;
    }

    public final void b(int i) {
        int j = c();
        int k = d();
        if (this.b != j || this.d != k) {
            int i1 = i;
            if (i1 > this.e) {
                i1 = this.e;
            }
            int j1 = i;
            if (j1 + this.e + this.b > j) {
                j1 = j - this.e - this.b;
            }
            int k1 = i;
            if (k1 > this.g) {
                k1 = this.g;
            }
            int i2 = i;
            if (i2 + this.g + this.d > k) {
                i2 = k - this.g - this.d;
            }
            int j2 = this.b + i1 + j1;
            int k2 = this.d + k1 + i2;
            byte[] buf = new byte[j2 * k2];
            if (this.f == null) {
                for (int i3 = 0; i3 < this.d; i3++) {
                    int j3 = i3 * this.b;
                    int k3 = (i3 + k1) * j2 + i1;
                    for (int count = 0; count < this.b; count++) {
                        buf[k3++] = this.c[j3++];
                    }
                }
            } else {
                byte[] buf1 = new byte[j2 * k2];
                for (int i3 = 0; i3 < this.d; i3++) {
                    int j3 = i3 * this.b;
                    int k3 = (i3 + k1) * j2 + i1;
                    for (int count = 0; count < this.b; count++) {
                        buf1[k3] = this.f[j3];
                        buf[k3++] = this.c[j3++];
                    }
                }
                this.f = buf1;
            }
            this.e -= i1;
            this.g -= k1;
            this.a -= j1;
            this.h -= i2;
            this.b = j2;
            this.d = k2;
            this.c = buf;
        }
    }

    public final void c(int i) {
        int length = -1;
        if (this.i.length < 255) {
            for (int index = 0; index < this.i.length; index++) {
                if (this.i[index] == i) {
                    length = index;
                    break;
                }
            }
            if (length == -1) {
                length = this.i.length;
                int[] buf = new int[this.i.length + 1];
                co.a(this.i, 0, buf, 0, this.i.length);
                this.i = buf;
                buf[length] = i;
            }
        } else {
            int j = 2147483647;
            int k = i >> 16 & 0xff;
            int i1 = i >> 8 & 0xff;
            int j1 = i & 0xff;
            for (int k1 = 0; k1 < this.i.length; k1++) {
                int i2 = this.i[k1];
                int j2 = i2 >> 16 & 0xff;
                int k2 = i2 >> 8 & 0xff;
                int i3 = i2 & 0xff;
                int j3 = k - j2;
                if (j3 < 0) {
                    j3 = -j3;
                }
                int k3 = i1 - k2;
                if (k3 < 0) {
                    k3 = -k3;
                }
                int i4 = j1 - i3;
                if (i4 < 0) {
                    i4 = -i4;
                }
                int j4 = j3 + k3 + i4;
                if (j4 < j) {
                    j = j4;
                    length = k1;
                }
            }
        }
        for (int j = this.d - 1; j > 0; j--) {
            int k = j * this.b;
            for (int i1 = this.b - 1; i1 > 0; i1--) {
                if (this.i[this.c[i1 + k] & 0xff] == 0 && (this.i[(this.c[i1 + k - 1 - this.b] & 0xff)]) != 0) {
                    this.c[i1 + k] = (byte) length;
                }
            }
        }
    }

    public aga() {
    /* empty */
    }
}
