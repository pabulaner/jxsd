package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BiLevelEffectModel;
import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;

public class CT_BiLevelEffectBuilder {
  private ST_PositiveFixedPercentageModel thresh;

  public CT_BiLevelEffectBuilder() {
  }

  public CT_BiLevelEffectBuilder setThresh(ST_PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
    return this;
  }

  public CT_BiLevelEffectModel build() {
    return new CT_BiLevelEffectModel(this.thresh);
  }

  public CT_BiLevelEffectBuilder from(CT_BiLevelEffectModel value) {
    this.thresh = value.getThresh();
    return this;
  }
}
