package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingShapePropsModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_ShapeLockingModel;

public class CT_NonVisualDrawingShapePropsBuilder {
  private BooleanModel txBox;

  private CT_ShapeLockingModel spLocks;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualDrawingShapePropsBuilder() {
  }

  public CT_NonVisualDrawingShapePropsBuilder setTxBox(BooleanModel txBox) {
    this.txBox = txBox;
    return this;
  }

  public CT_NonVisualDrawingShapePropsBuilder setSpLocks(CT_ShapeLockingModel spLocks) {
    this.spLocks = spLocks;
    return this;
  }

  public CT_NonVisualDrawingShapePropsBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NonVisualDrawingShapePropsModel build() {
    return new CT_NonVisualDrawingShapePropsModel(this.txBox, this.spLocks, this.extLst);
  }

  public CT_NonVisualDrawingShapePropsBuilder from(CT_NonVisualDrawingShapePropsModel value) {
    this.txBox = value.getTxBox();
    this.spLocks = value.getSpLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
