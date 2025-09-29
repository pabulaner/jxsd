package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GraphicalObjectFrameLockingModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class GraphicalObjectFrameLockingBuilder {
  private boolean noDrilldown;

  private boolean noResize;

  private boolean noChangeAspect;

  private boolean noSelect;

  private boolean noGrp;

  private boolean noMove;

  private OfficeArtExtensionListModel extLst;

  public GraphicalObjectFrameLockingBuilder() {
  }

  public GraphicalObjectFrameLockingBuilder setNoDrilldown(boolean noDrilldown) {
    this.noDrilldown = noDrilldown;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoResize(boolean noResize) {
    this.noResize = noResize;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoChangeAspect(boolean noChangeAspect) {
    this.noChangeAspect = noChangeAspect;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoSelect(boolean noSelect) {
    this.noSelect = noSelect;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoGrp(boolean noGrp) {
    this.noGrp = noGrp;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setNoMove(boolean noMove) {
    this.noMove = noMove;
    return this;
  }

  public GraphicalObjectFrameLockingBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
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

  public GraphicalObjectFrameLockingModel build() {
    return new GraphicalObjectFrameLockingModel(this.noDrilldown, this.noResize, this.noChangeAspect, this.noSelect, this.noGrp, this.noMove, this.extLst);
  }
}
