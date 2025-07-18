package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_NumValModel;
import com.scell.model.drawingml.chart.ST_XstringModel;

public class CT_NumValBuilder {
  private ST_XstringModel formatCode;

  private UnsignedIntModel idx;

  private ST_XstringModel v;

  public CT_NumValBuilder() {
  }

  public CT_NumValBuilder setFormatCode(ST_XstringModel formatCode) {
    this.formatCode = formatCode;
    return this;
  }

  public CT_NumValBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_NumValBuilder setV(ST_XstringModel v) {
    this.v = v;
    return this;
  }

  public CT_NumValModel build() {
    return new CT_NumValModel(this.formatCode, this.idx, this.v);
  }

  public CT_NumValBuilder from(CT_NumValModel value) {
    this.formatCode = value.getFormatCode();
    this.idx = value.getIdx();
    this.v = value.getV();
    return this;
  }
}
