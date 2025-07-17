package com.scell.model.drawingml.main;

public class CT_FixedPercentageModel {
  private final ST_FixedPercentageModel val;

  public CT_FixedPercentageModel(ST_FixedPercentageModel val) {
    this.val = val;
  }

  public ST_FixedPercentageModel getVal() {
    return this.val;
  }
}
