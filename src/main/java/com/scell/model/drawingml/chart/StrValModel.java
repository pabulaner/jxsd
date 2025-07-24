package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class StrValModel {
  private final UnsignedIntModel idx;

  private final XstringModel v;

  public StrValModel(UnsignedIntModel idx, XstringModel v) {
    this.idx = idx;
    this.v = v;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public XstringModel getV() {
    return this.v;
  }
}
