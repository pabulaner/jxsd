package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextTabAlignTypeModel;

public class ST_TextTabAlignTypeBuilder {
  private ST_TextTabAlignTypeModel value;

  public ST_TextTabAlignTypeBuilder() {
    this.value = null;
  }

  public ST_TextTabAlignTypeBuilder from(ST_TextTabAlignTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextTabAlignTypeModel build() {
    return this.value;
  }

  public ST_TextTabAlignTypeBuilder setValue(ST_TextTabAlignTypeModel value) {
    this.value = value;
    return this;
  }
}
