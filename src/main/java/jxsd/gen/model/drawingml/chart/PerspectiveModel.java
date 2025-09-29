package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PerspectiveBuilder;

/**
 * This is a generated sequence class.
 */
public class PerspectiveModel {
  private final short val;

  public PerspectiveModel(short val) {
    this.val = val;
  }

  public PerspectiveBuilder builder() {
    return new PerspectiveBuilder().from(this);
  }

  public short getVal() {
    return this.val;
  }
}
