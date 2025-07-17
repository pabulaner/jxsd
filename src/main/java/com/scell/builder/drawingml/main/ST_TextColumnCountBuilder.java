package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextColumnCountModel;

public class ST_TextColumnCountBuilder {
  private Long value;

  public ST_TextColumnCountBuilder() {
    this.value = null;
  }

  public ST_TextColumnCountBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextColumnCountBuilder from(ST_TextColumnCountModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextColumnCountModel build() {
    return new ST_TextColumnCountModel(this.value);
  }
}
