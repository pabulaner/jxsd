package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;
import com.scell.model.drawingml.main.FlatTextModel;

public class FlatTextBuilder {
  private CoordinateModel z;

  public FlatTextBuilder() {
  }

  public FlatTextBuilder setZ(CoordinateModel z) {
    this.z = z;
    return this;
  }

  public FlatTextModel build() {
    return new FlatTextModel(this.z);
  }

  public FlatTextBuilder from(FlatTextModel value) {
    this.z = value.getZ();
    return this;
  }
}
