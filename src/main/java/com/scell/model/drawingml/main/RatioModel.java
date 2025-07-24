package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.LongModel;

public class RatioModel {
  private final LongModel n;

  private final LongModel d;

  public RatioModel(LongModel n, LongModel d) {
    this.n = n;
    this.d = d;
  }

  public LongModel getN() {
    return this.n;
  }

  public LongModel getD() {
    return this.d;
  }
}
