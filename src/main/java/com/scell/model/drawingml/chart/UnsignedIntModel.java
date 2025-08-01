package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class UnsignedIntModel {
  private final UnsignedIntValueModel val;

  public UnsignedIntModel(UnsignedIntValueModel val) {
    this.val = val;
  }

  public UnsignedIntValueModel getVal() {
    return this.val;
  }
}
