package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OverlapModel;

public class ST_OverlapBuilder {
  private Long value;

  public ST_OverlapBuilder() {
    this.value = null;
  }

  public ST_OverlapBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_OverlapBuilder from(ST_OverlapModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_OverlapModel build() {
    return new ST_OverlapModel(this.value);
  }
}
