package com.scell.model.drawingml.main;

public class NonVisualGroupDrawingShapePropsModel {
  private final GroupLockingModel grpSpLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualGroupDrawingShapePropsModel(GroupLockingModel grpSpLocks,
      OfficeArtExtensionListModel extLst) {
    this.grpSpLocks = grpSpLocks;
    this.extLst = extLst;
  }

  public GroupLockingModel getGrpSpLocks() {
    return this.grpSpLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
