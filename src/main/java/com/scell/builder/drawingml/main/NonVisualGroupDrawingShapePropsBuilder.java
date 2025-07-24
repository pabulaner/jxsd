package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GroupLockingModel;
import com.scell.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

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

  public NonVisualGroupDrawingShapePropsModel build() {
    return new NonVisualGroupDrawingShapePropsModel(this.grpSpLocks, this.extLst);
  }

  public NonVisualGroupDrawingShapePropsBuilder from(NonVisualGroupDrawingShapePropsModel value) {
    this.grpSpLocks = value.getGrpSpLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
