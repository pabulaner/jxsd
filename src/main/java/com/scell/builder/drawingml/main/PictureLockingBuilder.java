package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PictureLockingModel;

public class PictureLockingBuilder {
  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noEditPoints;

  private BooleanModel noChangeArrowheads;

  private BooleanModel noCrop;

  private BooleanModel noSelect;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private BooleanModel noRot;

  private BooleanModel noChangeShapeType;

  private BooleanModel noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public PictureLockingBuilder() {
  }

  public PictureLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public PictureLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public PictureLockingBuilder setNoEditPoints(BooleanModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public PictureLockingBuilder setNoChangeArrowheads(BooleanModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public PictureLockingBuilder setNoCrop(BooleanModel noCrop) {
    this.noCrop = noCrop;
    return this;
  }

  public PictureLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public PictureLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public PictureLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public PictureLockingBuilder setNoRot(BooleanModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public PictureLockingBuilder setNoChangeShapeType(BooleanModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public PictureLockingBuilder setNoAdjustHandles(BooleanModel noAdjustHandles) {
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
