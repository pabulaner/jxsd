
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.main.CT_Scene3DModel;
import test.ooxml.drawingml.main.CT_Shape3DModel;
import test.ooxml.drawingml.diagram.CT_TextPropsModel;
import test.ooxml.drawingml.main.CT_ShapeStyleModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_StyleLabelModel {


    private final StringModel name;
    private final CT_Scene3DModel scene3d;
    private final CT_Shape3DModel sp3d;
    private final CT_TextPropsModel txPr;
    private final CT_ShapeStyleModel style;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_StyleLabelModel(StringModel name, CT_Scene3DModel scene3d, CT_Shape3DModel sp3d, CT_TextPropsModel txPr, CT_ShapeStyleModel style, CT_OfficeArtExtensionListModel extLst) {
        this.name = name;
        this.scene3d = scene3d;
        this.sp3d = sp3d;
        this.txPr = txPr;
        this.style = style;
        this.extLst = extLst;
    }

    public StringModel getName() {
        return this.name;
    }
    public CT_Scene3DModel getScene3d() {
        return this.scene3d;
    }
    public CT_Shape3DModel getSp3d() {
        return this.sp3d;
    }
    public CT_TextPropsModel getTxPr() {
        return this.txPr;
    }
    public CT_ShapeStyleModel getStyle() {
        return this.style;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
