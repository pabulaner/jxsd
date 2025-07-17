package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_StyleMatrixColumnIndexModel;

public class ST_StyleMatrixColumnIndexBuilder {
  private Long value;

  public ST_StyleMatrixColumnIndexBuilder() {
    this.value = null;
  }

  public ST_StyleMatrixColumnIndexBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_StyleMatrixColumnIndexBuilder from(ST_StyleMatrixColumnIndexModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_StyleMatrixColumnIndexModel build() {
    return new ST_StyleMatrixColumnIndexModel(this.value);
  }
}
