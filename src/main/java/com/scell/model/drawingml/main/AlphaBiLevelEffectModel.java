package com.scell.model.drawingml.main;

public class AlphaBiLevelEffectModel {
  private final PositiveFixedPercentageModel thresh;

  public AlphaBiLevelEffectModel(PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
  }

  public PositiveFixedPercentageModel getThresh() {
    return this.thresh;
  }
}
