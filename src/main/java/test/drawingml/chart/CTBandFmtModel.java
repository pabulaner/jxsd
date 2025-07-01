package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTBandFmtModel {
  private final CTUnsignedIntModel idx;

  private final CTShapePropertiesModel spPr;

  public CTBandFmtModel(CTUnsignedIntModel idx, CTShapePropertiesModel spPr) {
    this.idx = idx;
    this.spPr = spPr;
  }

  public CTUnsignedIntModel getIdx() {
    return this.idx;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
