package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ShapeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum ShapeValueModel {
  CONE,

  CONE_TO_MAX,

  BOX,

  CYLINDER,

  PYRAMID,

  PYRAMID_TO_MAX;

  public ShapeValueBuilder builder() {
    return new ShapeValueBuilder().from(this);
  }
}
