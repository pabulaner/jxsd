package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_ChartLinesBuilder {
  private CT_ShapePropertiesModel spPr;

  public CT_ChartLinesBuilder() {
  }

  public CT_ChartLinesBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ChartLinesModel build() {
    return new CT_ChartLinesModel(this.spPr);
  }

  public CT_ChartLinesBuilder from(CT_ChartLinesModel value) {
    this.spPr = value.getSpPr();
    return this;
  }
}
