package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.chart.StrValModel;
import com.scell.model.drawingml.chart.XstringValueModel;

public class StrValBuilder {
  private UnsignedIntValueModel idx;

  private XstringValueModel v;

  public StrValBuilder() {
  }

  public StrValBuilder setIdx(UnsignedIntValueModel idx) {
    this.idx = idx;
    return this;
  }

  public StrValBuilder setV(XstringValueModel v) {
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
