package com.scell.model.drawingml.main;

public class RelativeRectModel {
  private final PercentageModel l;

  private final PercentageModel t;

  private final PercentageModel r;

  private final PercentageModel b;

  public RelativeRectModel(PercentageModel l, PercentageModel t, PercentageModel r,
      PercentageModel b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public PercentageModel getL() {
    return this.l;
  }

  public PercentageModel getT() {
    return this.t;
  }

  public PercentageModel getR() {
    return this.r;
  }

  public PercentageModel getB() {
    return this.b;
  }
}
