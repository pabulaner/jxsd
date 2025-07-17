package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_FlatTextModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;

public class CT_FlatTextBuilder {
  private ST_CoordinateModel z;

  public CT_FlatTextBuilder() {
  }

  public CT_FlatTextBuilder setZ(ST_CoordinateModel z) {
    this.z = z;
    return this;
  }

  public CT_FlatTextModel build() {
    return new CT_FlatTextModel(this.z);
  }

  public CT_FlatTextBuilder from(CT_FlatTextModel value) {
    this.z = value.getZ();
    return this;
  }
}
