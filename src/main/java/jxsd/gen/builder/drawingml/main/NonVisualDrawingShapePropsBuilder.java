package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.NonVisualDrawingShapePropsModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.ShapeLockingModel;

/**
 * This is a generated sequence class.
 */
public class NonVisualDrawingShapePropsBuilder {
  private boolean txBox;

  private ShapeLockingModel spLocks;

  private OfficeArtExtensionListModel extLst;

  public NonVisualDrawingShapePropsBuilder() {
  }

  public NonVisualDrawingShapePropsBuilder setTxBox(boolean txBox) {
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

  public NonVisualDrawingShapePropsBuilder from(NonVisualDrawingShapePropsModel value) {
    this.txBox = value.getTxBox();
    this.spLocks = value.getSpLocks();
    this.extLst = value.getExtLst();
    return this;
  }

  public NonVisualDrawingShapePropsModel build() {
    return new NonVisualDrawingShapePropsModel(this.txBox, this.spLocks, this.extLst);
  }
}
