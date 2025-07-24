package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.ShapeLockingModel;

public class ShapeLockingBuilder {
  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noEditPoints;

  private BooleanModel noChangeArrowheads;

  private BooleanModel noTextEdit;

  private BooleanModel noSelect;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private BooleanModel noRot;

  private BooleanModel noChangeShapeType;

  private BooleanModel noAdjustHandles;

  private OfficeArtExtensionListModel extLst;

  public ShapeLockingBuilder() {
  }

  public ShapeLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public ShapeLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public ShapeLockingBuilder setNoEditPoints(BooleanModel noEditPoints) {
    this.noEditPoints = noEditPoints;
    return this;
  }

  public ShapeLockingBuilder setNoChangeArrowheads(BooleanModel noChangeArrowheads) {
    this.noChangeArrowheads = noChangeArrowheads;
    return this;
  }

  public ShapeLockingBuilder setNoTextEdit(BooleanModel noTextEdit) {
    this.noTextEdit = noTextEdit;
    return this;
  }

  public ShapeLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public ShapeLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public ShapeLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public ShapeLockingBuilder setNoRot(BooleanModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public ShapeLockingBuilder setNoChangeShapeType(BooleanModel noChangeShapeType) {
    this.noChangeShapeType = noChangeShapeType;
    return this;
  }

  public ShapeLockingBuilder setNoAdjustHandles(BooleanModel noAdjustHandles) {
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
