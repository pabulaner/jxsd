package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PictureLockingModel;

public class PictureLockingBuilder {
  private BooleanValueModel noResize;

  private BooleanValueModel noChangeAspect;

  private BooleanValueModel noEditPoints;

  private BooleanValueModel noChangeArrowheads;

  private BooleanValueModel noCrop;

  private BooleanValueModel noSelect;

  private BooleanValueModel noGrp;

  private BooleanValueModel noMove;

  private BooleanValueModel noRot;

  private BooleanValueModel noChangeShapeType;

  private BooleanValueModel noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public PictureLockingBuilder() {
  }

  public PictureLockingBuilder setNoResize(BooleanValueModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public PictureLockingBuilder setNoChangeAspect(BooleanValueModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public PictureLockingBuilder setNoEditPoints(BooleanValueModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public PictureLockingBuilder setNoChangeArrowheads(BooleanValueModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public PictureLockingBuilder setNoCrop(BooleanValueModel noCrop) {
    this.noCrop = noCrop;
    return this;
  }

  public PictureLockingBuilder setNoSelect(BooleanValueModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public PictureLockingBuilder setNoGrp(BooleanValueModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public PictureLockingBuilder setNoMove(BooleanValueModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public PictureLockingBuilder setNoRot(BooleanValueModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public PictureLockingBuilder setNoChangeShapeType(BooleanValueModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public PictureLockingBuilder setNoAdjustHandles(BooleanValueModel noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public PictureLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PictureLockingModel build() {
    return new PictureLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noCrop, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
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
}
