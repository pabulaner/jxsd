package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_StrValModel;
import com.scell.model.drawingml.chart.ST_XstringModel;

public class CT_StrValBuilder {
  private UnsignedIntModel idx;

  private ST_XstringModel v;

  public CT_StrValBuilder() {
  }

  public CT_StrValBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_StrValBuilder setV(ST_XstringModel v) {
    this.v = v;
    return this;
  }

  public CT_StrValModel build() {
    return new CT_StrValModel(this.idx, this.v);
  }

  public CT_StrValBuilder from(CT_StrValModel value) {
    this.idx = value.getIdx();
    this.v = value.getV();
    return this;
  }
}
