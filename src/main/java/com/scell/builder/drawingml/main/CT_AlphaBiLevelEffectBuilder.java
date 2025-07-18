package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AlphaBiLevelEffectModel;
import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;

public class CT_AlphaBiLevelEffectBuilder {
  private ST_PositiveFixedPercentageModel thresh;

  public CT_AlphaBiLevelEffectBuilder() {
  }

  public CT_AlphaBiLevelEffectBuilder setThresh(ST_PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
    return this;
  }

  public CT_AlphaBiLevelEffectModel build() {
    return new CT_AlphaBiLevelEffectModel(this.thresh);
  }

  public CT_AlphaBiLevelEffectBuilder from(CT_AlphaBiLevelEffectModel value) {
    this.thresh = value.getThresh();
    return this;
  }
}
