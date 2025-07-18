package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextShapeTypeModel;

public class ST_TextShapeTypeBuilder {
  private ST_TextShapeTypeModel value;

  public ST_TextShapeTypeBuilder() {
    this.value = null;
  }

  public ST_TextShapeTypeBuilder from(ST_TextShapeTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextShapeTypeModel build() {
    return this.value;
  }

  public ST_TextShapeTypeBuilder setValue(ST_TextShapeTypeModel value) {
    this.value = value;
    return this;
  }
}
