package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_GapAmountModel;

public class ST_GapAmountBuilder {
  private Long value;

  public ST_GapAmountBuilder() {
    this.value = null;
  }

  public ST_GapAmountBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_GapAmountBuilder from(ST_GapAmountModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_GapAmountModel build() {
    return new ST_GapAmountModel(this.value);
  }
}
