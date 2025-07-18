package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ConnectionModel;
import com.scell.model.drawingml.main.CT_ConnectorLockingModel;
import com.scell.model.drawingml.main.CT_NonVisualConnectorPropertiesModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_NonVisualConnectorPropertiesBuilder {
  private CT_ConnectorLockingModel cxnSpLocks;

  private CT_ConnectionModel stCxn;

  private CT_ConnectionModel endCxn;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualConnectorPropertiesBuilder() {
  }

  public CT_NonVisualConnectorPropertiesBuilder setCxnSpLocks(CT_ConnectorLockingModel cxnSpLocks) {
    this.cxnSpLocks = cxnSpLocks;
    return this;
  }

  public CT_NonVisualConnectorPropertiesBuilder setStCxn(CT_ConnectionModel stCxn) {
    this.stCxn = stCxn;
    return this;
  }

  public CT_NonVisualConnectorPropertiesBuilder setEndCxn(CT_ConnectionModel endCxn) {
    this.endCxn = endCxn;
    return this;
  }

  public CT_NonVisualConnectorPropertiesBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NonVisualConnectorPropertiesModel build() {
    return new CT_NonVisualConnectorPropertiesModel(this.cxnSpLocks, this.stCxn, this.endCxn, this.extLst);
  }

  public CT_NonVisualConnectorPropertiesBuilder from(CT_NonVisualConnectorPropertiesModel value) {
    this.cxnSpLocks = value.getCxnSpLocks();
    this.stCxn = value.getStCxn();
    this.endCxn = value.getEndCxn();
    this.extLst = value.getExtLst();
    return this;
  }
}
