package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureFormatModel;
import jxsd.gen.model.drawingml.chart.PictureFormatValueModel;

/**
 * This is a generated sequence class.
 */
public class PictureFormatBuilder {
  private PictureFormatValueModel val;

  public PictureFormatBuilder() {
  }

  public PictureFormatBuilder setVal(PictureFormatValueModel val) {
    this.val = val;
    return this;
  }

  public PictureFormatBuilder from(PictureFormatModel value) {
    this.val = value.getVal();
    return this;
  }

  public PictureFormatModel build() {
    return new PictureFormatModel(this.val);
  }
}
