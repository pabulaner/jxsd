package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_ConnectorLockingModel {
  private final booleanModel noResize;

  private final booleanModel noChangeAspect;

  private final booleanModel noEditPoints;

  private final booleanModel noChangeArrowheads;

  private final booleanModel noSelect;

  private final booleanModel noGrp;

  private final booleanModel noMove;

  private final booleanModel noRot;

  private final booleanModel noChangeShapeType;

  private final booleanModel noAdjustHandles;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_ConnectorLockingModel(booleanModel noResize, booleanModel noChangeAspect,
      booleanModel noEditPoints, booleanModel noChangeArrowheads, booleanModel noSelect,
      booleanModel noGrp, booleanModel noMove, booleanModel noRot, booleanModel noChangeShapeType,
      booleanModel noAdjustHandles, CT_OfficeArtExtensionListModel extLst) {
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

  public booleanModel getNoResize() {
    return this.noResize;
  }

  public booleanModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public booleanModel getNoEditPoints() {
    return this.noEditPoints;
  }

  public booleanModel getNoChangeArrowheads() {
    return this.noChangeArrowheads;
  }

  public booleanModel getNoSelect() {
    return this.noSelect;
  }

  public booleanModel getNoGrp() {
    return this.noGrp;
  }

  public booleanModel getNoMove() {
    return this.noMove;
  }

  public booleanModel getNoRot() {
    return this.noRot;
  }

  public booleanModel getNoChangeShapeType() {
    return this.noChangeShapeType;
  }

  public booleanModel getNoAdjustHandles() {
    return this.noAdjustHandles;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
