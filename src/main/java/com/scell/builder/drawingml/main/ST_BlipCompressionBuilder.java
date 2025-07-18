package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_BlipCompressionModel;

public class ST_BlipCompressionBuilder {
  private ST_BlipCompressionModel value;

  public ST_BlipCompressionBuilder() {
    this.value = null;
  }

  public ST_BlipCompressionBuilder from(ST_BlipCompressionModel value) {
    this.value = value;
    return this;
  }

  public ST_BlipCompressionModel build() {
    return this.value;
  }

  public ST_BlipCompressionBuilder setValue(ST_BlipCompressionModel value) {
    this.value = value;
    return this;
  }
}
