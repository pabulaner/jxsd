package test.drawingml.main;

public class CTDefaultShapeDefinitionModel {
  private final CTShapePropertiesModel spPr;

  private final CTTextBodyPropertiesModel bodyPr;

  private final CTTextListStyleModel lstStyle;

  private final CTShapeStyleModel style;

  private final CTOfficeArtExtensionListModel extLst;

  public CTDefaultShapeDefinitionModel(CTShapePropertiesModel spPr,
      CTTextBodyPropertiesModel bodyPr, CTTextListStyleModel lstStyle, CTShapeStyleModel style,
      CTOfficeArtExtensionListModel extLst) {
    this.spPr = spPr;
    this.bodyPr = bodyPr;
    this.lstStyle = lstStyle;
    this.style = style;
    this.extLst = extLst;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyPropertiesModel getBodyPr() {
    return this.bodyPr;
  }

  public CTTextListStyleModel getLstStyle() {
    return this.lstStyle;
  }

  public CTShapeStyleModel getStyle() {
    return this.style;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
