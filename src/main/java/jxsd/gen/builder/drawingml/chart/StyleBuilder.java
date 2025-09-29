package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.StyleModel;

/**
 * This is a generated sequence class.
 */
public class StyleBuilder {
  private short val;

  public StyleBuilder() {
  }

  public StyleBuilder setVal(short val) {
    this.val = val;
    return this;
  }

  public StyleBuilder from(StyleModel value) {
    this.val = value.getVal();
    return this;
  }

  public StyleModel build() {
    return new StyleModel(this.val);
  }
}
