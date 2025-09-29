package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.ShapeLockingModel;

/**
 * This is a generated sequence class.
 */
public class ShapeLockingBuilder {
  private boolean noResize;

  private boolean noChangeAspect;

  private boolean noEditPoints;

  private boolean noChangeArrowheads;

  private boolean noTextEdit;

  private boolean noSelect;

  private boolean noGrp;

  private boolean noMove;

  private boolean noRot;

  private boolean noChangeShapeType;

  private boolean noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public ShapeLockingBuilder() {
  }

  public ShapeLockingBuilder setNoResize(boolean noResize) {
    this.noResize = noResize;
    return this;
  }

  public ShapeLockingBuilder setNoChangeAspect(boolean noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public ShapeLockingBuilder setNoEditPoints(boolean noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public ShapeLockingBuilder setNoChangeArrowheads(boolean noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public ShapeLockingBuilder setNoTextEdit(boolean noTextEdit) {
    this.noTextEdit = noTextEdit;
    return this;
  }

  public ShapeLockingBuilder setNoSelect(boolean noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public ShapeLockingBuilder setNoGrp(boolean noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public ShapeLockingBuilder setNoMove(boolean noMove) {
    this.noMove = noMove;
    return this;
  }

  public ShapeLockingBuilder setNoRot(boolean noRot) {
    this.noRot = noRot;
    return this;
  }

  public ShapeLockingBuilder setNoChangeShapeType(boolean noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public ShapeLockingBuilder setNoAdjustHandles(boolean noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public ShapeLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ShapeLockingBuilder from(ShapeLockingModel value) {
    this.noResize = value.getNoResize();
    this.noChangeAspect = value.getNoChangeAspect();
    this.noEditPoints = value.getNoEditPoints();
    this.noChangeArrowheads = value.getNoChangeArrowheads();
    this.noTextEdit = value.getNoTextEdit();
    this.noSelect = value.getNoSelect();
    this.noGrp = value.getNoGrp();
    this.noMove = value.getNoMove();
    this.noRot = value.getNoRot();
    this.noChangeShapeType = value.getNoChangeShapeType();
    this.noAdjustHandles = value.getNoAdjustHandles();
    this.extLst = value.getExtLst();
    return this;
  }

  public ShapeLockingModel build() {
    return new ShapeLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noTextEdit, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
  }
}
