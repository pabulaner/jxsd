package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.NonVisualGroupDrawingShapePropsBuilder;

/**
 * This is a generated sequence class.
 */
public class NonVisualGroupDrawingShapePropsModel {
  private final GroupLockingModel grpSpLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualGroupDrawingShapePropsModel(GroupLockingModel grpSpLocks,
      OfficeArtExtensionListModel extLst) {
    this.grpSpLocks = grpSpLocks;
    this.extLst = extLst;
  }

  public NonVisualGroupDrawingShapePropsBuilder builder() {
    return new NonVisualGroupDrawingShapePropsBuilder().from(this);
  }

  public GroupLockingModel getGrpSpLocks() {
    return this.grpSpLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
