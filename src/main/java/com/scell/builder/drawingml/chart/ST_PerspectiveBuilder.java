package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PerspectiveModel;

public class ST_PerspectiveBuilder {
  private Long value;

  public ST_PerspectiveBuilder() {
    this.value = null;
  }

  public ST_PerspectiveBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PerspectiveBuilder from(ST_PerspectiveModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PerspectiveModel build() {
    return new ST_PerspectiveModel(this.value);
  }
}
