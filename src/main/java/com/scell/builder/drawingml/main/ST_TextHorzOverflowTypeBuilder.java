package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextHorzOverflowTypeModel;

public class ST_TextHorzOverflowTypeBuilder {
  private ST_TextHorzOverflowTypeModel value;

  public ST_TextHorzOverflowTypeBuilder() {
    this.value = null;
  }

  public ST_TextHorzOverflowTypeBuilder from(ST_TextHorzOverflowTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextHorzOverflowTypeModel build() {
    return this.value;
  }

  public ST_TextHorzOverflowTypeBuilder setValue(ST_TextHorzOverflowTypeModel value) {
    this.value = value;
    return this;
  }
}
