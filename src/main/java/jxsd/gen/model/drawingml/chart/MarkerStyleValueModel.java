package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.MarkerStyleValueBuilder;

/**
 * This is a generated enum class.
 */
public enum MarkerStyleValueModel {
  CIRCLE,

  DASH,

  DIAMOND,

  DOT,

  NONE,

  PICTURE,

  PLUS,

  SQUARE,

  STAR,

  TRIANGLE,

  X;

  public MarkerStyleValueBuilder builder() {
    return new MarkerStyleValueBuilder().from(this);
  }
}
