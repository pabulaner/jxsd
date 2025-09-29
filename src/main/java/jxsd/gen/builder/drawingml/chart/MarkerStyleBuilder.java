package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.MarkerStyleModel;
import jxsd.gen.model.drawingml.chart.MarkerStyleValueModel;

/**
 * This is a generated sequence class.
 */
public class MarkerStyleBuilder {
  private MarkerStyleValueModel val;

  public MarkerStyleBuilder() {
  }

  public MarkerStyleBuilder setVal(MarkerStyleValueModel val) {
    this.val = val;
    return this;
  }

  public MarkerStyleBuilder from(MarkerStyleModel value) {
    this.val = value.getVal();
    return this;
  }

  public MarkerStyleModel build() {
    return new MarkerStyleModel(this.val);
  }
}
