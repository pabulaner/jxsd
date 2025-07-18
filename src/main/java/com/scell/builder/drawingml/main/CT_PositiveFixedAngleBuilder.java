package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveFixedAngleModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class CT_PositiveFixedAngleBuilder {
  private ST_PositiveFixedAngleModel val;

  public CT_PositiveFixedAngleBuilder() {
  }

  public CT_PositiveFixedAngleBuilder setVal(ST_PositiveFixedAngleModel val) {
    this.val = val;
    return this;
  }

  public CT_PositiveFixedAngleModel build() {
    return new CT_PositiveFixedAngleModel(this.val);
  }

  public CT_PositiveFixedAngleBuilder from(CT_PositiveFixedAngleModel value) {
    this.val = value.getVal();
    return this;
  }
}
