package test.drawingml.main;

import test.XMLSchema.StringModel;

public class CTTextFieldModel {
  private final StringModel type;

  private final STGuidModel id;

  private final CTTextCharacterPropertiesModel rPr;

  private final CTTextParagraphPropertiesModel pPr;

  private final StringModel t;

  public CTTextFieldModel(StringModel type, STGuidModel id, CTTextCharacterPropertiesModel rPr,
      CTTextParagraphPropertiesModel pPr, StringModel t) {
    this.type = type;
    this.id = id;
    this.rPr = rPr;
    this.pPr = pPr;
    this.t = t;
  }

  public StringModel getType() {
    return this.type;
  }

  public STGuidModel getId() {
    return this.id;
  }

  public CTTextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public CTTextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public StringModel getT() {
    return this.t;
  }
}
