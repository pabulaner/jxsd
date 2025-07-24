package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ShapeModel;

public class ShapeBuilder {
  private ShapeModel val;

  public ShapeBuilder() {
  }

  public ShapeBuilder setVal(ShapeModel val) {
    this.val = val;
    return this;
  }

  public ShapeModel build() {
    return new ShapeModel(this.val);
  }

  public ShapeBuilder from(ShapeModel value) {
    this.val = value.getVal();
    return this;
  }
}
