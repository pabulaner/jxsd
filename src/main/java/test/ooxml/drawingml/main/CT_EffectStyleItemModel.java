
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_Scene3DModel;
import test.ooxml.drawingml.main.CT_Shape3DModel;


public class CT_EffectStyleItemModel {


    private final CT_Scene3DModel scene3d;
    private final CT_Shape3DModel sp3d;

    public CT_EffectStyleItemModel(CT_Scene3DModel scene3d, CT_Shape3DModel sp3d) {
        this.scene3d = scene3d;
        this.sp3d = sp3d;
    }

    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public CT_Shape3DModel getSp3d() {
        return this.sp3d;
    }
}
