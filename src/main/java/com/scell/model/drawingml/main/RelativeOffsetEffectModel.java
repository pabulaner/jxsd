package com.scell.model.drawingml.main;

public class RelativeOffsetEffectModel {
  private final PercentageModel ty;

  private final PercentageModel tx;

  public RelativeOffsetEffectModel(PercentageModel ty, PercentageModel tx) {
    this.ty = ty;
    this.tx = tx;
  }

  public PercentageModel getTy() {
    return this.ty;
  }

  public PercentageModel getTx() {
    return this.tx;
  }
}
