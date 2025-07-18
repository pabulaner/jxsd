package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextFontSizeModel;

public class ST_TextFontSizeBuilder {
  private Long value;

  public ST_TextFontSizeBuilder() {
    this.value = null;
  }

  public ST_TextFontSizeBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextFontSizeBuilder from(ST_TextFontSizeModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextFontSizeModel build() {
    return new ST_TextFontSizeModel(this.value);
  }
}
