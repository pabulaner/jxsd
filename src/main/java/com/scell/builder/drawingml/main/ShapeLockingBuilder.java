package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.ShapeLockingModel;

public class ShapeLockingBuilder {
  private BooleanValueModel noResize;

  private BooleanValueModel noChangeAspect;

  private BooleanValueModel noEditPoints;

  private BooleanValueModel noChangeArrowheads;

  private BooleanValueModel noTextEdit;

  private BooleanValueModel noSelect;

  private BooleanValueModel noGrp;

  private BooleanValueModel noMove;

  private BooleanValueModel noRot;

  private BooleanValueModel noChangeShapeType;

  private BooleanValueModel noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public ShapeLockingBuilder() {
  }

  public ShapeLockingBuilder setNoResize(BooleanValueModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public ShapeLockingBuilder setNoChangeAspect(BooleanValueModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public ShapeLockingBuilder setNoEditPoints(BooleanValueModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public ShapeLockingBuilder setNoChangeArrowheads(BooleanValueModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public ShapeLockingBuilder setNoTextEdit(BooleanValueModel noTextEdit) {
    this.noTextEdit = noTextEdit;
    return this;
  }

  public ShapeLockingBuilder setNoSelect(BooleanValueModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public ShapeLockingBuilder setNoGrp(BooleanValueModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public ShapeLockingBuilder setNoMove(BooleanValueModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public ShapeLockingBuilder setNoRot(BooleanValueModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public ShapeLockingBuilder setNoChangeShapeType(BooleanValueModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public ShapeLockingBuilder setNoAdjustHandles(BooleanValueModel noAdjustHandles) {
    this.noAdjustHandles = noAdjustHandles;
    return this;
  }

  public ShapeLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ShapeLockingModel build() {
    return new ShapeLockingModel(this.noResize, this.noChangeAspect, this.noEditPoints, this.noChangeArrowheads, this.noTextEdit, this.noSelect, this.noGrp, this.noMove, this.noRot, this.noChangeShapeType, this.noAdjustHandles, this.extLst);
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
}
