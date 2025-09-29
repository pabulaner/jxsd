package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PictureStackUnitBuilder;

/**
 * This is a generated sequence class.
 */
public class PictureStackUnitModel {
  private final double val;

  public PictureStackUnitModel(double val) {
    this.val = val;
  }

  public PictureStackUnitBuilder builder() {
    return new PictureStackUnitBuilder().from(this);
  }

  public double getVal() {
    return this.val;
  }
}
