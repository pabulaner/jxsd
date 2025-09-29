package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrBarTypeBuilder;

/**
 * This is a generated sequence class.
 */
public class ErrBarTypeModel {
  private final ErrBarTypeValueModel val;

  public ErrBarTypeModel(ErrBarTypeValueModel val) {
    this.val = val;
  }

  public ErrBarTypeBuilder builder() {
    return new ErrBarTypeBuilder().from(this);
  }

  public ErrBarTypeValueModel getVal() {
    return this.val;
  }
}
