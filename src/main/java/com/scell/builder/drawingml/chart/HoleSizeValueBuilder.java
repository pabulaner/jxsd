package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.HoleSizeValueModel;

public class HoleSizeValueBuilder {
  private short value;

  public HoleSizeValueBuilder() {
  }

  public HoleSizeValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public HoleSizeValueBuilder from(HoleSizeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public HoleSizeValueModel build() {
    return new HoleSizeValueModel(this.value);
  }
}
