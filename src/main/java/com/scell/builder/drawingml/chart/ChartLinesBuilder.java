package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class ChartLinesBuilder {
  private ShapePropertiesModel spPr;

  public ChartLinesBuilder() {
  }

  public ChartLinesBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ChartLinesModel build() {
    return new ChartLinesModel(this.spPr);
  }

  public ChartLinesBuilder from(ChartLinesModel value) {
    this.spPr = value.getSpPr();
    return this;
  }
}
