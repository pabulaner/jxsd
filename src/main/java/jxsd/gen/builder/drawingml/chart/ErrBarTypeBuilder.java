package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrBarTypeModel;
import jxsd.gen.model.drawingml.chart.ErrBarTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class ErrBarTypeBuilder {
  private ErrBarTypeValueModel val;

  public ErrBarTypeBuilder() {
  }

  public ErrBarTypeBuilder setVal(ErrBarTypeValueModel val) {
    this.val = val;
    return this;
  }

  public ErrBarTypeBuilder from(ErrBarTypeModel value) {
    this.val = value.getVal();
    return this;
  }

  public ErrBarTypeModel build() {
    return new ErrBarTypeModel(this.val);
  }
}
