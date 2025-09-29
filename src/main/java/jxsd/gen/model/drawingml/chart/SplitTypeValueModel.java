package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SplitTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum SplitTypeValueModel {
  AUTO,

  CUST,

  PERCENT,

  POS,

  VAL;

  public SplitTypeValueBuilder builder() {
    return new SplitTypeValueBuilder().from(this);
  }
}
