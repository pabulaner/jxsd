package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GroupLockingModel;
import com.scell.model.drawingml.main.CT_NonVisualGroupDrawingShapePropsModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_NonVisualGroupDrawingShapePropsBuilder {
  private CT_GroupLockingModel grpSpLocks;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualGroupDrawingShapePropsBuilder() {
  }

  public CT_NonVisualGroupDrawingShapePropsBuilder setGrpSpLocks(CT_GroupLockingModel grpSpLocks) {
    this.grpSpLocks = grpSpLocks;
    return this;
  }

  public CT_NonVisualGroupDrawingShapePropsBuilder setExtLst(
      CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NonVisualGroupDrawingShapePropsModel build() {
    return new CT_NonVisualGroupDrawingShapePropsModel(this.grpSpLocks, this.extLst);
  }

  public CT_NonVisualGroupDrawingShapePropsBuilder from(
      CT_NonVisualGroupDrawingShapePropsModel value) {
    this.grpSpLocks = value.getGrpSpLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
