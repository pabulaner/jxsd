package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AngleModel;

public class AngleBuilder {
  private AngleModel val;

  public AngleBuilder() {
  }

  public AngleBuilder setVal(AngleModel val) {
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
