package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.LongValueModel;
import com.scell.model.drawingml.main.RatioModel;

public class RatioBuilder {
  private LongValueModel n;

  private LongValueModel d;

  public RatioBuilder() {
  }

  public RatioBuilder setN(LongValueModel n) {
    this.n = n;
    return this;
  }

  public RatioBuilder setD(LongValueModel d) {
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
