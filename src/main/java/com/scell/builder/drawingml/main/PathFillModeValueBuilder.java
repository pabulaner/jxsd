package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PathFillModeValueModel;

public class PathFillModeValueBuilder {
  private PathFillModeValueModel value;

  public PathFillModeValueBuilder() {
    this.value = null;
  }

  public PathFillModeValueBuilder from(PathFillModeValueModel value) {
    this.value = value;
    return this;
  }

  public PathFillModeValueModel build() {
    return this.value;
  }

  public PathFillModeValueBuilder setValue(PathFillModeValueModel value) {
    this.value = value;
    return this;
  }
}
