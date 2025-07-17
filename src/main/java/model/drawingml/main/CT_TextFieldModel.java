package model.drawingml.main;

import model.XMLSchema.stringModel;

public class CT_TextFieldModel {
  private final stringModel type;

  private final ST_GuidModel id;

  private final CT_TextCharacterPropertiesModel rPr;

  private final CT_TextParagraphPropertiesModel pPr;

  private final stringModel t;

  public CT_TextFieldModel(stringModel type, ST_GuidModel id, CT_TextCharacterPropertiesModel rPr,
      CT_TextParagraphPropertiesModel pPr, stringModel t) {
    this.type = type;
    this.id = id;
    this.rPr = rPr;
    this.pPr = pPr;
    this.t = t;
  }

  public stringModel getType() {
    return this.type;
  }

  public ST_GuidModel getId() {
    return this.id;
  }

  public CT_TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public CT_TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public stringModel getT() {
    return this.t;
  }
}
