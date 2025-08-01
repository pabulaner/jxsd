package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class GraphicalObjectFrameLockingModel {
  private final BooleanValueModel noDrilldown;

  private final BooleanValueModel noResize;

  private final BooleanValueModel noChangeAspect;

  private final BooleanValueModel noSelect;

  private final BooleanValueModel noGrp;

  private final BooleanValueModel noMove;

  private final OfficeArtExtensionListModel extLst;

  public GraphicalObjectFrameLockingModel(BooleanValueModel noDrilldown, BooleanValueModel noResize,
      BooleanValueModel noChangeAspect, BooleanValueModel noSelect, BooleanValueModel noGrp,
      BooleanValueModel noMove, OfficeArtExtensionListModel extLst) {
    this.noDrilldown = noDrilldown;
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.extLst = extLst;
  }

  public BooleanValueModel getNoDrilldown() {
    return this.noDrilldown;
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

  public BooleanValueModel getNoGrp() {
    return this.noGrp;
  }

  public BooleanValueModel getNoMove() {
    return this.noMove;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
