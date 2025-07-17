package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LineCapModel;

public class ST_LineCapBuilder {
  private ST_LineCapModel value;

  public ST_LineCapBuilder() {
    this.value = null;
  }

  public ST_LineCapBuilder from(ST_LineCapModel value) {
    this.value = value;
    return this;
  }

  public ST_LineCapModel build() {
    return this.value;
  }

  public ST_LineCapBuilder setValue(ST_LineCapModel value) {
    this.value = value;
    return this;
  }
}
