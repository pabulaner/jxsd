package test.drawingml.main;

public class CTNonVisualGroupDrawingShapePropsModel {
  private final CTGroupLockingModel grpSpLocks;

  private final CTOfficeArtExtensionListModel extLst;

  public CTNonVisualGroupDrawingShapePropsModel(CTGroupLockingModel grpSpLocks,
      CTOfficeArtExtensionListModel extLst) {
    this.grpSpLocks = grpSpLocks;
    this.extLst = extLst;
  }

  public CTGroupLockingModel getGrpSpLocks() {
    return this.grpSpLocks;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
