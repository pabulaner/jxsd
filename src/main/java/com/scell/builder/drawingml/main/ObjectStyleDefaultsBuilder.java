package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DefaultShapeDefinitionModel;
import com.scell.model.drawingml.main.ObjectStyleDefaultsModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class ObjectStyleDefaultsBuilder {
  private DefaultShapeDefinitionModel spDef;

  private DefaultShapeDefinitionModel lnDef;

  private DefaultShapeDefinitionModel txDef;

  private OfficeArtExtensionListModel extLst;

  public ObjectStyleDefaultsBuilder() {
  }

  public ObjectStyleDefaultsBuilder setSpDef(DefaultShapeDefinitionModel spDef) {
    this.spDef = spDef;
    return this;
  }

  public ObjectStyleDefaultsBuilder setLnDef(DefaultShapeDefinitionModel lnDef) {
    this.lnDef = lnDef;
    return this;
  }

  public ObjectStyleDefaultsBuilder setTxDef(DefaultShapeDefinitionModel txDef) {
    this.txDef = txDef;
    return this;
  }

  public ObjectStyleDefaultsBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ObjectStyleDefaultsModel build() {
    return new ObjectStyleDefaultsModel(this.spDef, this.lnDef, this.txDef, this.extLst);
  }

  public ObjectStyleDefaultsBuilder from(ObjectStyleDefaultsModel value) {
    this.spDef = value.getSpDef();
    this.lnDef = value.getLnDef();
    this.txDef = value.getTxDef();
    this.extLst = value.getExtLst();
    return this;
  }
}
