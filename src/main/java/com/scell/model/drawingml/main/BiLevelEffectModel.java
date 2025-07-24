package com.scell.model.drawingml.main;

public class BiLevelEffectModel {
  private final PositiveFixedPercentageModel thresh;

  public BiLevelEffectModel(PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
  }

  public PositiveFixedPercentageModel getThresh() {
    return this.thresh;
  }
}
