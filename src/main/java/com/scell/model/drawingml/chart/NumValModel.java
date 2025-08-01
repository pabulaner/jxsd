package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class NumValModel {
  private final XstringValueModel formatCode;

  private final UnsignedIntValueModel idx;

  private final XstringValueModel v;

  public NumValModel(XstringValueModel formatCode, UnsignedIntValueModel idx, XstringValueModel v) {
    this.formatCode = formatCode;
    this.idx = idx;
    this.v = v;
  }

  public XstringValueModel getFormatCode() {
    return this.formatCode;
  }

  public UnsignedIntValueModel getIdx() {
    return this.idx;
  }

  public XstringValueModel getV() {
    return this.v;
  }
}
