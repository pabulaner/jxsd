package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class GroupLockingModel {
  private final BooleanValueModel noResize;

  private final BooleanValueModel noChangeAspect;

  private final BooleanValueModel noSelect;

  private final BooleanValueModel noUngrp;

  private final BooleanValueModel noGrp;

  private final BooleanValueModel noMove;

  private final BooleanValueModel noRot;

  private final OfficeArtExtensionListModel extLst;

  public GroupLockingModel(BooleanValueModel noResize, BooleanValueModel noChangeAspect,
      BooleanValueModel noSelect, BooleanValueModel noUngrp, BooleanValueModel noGrp,
      BooleanValueModel noMove, BooleanValueModel noRot, OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noUngrp = noUngrp;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.extLst = extLst;
  }

  public BooleanValueModel getNoResize() {
    return this.noResize;
  }

  public BooleanValueModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public BooleanValueModel getNoSelect() {
    return this.noSelect;
  }

  public BooleanValueModel getNoUngrp() {
    return this.noUngrp;
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

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
