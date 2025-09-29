package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TickMarkBuilder;

/**
 * This is a generated sequence class.
 */
public class TickMarkModel {
  private final TickMarkValueModel val;

  public TickMarkModel(TickMarkValueModel val) {
    this.val = val;
  }

  public TickMarkBuilder builder() {
    return new TickMarkBuilder().from(this);
  }

  public TickMarkValueModel getVal() {
    return this.val;
  }
}
