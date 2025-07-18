package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextPointModel;

public class ST_TextPointBuilder {
  private Long value;

  public ST_TextPointBuilder() {
    this.value = null;
  }

  public ST_TextPointBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextPointBuilder from(ST_TextPointModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextPointModel build() {
    return new ST_TextPointModel(this.value);
  }
}
