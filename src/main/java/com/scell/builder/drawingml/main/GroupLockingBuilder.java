package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.GroupLockingModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class GroupLockingBuilder {
  private BooleanValueModel noResize;

  private BooleanValueModel noChangeAspect;

  private BooleanValueModel noSelect;

  private BooleanValueModel noUngrp;

  private BooleanValueModel noGrp;

  private BooleanValueModel noMove;

  private BooleanValueModel noRot;

  private OfficeArtExtensionListModel extLst;

  public GroupLockingBuilder() {
  }

  public GroupLockingBuilder setNoResize(BooleanValueModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public GroupLockingBuilder setNoChangeAspect(BooleanValueModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public GroupLockingBuilder setNoSelect(BooleanValueModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public GroupLockingBuilder setNoUngrp(BooleanValueModel noUngrp) {
    this.noUngrp = noUngrp;
    return this;
  }

  public GroupLockingBuilder setNoGrp(BooleanValueModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public GroupLockingBuilder setNoMove(BooleanValueModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public GroupLockingBuilder setNoRot(BooleanValueModel noRot) {
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
