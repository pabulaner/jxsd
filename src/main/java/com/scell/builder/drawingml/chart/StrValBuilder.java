package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.StrValModel;
import com.scell.model.drawingml.chart.XstringModel;

public class StrValBuilder {
  private UnsignedIntModel idx;

  private XstringModel v;

  public StrValBuilder() {
  }

  public StrValBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public StrValBuilder setV(XstringModel v) {
    this.v = v;
    return this;
  }

  public StrValModel build() {
    return new StrValModel(this.idx, this.v);
  }

  public StrValBuilder from(StrValModel value) {
    this.idx = value.getIdx();
    this.v = value.getV();
    return this;
  }
}
