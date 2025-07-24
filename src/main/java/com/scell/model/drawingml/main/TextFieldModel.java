package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;

public class TextFieldModel {
  private final StringModel type;

  private final GuidModel id;

  private final TextCharacterPropertiesModel rPr;

  private final TextParagraphPropertiesModel pPr;

  private final StringModel t;

  public TextFieldModel(StringModel type, GuidModel id, TextCharacterPropertiesModel rPr,
      TextParagraphPropertiesModel pPr, StringModel t) {
    this.type = type;
    this.id = id;
    this.rPr = rPr;
    this.pPr = pPr;
    this.t = t;
  }

  public StringModel getType() {
    return this.type;
  }

  public GuidModel getId() {
    return this.id;
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public StringModel getT() {
    return this.t;
  }
}
