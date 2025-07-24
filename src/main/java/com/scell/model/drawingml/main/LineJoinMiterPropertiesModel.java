package com.scell.model.drawingml.main;

public class LineJoinMiterPropertiesModel {
  private final PositivePercentageModel lim;

  public LineJoinMiterPropertiesModel(PositivePercentageModel lim) {
    this.lim = lim;
  }

  public PositivePercentageModel getLim() {
    return this.lim;
  }
}
