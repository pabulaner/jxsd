package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.GuidValueModel;
import com.scell.model.drawingml.main.TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.TextFieldModel;
import com.scell.model.drawingml.main.TextParagraphPropertiesModel;

public class TextFieldBuilder {
  private StringValueModel type;

  private GuidValueModel id;

  private TextCharacterPropertiesModel rPr;

  private TextParagraphPropertiesModel pPr;

  private StringValueModel t;

  public TextFieldBuilder() {
  }

  public TextFieldBuilder setType(StringValueModel type) {
    this.type = type;
    return this;
  }

  public TextFieldBuilder setId(GuidValueModel id) {
    this.id = id;
    return this;
  }

  public TextFieldBuilder setRPr(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public TextFieldBuilder setPPr(TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public TextFieldBuilder setT(StringValueModel t) {
    this.t = t;
    return this;
  }

  public TextFieldModel build() {
    return new TextFieldModel(this.type, this.id, this.rPr, this.pPr, this.t);
  }

  public TextFieldBuilder from(TextFieldModel value) {
    this.type = value.getType();
    this.id = value.getId();
    this.rPr = value.getRPr();
    this.pPr = value.getPPr();
    this.t = value.getT();
    return this;
  }
}
