package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossesModel;
import jxsd.gen.model.drawingml.chart.CrossesValueModel;

/**
 * This is a generated sequence class.
 */
public class CrossesBuilder {
  private CrossesValueModel val;

  public CrossesBuilder() {
  }

  public CrossesBuilder setVal(CrossesValueModel val) {
    this.val = val;
    return this;
  }

  public CrossesBuilder from(CrossesModel value) {
    this.val = value.getVal();
    return this;
  }

  public CrossesModel build() {
    return new CrossesModel(this.val);
  }
}
