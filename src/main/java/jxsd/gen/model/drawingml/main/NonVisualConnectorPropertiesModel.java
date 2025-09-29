package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.NonVisualConnectorPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class NonVisualConnectorPropertiesModel {
  private final ConnectorLockingModel cxnSpLocks;

  private final ConnectionModel stCxn;

  private final ConnectionModel endCxn;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualConnectorPropertiesModel(ConnectorLockingModel cxnSpLocks, ConnectionModel stCxn,
      ConnectionModel endCxn, OfficeArtExtensionListModel extLst) {
    this.cxnSpLocks = cxnSpLocks;
    this.stCxn = stCxn;
    this.endCxn = endCxn;
    this.extLst = extLst;
  }

  public NonVisualConnectorPropertiesBuilder builder() {
    return new NonVisualConnectorPropertiesBuilder().from(this);
  }

  public ConnectorLockingModel getCxnSpLocks() {
    return this.cxnSpLocks;
  }

  public ConnectionModel getStCxn() {
    return this.stCxn;
  }

  public ConnectionModel getEndCxn() {
    return this.endCxn;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
