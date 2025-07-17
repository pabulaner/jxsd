package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_ShapeModel;

public class ST_ShapeBuilder {
  private ST_ShapeModel value;

  public ST_ShapeBuilder() {
    this.value = null;
  }

  public ST_ShapeBuilder from(ST_ShapeModel value) {
    this.value = value;
    return this;
  }

  public ST_ShapeModel build() {
    return this.value;
  }

  public ST_ShapeBuilder setValue(ST_ShapeModel value) {
    this.value = value;
    return this;
  }
}
