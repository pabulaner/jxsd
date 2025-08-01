package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ShapeModel;
import com.scell.model.drawingml.chart.ShapeValueModel;

public class ShapeBuilder {
  private ShapeValueModel val;

  public ShapeBuilder() {
  }

  public ShapeBuilder setVal(ShapeValueModel val) {
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
