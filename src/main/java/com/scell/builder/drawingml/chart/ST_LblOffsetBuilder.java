package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LblOffsetModel;

public class ST_LblOffsetBuilder {
  private Long value;

  public ST_LblOffsetBuilder() {
    this.value = null;
  }

  public ST_LblOffsetBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_LblOffsetBuilder from(ST_LblOffsetModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_LblOffsetModel build() {
    return new ST_LblOffsetModel(this.value);
  }
}
