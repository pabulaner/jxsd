package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextMarginModel;

public class ST_TextMarginBuilder {
  private Long value;

  public ST_TextMarginBuilder() {
    this.value = null;
  }

  public ST_TextMarginBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextMarginBuilder from(ST_TextMarginModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextMarginModel build() {
    return new ST_TextMarginModel(this.value);
  }
}
