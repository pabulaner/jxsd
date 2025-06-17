
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.CT_ShapeLockingModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_NonVisualDrawingShapePropsModel {


    private final BooleanModel txBox;
    private final CT_ShapeLockingModel spLocks;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_NonVisualDrawingShapePropsModel(BooleanModel txBox, CT_ShapeLockingModel spLocks, CT_OfficeArtExtensionListModel extLst) {
        this.txBox = txBox;
        this.spLocks = spLocks;
        this.extLst = extLst;
    }

    public BooleanModel getTxBox() {
        return this.txBox;
    }
    public CT_ShapeLockingModel getSpLocks() {
        return this.spLocks;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
