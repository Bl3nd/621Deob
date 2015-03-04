/* fca - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class fca {
    static int clearTextCoords;
    static int b;
    static int c;
    private Interactable interactable = new Interactable();
    static int e;
    static int[] f = new int[2048];
    static int g;
    static int h;
    static int i;
    static int j;
    static int k;
    static int l;
    private Interactable m;
    static int n;

    final boolean a(int i) {
        if (i != 17494)
            return false;
        j++;
        if (((Interactable) interactable).previousInteractable != interactable)
            return false;
        return true;
    }

    static final void a(boolean bool, qj var_qj) {
        b++;
        if (Interactable.d == null) {
            gn var_gn = new gn();
            byte[] is = var_gn.a((int) 0, 128, 128, 16);
            Interactable.d = kg.a(-137, is, false);
        }
        if (tp.a == null) {
            up var_up = new up();
            byte[] is = var_up.a(12743, 16, 128, 128);
            tp.a = kg.a(-137, is, false);
        }
        if (bool != false)
            e(-72);
        gk var_gk = ((qj) var_qj).ie;
        if (var_gk.a((byte) -126) && bg.b == null) {
            byte[] is = Class_rb.a(0, 8, 16.0F, 16, 0.5F, 0.6F, 4.0F, 128, 128,
                    new vq(419684), 4.0F);
            bg.b = kg.a(-137, is, false);
        }
    }

    static final void a(byte i, double d) {
        if (d != aw.e) {
            for (int i_0_ = 0; i_0_ < 256; i_0_++) {
                int i_1_ = (int) (255.0 * Math.pow((double) i_0_ / 255.0, d));
                sg.a[i_0_] = i_1_ <= 255 ? i_1_ : 255;
            }
            aw.e = d;
        }
        e++;
        if (i != 86)
            f = null;
    }

    /**
     * Clears the text coords. Executed on command (cleartext).
     * @param i
     */
    public final void clearTextCoords(int i) {
        clearTextCoords++;
        if (i != 128) {
            interactable = null;
        }
        for (; ; ) {
            Interactable interactable = this.interactable.previousInteractable;
            if (interactable == this.interactable) {
                break;
            }
            interactable.unlink(2);
        }
        m = null;
    }

    final Interactable a(byte i) {
        n++;
        if (i != -106)
            a(3, 74, null, true, -8, null);
        Interactable var_fga = m;
        if (interactable == var_fga) {
            m = null;
            return null;
        }
        m = ((Interactable) var_fga).previousInteractable;
        return var_fga;
    }

    final void a(Interactable var_fga, int i) {
        k++;
        if (((Interactable) var_fga).nextInteractable != null)
            var_fga.unlink(2);
        ((Interactable) var_fga).previousInteractable = interactable;
        ((Interactable) var_fga).nextInteractable = ((Interactable) interactable).nextInteractable;
        if (i <= 39)
            b((byte) 22);
        ((Interactable) ((Interactable) var_fga).nextInteractable).previousInteractable = var_fga;
        ((Interactable) ((Interactable) var_fga).previousInteractable).nextInteractable = var_fga;
    }

    final Interactable b(byte i) {
        l++;
        if (i <= 69)
            f = null;
        Interactable var_fga = ((Interactable) interactable).previousInteractable;
        if (interactable == var_fga) {
            m = null;
            return null;
        }
        m = ((Interactable) var_fga).previousInteractable;
        return var_fga;
    }

    final Interactable c(int i) {
        if (i < 120)
            return null;
        h++;
        Interactable var_fga = ((Interactable) interactable).nextInteractable;
        if (var_fga == interactable) {
            m = null;
            return null;
        }
        m = ((Interactable) var_fga).nextInteractable;
        return var_fga;
    }

    final int d(int i) {
        c++;
        int i_2_ = i;
        Interactable var_fga = ((Interactable) interactable).previousInteractable;
        while (var_fga != interactable) {
            var_fga = ((Interactable) var_fga).previousInteractable;
            i_2_++;
        }
        return i_2_;
    }

    static final ar a(int i, int i_3_, qj var_qj, boolean bool, int i_4_,
                      int[] is) {
        if (i != 26871)
            a(false, null);
        fca.i++;
        if (!((qj) var_qj).pg
                && (!ar.a(i_3_, (byte) 98) || !ar.a(i_4_, (byte) 98))) {
            if (((qj) var_qj).vf)
                return new ar(var_qj, 34037, i_3_, i_4_, bool, is);
            return new ar(var_qj, i_3_, i_4_, dfa.a(i_3_, 128),
                    dfa.a(i_4_, 128), is);
        }
        return new ar(var_qj, 3553, i_3_, i_4_, bool, is);
    }

    public static void e(int i) {
        if (i == -13197)
            f = null;
    }

    public fca() {
        ((Interactable) interactable).previousInteractable = interactable;
        ((Interactable) interactable).nextInteractable = interactable;
    }

    final Interactable a(boolean bool) {
        if (bool != true)
            interactable = null;
        g++;
        Interactable var_fga = ((Interactable) interactable).previousInteractable;
        if (var_fga == interactable)
            return null;
        var_fga.unlink(2);
        return var_fga;
    }
}
