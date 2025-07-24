package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class NumValModel {
  private final XstringModel formatCode;

  private final UnsignedIntModel idx;

  private final XstringModel v;

  public NumValModel(XstringModel formatCode, UnsignedIntModel idx, XstringModel v) {
    this.formatCode = formatCode;
    this.idx = idx;
    this.v = v;
  }

  public XstringModel getFormatCode() {
    return this.formatCode;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public XstringModel getV() {
    return this.v;
  }
}
