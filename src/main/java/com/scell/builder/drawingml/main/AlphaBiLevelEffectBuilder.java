package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageModel;

public class AlphaBiLevelEffectBuilder {
  private PositiveFixedPercentageModel thresh;

  public AlphaBiLevelEffectBuilder() {
  }

  public AlphaBiLevelEffectBuilder setThresh(PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
    return this;
  }

  public AlphaBiLevelEffectModel build() {
    return new AlphaBiLevelEffectModel(this.thresh);
  }

  public AlphaBiLevelEffectBuilder from(AlphaBiLevelEffectModel value) {
    this.thresh = value.getThresh();
    return this;
  }
}
