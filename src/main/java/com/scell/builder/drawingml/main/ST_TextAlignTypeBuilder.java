package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextAlignTypeModel;

public class ST_TextAlignTypeBuilder {
  private ST_TextAlignTypeModel value;

  public ST_TextAlignTypeBuilder() {
    this.value = null;
  }

  public ST_TextAlignTypeBuilder from(ST_TextAlignTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextAlignTypeModel build() {
    return this.value;
  }

  public ST_TextAlignTypeBuilder setValue(ST_TextAlignTypeModel value) {
    this.value = value;
    return this;
  }
}
