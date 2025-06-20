
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_GroupLockingModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_NonVisualGroupDrawingShapePropsModel {


    private final CT_GroupLockingModel grpSpLocks;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_NonVisualGroupDrawingShapePropsModel(CT_GroupLockingModel grpSpLocks, CT_OfficeArtExtensionListModel extLst) {
        this.grpSpLocks = grpSpLocks;
        this.extLst = extLst;
    }

    public CT_GroupLockingModel getGrpSpLocks() {
        return this.grpSpLocks;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
