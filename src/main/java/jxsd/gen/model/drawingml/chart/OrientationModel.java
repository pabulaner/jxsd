package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.OrientationBuilder;

/**
 * This is a generated sequence class.
 */
public class OrientationModel {
  private final OrientationValueModel val;

  public OrientationModel(OrientationValueModel val) {
    this.val = val;
  }

  public OrientationBuilder builder() {
    return new OrientationBuilder().from(this);
  }

  public OrientationValueModel getVal() {
    return this.val;
  }
}
