package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AngleModel;
import com.scell.model.drawingml.main.ST_AngleModel;

public class CT_AngleBuilder {
  private ST_AngleModel val;

  public CT_AngleBuilder() {
  }

  public CT_AngleBuilder setVal(ST_AngleModel val) {
    this.val = val;
    return this;
  }

  public CT_AngleModel build() {
    return new CT_AngleModel(this.val);
  }

  public CT_AngleBuilder from(CT_AngleModel value) {
    this.val = value.getVal();
    return this;
  }
}
