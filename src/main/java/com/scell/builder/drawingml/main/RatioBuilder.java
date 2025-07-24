package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.LongModel;
import com.scell.model.drawingml.main.RatioModel;

public class RatioBuilder {
  private LongModel n;

  private LongModel d;

  public RatioBuilder() {
  }

  public RatioBuilder setN(LongModel n) {
    this.n = n;
    return this;
  }

  public RatioBuilder setD(LongModel d) {
    this.d = d;
    return this;
  }

  public RatioModel build() {
    return new RatioModel(this.n, this.d);
  }

  public RatioBuilder from(RatioModel value) {
    this.n = value.getN();
    this.d = value.getD();
    return this;
  }
}
