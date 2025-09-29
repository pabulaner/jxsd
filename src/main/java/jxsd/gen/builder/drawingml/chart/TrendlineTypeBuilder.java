package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TrendlineTypeModel;
import jxsd.gen.model.drawingml.chart.TrendlineTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class TrendlineTypeBuilder {
  private TrendlineTypeValueModel val;

  public TrendlineTypeBuilder() {
  }

  public TrendlineTypeBuilder setVal(TrendlineTypeValueModel val) {
    this.val = val;
    return this;
  }

  public TrendlineTypeBuilder from(TrendlineTypeModel value) {
    this.val = value.getVal();
    return this;
  }

  public TrendlineTypeModel build() {
    return new TrendlineTypeModel(this.val);
  }
}
