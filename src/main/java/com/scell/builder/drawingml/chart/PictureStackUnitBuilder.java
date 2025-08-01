package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PictureStackUnitModel;
import com.scell.model.drawingml.chart.PictureStackUnitValueModel;

public class PictureStackUnitBuilder {
  private PictureStackUnitValueModel val;

  public PictureStackUnitBuilder() {
  }

  public PictureStackUnitBuilder setVal(PictureStackUnitValueModel val) {
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
