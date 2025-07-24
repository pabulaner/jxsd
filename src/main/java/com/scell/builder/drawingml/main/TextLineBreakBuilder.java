package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextCharacterPropertiesModel;
import com.scell.model.drawingml.main.TextLineBreakModel;

public class TextLineBreakBuilder {
  private TextCharacterPropertiesModel rPr;

  public TextLineBreakBuilder() {
  }

  public TextLineBreakBuilder setRPr(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public TextLineBreakModel build() {
    return new TextLineBreakModel(this.rPr);
  }

  public TextLineBreakBuilder from(TextLineBreakModel value) {
    this.rPr = value.getRPr();
    return this;
  }
}
