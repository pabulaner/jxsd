package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PerspectiveModel;

/**
 * This is a generated sequence class.
 */
public class PerspectiveBuilder {
  private short val;

  public PerspectiveBuilder() {
  }

  public PerspectiveBuilder setVal(short val) {
    this.val = val;
    return this;
  }

  public PerspectiveBuilder from(PerspectiveModel value) {
    this.val = value.getVal();
    return this;
  }

  public PerspectiveModel build() {
    return new PerspectiveModel(this.val);
  }
}
