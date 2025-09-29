package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PictureLockingModel;

/**
 * This is a generated sequence class.
 */
public class PictureLockingBuilder {
  private boolean noResize;

  private boolean noChangeAspect;

  private boolean noEditPoints;

  private boolean noChangeArrowheads;

  private boolean noCrop;

  private boolean noSelect;

  private boolean noGrp;

  private boolean noMove;

  private boolean noRot;

  private boolean noChangeShapeType;

  private boolean noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public PictureLockingBuilder() {
  }

  public PictureLockingBuilder setNoResize(boolean noResize) {
    this.noResize = noResize;
    return this;
  }

  public PictureLockingBuilder setNoChangeAspect(boolean noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public PictureLockingBuilder setNoEditPoints(boolean noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public PictureLockingBuilder setNoChangeArrowheads(boolean noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public PictureLockingBuilder setNoCrop(boolean noCrop) {
    this.noCrop = noCrop;
    return this;
  }

  public PictureLockingBuilder setNoSelect(boolean noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public PictureLockingBuilder setNoGrp(boolean noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public PictureLockingBuilder setNoMove(boolean noMove) {
    this.noMove = noMove;
    return this;
  }

  public PictureLockingBuilder setNoRot(boolean noRot) {
    this.noRot = noRot;
    return this;
  }

  public PictureLockingBuilder setNoChangeShapeType(boolean noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public PictureLockingBuilder setNoAdjustHandles(boolean noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public PictureLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PictureLockingBuilder from(PictureLockingModel value) {
    this.noResize = value.getNoResize();
    this.noChangeAspect = value.getNoChangeAspect();
    this.noEditPoints = value.getNoEditPoints();
    this.noChangeArrowheads = value.getNoChangeArrowheads();
    this.noCrop = value.getNoCrop();
    this.noSelect = value.getNoSelect();
    this.noGrp = value.getNoGrp();
    this.noMove = value.getNoMove();
    this.noRot = value.getNoRot();
    this.noChangeShapeType = value.getNoChangeShapeType();
    this.noAdjustHandles = value.getNoAdjustHandles();
    this.extLst = value.getExtLst();
    return this;
  }

  public PictureLockingModel build() {
    return new PictureLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noCrop, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
  }
}
