package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class ConnectorLockingModel {
  private final BooleanModel noResize;

  private final BooleanModel noChangeAspect;

  private final BooleanModel noEditPoints;

  private final BooleanModel noChangeArrowheads;

  private final BooleanModel noSelect;

  private final BooleanModel noGrp;

  private final BooleanModel noMove;

  private final BooleanModel noRot;

  private final BooleanModel noChangeShapeType;

  private final BooleanModel noAdjustHandles;

  private final OfficeArtExtensionListModel extLst;

  public ConnectorLockingModel(BooleanModel noResize, BooleanModel noChangeAspect,
      BooleanModel noEditPoints, BooleanModel noChangeArrowheads, BooleanModel noSelect,
      BooleanModel noGrp, BooleanModel noMove, BooleanModel noRot, BooleanModel noChangeShapeType,
      BooleanModel noAdjustHandles, OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noEditPoints = noEditPoints;
    this.noChangeArrowheads = noChangeArrowheads;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.noChangeShapeType = noChangeShapeType;
    this.noAdjustHandles = noAdjustHandles;
    this.extLst = extLst;
  }

  public BooleanModel getNoResize() {
    return this.noResize;
  }

  public BooleanModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public BooleanModel getNoEditPoints() {
    return this.noEditPoints;
  }

  public BooleanModel getNoChangeArrowheads() {
    return this.noChangeArrowheads;
  }

  public BooleanModel getNoSelect() {
    return this.noSelect;
  }

  public BooleanModel getNoGrp() {
    return this.noGrp;
  }

  public BooleanModel getNoMove() {
    return this.noMove;
  }

  public BooleanModel getNoRot() {
    return this.noRot;
  }

  public BooleanModel getNoChangeShapeType() {
    return this.noChangeShapeType;
  }

  public BooleanModel getNoAdjustHandles() {
    return this.noAdjustHandles;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
