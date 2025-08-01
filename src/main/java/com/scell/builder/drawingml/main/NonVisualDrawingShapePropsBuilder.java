package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.NonVisualDrawingShapePropsModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.ShapeLockingModel;

public class NonVisualDrawingShapePropsBuilder {
  private BooleanValueModel txBox;

  private ShapeLockingModel spLocks;

  private OfficeArtExtensionListModel extLst;

  public NonVisualDrawingShapePropsBuilder() {
  }

  public NonVisualDrawingShapePropsBuilder setTxBox(BooleanValueModel txBox) {
    this.txBox = txBox;
    return this;
  }

  public NonVisualDrawingShapePropsBuilder setSpLocks(ShapeLockingModel spLocks) {
    this.spLocks = spLocks;
    return this;
  }

  public NonVisualDrawingShapePropsBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NonVisualDrawingShapePropsModel build() {
    return new NonVisualDrawingShapePropsModel(this.txBox, this.spLocks, this.extLst);
  }

  public NonVisualDrawingShapePropsBuilder from(NonVisualDrawingShapePropsModel value) {
    this.txBox = value.getTxBox();
    this.spLocks = value.getSpLocks();
    this.extLst = value.getExtLst();
    return this;
  }
}
