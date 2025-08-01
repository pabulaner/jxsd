package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AngleModel;
import com.scell.model.drawingml.main.AngleValueModel;

public class AngleBuilder {
  private AngleValueModel val;

  public AngleBuilder() {
  }

  public AngleBuilder setVal(AngleValueModel val) {
    this.val = val;
    return this;
  }

  public AngleModel build() {
    return new AngleModel(this.val);
  }

  public AngleBuilder from(AngleModel value) {
    this.val = value.getVal();
    return this;
  }
}
