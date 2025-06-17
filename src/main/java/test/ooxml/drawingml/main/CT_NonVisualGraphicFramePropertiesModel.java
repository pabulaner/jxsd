
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_GraphicalObjectFrameLockingModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_NonVisualGraphicFramePropertiesModel {


    private final CT_GraphicalObjectFrameLockingModel graphicFrameLocks;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_NonVisualGraphicFramePropertiesModel(CT_GraphicalObjectFrameLockingModel graphicFrameLocks, CT_OfficeArtExtensionListModel extLst) {
        this.graphicFrameLocks = graphicFrameLocks;
        this.extLst = extLst;
    }

    public CT_GraphicalObjectFrameLockingModel getGraphicFrameLocks() {
        return this.graphicFrameLocks;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
