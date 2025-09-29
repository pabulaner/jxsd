package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SizeRepresentsBuilder;

/**
 * This is a generated sequence class.
 */
public class SizeRepresentsModel {
  private final SizeRepresentsValueModel val;

  public SizeRepresentsModel(SizeRepresentsValueModel val) {
    this.val = val;
  }

  public SizeRepresentsBuilder builder() {
    return new SizeRepresentsBuilder().from(this);
  }

  public SizeRepresentsValueModel getVal() {
    return this.val;
  }
}
