package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DispBlanksAsValueBuilder;

/**
 * This is a generated enum class.
 */
public enum DispBlanksAsValueModel {
  SPAN,

  GAP,

  ZERO;

  public DispBlanksAsValueBuilder builder() {
    return new DispBlanksAsValueBuilder().from(this);
  }
}
