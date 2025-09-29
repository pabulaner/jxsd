package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PageSetupOrientationValueBuilder;

/**
 * This is a generated enum class.
 */
public enum PageSetupOrientationValueModel {
  DEFAULT,

  PORTRAIT,

  LANDSCAPE;

  public PageSetupOrientationValueBuilder builder() {
    return new PageSetupOrientationValueBuilder().from(this);
  }
}
