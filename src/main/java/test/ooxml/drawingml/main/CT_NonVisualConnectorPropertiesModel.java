
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_ConnectorLockingModel;
import test.ooxml.drawingml.main.CT_ConnectionModel;
import test.ooxml.drawingml.main.CT_ConnectionModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_NonVisualConnectorPropertiesModel {


    private final CT_ConnectorLockingModel cxnSpLocks;
    private final CT_ConnectionModel stCxn;
    private final CT_ConnectionModel endCxn;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_NonVisualConnectorPropertiesModel(CT_ConnectorLockingModel cxnSpLocks, CT_ConnectionModel stCxn, CT_ConnectionModel endCxn, CT_OfficeArtExtensionListModel extLst) {
        this.cxnSpLocks = cxnSpLocks;
        this.stCxn = stCxn;
        this.endCxn = endCxn;
        this.extLst = extLst;
    }

    public CT_ConnectorLockingModel getCxnSpLocks() {
        return this.cxnSpLocks;
    }
    public CT_ConnectionModel getStCxn() {
        return this.stCxn;
    }
    public CT_ConnectionModel getEndCxn() {
        return this.endCxn;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
