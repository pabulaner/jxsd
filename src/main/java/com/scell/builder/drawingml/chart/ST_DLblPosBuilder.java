package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_DLblPosModel;

public class ST_DLblPosBuilder {
  private ST_DLblPosModel value;

  public ST_DLblPosBuilder() {
    this.value = null;
  }

  public ST_DLblPosBuilder from(ST_DLblPosModel value) {
    this.value = value;
    return this;
  }

  public ST_DLblPosModel build() {
    return this.value;
  }

  public ST_DLblPosBuilder setValue(ST_DLblPosModel value) {
    this.value = value;
    return this;
  }
}
