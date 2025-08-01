package com.scell.model.drawingml.main;

public class FixedPercentageModel {
  private final FixedPercentageValueModel val;

  public FixedPercentageModel(FixedPercentageValueModel val) {
    this.val = val;
  }

  public FixedPercentageValueModel getVal() {
    return this.val;
  }
}
