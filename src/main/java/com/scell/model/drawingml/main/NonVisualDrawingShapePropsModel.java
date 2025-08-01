package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class NonVisualDrawingShapePropsModel {
  private final BooleanValueModel txBox;

  private final ShapeLockingModel spLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualDrawingShapePropsModel(BooleanValueModel txBox, ShapeLockingModel spLocks,
      OfficeArtExtensionListModel extLst) {
    this.txBox = txBox;
    this.spLocks = spLocks;
    this.extLst = extLst;
  }

  public BooleanValueModel getTxBox() {
    return this.txBox;
  }

  public ShapeLockingModel getSpLocks() {
    return this.spLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
