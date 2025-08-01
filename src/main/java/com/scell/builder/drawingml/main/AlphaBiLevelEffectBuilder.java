package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;

public class AlphaBiLevelEffectBuilder {
  private PositiveFixedPercentageValueModel thresh;

  public AlphaBiLevelEffectBuilder() {
  }

  public AlphaBiLevelEffectBuilder setThresh(PositiveFixedPercentageValueModel thresh) {
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
