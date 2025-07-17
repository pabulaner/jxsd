package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LegendPosModel;

public class ST_LegendPosBuilder {
  private ST_LegendPosModel value;

  public ST_LegendPosBuilder() {
    this.value = null;
  }

  public ST_LegendPosBuilder from(ST_LegendPosModel value) {
    this.value = value;
    return this;
  }

  public ST_LegendPosModel build() {
    return this.value;
  }

  public ST_LegendPosBuilder setValue(ST_LegendPosModel value) {
    this.value = value;
    return this;
  }
}
