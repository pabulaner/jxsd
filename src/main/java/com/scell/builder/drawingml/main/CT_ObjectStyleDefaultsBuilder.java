package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_DefaultShapeDefinitionModel;
import com.scell.model.drawingml.main.CT_ObjectStyleDefaultsModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;

public class CT_ObjectStyleDefaultsBuilder {
  private CT_DefaultShapeDefinitionModel spDef;

  private CT_DefaultShapeDefinitionModel lnDef;

  private CT_DefaultShapeDefinitionModel txDef;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_ObjectStyleDefaultsBuilder() {
  }

  public CT_ObjectStyleDefaultsBuilder setSpDef(CT_DefaultShapeDefinitionModel spDef) {
    this.spDef = spDef;
    return this;
  }

  public CT_ObjectStyleDefaultsBuilder setLnDef(CT_DefaultShapeDefinitionModel lnDef) {
    this.lnDef = lnDef;
    return this;
  }

  public CT_ObjectStyleDefaultsBuilder setTxDef(CT_DefaultShapeDefinitionModel txDef) {
    this.txDef = txDef;
    return this;
  }

  public CT_ObjectStyleDefaultsBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ObjectStyleDefaultsModel build() {
    return new CT_ObjectStyleDefaultsModel(this.spDef, this.lnDef, this.txDef, this.extLst);
  }

  public CT_ObjectStyleDefaultsBuilder from(CT_ObjectStyleDefaultsModel value) {
    this.spDef = value.getSpDef();
    this.lnDef = value.getLnDef();
    this.txDef = value.getTxDef();
    this.extLst = value.getExtLst();
    return this;
  }
}
