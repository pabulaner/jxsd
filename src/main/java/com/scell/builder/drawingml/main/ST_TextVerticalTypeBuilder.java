package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextVerticalTypeModel;

public class ST_TextVerticalTypeBuilder {
  private ST_TextVerticalTypeModel value;

  public ST_TextVerticalTypeBuilder() {
    this.value = null;
  }

  public ST_TextVerticalTypeBuilder from(ST_TextVerticalTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextVerticalTypeModel build() {
    return this.value;
  }

  public ST_TextVerticalTypeBuilder setValue(ST_TextVerticalTypeModel value) {
    this.value = value;
    return this;
  }
}
