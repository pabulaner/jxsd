package test.drawingml.main;

import test.XMLSchema.LongModel;

public class CTRatioModel {
  private final LongModel n;

  private final LongModel d;

  public CTRatioModel(LongModel n, LongModel d) {
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
