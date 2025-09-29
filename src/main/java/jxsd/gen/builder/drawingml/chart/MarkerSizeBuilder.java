package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.MarkerSizeModel;

/**
 * This is a generated sequence class.
 */
public class MarkerSizeBuilder {
  private short val;

  public MarkerSizeBuilder() {
  }

  public MarkerSizeBuilder setVal(short val) {
    this.val = val;
    return this;
  }

  public MarkerSizeBuilder from(MarkerSizeModel value) {
    this.val = value.getVal();
    return this;
  }

  public MarkerSizeModel build() {
    return new MarkerSizeModel(this.val);
  }
}
