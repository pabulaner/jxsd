package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PictureFormatModel;

public class ST_PictureFormatBuilder {
  private ST_PictureFormatModel value;

  public ST_PictureFormatBuilder() {
    this.value = null;
  }

  public ST_PictureFormatBuilder from(ST_PictureFormatModel value) {
    this.value = value;
    return this;
  }

  public ST_PictureFormatModel build() {
    return this.value;
  }

  public ST_PictureFormatBuilder setValue(ST_PictureFormatModel value) {
    this.value = value;
    return this;
  }
}
