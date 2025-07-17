package model.drawingml.main;

import model.XMLSchema.longModel;

public class CT_RatioModel {
  private final longModel n;

  private final longModel d;

  public CT_RatioModel(longModel n, longModel d) {
    this.n = n;
    this.d = d;
  }

  public longModel getN() {
    return this.n;
  }

  public longModel getD() {
    return this.d;
  }
}
