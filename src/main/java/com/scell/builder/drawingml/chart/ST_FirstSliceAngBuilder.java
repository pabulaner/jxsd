package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_FirstSliceAngModel;

public class ST_FirstSliceAngBuilder {
  private Long value;

  public ST_FirstSliceAngBuilder() {
    this.value = null;
  }

  public ST_FirstSliceAngBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_FirstSliceAngBuilder from(ST_FirstSliceAngModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_FirstSliceAngModel build() {
    return new ST_FirstSliceAngModel(this.value);
  }
}
