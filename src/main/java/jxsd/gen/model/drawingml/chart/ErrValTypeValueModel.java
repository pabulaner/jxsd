package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrValTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum ErrValTypeValueModel {
  CUST,

  FIXED_VAL,

  PERCENTAGE,

  STD_DEV,

  STD_ERR;

  public ErrValTypeValueBuilder builder() {
    return new ErrValTypeValueBuilder().from(this);
  }
}
