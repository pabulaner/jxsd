package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SkipModel;

public class ST_SkipBuilder {
  private Long value;

  public ST_SkipBuilder() {
    this.value = null;
  }

  public ST_SkipBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_SkipBuilder from(ST_SkipModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_SkipModel build() {
    return new ST_SkipModel(this.value);
  }
}
