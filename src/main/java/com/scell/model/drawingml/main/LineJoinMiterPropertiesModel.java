package com.scell.model.drawingml.main;

public class LineJoinMiterPropertiesModel {
  private final PositivePercentageValueModel lim;

  public LineJoinMiterPropertiesModel(PositivePercentageValueModel lim) {
    this.lim = lim;
  }

  public PositivePercentageValueModel getLim() {
    return this.lim;
  }
}
