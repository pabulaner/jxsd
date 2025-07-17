package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class CT_GroupLockingModel {
  private final BooleanModel noResize;

  private final BooleanModel noChangeAspect;

  private final BooleanModel noSelect;

  private final BooleanModel noUngrp;

  private final BooleanModel noGrp;

  private final BooleanModel noMove;

  private final BooleanModel noRot;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_GroupLockingModel(BooleanModel noResize, BooleanModel noChangeAspect,
      BooleanModel noSelect, BooleanModel noUngrp, BooleanModel noGrp, BooleanModel noMove,
      BooleanModel noRot, CT_OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noUngrp = noUngrp;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.extLst = extLst;
  }

  public BooleanModel getNoResize() {
    return this.noResize;
  }

  public BooleanModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public BooleanModel getNoSelect() {
    return this.noSelect;
  }

  public BooleanModel getNoUngrp() {
    return this.noUngrp;
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

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
