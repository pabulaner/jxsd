package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PathShadeTypeModel;

public class ST_PathShadeTypeBuilder {
  private ST_PathShadeTypeModel value;

  public ST_PathShadeTypeBuilder() {
    this.value = null;
  }

  public ST_PathShadeTypeBuilder from(ST_PathShadeTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_PathShadeTypeModel build() {
    return this.value;
  }

  public ST_PathShadeTypeBuilder setValue(ST_PathShadeTypeModel value) {
    this.value = value;
    return this;
  }
}
