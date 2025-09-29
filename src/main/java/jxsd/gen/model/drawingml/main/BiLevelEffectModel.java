package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BiLevelEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class BiLevelEffectModel {
  private final int thresh;

  public BiLevelEffectModel(int thresh) {
    this.thresh = thresh;
  }

  public BiLevelEffectBuilder builder() {
    return new BiLevelEffectBuilder().from(this);
  }

  public int getThresh() {
    return this.thresh;
  }
}
