package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PathFillModeModel;

public class PathFillModeBuilder {
  private PathFillModeModel value;

  public PathFillModeBuilder() {
    this.value = null;
  }

  public PathFillModeBuilder from(PathFillModeModel value) {
    this.value = value;
    return this;
  }

  public PathFillModeModel build() {
    return this.value;
  }

  public PathFillModeBuilder setValue(PathFillModeModel value) {
    this.value = value;
    return this;
  }
}
