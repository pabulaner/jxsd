package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;

public class TextFieldModel {
  private final StringValueModel type;

  private final GuidValueModel id;

  private final TextCharacterPropertiesModel rPr;

  private final TextParagraphPropertiesModel pPr;

  private final StringValueModel t;

  public TextFieldModel(StringValueModel type, GuidValueModel id, TextCharacterPropertiesModel rPr,
      TextParagraphPropertiesModel pPr, StringValueModel t) {
    this.type = type;
    this.id = id;
    this.rPr = rPr;
    this.pPr = pPr;
    this.t = t;
  }

  public StringValueModel getType() {
    return this.type;
  }

  public GuidValueModel getId() {
    return this.id;
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public TextParagraphPropertiesModel getPPr() {
    return this.pPr;
  }

  public StringValueModel getT() {
    return this.t;
  }
}
