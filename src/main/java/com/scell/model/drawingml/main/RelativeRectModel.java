package com.scell.model.drawingml.main;

public class RelativeRectModel {
  private final PercentageValueModel l;

  private final PercentageValueModel t;

  private final PercentageValueModel r;

  private final PercentageValueModel b;

  public RelativeRectModel(PercentageValueModel l, PercentageValueModel t, PercentageValueModel r,
      PercentageValueModel b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public PercentageValueModel getL() {
    return this.l;
  }

  public PercentageValueModel getT() {
    return this.t;
  }

  public PercentageValueModel getR() {
    return this.r;
  }

  public PercentageValueModel getB() {
    return this.b;
  }
}
