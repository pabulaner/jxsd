package com.scell.model.drawingml.main;

public class CT_LineJoinMiterPropertiesModel {
  private final ST_PositivePercentageModel lim;

  public CT_LineJoinMiterPropertiesModel(ST_PositivePercentageModel lim) {
    this.lim = lim;
  }

  public ST_PositivePercentageModel getLim() {
    return this.lim;
  }
}
