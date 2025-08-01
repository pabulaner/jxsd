package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;

public class BooleanModel {
  private final BooleanValueModel val;

  public BooleanModel(BooleanValueModel val) {
    this.val = val;
  }

  public BooleanValueModel getVal() {
    return this.val;
  }
}
