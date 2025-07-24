package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.NumValModel;
import com.scell.model.drawingml.chart.XstringModel;

public class NumValBuilder {
  private XstringModel formatCode;

  private UnsignedIntModel idx;

  private XstringModel v;

  public NumValBuilder() {
  }

  public NumValBuilder setFormatCode(XstringModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumValBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public NumValBuilder setV(XstringModel v) {
    this.v = v;
    return this;
  }

  public NumValModel build() {
    return new NumValModel(this.formatCode, this.idx, this.v);
  }

  public NumValBuilder from(NumValModel value) {
    this.formatCode = value.getFormatCode();
    this.idx = value.getIdx();
    this.v = value.getV();
    return this;
  }
}
