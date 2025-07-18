package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OfPieTypeModel;

public class ST_OfPieTypeBuilder {
  private ST_OfPieTypeModel value;

  public ST_OfPieTypeBuilder() {
    this.value = null;
  }

  public ST_OfPieTypeBuilder from(ST_OfPieTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_OfPieTypeModel build() {
    return this.value;
  }

  public ST_OfPieTypeBuilder setValue(ST_OfPieTypeModel value) {
    this.value = value;
    return this;
  }
}
