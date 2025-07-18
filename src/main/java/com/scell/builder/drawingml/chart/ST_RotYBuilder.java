package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RotYModel;

public class ST_RotYBuilder {
  private Long value;

  public ST_RotYBuilder() {
    this.value = null;
  }

  public ST_RotYBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_RotYBuilder from(ST_RotYModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_RotYModel build() {
    return new ST_RotYModel(this.value);
  }
}
