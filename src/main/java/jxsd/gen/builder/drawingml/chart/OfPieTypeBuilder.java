package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OfPieTypeModel;
import jxsd.gen.model.drawingml.chart.OfPieTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class OfPieTypeBuilder {
  private OfPieTypeValueModel val;

  public OfPieTypeBuilder() {
  }

  public OfPieTypeBuilder setVal(OfPieTypeValueModel val) {
    this.val = val;
    return this;
  }

  public OfPieTypeBuilder from(OfPieTypeModel value) {
    this.val = value.getVal();
    return this;
  }

  public OfPieTypeModel build() {
    return new OfPieTypeModel(this.val);
  }
}
