package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GroupLockingModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class GroupLockingBuilder {
  private boolean noResize;

  private boolean noChangeAspect;

  private boolean noSelect;

  private boolean noUngrp;

  private boolean noGrp;

  private boolean noMove;

  private boolean noRot;

  private OfficeArtExtensionListModel extLst;

  public GroupLockingBuilder() {
  }

  public GroupLockingBuilder setNoResize(boolean noResize) {
    this.noResize = noResize;
    return this;
  }

  public GroupLockingBuilder setNoChangeAspect(boolean noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public GroupLockingBuilder setNoSelect(boolean noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public GroupLockingBuilder setNoUngrp(boolean noUngrp) {
    this.noUngrp = noUngrp;
    return this;
  }

  public GroupLockingBuilder setNoGrp(boolean noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public GroupLockingBuilder setNoMove(boolean noMove) {
    this.noMove = noMove;
    return this;
  }

  public GroupLockingBuilder setNoRot(boolean noRot) {
    this.noRot = noRot;
    return this;
  }

  public GroupLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
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

  public GroupLockingModel build() {
    return new GroupLockingModel(this.noResize, this.noChangeAspect, this.noSelect, this.noUngrp, this.noGrp, this.noMove, this.noRot, this.extLst);
  }
}
