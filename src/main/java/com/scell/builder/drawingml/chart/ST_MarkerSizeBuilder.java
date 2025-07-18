package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_MarkerSizeModel;

public class ST_MarkerSizeBuilder {
  private Long value;

  public ST_MarkerSizeBuilder() {
    this.value = null;
  }

  public ST_MarkerSizeBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_MarkerSizeBuilder from(ST_MarkerSizeModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_MarkerSizeModel build() {
    return new ST_MarkerSizeModel(this.value);
  }
}
