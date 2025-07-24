package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.GraphicalObjectFrameLockingModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class GraphicalObjectFrameLockingBuilder {
  private BooleanModel noDrilldown;

  private BooleanModel noResize;

  private BooleanModel noChangeAspect;

  private BooleanModel noSelect;

  private BooleanModel noGrp;

  private BooleanModel noMove;

  private OfficeArtExtensionListModel extLst;

  public GraphicalObjectFrameLockingBuilder() {
  }

  public GraphicalObjectFrameLockingBuilder setNoDrilldown(BooleanModel noDrilldown) {
    this.noDrilldown = noDrilldown;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoResize(BooleanModel noResize) {
    this.noResize = noResize;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoChangeAspect(BooleanModel noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoSelect(BooleanModel noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoGrp(BooleanModel noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoMove(BooleanModel noMove) {
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
