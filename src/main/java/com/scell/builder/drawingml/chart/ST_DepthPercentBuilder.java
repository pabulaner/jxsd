package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_DepthPercentModel;

public class ST_DepthPercentBuilder {
  private Long value;

  public ST_DepthPercentBuilder() {
    this.value = null;
  }

  public ST_DepthPercentBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_DepthPercentBuilder from(ST_DepthPercentModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_DepthPercentModel build() {
    return new ST_DepthPercentModel(this.value);
  }
}
