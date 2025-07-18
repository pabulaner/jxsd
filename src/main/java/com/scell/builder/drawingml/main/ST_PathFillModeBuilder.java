package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PathFillModeModel;

public class ST_PathFillModeBuilder {
  private ST_PathFillModeModel value;

  public ST_PathFillModeBuilder() {
    this.value = null;
  }

  public ST_PathFillModeBuilder from(ST_PathFillModeModel value) {
    this.value = value;
    return this;
  }

  public ST_PathFillModeModel build() {
    return this.value;
  }

  public ST_PathFillModeBuilder setValue(ST_PathFillModeModel value) {
    this.value = value;
    return this;
  }
}
