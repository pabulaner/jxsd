package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_GraphicalObjectFrameLockingModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_GraphicalObjectFrameLockingBuilder {
  private BooleanModel noDrilldown;

  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noSelect;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_GraphicalObjectFrameLockingBuilder() {
  }

  public CT_GraphicalObjectFrameLockingBuilder setNoDrilldown(BooleanModel noDrilldown) {
    this.noDrilldown = noDrilldown;
    return this;
  }

  public CT_GraphicalObjectFrameLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public CT_GraphicalObjectFrameLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public CT_GraphicalObjectFrameLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public CT_GraphicalObjectFrameLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public CT_GraphicalObjectFrameLockingBuilder setNoMove(BooleanModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public CT_GraphicalObjectFrameLockingBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_GraphicalObjectFrameLockingModel build() {
    return new CT_GraphicalObjectFrameLockingModel(this.noDrilldown, this.noResize, this.noChangeAspect, this.noSelect, this.noGrp, this.noMove, this.extLst);
  }

  public CT_GraphicalObjectFrameLockingBuilder from(CT_GraphicalObjectFrameLockingModel value) {
    this.noDrilldown = value.getNoDrilldown();
    this.noResize = value.getNoResize();
    this.noChangeAspect = value.getNoChangeAspect();
    this.noSelect = value.getNoSelect();
    this.noGrp = value.getNoGrp();
    this.noMove = value.getNoMove();
    this.extLst = value.getExtLst();
    return this;
  }
}
