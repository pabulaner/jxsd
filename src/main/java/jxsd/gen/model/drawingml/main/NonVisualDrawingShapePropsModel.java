package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.NonVisualDrawingShapePropsBuilder;

/**
 * This is a generated sequence class.
 */
public class NonVisualDrawingShapePropsModel {
  private final boolean txBox;

  private final ShapeLockingModel spLocks;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualDrawingShapePropsModel(boolean txBox, ShapeLockingModel spLocks,
      OfficeArtExtensionListModel extLst) {
    this.txBox = txBox;
    this.spLocks = spLocks;
    this.extLst = extLst;
  }

  public NonVisualDrawingShapePropsBuilder builder() {
    return new NonVisualDrawingShapePropsBuilder().from(this);
  }

  public boolean getTxBox() {
    return this.txBox;
  }

  public ShapeLockingModel getSpLocks() {
    return this.spLocks;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
