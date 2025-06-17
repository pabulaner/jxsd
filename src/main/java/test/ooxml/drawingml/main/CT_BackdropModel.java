
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_Point3DModel;
import test.ooxml.drawingml.main.CT_Vector3DModel;
import test.ooxml.drawingml.main.CT_Vector3DModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_BackdropModel {


    private final CT_Point3DModel anchor;
    private final CT_Vector3DModel norm;
    private final CT_Vector3DModel up;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_BackdropModel(CT_Point3DModel anchor, CT_Vector3DModel norm, CT_Vector3DModel up, CT_OfficeArtExtensionListModel extLst) {
        this.anchor = anchor;
        this.norm = norm;
        this.up = up;
        this.extLst = extLst;
    }

    public CT_Point3DModel getAnchor() {
        return this.anchor;
    }
    public CT_Vector3DModel getNorm() {
        return this.norm;
    }
    public CT_Vector3DModel getUp() {
        return this.up;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
