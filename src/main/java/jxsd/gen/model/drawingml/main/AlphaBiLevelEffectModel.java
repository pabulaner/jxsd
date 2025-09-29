package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AlphaBiLevelEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class AlphaBiLevelEffectModel {
  private final int thresh;

  public AlphaBiLevelEffectModel(int thresh) {
    this.thresh = thresh;
  }

  public AlphaBiLevelEffectBuilder builder() {
    return new AlphaBiLevelEffectBuilder().from(this);
  }

  public int getThresh() {
    return this.thresh;
  }
}
