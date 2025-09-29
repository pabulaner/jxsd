package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;

/**
 * This is a generated sequence class.
 */
public class BooleanBuilder {
  private boolean val;

  public BooleanBuilder() {
  }

  public BooleanBuilder setVal(boolean val) {
    this.val = val;
    return this;
  }

  public BooleanBuilder from(BooleanModel value) {
    this.val = value.getVal();
    return this;
  }

  public BooleanModel build() {
    return new BooleanModel(this.val);
  }
}
