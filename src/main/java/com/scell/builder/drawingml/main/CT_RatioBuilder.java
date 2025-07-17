package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.LongModel;
import com.scell.model.drawingml.main.CT_RatioModel;

public class CT_RatioBuilder {
  private LongModel n;

  private LongModel d;

  public CT_RatioBuilder() {
  }

  public CT_RatioBuilder setN(LongModel n) {
    this.n = n;
    return this;
  }

  public CT_RatioBuilder setD(LongModel d) {
    this.d = d;
    return this;
  }

  public CT_RatioModel build() {
    return new CT_RatioModel(this.n, this.d);
  }

  public CT_RatioBuilder from(CT_RatioModel value) {
    this.n = value.getN();
    this.d = value.getD();
    return this;
  }
}
