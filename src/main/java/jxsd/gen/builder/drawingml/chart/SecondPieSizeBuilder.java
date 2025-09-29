package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SecondPieSizeModel;

/**
 * This is a generated sequence class.
 */
public class SecondPieSizeBuilder {
  private int val;

  public SecondPieSizeBuilder() {
  }

  public SecondPieSizeBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public SecondPieSizeBuilder from(SecondPieSizeModel value) {
    this.val = value.getVal();
    return this;
  }

  public SecondPieSizeModel build() {
    return new SecondPieSizeModel(this.val);
  }
}
