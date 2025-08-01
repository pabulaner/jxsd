package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HPercentValueModel;

public class HPercentValueBuilder {
  private int value;

  public HPercentValueBuilder() {
  }

  public HPercentValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public HPercentValueBuilder from(HPercentValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public HPercentValueModel build() {
    return new HPercentValueModel(this.value);
  }
}
