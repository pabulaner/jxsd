package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class CT_StrValModel {
  private final UnsignedIntModel idx;

  private final ST_XstringModel v;

  public CT_StrValModel(UnsignedIntModel idx, ST_XstringModel v) {
    this.idx = idx;
    this.v = v;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public ST_XstringModel getV() {
    return this.v;
  }
}
