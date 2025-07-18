package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_RelativeRectModel;
import com.scell.model.drawingml.main.ST_PercentageModel;

public class CT_RelativeRectBuilder {
  private ST_PercentageModel l;

  private ST_PercentageModel t;

  private ST_PercentageModel r;

  private ST_PercentageModel b;

  public CT_RelativeRectBuilder() {
  }

  public CT_RelativeRectBuilder setL(ST_PercentageModel l) {
    this.l = l;
    return this;
  }

  public CT_RelativeRectBuilder setT(ST_PercentageModel t) {
    this.t = t;
    return this;
  }

  public CT_RelativeRectBuilder setR(ST_PercentageModel r) {
    this.r = r;
    return this;
  }

  public CT_RelativeRectBuilder setB(ST_PercentageModel b) {
    this.b = b;
    return this;
  }

  public CT_RelativeRectModel build() {
    return new CT_RelativeRectModel(this.l, this.t, this.r, this.b);
  }

  public CT_RelativeRectBuilder from(CT_RelativeRectModel value) {
    this.l = value.getL();
    this.t = value.getT();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }
}
