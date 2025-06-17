
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_TextBodyModel;
import test.ooxml.drawingml.main.CT_GvmlUseShapeRectangleModel;
import test.ooxml.drawingml.main.CT_Transform2DModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_GvmlTextShapeModel {

public class UseSpRectOrxfrmModel {


    private final Object value;

    public UseSpRectOrxfrmModel(CT_GvmlUseShapeRectangleModel value) {
        this.value = value;
    }
    public UseSpRectOrxfrmModel(CT_Transform2DModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_GvmlUseShapeRectangleModel getUseSpRect() {
        return (CT_GvmlUseShapeRectangleModel) value;
    }
    public CT_Transform2DModel getXfrm() {
        return (CT_Transform2DModel) value;
    }
}

    private final CT_TextBodyModel txBody;
    private final UseSpRectOrxfrmModel useSpRectOrxfrm;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GvmlTextShapeModel(CT_TextBodyModel txBody, UseSpRectOrxfrmModel useSpRectOrxfrm, CT_OfficeArtExtensionListModel extLst) {
        this.txBody = txBody;
        this.useSpRectOrxfrm = useSpRectOrxfrm;
        this.extLst = extLst;
    }

    public CT_TextBodyModel getTxBody() {
        return this.txBody;
    }
    public UseSpRectOrxfrmModel getUseSpRectOrxfrm() {
        return this.useSpRectOrxfrm;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
