package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PanoseModel;

public class ST_PanoseBuilder {
  private byte[] value;

  public ST_PanoseBuilder() {
    this.value = null;
  }

  public ST_PanoseBuilder setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public ST_PanoseBuilder from(ST_PanoseModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PanoseModel build() {
    return new ST_PanoseModel(this.value);
  }
}
