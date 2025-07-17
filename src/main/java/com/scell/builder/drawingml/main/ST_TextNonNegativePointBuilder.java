package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextNonNegativePointModel;

public class ST_TextNonNegativePointBuilder {
  private Long value;

  public ST_TextNonNegativePointBuilder() {
    this.value = null;
  }

  public ST_TextNonNegativePointBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextNonNegativePointBuilder from(ST_TextNonNegativePointModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextNonNegativePointModel build() {
    return new ST_TextNonNegativePointModel(this.value);
  }
}
