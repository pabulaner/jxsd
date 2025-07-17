package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LayoutTargetModel;

public class ST_LayoutTargetBuilder {
  private ST_LayoutTargetModel value;

  public ST_LayoutTargetBuilder() {
    this.value = null;
  }

  public ST_LayoutTargetBuilder from(ST_LayoutTargetModel value) {
    this.value = value;
    return this;
  }

  public ST_LayoutTargetModel build() {
    return this.value;
  }

  public ST_LayoutTargetBuilder setValue(ST_LayoutTargetModel value) {
    this.value = value;
    return this;
  }
}
