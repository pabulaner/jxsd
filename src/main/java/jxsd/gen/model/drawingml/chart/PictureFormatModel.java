package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PictureFormatBuilder;

/**
 * This is a generated sequence class.
 */
public class PictureFormatModel {
  private final PictureFormatValueModel val;

  public PictureFormatModel(PictureFormatValueModel val) {
    this.val = val;
  }

  public PictureFormatBuilder builder() {
    return new PictureFormatBuilder().from(this);
  }

  public PictureFormatValueModel getVal() {
    return this.val;
  }
}
