package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.OrientationValueBuilder;

/**
 * This is a generated enum class.
 */
public enum OrientationValueModel {
  MAX_MIN,

  MIN_MAX;

  public OrientationValueBuilder builder() {
    return new OrientationValueBuilder().from(this);
  }
}
