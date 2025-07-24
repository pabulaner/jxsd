package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PictureStackUnitModel;

public class PictureStackUnitBuilder {
  private PictureStackUnitModel val;

  public PictureStackUnitBuilder() {
  }

  public PictureStackUnitBuilder setVal(PictureStackUnitModel val) {
    this.val = val;
    return this;
  }

  public PictureStackUnitModel build() {
    return new PictureStackUnitModel(this.val);
  }

  public PictureStackUnitBuilder from(PictureStackUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
