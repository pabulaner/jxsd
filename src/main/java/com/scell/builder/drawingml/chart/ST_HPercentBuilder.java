package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_HPercentModel;

public class ST_HPercentBuilder {
  private Long value;

  public ST_HPercentBuilder() {
    this.value = null;
  }

  public ST_HPercentBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_HPercentBuilder from(ST_HPercentModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_HPercentModel build() {
    return new ST_HPercentModel(this.value);
  }
}
