package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SplitTypeModel;

public class ST_SplitTypeBuilder {
  private ST_SplitTypeModel value;

  public ST_SplitTypeBuilder() {
    this.value = null;
  }

  public ST_SplitTypeBuilder from(ST_SplitTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_SplitTypeModel build() {
    return this.value;
  }

  public ST_SplitTypeBuilder setValue(ST_SplitTypeModel value) {
    this.value = value;
    return this;
  }
}
