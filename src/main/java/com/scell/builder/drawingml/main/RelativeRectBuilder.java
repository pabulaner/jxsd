package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.RelativeRectModel;

public class RelativeRectBuilder {
  private PercentageModel l;

  private PercentageModel t;

  private PercentageModel r;

  private PercentageModel b;

  public RelativeRectBuilder() {
  }

  public RelativeRectBuilder setL(PercentageModel l) {
    this.l = l;
    return this;
  }

  public RelativeRectBuilder setT(PercentageModel t) {
    this.t = t;
    return this;
  }

  public RelativeRectBuilder setR(PercentageModel r) {
    this.r = r;
    return this;
  }

  public RelativeRectBuilder setB(PercentageModel b) {
    this.b = b;
    return this;
  }

  public RelativeRectModel build() {
    return new RelativeRectModel(this.l, this.t, this.r, this.b);
  }

  public RelativeRectBuilder from(RelativeRectModel value) {
    this.l = value.getL();
    this.t = value.getT();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }
}
