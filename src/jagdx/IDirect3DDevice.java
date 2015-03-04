/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.am;

public final class IDirect3DDevice extends IUnknown {

    private static float[] b = new float[4];
    private am c;

    private native int _CreateDepthStencilSurface(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, IDirect3DSurface idirect3dsurface);

    private native int _GetDepthStencilSurface(IDirect3DSurface idirect3dsurface);

    public final native int StretchRect(IDirect3DSurface idirect3dsurface, int i, int i_4_, int i_5_, int i_6_, IDirect3DSurface idirect3dsurface_7_,
                                        int i_8_, int i_9_, int i_10_, int i_11_, int i_12_);

    public final native int Reset(D3DPRESENT_PARAMETERS d3dpresent_parameters);

    public final native int SetTransform(int i, float[] fs);

    private native int _CreateOffscreenPlainSurface(int i, int i_13_, int i_14_, int i_15_, IDirect3DSurface idirect3dsurface);

    public final native int BeginScene();

    public final int a(int i, float[] fs) {
        return SetVertexShaderConstantF(i, fs, fs.length / 4);
    }

    public final native int SetPixelShaderConstantF(int i, float[] fs, int i_16_);

    private native int _CreateIndexBuffer(int i, int i_17_, int i_18_, int i_19_, IDirect3DIndexBuffer idirect3dindexbuffer);

    public final native int SetIndices(IDirect3DIndexBuffer idirect3dindexbuffer);

    public final native int Clear(int i, int i_20_, float f, int i_21_);

    public final native int SetVertexShaderConstantF(int i, float[] fs, int i_22_);

    public final native int EndScene();

    public final native int SetVertexDeclaration(IDirect3DVertexDeclaration idirect3dvertexdeclaration);

    public final native int SetVertexShader(IDirect3DVertexShader idirect3dvertexshader);

    public final native int SetFVF(int i);

    public final native int _CreateTexture(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, IDirect3DTexture idirect3dtexture);

    public final native int SetPixelShader(IDirect3DPixelShader idirect3dpixelshader);

    public final IDirect3DSurface b() {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(c);
        int stencilSurface = _GetDepthStencilSurface(idirect3dsurface);
        if (qr.a(true, stencilSurface)) {
            throw new bs(String.valueOf(stencilSurface));
        }
        return idirect3dsurface;
    }

    public final native int SetLight(int i, D3DLIGHT d3dlight);

    public final native int SetStreamSource(int i, IDirect3DVertexBuffer idirect3dvertexbuffer, int i_28_, int i_29_);

    public final native int _CreateVolumeTexture(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_,
                                                 IDirect3DVolumeTexture idirect3dvolumetexture);

    private native int SetRenderStateb(int i, boolean bool);

    public final native int SetTextureStageState(int i, int i_36_, int i_37_);

    public final native int SetSamplerState(int i, int i_38_, int i_39_);

    private native int _CreateRenderTarget(int i, int i_40_, int i_41_, int i_42_, int i_43_, boolean bool,
             IDirect3DSurface idirect3dsurface);

    public final native int TestCooperativeLevel();

    private native int _GetSwapChain(int i, IDirect3DSwapChain idirect3dswapchain);

    public final IDirect3DVolumeTexture a(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
        IDirect3DVolumeTexture idirect3dvolumetexture = new IDirect3DVolumeTexture(c);
        int volumeTexture = _CreateVolumeTexture(i, i_44_, i_45_, i_46_, i_47_, i_48_, i_49_, idirect3dvolumetexture);
        if (qr.a(true, volumeTexture)) {
            throw new bs(String.valueOf(volumeTexture));
        }
        return idirect3dvolumetexture;
    }

    public final int a(int i, float f) {
        return SetRenderStatef(i, f);
    }

    public final IDirect3DVertexDeclaration a(VertexElementCollection vertexelementcollection, IDirect3DVertexDeclaration idirect3dvertexdeclaration) {
        if (idirect3dvertexdeclaration == null) {
            idirect3dvertexdeclaration = new IDirect3DVertexDeclaration(c);
        } else {
            idirect3dvertexdeclaration.b(6168);
        }
        int vertexDeclaration = _CreateVertexDeclaration(vertexelementcollection, idirect3dvertexdeclaration);
        if (qr.a(true, vertexDeclaration)) {
            throw new bs(String.valueOf(vertexDeclaration));
        }
        return idirect3dvertexdeclaration;
    }

    public final IDirect3DSurface c(int i) {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(c);
        int renderTarget = _GetRenderTarget(i, idirect3dsurface);
        if (qr.a(true, renderTarget)) {
            throw new bs(String.valueOf(renderTarget));
        }
        return idirect3dsurface;
    }

    public final IDirect3DVertexShader a(byte[] is) {
        if (is == null) {
            return null;
        }
        IDirect3DVertexShader idirect3dvertexshader = new IDirect3DVertexShader(c);
        int vertexShader = _CreateVertexShader(is, idirect3dvertexshader);
        if (qr.a(true, vertexShader)) {
            throw new bs(String.valueOf(vertexShader));
        }
        return idirect3dvertexshader;
    }

    private native int _CreateEventQuery(IDirect3DEventQuery idirect3deventquery);

    public final native int _CreateCubeTexture(int i, int i_52_, int i_53_, int i_54_, int i_55_, IDirect3DCubeTexture idirect3dcubetexture);

    public final IDirect3DTexture a(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
        IDirect3DTexture idirect3dtexture = new IDirect3DTexture(c);
        int texture = _CreateTexture(i, i_56_, i_57_, i_58_, i_59_, i_60_, idirect3dtexture);
        if (qr.a(true, texture)) {
            throw new bs(String.valueOf(texture));
        }
        return idirect3dtexture;
    }

    private native int SetRenderStatef(int i, float f);

    public final int a(int i, float f, float f_62_, float f_63_, float f_64_) {
        b[0] = f;
        b[2] = f_63_;
        b[1] = f_62_;
        b[3] = f_64_;
        return SetVertexShaderConstantF(i, b, 1);
    }

    public final IDirect3DSwapChain d(int i) {
        IDirect3DSwapChain idirect3dswapchain = new IDirect3DSwapChain(c);
        int getSwapChain = _GetSwapChain(i, idirect3dswapchain);
        if (qr.a(true, getSwapChain)) {
            throw new bs(String.valueOf(getSwapChain));
        }
        return idirect3dswapchain;
    }

    public final IDirect3DPixelShader b(byte[] is) {
        if (is == null) {
            return null;
        }
        IDirect3DPixelShader idirect3dpixelshader = new IDirect3DPixelShader(c);
        int pixelShader = _CreatePixelShader(is, idirect3dpixelshader);
        if (qr.a(true, pixelShader)) {
            throw new bs(String.valueOf(pixelShader));
        }
        return idirect3dpixelshader;
    }

    public final native int SetRenderState(int i, int i_66_);

    public final int a(int i, boolean bool) {
        return SetRenderStateb(i, bool);
    }

    public final native int SetViewport(int i, int i_67_, int i_68_, int i_69_, float f, float f_70_);

    public final IDirect3DVertexBuffer a(int i, int i_71_, int i_72_, int i_73_, IDirect3DVertexBuffer idirect3dvertexbuffer) {
        if (idirect3dvertexbuffer == null) {
            idirect3dvertexbuffer = new IDirect3DVertexBuffer(c);
        } else {
            idirect3dvertexbuffer.b(6168);
        }
        int vertexBuffer = _CreateVertexBuffer(i, i_71_, i_72_, i_73_, idirect3dvertexbuffer);
        if (qr.a(true, vertexBuffer)) {
            throw new bs(String.valueOf(vertexBuffer));
        }
        idirect3dvertexbuffer.b = i;
        return idirect3dvertexbuffer;
    }

    private native int _CreateVertexBuffer(int i, int i_75_, int i_76_, int i_77_, IDirect3DVertexBuffer idirect3dvertexbuffer);

    public final native int DrawIndexedPrimitive(int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_);

    public IDirect3DDevice(am am) {
        super(am);
        c = am;
    }

    public final IDirect3DEventQuery c() {
        IDirect3DEventQuery idirect3deventquery = new IDirect3DEventQuery(c);
        if (qr.a(_CreateEventQuery(idirect3deventquery), -2005530519)) {
            return !idirect3deventquery.a(8108) ? null : idirect3deventquery;
        }
        return null;
    }

    public final int b(int i, float f, float f_83_, float f_84_, float f_85_) {
        b[0] = f;
        b[3] = f_85_;
        b[1] = f_83_;
        b[2] = f_84_;
        return SetPixelShaderConstantF(i, b, 1);
    }

    public final IDirect3DIndexBuffer a(int i, int i_86_, int i_87_, int i_88_, IDirect3DIndexBuffer idirect3dindexbuffer) {
        if (idirect3dindexbuffer == null) {
            idirect3dindexbuffer = new IDirect3DIndexBuffer(c);
        } else {
            idirect3dindexbuffer.b(6168);
        }
        int indexBuffer = _CreateIndexBuffer(i, i_86_, i_87_, i_88_, idirect3dindexbuffer);
        if (qr.a(true, indexBuffer)) {
            throw new bs(String.valueOf(indexBuffer));
        }
        return idirect3dindexbuffer;
    }

    private native int _CreateVertexDeclaration(VertexElementCollection vertexelementcollection, IDirect3DVertexDeclaration idirect3dvertexdeclaration);

    public final native int DrawPrimitive(int i, int i_90_, int i_91_);

    public final native int _CreateVertexShader(byte[] is, IDirect3DVertexShader idirect3dvertexshader);

    public final IDirect3DCubeTexture a(int i, int i_92_, int i_93_, int i_94_, int i_95_) {
        IDirect3DCubeTexture idirect3dcubetexture = new IDirect3DCubeTexture(c);
        int cubeTexture = _CreateCubeTexture(i, i_92_, i_93_, i_94_, i_95_, idirect3dcubetexture);
        if (qr.a(true, cubeTexture)) {
            throw new bs(String.valueOf(cubeTexture));
        }
        return idirect3dcubetexture;
    }

    public final native int SetTexture(int i, IDirect3DBaseTexture idirect3dbasetexture);

    private native int _GetRenderTarget(int i, IDirect3DSurface idirect3dsurface);

    public final IDirect3DSurface a(int i, int i_97_, int i_98_, int i_99_, int i_100_, boolean bool) {
        IDirect3DSurface idirect3dsurface = new IDirect3DSurface(c);
        int renderTarget = _CreateRenderTarget(i, i_97_, i_98_, i_99_, i_100_, bool, idirect3dsurface);
        if (qr.a(true, renderTarget)) {
            throw new bs(String.valueOf(renderTarget));
        }
        return idirect3dsurface;
    }

    public final native int SetScissorRect(int i, int i_102_, int i_103_, int i_104_);

    public final native int _CreatePixelShader(byte[] is, IDirect3DPixelShader idirect3dpixelshader);

    private native int _GetBackBuffer(int i, int i_105_, int i_106_, IDirect3DSurface idirect3dsurface);

    public final native boolean LightEnable(int i, boolean bool);
}
