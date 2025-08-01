package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SplitTypeValueModel;

public class SplitTypeValueBuilder {
  private SplitTypeValueModel value;

  public SplitTypeValueBuilder() {
    this.value = null;
  }

  public SplitTypeValueBuilder from(SplitTypeValueModel value) {
    this.value = value;
    return this;
  }

  public SplitTypeValueModel build() {
    return this.value;
  }

  public SplitTypeValueBuilder setValue(SplitTypeValueModel value) {
    this.value = value;
    return this;
  }
}
