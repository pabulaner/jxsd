package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SplitTypeModel;
import jxsd.gen.model.drawingml.chart.SplitTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class SplitTypeBuilder {
  private SplitTypeValueModel val;

  public SplitTypeBuilder() {
  }

  public SplitTypeBuilder setVal(SplitTypeValueModel val) {
    this.val = val;
    return this;
  }

  public SplitTypeBuilder from(SplitTypeModel value) {
    this.val = value.getVal();
    return this;
  }

  public SplitTypeModel build() {
    return new SplitTypeModel(this.val);
  }
}
