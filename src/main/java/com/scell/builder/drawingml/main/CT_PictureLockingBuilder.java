package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.CT_PictureLockingModel;

public class CT_PictureLockingBuilder {
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

  private CT_OfficeArtExtensionListModel extLst;

  public CT_PictureLockingBuilder() {
  }

  public CT_PictureLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public CT_PictureLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public CT_PictureLockingBuilder setNoEditPoints(BooleanModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public CT_PictureLockingBuilder setNoChangeArrowheads(BooleanModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public CT_PictureLockingBuilder setNoCrop(BooleanModel noCrop) {
    this.noCrop = noCrop;
    return this;
  }

  public CT_PictureLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public CT_PictureLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public CT_PictureLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public CT_PictureLockingBuilder setNoRot(BooleanModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public CT_PictureLockingBuilder setNoChangeShapeType(BooleanModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public CT_PictureLockingBuilder setNoAdjustHandles(BooleanModel noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public CT_PictureLockingBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_PictureLockingModel build() {
    return new CT_PictureLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noCrop, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
  }

  public CT_PictureLockingBuilder from(CT_PictureLockingModel value) {
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
