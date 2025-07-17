package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PictureStackUnitModel;
import com.scell.model.drawingml.chart.ST_PictureStackUnitModel;

public class CT_PictureStackUnitBuilder {
  private ST_PictureStackUnitModel val;

  public CT_PictureStackUnitBuilder() {
  }

  public CT_PictureStackUnitBuilder setVal(ST_PictureStackUnitModel val) {
    this.val = val;
    return this;
  }

  public CT_PictureStackUnitModel build() {
    return new CT_PictureStackUnitModel(this.val);
  }

  public CT_PictureStackUnitBuilder from(CT_PictureStackUnitModel value) {
    this.val = value.getVal();
    return this;
  }
}
