package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ShapeModel;
import com.scell.model.drawingml.chart.ST_ShapeModel;

public class CT_ShapeBuilder {
  private ST_ShapeModel val;

  public CT_ShapeBuilder() {
  }

  public CT_ShapeBuilder setVal(ST_ShapeModel val) {
    this.val = val;
    return this;
  }

  public CT_ShapeModel build() {
    return new CT_ShapeModel(this.val);
  }

  public CT_ShapeBuilder from(CT_ShapeModel value) {
    this.val = value.getVal();
    return this;
  }
}
