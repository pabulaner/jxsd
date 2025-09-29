package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ObjectStyleDefaultsBuilder;

/**
 * This is a generated sequence class.
 */
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

  public ObjectStyleDefaultsBuilder builder() {
    return new ObjectStyleDefaultsBuilder().from(this);
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
