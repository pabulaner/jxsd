package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.MarkerStyleBuilder;

/**
 * This is a generated sequence class.
 */
public class MarkerStyleModel {
  private final MarkerStyleValueModel val;

  public MarkerStyleModel(MarkerStyleValueModel val) {
    this.val = val;
  }

  public MarkerStyleBuilder builder() {
    return new MarkerStyleBuilder().from(this);
  }

  public MarkerStyleValueModel getVal() {
    return this.val;
  }
}
