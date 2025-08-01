package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.LongValueModel;

public class RatioModel {
  private final LongValueModel n;

  private final LongValueModel d;

  public RatioModel(LongValueModel n, LongValueModel d) {
    this.n = n;
    this.d = d;
  }

  public LongValueModel getN() {
    return this.n;
  }

  public LongValueModel getD() {
    return this.d;
  }
}
