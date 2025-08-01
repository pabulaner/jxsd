package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.DoubleValueModel;

public class DoubleModel {
  private final DoubleValueModel val;

  public DoubleModel(DoubleValueModel val) {
    this.val = val;
  }

  public DoubleValueModel getVal() {
    return this.val;
  }
}
