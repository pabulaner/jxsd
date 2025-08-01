package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.GraphicalObjectFrameLockingModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class GraphicalObjectFrameLockingBuilder {
  private BooleanValueModel noDrilldown;

  private BooleanValueModel noResize;

  private BooleanValueModel noChangeAspect;

  private BooleanValueModel noSelect;

  private BooleanValueModel noGrp;

  private BooleanValueModel noMove;

  private OfficeArtExtensionListModel extLst;

  public GraphicalObjectFrameLockingBuilder() {
  }

  public GraphicalObjectFrameLockingBuilder setNoDrilldown(BooleanValueModel noDrilldown) {
    this.noDrilldown = noDrilldown;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoResize(BooleanValueModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoChangeAspect(BooleanValueModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoSelect(BooleanValueModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoGrp(BooleanValueModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoMove(BooleanValueModel noMove) {
    this.noMove = noMove;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public GraphicalObjectFrameLockingModel build() {
    return new GraphicalObjectFrameLockingModel(this.noDrilldown, this.noResize, this.noChangeAspect, this.noSelect, this.noGrp, this.noMove, this.extLst);
  }

  public GraphicalObjectFrameLockingBuilder from(GraphicalObjectFrameLockingModel value) {
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
