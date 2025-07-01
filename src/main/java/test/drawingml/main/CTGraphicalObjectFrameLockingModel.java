package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTGraphicalObjectFrameLockingModel {
  private final BooleanModel noDrilldown;

  private final BooleanModel noResize;

  private final BooleanModel noChangeAspect;

  private final BooleanModel noSelect;

  private final BooleanModel noGrp;

  private final BooleanModel noMove;

  private final CTOfficeArtExtensionListModel extLst;

  public CTGraphicalObjectFrameLockingModel(BooleanModel noDrilldown, BooleanModel noResize,
      BooleanModel noChangeAspect, BooleanModel noSelect, BooleanModel noGrp, BooleanModel noMove,
      CTOfficeArtExtensionListModel extLst) {
    this.noDrilldown = noDrilldown;
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.extLst = extLst;
  }

  public BooleanModel getNoDrilldown() {
    return this.noDrilldown;
  }

  public BooleanModel getNoResize() {
    return this.noResize;
  }

  public BooleanModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public BooleanModel getNoSelect() {
    return this.noSelect;
  }

  public BooleanModel getNoGrp() {
    return this.noGrp;
  }

  public BooleanModel getNoMove() {
    return this.noMove;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
