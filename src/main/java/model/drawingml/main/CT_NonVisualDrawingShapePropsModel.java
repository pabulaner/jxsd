package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_NonVisualDrawingShapePropsModel {
  private final booleanModel txBox;

  private final CT_ShapeLockingModel spLocks;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualDrawingShapePropsModel(booleanModel txBox, CT_ShapeLockingModel spLocks,
      CT_OfficeArtExtensionListModel extLst) {
    this.txBox = txBox;
    this.spLocks = spLocks;
    this.extLst = extLst;
  }

  public booleanModel getTxBox() {
    return this.txBox;
  }

  public CT_ShapeLockingModel getSpLocks() {
    return this.spLocks;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
