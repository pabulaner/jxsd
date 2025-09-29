package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureStackUnitModel;

/**
 * This is a generated sequence class.
 */
public class PictureStackUnitBuilder {
  private double val;

  public PictureStackUnitBuilder() {
  }

  public PictureStackUnitBuilder setVal(double val) {
    this.val = val;
    return this;
  }

  public PictureStackUnitBuilder from(PictureStackUnitModel value) {
    this.val = value.getVal();
    return this;
  }

  public PictureStackUnitModel build() {
    return new PictureStackUnitModel(this.val);
  }
}
