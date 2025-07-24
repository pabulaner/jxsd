package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;

public class BandFmtModel {
  private final UnsignedIntModel idx;

  private final ShapePropertiesModel spPr;

  public BandFmtModel(UnsignedIntModel idx, ShapePropertiesModel spPr) {
    this.idx = idx;
    this.spPr = spPr;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
