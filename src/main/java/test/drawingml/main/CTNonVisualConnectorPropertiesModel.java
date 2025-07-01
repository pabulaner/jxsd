package test.drawingml.main;

public class CTNonVisualConnectorPropertiesModel {
  private final CTConnectorLockingModel cxnSpLocks;

  private final CTConnectionModel stCxn;

  private final CTConnectionModel endCxn;

  private final CTOfficeArtExtensionListModel extLst;

  public CTNonVisualConnectorPropertiesModel(CTConnectorLockingModel cxnSpLocks,
      CTConnectionModel stCxn, CTConnectionModel endCxn, CTOfficeArtExtensionListModel extLst) {
    this.cxnSpLocks = cxnSpLocks;
    this.stCxn = stCxn;
    this.endCxn = endCxn;
    this.extLst = extLst;
  }

  public CTConnectorLockingModel getCxnSpLocks() {
    return this.cxnSpLocks;
  }

  public CTConnectionModel getStCxn() {
    return this.stCxn;
  }

  public CTConnectionModel getEndCxn() {
    return this.endCxn;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
