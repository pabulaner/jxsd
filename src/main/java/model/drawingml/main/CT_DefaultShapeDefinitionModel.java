package model.drawingml.main;

public class CT_DefaultShapeDefinitionModel {
  private final CT_ShapePropertiesModel spPr;

  private final CT_TextBodyPropertiesModel bodyPr;

  private final CT_TextListStyleModel lstStyle;

  private final CT_ShapeStyleModel style;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_DefaultShapeDefinitionModel(CT_ShapePropertiesModel spPr,
      CT_TextBodyPropertiesModel bodyPr, CT_TextListStyleModel lstStyle, CT_ShapeStyleModel style,
      CT_OfficeArtExtensionListModel extLst) {
    this.spPr = spPr;
    this.bodyPr = bodyPr;
    this.lstStyle = lstStyle;
    this.style = style;
    this.extLst = extLst;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_TextBodyPropertiesModel getBodyPr() {
    return this.bodyPr;
  }

  public CT_TextListStyleModel getLstStyle() {
    return this.lstStyle;
  }

  public CT_ShapeStyleModel getStyle() {
    return this.style;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
