package com.scell.model.drawingml.main;

public class BiLevelEffectModel {
  private final PositiveFixedPercentageValueModel thresh;

  public BiLevelEffectModel(PositiveFixedPercentageValueModel thresh) {
    this.thresh = thresh;
  }

  public PositiveFixedPercentageValueModel getThresh() {
    return this.thresh;
  }
}
