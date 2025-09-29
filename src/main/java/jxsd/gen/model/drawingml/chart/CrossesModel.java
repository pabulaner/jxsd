package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.CrossesBuilder;

/**
 * This is a generated sequence class.
 */
public class CrossesModel {
  private final CrossesValueModel val;

  public CrossesModel(CrossesValueModel val) {
    this.val = val;
  }

  public CrossesBuilder builder() {
    return new CrossesBuilder().from(this);
  }

  public CrossesValueModel getVal() {
    return this.val;
  }
}
