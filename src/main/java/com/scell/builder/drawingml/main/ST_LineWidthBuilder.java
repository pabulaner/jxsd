package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LineWidthModel;

public class ST_LineWidthBuilder {
  private Long value;

  public ST_LineWidthBuilder() {
    this.value = null;
  }

  public ST_LineWidthBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_LineWidthBuilder from(ST_LineWidthModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_LineWidthModel build() {
    return new ST_LineWidthModel(this.value);
  }
}
