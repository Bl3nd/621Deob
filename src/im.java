// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


class im extends mp
{


// JavaClassFileOutputException: Stack underflow

    static final void a(int i, byte byte0, int j)
    {
        if(byte0 >= -22)
            return;
        y++;
        if(j != fr.v)
        {
            js.p = new int[j];
            for(int k = 0; k < j; k++)
                js.p[k] = (k << 12) / j;

            qf.g = j - 1;
            Class_lc.bb = 32 * j;
            fr.v = j;
        }
        if(i != od.pb)
        {
            if(fr.v != i)
            {
                Class_i.i = new int[i];
                for(int l = 0; l < i; l++)
                    Class_i.i[l] = (l << 12) / i;

            } else
            {
                Class_i.i = js.p;
            }
            bc.d = i - 1;
            od.pb = i;
        }
    }

    im(int i, int j, int k, int l, int i1, float f, float f1, 
            float f2)
    {
        super(i, j, k, l, i1);
        C = (int)(4096F * f2);
        z = (int)(f1 * 4096F);
        A = E = (int)(Math.pow(0.5D, -f) * 4096D);
    }

    static final void a(String s1, long l, boolean flag, byte byte0)
    {
        x++;
        if(flag)
        {
            qca.a(-99);
            if(nu.i.equals(""))
            {
                RSKeyListener.s = 39;
                return;
            }
        }
        BytesParser es1 = new BytesParser(576);
        es1.writeByte(10, (byte)-119);
        es1.writeShort((int)(Math.random() * 65535D), 13469);
        es1.writeLong(l, -16719);
        es1.writeShort(flag ? nf.G : hl.affId, 13469);
        es1.writeString(s1, -23);
        es1.writeLong(flag ? ei.e : ak.userFlow, -16719);
        if(flag)
        {
            es1.writeLong(aaa.stringToLong(0, nu.i), -16719);
            try
            {
                es1.writeLong(Long.parseLong(eo.n), -16719);
            }
            catch(Exception _ex)
            {
                RSKeyListener.s = 39;
                return;
            }
        } else
        {
            es1.writeInt((int)(Math.random() * 99999999D), -109);
            es1.writeInt((int)(99999999D * Math.random()), -108);
            es1.writeInt((int)(99999999D * Math.random()), -97);
            es1.writeInt((int)(99999999D * Math.random()), -102);
        }
        es1.writeInt((int)(99999999D * Math.random()), -96);
        if(byte0 <= 73)
            return;
        es1.applyRSAEncryption(nf.publicRSAKey, -57, uf.rsaModulus);
        tba tba1 = gr.b(-107);
        tba1.loginStream.writeByte(flag ? hea.q.packetID : hea.n.packetID, (byte)-110);
        int i = 1;
        if(br.additionalInfo != null)
            i += br.additionalInfo.length() + 1;
        tba1.loginStream.writeShort(28 + i + es1.pos, 13469);
        tba1.loginStream.writeShort(621, 13469);
        tba1.loginStream.writeByte(cba.languageID, (byte)-119);
        tba1.loginStream.writeByte(me.q.h, (byte)-125);
        vq.writeBytesWithSetOffset(tba1.loginStream, 0);
        String s2 = flag ? mj.u : br.additionalInfo;
        tba1.loginStream.writeByte(s2 == null ? 0 : 1, (byte)-116);
        if(s2 != null)
            tba1.loginStream.writeString(s2, -80);
        tba1.loginStream.writeBytes(0x10000, es1.pos, 0, es1.bytes);
        ud.a(tba1, (byte)-36);
        Class_eb.q = 1;
        tfa.u = 0;
        lr.j = 0;
        RSKeyListener.s = -3;
    }

    public static void d(byte byte0)
    {
        r = null;
        n = null;
        if(byte0 >= -51)
            p = true;
    }

    final void b(int i)
    {
        w >>= 4;
        o++;
        A = E;
        if(w < 0)
            w = 0;
        else
        if(w > 255)
            w = 255;
        if(i != 1)
            b(-108);
        a((byte)w, u++, false);
        w = 0;
    }

    final void c(int i)
    {
        int j = 90 / ((-84 - i) / 39);
        w = 0;
        u = 0;
        D++;
    }

    void a(byte byte0, int i, boolean flag)
    {
        if(flag)
            d((byte)21);
        B++;
        t[i] = byte0;
    }

    static fh n = new fh(9, 6);
    static int o;
    static boolean p = false;
    private int q;
    static int r[] = {
        1, 2, 4, 8
    };
    private int s;
    private byte t[];
    private int u;
    static int v;
    private int w;
    static int x;
    static int y;
    private int z;
    private int A;
    static int B;
    private int C;
    static int D;
    private int E;
	@Override
	void a(byte i, int i_59, int i_60) {
		// TODO Auto-generated method stub
		
	}

}
