package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_AxPosModel;

public class ST_AxPosBuilder {
  private ST_AxPosModel value;

  public ST_AxPosBuilder() {
    this.value = null;
  }

  public ST_AxPosBuilder from(ST_AxPosModel value) {
    this.value = value;
    return this;
  }

  public ST_AxPosModel build() {
    return this.value;
  }

  public ST_AxPosBuilder setValue(ST_AxPosModel value) {
    this.value = value;
    return this;
  }
}
