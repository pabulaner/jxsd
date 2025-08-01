package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PictureFormatModel;
import com.scell.model.drawingml.chart.PictureFormatValueModel;

public class PictureFormatBuilder {
  private PictureFormatValueModel val;

  public PictureFormatBuilder() {
  }

  public PictureFormatBuilder setVal(PictureFormatValueModel val) {
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
