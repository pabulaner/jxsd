package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextFontAlignTypeModel;

public class ST_TextFontAlignTypeBuilder {
  private ST_TextFontAlignTypeModel value;

  public ST_TextFontAlignTypeBuilder() {
    this.value = null;
  }

  public ST_TextFontAlignTypeBuilder from(ST_TextFontAlignTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextFontAlignTypeModel build() {
    return this.value;
  }

  public ST_TextFontAlignTypeBuilder setValue(ST_TextFontAlignTypeModel value) {
    this.value = value;
    return this;
  }
}
