package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_GraphicalObjectFrameLockingModel {
  private final booleanModel noDrilldown;

  private final booleanModel noResize;

  private final booleanModel noChangeAspect;

  private final booleanModel noSelect;

  private final booleanModel noGrp;

  private final booleanModel noMove;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_GraphicalObjectFrameLockingModel(booleanModel noDrilldown, booleanModel noResize,
      booleanModel noChangeAspect, booleanModel noSelect, booleanModel noGrp, booleanModel noMove,
      CT_OfficeArtExtensionListModel extLst) {
    this.noDrilldown = noDrilldown;
    this.noResize = noResize;
    this.noChangeAspect = noChangeAspect;
    this.noSelect = noSelect;
    this.noGrp = noGrp;
    this.noMove = noMove;
    this.extLst = extLst;
  }

  public booleanModel getNoDrilldown() {
    return this.noDrilldown;
  }

  public booleanModel getNoResize() {
    return this.noResize;
  }

  public booleanModel getNoChangeAspect() {
    return this.noChangeAspect;
  }

  public booleanModel getNoSelect() {
    return this.noSelect;
  }

  public booleanModel getNoGrp() {
    return this.noGrp;
  }

  public booleanModel getNoMove() {
    return this.noMove;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
