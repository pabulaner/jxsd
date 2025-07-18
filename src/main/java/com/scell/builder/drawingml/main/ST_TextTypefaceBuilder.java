package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextTypefaceModel;

public class ST_TextTypefaceBuilder {
  private String value;

  public ST_TextTypefaceBuilder() {
    this.value = null;
  }

  public ST_TextTypefaceBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_TextTypefaceBuilder from(ST_TextTypefaceModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextTypefaceModel build() {
    return new ST_TextTypefaceModel(this.value);
  }
}
