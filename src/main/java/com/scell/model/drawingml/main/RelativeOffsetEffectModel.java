package com.scell.model.drawingml.main;

public class RelativeOffsetEffectModel {
  private final PercentageValueModel ty;

  private final PercentageValueModel tx;

  public RelativeOffsetEffectModel(PercentageValueModel ty, PercentageValueModel tx) {
    this.ty = ty;
    this.tx = tx;
  }

  public PercentageValueModel getTy() {
    return this.ty;
  }

  public PercentageValueModel getTx() {
    return this.tx;
  }
}
