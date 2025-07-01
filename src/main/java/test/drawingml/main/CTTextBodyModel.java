package test.drawingml.main;

public class CTTextBodyModel {
  private final CTTextBodyPropertiesModel bodyPr;

  private final CTTextListStyleModel lstStyle;

  private final CTTextParagraphModel p;

  public CTTextBodyModel(CTTextBodyPropertiesModel bodyPr, CTTextListStyleModel lstStyle,
      CTTextParagraphModel p) {
    this.bodyPr = bodyPr;
    this.lstStyle = lstStyle;
    this.p = p;
  }

  public CTTextBodyPropertiesModel getBodyPr() {
    return this.bodyPr;
  }

  public CTTextListStyleModel getLstStyle() {
    return this.lstStyle;
  }

  public CTTextParagraphModel getP() {
    return this.p;
  }
}
