package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BiLevelEffectModel;

/**
 * This is a generated sequence class.
 */
public class BiLevelEffectBuilder {
  private int thresh;

  public BiLevelEffectBuilder() {
  }

  public BiLevelEffectBuilder setThresh(int thresh) {
    this.thresh = thresh;
    return this;
  }

  public BiLevelEffectBuilder from(BiLevelEffectModel value) {
    this.thresh = value.getThresh();
    return this;
  }

  public BiLevelEffectModel build() {
    return new BiLevelEffectModel(this.thresh);
  }
}
