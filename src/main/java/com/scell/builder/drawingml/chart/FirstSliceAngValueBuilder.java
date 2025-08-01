package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.FirstSliceAngValueModel;

public class FirstSliceAngValueBuilder {
  private int value;

  public FirstSliceAngValueBuilder() {
  }

  public FirstSliceAngValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public FirstSliceAngValueBuilder from(FirstSliceAngValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public FirstSliceAngValueModel build() {
    return new FirstSliceAngValueModel(this.value);
  }
}
