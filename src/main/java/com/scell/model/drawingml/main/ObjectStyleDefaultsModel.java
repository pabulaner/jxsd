package com.scell.model.drawingml.main;

public class ObjectStyleDefaultsModel {
  private final DefaultShapeDefinitionModel spDef;

  private final DefaultShapeDefinitionModel lnDef;

  private final DefaultShapeDefinitionModel txDef;

  private final OfficeArtExtensionListModel extLst;

  public ObjectStyleDefaultsModel(DefaultShapeDefinitionModel spDef,
      DefaultShapeDefinitionModel lnDef, DefaultShapeDefinitionModel txDef,
      OfficeArtExtensionListModel extLst) {
    this.spDef = spDef;
    this.lnDef = lnDef;
    this.txDef = txDef;
    this.extLst = extLst;
  }

  public DefaultShapeDefinitionModel getSpDef() {
    return this.spDef;
  }

  public DefaultShapeDefinitionModel getLnDef() {
    return this.lnDef;
  }

  public DefaultShapeDefinitionModel getTxDef() {
    return this.txDef;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
