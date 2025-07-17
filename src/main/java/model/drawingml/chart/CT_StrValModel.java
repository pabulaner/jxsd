package model.drawingml.chart;

import model.XMLSchema.unsignedIntModel;

public class CT_StrValModel {
  private final unsignedIntModel idx;

  private final ST_XstringModel v;

  public CT_StrValModel(unsignedIntModel idx, ST_XstringModel v) {
    this.idx = idx;
    this.v = v;
  }

  public unsignedIntModel getIdx() {
    return this.idx;
  }

  public ST_XstringModel getV() {
    return this.v;
  }
}
