package test.drawingml.main;

public class CTObjectStyleDefaultsModel {
  private final CTDefaultShapeDefinitionModel spDef;

  private final CTDefaultShapeDefinitionModel lnDef;

  private final CTDefaultShapeDefinitionModel txDef;

  private final CTOfficeArtExtensionListModel extLst;

  public CTObjectStyleDefaultsModel(CTDefaultShapeDefinitionModel spDef,
      CTDefaultShapeDefinitionModel lnDef, CTDefaultShapeDefinitionModel txDef,
      CTOfficeArtExtensionListModel extLst) {
    this.spDef = spDef;
    this.lnDef = lnDef;
    this.txDef = txDef;
    this.extLst = extLst;
  }

  public CTDefaultShapeDefinitionModel getSpDef() {
    return this.spDef;
  }

  public CTDefaultShapeDefinitionModel getLnDef() {
    return this.lnDef;
  }

  public CTDefaultShapeDefinitionModel getTxDef() {
    return this.txDef;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
