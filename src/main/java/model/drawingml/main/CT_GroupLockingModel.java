package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_GroupLockingModel {
  private final booleanModel noResize;

  private final booleanModel noChangeAspect;

  private final booleanModel noSelect;

  private final booleanModel noUngrp;

  private final booleanModel noGrp;

  private final booleanModel noMove;

  private final booleanModel noRot;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_GroupLockingModel(booleanModel noResize, booleanModel noChangeAspect,
      booleanModel noSelect, booleanModel noUngrp, booleanModel noGrp, booleanModel noMove,
      booleanModel noRot, CT_OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noUngrp = noUngrp;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.extLst = extLst;
  }

  public booleanModel getNoResize() {
    return this.noResize;
  }

  public booleanModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public booleanModel getNoSelect() {
    return this.noSelect;
  }

  public booleanModel getNoUngrp() {
    return this.noUngrp;
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

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
