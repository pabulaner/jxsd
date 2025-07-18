package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.CT_TextLineBreakModel;

public class CT_TextLineBreakBuilder {
  private CT_TextCharacterPropertiesModel rPr;

  public CT_TextLineBreakBuilder() {
  }

  public CT_TextLineBreakBuilder setRPr(CT_TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public CT_TextLineBreakModel build() {
    return new CT_TextLineBreakModel(this.rPr);
  }

  public CT_TextLineBreakBuilder from(CT_TextLineBreakModel value) {
    this.rPr = value.getRPr();
    return this;
  }
}
