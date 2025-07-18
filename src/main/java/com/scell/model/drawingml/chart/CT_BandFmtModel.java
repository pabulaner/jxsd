package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_BandFmtModel {
  private final CT_UnsignedIntModel idx;

  private final CT_ShapePropertiesModel spPr;

  public CT_BandFmtModel(CT_UnsignedIntModel idx, CT_ShapePropertiesModel spPr) {
    this.idx = idx;
    this.spPr = spPr;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
