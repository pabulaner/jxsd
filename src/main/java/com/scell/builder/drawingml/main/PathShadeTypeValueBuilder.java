package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PathShadeTypeValueModel;

public class PathShadeTypeValueBuilder {
  private PathShadeTypeValueModel value;

  public PathShadeTypeValueBuilder() {
    this.value = null;
  }

  public PathShadeTypeValueBuilder from(PathShadeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PathShadeTypeValueModel build() {
    return this.value;
  }

  public PathShadeTypeValueBuilder setValue(PathShadeTypeValueModel value) {
    this.value = value;
    return this;
  }
}
