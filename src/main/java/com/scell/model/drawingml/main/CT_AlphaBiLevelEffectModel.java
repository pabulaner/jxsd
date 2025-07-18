package com.scell.model.drawingml.main;

public class CT_AlphaBiLevelEffectModel {
  private final ST_PositiveFixedPercentageModel thresh;

  public CT_AlphaBiLevelEffectModel(ST_PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
  }

  public ST_PositiveFixedPercentageModel getThresh() {
    return this.thresh;
  }
}
