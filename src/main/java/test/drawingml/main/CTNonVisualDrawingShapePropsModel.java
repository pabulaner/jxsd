package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTNonVisualDrawingShapePropsModel {
  private final BooleanModel txBox;

  private final CTShapeLockingModel spLocks;

  private final CTOfficeArtExtensionListModel extLst;

  public CTNonVisualDrawingShapePropsModel(BooleanModel txBox, CTShapeLockingModel spLocks,
      CTOfficeArtExtensionListModel extLst) {
    this.txBox = txBox;
    this.spLocks = spLocks;
    this.extLst = extLst;
  }

  public BooleanModel getTxBox() {
    return this.txBox;
  }

  public CTShapeLockingModel getSpLocks() {
    return this.spLocks;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
