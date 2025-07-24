package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.GroupLockingModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class GroupLockingBuilder {
  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noSelect;

  private BooleanModel noUngrp;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private BooleanModel noRot;

  private OfficeArtExtensionListModel extLst;

  public GroupLockingBuilder() {
  }

  public GroupLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public GroupLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public GroupLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public GroupLockingBuilder setNoUngrp(BooleanModel noUngrp) {
    this.noUngrp = noUngrp;
    return this;
  }

  public GroupLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public GroupLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public GroupLockingBuilder setNoRot(BooleanModel noRot) {
    this.noRot = noRot;
    return this;
  }

  public GroupLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public GroupLockingModel build() {
    return new GroupLockingModel(this.noResize, this.noChangeAspect, this.noSelect, this.noUngrp, this.noGrp, this.noMove, this.noRot, this.extLst);
  }

  public GroupLockingBuilder from(GroupLockingModel value) {
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
