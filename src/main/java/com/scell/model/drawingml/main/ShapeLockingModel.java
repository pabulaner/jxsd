package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class ShapeLockingModel {
  private final BooleanValueModel noResize;

  private final BooleanValueModel noChangeAspect;

  private final BooleanValueModel noEditPoints;

  private final BooleanValueModel noChangeArrowheads;

  private final BooleanValueModel noTextEdit;

  private final BooleanValueModel noSelect;

  private final BooleanValueModel noGrp;

  private final BooleanValueModel noMove;

  private final BooleanValueModel noRot;

  private final BooleanValueModel noChangeShapeType;

  private final BooleanValueModel noAdjustHandles;

  private final OfficeArtExtensionListModel extLst;

  public ShapeLockingModel(BooleanValueModel noResize, BooleanValueModel noChangeAspect,
      BooleanValueModel noEditPoints, BooleanValueModel noChangeArrowheads,
      BooleanValueModel noTextEdit, BooleanValueModel noSelect, BooleanValueModel noGrp,
      BooleanValueModel noMove, BooleanValueModel noRot, BooleanValueModel noChangeShapeType,
      BooleanValueModel noAdjustHandles, OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noEditPoints = noEditPoints;
    this.noChangeArrowheads = noChangeArrowheads;
    this.noTextEdit = noTextEdit;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.noChangeShapeType = noChangeShapeType;
    this.noAdjustHandles = noAdjustHandles;
    this.extLst = extLst;
  }

  public BooleanValueModel getNoResize() {
    return this.noResize;
  }

  public BooleanValueModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public BooleanValueModel getNoEditPoints() {
    return this.noEditPoints;
  }

  public BooleanValueModel getNoChangeArrowheads() {
    return this.noChangeArrowheads;
  }

  public BooleanValueModel getNoTextEdit() {
    return this.noTextEdit;
  }

  public BooleanValueModel getNoSelect() {
    return this.noSelect;
  }

  public BooleanValueModel getNoGrp() {
    return this.noGrp;
  }

  public BooleanValueModel getNoMove() {
    return this.noMove;
  }

  public BooleanValueModel getNoRot() {
    return this.noRot;
  }

  public BooleanValueModel getNoChangeShapeType() {
    return this.noChangeShapeType;
  }

  public BooleanValueModel getNoAdjustHandles() {
    return this.noAdjustHandles;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
