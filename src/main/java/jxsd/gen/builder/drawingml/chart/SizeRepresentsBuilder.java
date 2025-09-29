package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SizeRepresentsModel;
import jxsd.gen.model.drawingml.chart.SizeRepresentsValueModel;

/**
 * This is a generated sequence class.
 */
public class SizeRepresentsBuilder {
  private SizeRepresentsValueModel val;

  public SizeRepresentsBuilder() {
  }

  public SizeRepresentsBuilder setVal(SizeRepresentsValueModel val) {
    this.val = val;
    return this;
  }

  public SizeRepresentsBuilder from(SizeRepresentsModel value) {
    this.val = value.getVal();
    return this;
  }

  public SizeRepresentsModel build() {
    return new SizeRepresentsModel(this.val);
  }
}
