package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PathShadeTypeModel;

public class PathShadeTypeBuilder {
  private PathShadeTypeModel value;

  public PathShadeTypeBuilder() {
    this.value = null;
  }

  public PathShadeTypeBuilder from(PathShadeTypeModel value) {
    this.value = value;
    return this;
  }

  public PathShadeTypeModel build() {
    return this.value;
  }

  public PathShadeTypeBuilder setValue(PathShadeTypeModel value) {
    this.value = value;
    return this;
  }
}
