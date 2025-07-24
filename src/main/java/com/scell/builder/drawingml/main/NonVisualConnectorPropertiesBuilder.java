package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ConnectionModel;
import com.scell.model.drawingml.main.ConnectorLockingModel;
import com.scell.model.drawingml.main.NonVisualConnectorPropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class NonVisualConnectorPropertiesBuilder {
  private ConnectorLockingModel cxnSpLocks;

  private ConnectionModel stCxn;

  private ConnectionModel endCxn;

  private OfficeArtExtensionListModel extLst;

  public NonVisualConnectorPropertiesBuilder() {
  }

  public NonVisualConnectorPropertiesBuilder setCxnSpLocks(ConnectorLockingModel cxnSpLocks) {
    this.cxnSpLocks = cxnSpLocks;
    return this;
  }

  public NonVisualConnectorPropertiesBuilder setStCxn(ConnectionModel stCxn) {
    this.stCxn = stCxn;
    return this;
  }

  public NonVisualConnectorPropertiesBuilder setEndCxn(ConnectionModel endCxn) {
    this.endCxn = endCxn;
    return this;
  }

  public NonVisualConnectorPropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NonVisualConnectorPropertiesModel build() {
    return new NonVisualConnectorPropertiesModel(this.cxnSpLocks, this.stCxn, this.endCxn, this.extLst);
  }

  public NonVisualConnectorPropertiesBuilder from(NonVisualConnectorPropertiesModel value) {
    this.cxnSpLocks = value.getCxnSpLocks();
    this.stCxn = value.getStCxn();
    this.endCxn = value.getEndCxn();
    this.extLst = value.getExtLst();
    return this;
  }
}
