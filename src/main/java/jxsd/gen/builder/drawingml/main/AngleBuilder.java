package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AngleModel;

/**
 * This is a generated sequence class.
 */
public class AngleBuilder {
  private int val;

  public AngleBuilder() {
  }

  public AngleBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public AngleBuilder from(AngleModel value) {
    this.val = value.getVal();
    return this;
  }

  public AngleModel build() {
    return new AngleModel(this.val);
  }
}
