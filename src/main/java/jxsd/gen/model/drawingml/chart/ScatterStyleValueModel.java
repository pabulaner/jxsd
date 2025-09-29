package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ScatterStyleValueBuilder;

/**
 * This is a generated enum class.
 */
public enum ScatterStyleValueModel {
  NONE,

  LINE,

  LINE_MARKER,

  MARKER,

  SMOOTH,

  SMOOTH_MARKER;

  public ScatterStyleValueBuilder builder() {
    return new ScatterStyleValueBuilder().from(this);
  }
}
