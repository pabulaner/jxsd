package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GroupLockingModel;
import jxsd.gen.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class NonVisualGroupDrawingShapePropsBuilder {
  private GroupLockingModel grpSpLocks;

  private OfficeArtExtensionListModel extLst;

  public NonVisualGroupDrawingShapePropsBuilder() {
  }

  public NonVisualGroupDrawingShapePropsBuilder setGrpSpLocks(GroupLockingModel grpSpLocks) {
    this.grpSpLocks = grpSpLocks;
    return this;
  }

  public NonVisualGroupDrawingShapePropsBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NonVisualGroupDrawingShapePropsBuilder from(NonVisualGroupDrawingShapePropsModel value) {
    this.grpSpLocks = value.getGrpSpLocks();
    this.extLst = value.getExtLst();
    return this;
  }

  public NonVisualGroupDrawingShapePropsModel build() {
    return new NonVisualGroupDrawingShapePropsModel(this.grpSpLocks, this.extLst);
  }
}
