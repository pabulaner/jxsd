package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PictureFormatValueModel;

public class PictureFormatValueBuilder {
  private PictureFormatValueModel value;

  public PictureFormatValueBuilder() {
    this.value = null;
  }

  public PictureFormatValueBuilder from(PictureFormatValueModel value) {
    this.value = value;
    return this;
  }

  public PictureFormatValueModel build() {
    return this.value;
  }

  public PictureFormatValueBuilder setValue(PictureFormatValueModel value) {
    this.value = value;
    return this;
  }
}
