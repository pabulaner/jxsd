package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextVertOverflowTypeModel;

public class ST_TextVertOverflowTypeBuilder {
  private ST_TextVertOverflowTypeModel value;

  public ST_TextVertOverflowTypeBuilder() {
    this.value = null;
  }

  public ST_TextVertOverflowTypeBuilder from(ST_TextVertOverflowTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextVertOverflowTypeModel build() {
    return this.value;
  }

  public ST_TextVertOverflowTypeBuilder setValue(ST_TextVertOverflowTypeModel value) {
    this.value = value;
    return this;
  }
}
