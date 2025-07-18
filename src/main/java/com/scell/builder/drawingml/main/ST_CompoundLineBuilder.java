package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_CompoundLineModel;

public class ST_CompoundLineBuilder {
  private ST_CompoundLineModel value;

  public ST_CompoundLineBuilder() {
    this.value = null;
  }

  public ST_CompoundLineBuilder from(ST_CompoundLineModel value) {
    this.value = value;
    return this;
  }

  public ST_CompoundLineModel build() {
    return this.value;
  }

  public ST_CompoundLineBuilder setValue(ST_CompoundLineModel value) {
    this.value = value;
    return this;
  }
}
