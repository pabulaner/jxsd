package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PictureFormatValueBuilder;

/**
 * This is a generated enum class.
 */
public enum PictureFormatValueModel {
  STRETCH,

  STACK,

  STACK_SCALE;

  public PictureFormatValueBuilder builder() {
    return new PictureFormatValueBuilder().from(this);
  }
}
