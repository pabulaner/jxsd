package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextWrappingTypeModel;

public class ST_TextWrappingTypeBuilder {
  private ST_TextWrappingTypeModel value;

  public ST_TextWrappingTypeBuilder() {
    this.value = null;
  }

  public ST_TextWrappingTypeBuilder from(ST_TextWrappingTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextWrappingTypeModel build() {
    return this.value;
  }

  public ST_TextWrappingTypeBuilder setValue(ST_TextWrappingTypeModel value) {
    this.value = value;
    return this;
  }
}
