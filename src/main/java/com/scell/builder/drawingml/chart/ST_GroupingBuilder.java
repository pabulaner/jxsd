package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_GroupingModel;

public class ST_GroupingBuilder {
  private ST_GroupingModel value;

  public ST_GroupingBuilder() {
    this.value = null;
  }

  public ST_GroupingBuilder from(ST_GroupingModel value) {
    this.value = value;
    return this;
  }

  public ST_GroupingModel build() {
    return this.value;
  }

  public ST_GroupingBuilder setValue(ST_GroupingModel value) {
    this.value = value;
    return this;
  }
}
