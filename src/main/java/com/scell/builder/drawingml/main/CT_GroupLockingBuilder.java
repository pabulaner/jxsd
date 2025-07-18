package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_GroupLockingModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_GroupLockingBuilder {
  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noSelect;

  private BooleanModel noUngrp;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private BooleanModel noRot;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_GroupLockingBuilder() {
  }

  public CT_GroupLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public CT_GroupLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public CT_GroupLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public CT_GroupLockingBuilder setNoUngrp(BooleanModel noUngrp) {
    this.noUngrp = noUngrp;
    return this;
  }

  public CT_GroupLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public CT_GroupLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public CT_GroupLockingBuilder setNoRot(BooleanModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public CT_GroupLockingBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_GroupLockingModel build() {
    return new CT_GroupLockingModel(this.noResize, this.noChangeAspect, this.noSelect, this.noUngrp, this.noGrp, this.noMove, this.noRot, this.extLst);
  }

  public CT_GroupLockingBuilder from(CT_GroupLockingModel value) {
    this.noResize = value.getNoResize();
    this.noChangeAspect = value.getNoChangeAspect();
    this.noSelect = value.getNoSelect();
    this.noUngrp = value.getNoUngrp();
    this.noGrp = value.getNoGrp();
    this.noMove = value.getNoMove();
    this.noRot = value.getNoRot();
    this.extLst = value.getExtLst();
    return this;
  }
}
