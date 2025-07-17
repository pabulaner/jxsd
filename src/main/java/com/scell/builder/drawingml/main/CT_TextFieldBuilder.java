package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.CT_TextFieldModel;
import com.scell.model.drawingml.main.CT_TextParagraphPropertiesModel;
import com.scell.model.drawingml.main.ST_GuidModel;

public class CT_TextFieldBuilder {
  private StringModel type;

  private ST_GuidModel id;

  private CT_TextCharacterPropertiesModel rPr;

  private CT_TextParagraphPropertiesModel pPr;

  private StringModel t;

  public CT_TextFieldBuilder() {
  }

  public CT_TextFieldBuilder setType(StringModel type) {
    this.type = type;
    return this;
  }

  public CT_TextFieldBuilder setId(ST_GuidModel id) {
    this.id = id;
    return this;
  }

  public CT_TextFieldBuilder setRPr(CT_TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public CT_TextFieldBuilder setPPr(CT_TextParagraphPropertiesModel pPr) {
    this.pPr = pPr;
    return this;
  }

  public CT_TextFieldBuilder setT(StringModel t) {
    this.t = t;
    return this;
  }

  public CT_TextFieldModel build() {
    return new CT_TextFieldModel(this.type, this.id, this.rPr, this.pPr, this.t);
  }

  public CT_TextFieldBuilder from(CT_TextFieldModel value) {
    this.type = value.getType();
    this.id = value.getId();
    this.rPr = value.getRPr();
    this.pPr = value.getPPr();
    this.t = value.getT();
    return this;
  }
}
