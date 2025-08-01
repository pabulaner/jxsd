package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class StrValModel {
  private final UnsignedIntValueModel idx;

  private final XstringValueModel v;

  public StrValModel(UnsignedIntValueModel idx, XstringValueModel v) {
    this.idx = idx;
    this.v = v;
  }

  public UnsignedIntValueModel getIdx() {
    return this.idx;
  }

  public XstringValueModel getV() {
    return this.v;
  }
}
