
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_BlackWhiteModeModel;
import test.ooxml.drawingml.main.CT_GroupTransform2DModel;
import test.ooxml.drawingml.main.CT_Scene3DModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_GroupShapePropertiesModel {


    private final ST_BlackWhiteModeModel bwMode;
    private final CT_GroupTransform2DModel xfrm;
    private final CT_Scene3DModel scene3d;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GroupShapePropertiesModel(ST_BlackWhiteModeModel bwMode, CT_GroupTransform2DModel xfrm, CT_Scene3DModel scene3d, CT_OfficeArtExtensionListModel extLst) {
        this.bwMode = bwMode;
        this.xfrm = xfrm;
        this.scene3d = scene3d;
        this.extLst = extLst;
    }

    public ST_BlackWhiteModeModel getBwMode() {
        return this.bwMode;
    }
    public CT_GroupTransform2DModel getXfrm() {
        return this.xfrm;
    }
    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
