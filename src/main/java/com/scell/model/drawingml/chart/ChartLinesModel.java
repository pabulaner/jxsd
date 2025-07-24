package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;

public class ChartLinesModel {
  private final ShapePropertiesModel spPr;

  public ChartLinesModel(ShapePropertiesModel spPr) {
    this.spPr = spPr;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
