package com.scell.model.drawingml.main;

public class AlphaBiLevelEffectModel {
  private final PositiveFixedPercentageValueModel thresh;

  public AlphaBiLevelEffectModel(PositiveFixedPercentageValueModel thresh) {
    this.thresh = thresh;
  }

  public PositiveFixedPercentageValueModel getThresh() {
    return this.thresh;
  }
}
