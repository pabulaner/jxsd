package com.scell.model.drawingml.main;

public class CT_BiLevelEffectModel {
  private final ST_PositiveFixedPercentageModel thresh;

  public CT_BiLevelEffectModel(ST_PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
  }

  public ST_PositiveFixedPercentageModel getThresh() {
    return this.thresh;
  }
}
