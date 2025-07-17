package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TickLblPosModel;

public class ST_TickLblPosBuilder {
  private ST_TickLblPosModel value;

  public ST_TickLblPosBuilder() {
    this.value = null;
  }

  public ST_TickLblPosBuilder from(ST_TickLblPosModel value) {
    this.value = value;
    return this;
  }

  public ST_TickLblPosModel build() {
    return this.value;
  }

  public ST_TickLblPosBuilder setValue(ST_TickLblPosModel value) {
    this.value = value;
    return this;
  }
}
