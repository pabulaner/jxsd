package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_ChartLinesModel {
  private final CT_ShapePropertiesModel spPr;

  public CT_ChartLinesModel(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
