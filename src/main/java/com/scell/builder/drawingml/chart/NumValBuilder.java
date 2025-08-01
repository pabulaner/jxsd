package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.chart.NumValModel;
import com.scell.model.drawingml.chart.XstringValueModel;

public class NumValBuilder {
  private XstringValueModel formatCode;

  private UnsignedIntValueModel idx;

  private XstringValueModel v;

  public NumValBuilder() {
  }

  public NumValBuilder setFormatCode(XstringValueModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public NumValBuilder setIdx(UnsignedIntValueModel idx) {
    this.idx = idx;
    return this;
  }

  public NumValBuilder setV(XstringValueModel v) {
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
