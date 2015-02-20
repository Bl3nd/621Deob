/* dxVertexLayout - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class dxVertexLayout extends mq {
	
	public IDirect3DVertexDeclaration iDirect3dVertexDeclaration;

	public dxVertexLayout(gaa gaa, eda[] edas) {
		VertexElementCollection vertexelementcollection = new VertexElementCollection(((gaa) gaa).Mg);
		int i = 0;
		for (int j = 0; j < edas.length; j++) {
			int k = 0;
			eda eda = edas[j];
			for (int i1 = 0; i1 < eda.b(-124); i1++) {
				jv jv_ = eda.a(i1, (byte) 96);
				int j1;
				int k1;
				int i2;
				if (jv.e != jv_) {
					if (jv.k == jv_) {
						i2 = 0;
						k1 = 3;
						j1 = 2;
					} else if (jv.l != jv_) {
						if (jv_ != jv.m) {
							if (jv_ != jv.n) {
								if (jv_ != jv.o) {
									k1 = 5;
									j1 = 3;
									i2 = i++;
								} else {
									k1 = 5;
									j1 = 2;
									i2 = i++;
								}
							} else {
								k1 = 5;
								i2 = i++;
								j1 = 1;
							}
						} else {
							j1 = 0;
							i2 = i++;
							k1 = 5;
						}
					} else {
						i2 = 0;
						k1 = 10;
						j1 = 4;
					}
				} else {
					j1 = 2;
					k1 = 0;
					i2 = 0;
				}
				vertexelementcollection.addElement(j, j1, 0, k1, i2, k);
				k += ((jv) jv_).c;
			}
		}
		vertexelementcollection.finish();
		((dxVertexLayout) this).iDirect3dVertexDeclaration = ((gaa) gaa).Hg.a(vertexelementcollection, null);
	}
}
