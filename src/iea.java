/* iea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class iea implements oc
{
    static int a = -1;
    int b;
    static int c;
    int d;
    int e;
    int f;
    int g;
    static int h = 16777215;
    int i;
    rc j;
    int k;
    static int l;
    ct m;
    
    static final void a(boolean bool, f[] var_fs) {
	al.q = var_fs.length;
	l++;
	en.S = new f[al.q + 10];
	pda.z = new int[al.q + 10];
	co.a(var_fs, 0, en.S, 0, al.q);
	if (bool != true)
	    h = 120;
	for (int i = 0; al.q > i; i++)
	    pda.z[i] = en.S[i].ca();
	for (int i = al.q; i < en.S.length; i++)
	    pda.z[i] = 12;
    }
    
    public wea a(int i) {
	c++;
	if (i <= 38)
	    a(true, null);
	return null;
    }
    
    iea(ct var_ct, rc var_rc, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	int i_4_, int i_5_) {
	((iea) this).e = i_2_;
	((iea) this).k = i;
	((iea) this).b = i_4_;
	((iea) this).i = i_1_;
	((iea) this).g = i_3_;
	((iea) this).m = var_ct;
	((iea) this).d = i_0_;
	((iea) this).f = i_5_;
	((iea) this).j = var_rc;
    }
}
