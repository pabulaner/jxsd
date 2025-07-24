package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class NonVisualDrawingShapePropsModel {
  private final BooleanModel txBox;

  private final ShapeLockingModel spLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualDrawingShapePropsModel(BooleanModel txBox, ShapeLockingModel spLocks,
      OfficeArtExtensionListModel extLst) {
    this.txBox = txBox;
    this.spLocks = spLocks;
    this.extLst = extLst;
  }

  public BooleanModel getTxBox() {
    return this.txBox;
  }

  public ShapeLockingModel getSpLocks() {
    return this.spLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
