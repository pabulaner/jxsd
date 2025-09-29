package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PictureFormatValueModel;

/**
 * This is a generated enum class.
 */
public class PictureFormatValueBuilder {
  private PictureFormatValueModel value;

  public PictureFormatValueBuilder() {
  }

  public PictureFormatValueBuilder setValue(PictureFormatValueModel value) {
    this.value = value;
    return this;
  }

  public PictureFormatValueBuilder from(PictureFormatValueModel value) {
    this.value = value;
    return this;
  }

  public PictureFormatValueModel build() {
    return this.value;
  }
}
