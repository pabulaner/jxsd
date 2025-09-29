package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrValTypeBuilder;

/**
 * This is a generated sequence class.
 */
public class ErrValTypeModel {
  private final ErrValTypeValueModel val;

  public ErrValTypeModel(ErrValTypeValueModel val) {
    this.val = val;
  }

  public ErrValTypeBuilder builder() {
    return new ErrValTypeBuilder().from(this);
  }

  public ErrValTypeValueModel getVal() {
    return this.val;
  }
}
