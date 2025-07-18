package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PictureFormatModel;
import com.scell.model.drawingml.chart.ST_PictureFormatModel;

public class CT_PictureFormatBuilder {
  private ST_PictureFormatModel val;

  public CT_PictureFormatBuilder() {
  }

  public CT_PictureFormatBuilder setVal(ST_PictureFormatModel val) {
    this.val = val;
    return this;
  }

  public CT_PictureFormatModel build() {
    return new CT_PictureFormatModel(this.val);
  }

  public CT_PictureFormatBuilder from(CT_PictureFormatModel value) {
    this.val = value.getVal();
    return this;
  }
}
