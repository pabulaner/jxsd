package com.scell.model.drawingml.chart;

import java.util.List;

public class CustSplitModel {
  private final List<UnsignedIntModel> secondPiePt;

  public CustSplitModel(List<UnsignedIntModel> secondPiePt) {
    this.secondPiePt = secondPiePt;
  }

  public List<UnsignedIntModel> getSecondPiePt() {
    return this.secondPiePt;
  }
}
