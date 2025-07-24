package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BiLevelEffectModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageModel;

public class BiLevelEffectBuilder {
  private PositiveFixedPercentageModel thresh;

  public BiLevelEffectBuilder() {
  }

  public BiLevelEffectBuilder setThresh(PositiveFixedPercentageModel thresh) {
    this.thresh = thresh;
    return this;
  }

  public BiLevelEffectModel build() {
    return new BiLevelEffectModel(this.thresh);
  }

  public BiLevelEffectBuilder from(BiLevelEffectModel value) {
    this.thresh = value.getThresh();
    return this;
  }
}
