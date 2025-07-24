package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PictureFormatModel;

public class PictureFormatBuilder {
  private PictureFormatModel val;

  public PictureFormatBuilder() {
  }

  public PictureFormatBuilder setVal(PictureFormatModel val) {
    this.val = val;
    return this;
  }

  public PictureFormatModel build() {
    return new PictureFormatModel(this.val);
  }

  public PictureFormatBuilder from(PictureFormatModel value) {
    this.val = value.getVal();
    return this;
  }
}
