package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SecondPieSizeModel;

public class ST_SecondPieSizeBuilder {
  private Long value;

  public ST_SecondPieSizeBuilder() {
    this.value = null;
  }

  public ST_SecondPieSizeBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_SecondPieSizeBuilder from(ST_SecondPieSizeModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_SecondPieSizeModel build() {
    return new ST_SecondPieSizeModel(this.value);
  }
}
