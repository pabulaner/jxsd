package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ConnectionModel;
import jxsd.gen.model.drawingml.main.ConnectorLockingModel;
import jxsd.gen.model.drawingml.main.NonVisualConnectorPropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
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

  public NonVisualConnectorPropertiesBuilder from(NonVisualConnectorPropertiesModel value) {
    this.cxnSpLocks = value.getCxnSpLocks();
    this.stCxn = value.getStCxn();
    this.endCxn = value.getEndCxn();
    this.extLst = value.getExtLst();
    return this;
  }

  public NonVisualConnectorPropertiesModel build() {
    return new NonVisualConnectorPropertiesModel(this.cxnSpLocks, this.stCxn, this.endCxn, this.extLst);
  }
}
