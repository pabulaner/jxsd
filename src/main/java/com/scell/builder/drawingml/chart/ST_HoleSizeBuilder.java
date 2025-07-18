package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_HoleSizeModel;

public class ST_HoleSizeBuilder {
  private Long value;

  public ST_HoleSizeBuilder() {
    this.value = null;
  }

  public ST_HoleSizeBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_HoleSizeBuilder from(ST_HoleSizeModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_HoleSizeModel build() {
    return new ST_HoleSizeModel(this.value);
  }
}
