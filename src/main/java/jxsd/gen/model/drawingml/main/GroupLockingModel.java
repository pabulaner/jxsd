package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GroupLockingBuilder;

/**
 * This is a generated sequence class.
 */
public class GroupLockingModel {
  private final boolean noResize;

  private final boolean noChangeAspect;

  private final boolean noSelect;

  private final boolean noUngrp;

  private final boolean noGrp;

  private final boolean noMove;

  private final boolean noRot;

  private final OfficeArtExtensionListModel extLst;

  public GroupLockingModel(boolean noResize, boolean noChangeAspect, boolean noSelect,
      boolean noUngrp, boolean noGrp, boolean noMove, boolean noRot,
      OfficeArtExtensionListModel extLst) {
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noUngrp = noUngrp;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.noRot = noRot;
    this.extLst = extLst;
  }

  public GroupLockingBuilder builder() {
    return new GroupLockingBuilder().from(this);
  }

  public boolean getNoResize() {
    return this.noResize;
  }

  public boolean getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public boolean getNoSelect() {
    return this.noSelect;
  }

  public boolean getNoUngrp() {
    return this.noUngrp;
  }

  public boolean getNoGrp() {
    return this.noGrp;
  }

  public boolean getNoMove() {
    return this.noMove;
  }

  public boolean getNoRot() {
    return this.noRot;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
