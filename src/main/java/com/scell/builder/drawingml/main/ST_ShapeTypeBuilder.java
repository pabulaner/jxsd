package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_ShapeTypeModel;

public class ST_ShapeTypeBuilder {
  private ST_ShapeTypeModel value;

  public ST_ShapeTypeBuilder() {
    this.value = null;
  }

  public ST_ShapeTypeBuilder from(ST_ShapeTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_ShapeTypeModel build() {
    return this.value;
  }

  public ST_ShapeTypeBuilder setValue(ST_ShapeTypeModel value) {
    this.value = value;
    return this;
  }
}
