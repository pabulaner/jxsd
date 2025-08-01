package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;
import com.scell.model.drawingml.main.FlatTextModel;

public class FlatTextBuilder {
  private CoordinateValueModel z;

  public FlatTextBuilder() {
  }

  public FlatTextBuilder setZ(CoordinateValueModel z) {
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
