package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BarDirValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BarDirValueModel {
  BAR,

  COL;

  public BarDirValueBuilder builder() {
    return new BarDirValueBuilder().from(this);
  }
}
