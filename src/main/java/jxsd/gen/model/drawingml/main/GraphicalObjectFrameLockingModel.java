package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GraphicalObjectFrameLockingBuilder;

/**
 * This is a generated sequence class.
 */
public class GraphicalObjectFrameLockingModel {
  private final boolean noDrilldown;

  private final boolean noResize;

  private final boolean noChangeAspect;

  private final boolean noSelect;

  private final boolean noGrp;

  private final boolean noMove;

  private final OfficeArtExtensionListModel extLst;

  public GraphicalObjectFrameLockingModel(boolean noDrilldown, boolean noResize,
      boolean noChangeAspect, boolean noSelect, boolean noGrp, boolean noMove,
      OfficeArtExtensionListModel extLst) {
    this.noDrilldown = noDrilldown;
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.extLst = extLst;
  }

  public GraphicalObjectFrameLockingBuilder builder() {
    return new GraphicalObjectFrameLockingBuilder().from(this);
  }

  public boolean getNoDrilldown() {
    return this.noDrilldown;
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

  public boolean getNoGrp() {
    return this.noGrp;
  }

  public boolean getNoMove() {
    return this.noMove;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
