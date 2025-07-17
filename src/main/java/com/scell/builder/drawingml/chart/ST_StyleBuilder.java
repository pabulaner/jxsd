package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_StyleModel;

public class ST_StyleBuilder {
  private Long value;

  public ST_StyleBuilder() {
    this.value = null;
  }

  public ST_StyleBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_StyleBuilder from(ST_StyleModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_StyleModel build() {
    return new ST_StyleModel(this.value);
  }
}
