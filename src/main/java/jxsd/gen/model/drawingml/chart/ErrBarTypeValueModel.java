package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrBarTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum ErrBarTypeValueModel {
  BOTH,

  MINUS,

  PLUS;

  public ErrBarTypeValueBuilder builder() {
    return new ErrBarTypeValueBuilder().from(this);
  }
}
