package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BiLevelEffectModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;

public class BiLevelEffectBuilder {
  private PositiveFixedPercentageValueModel thresh;

  public BiLevelEffectBuilder() {
  }

  public BiLevelEffectBuilder setThresh(PositiveFixedPercentageValueModel thresh) {
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
