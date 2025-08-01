package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.RelativeRectModel;

public class RelativeRectBuilder {
  private PercentageValueModel l;

  private PercentageValueModel t;

  private PercentageValueModel r;

  private PercentageValueModel b;

  public RelativeRectBuilder() {
  }

  public RelativeRectBuilder setL(PercentageValueModel l) {
    this.l = l;
    return this;
  }

  public RelativeRectBuilder setT(PercentageValueModel t) {
    this.t = t;
    return this;
  }

  public RelativeRectBuilder setR(PercentageValueModel r) {
    this.r = r;
    return this;
  }

  public RelativeRectBuilder setB(PercentageValueModel b) {
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
