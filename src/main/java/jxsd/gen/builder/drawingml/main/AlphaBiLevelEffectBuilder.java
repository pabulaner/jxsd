package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaBiLevelEffectModel;

/**
 * This is a generated sequence class.
 */
public class AlphaBiLevelEffectBuilder {
  private int thresh;

  public AlphaBiLevelEffectBuilder() {
  }

  public AlphaBiLevelEffectBuilder setThresh(int thresh) {
    this.thresh = thresh;
    return this;
  }

  public AlphaBiLevelEffectBuilder from(AlphaBiLevelEffectModel value) {
    this.thresh = value.getThresh();
    return this;
  }

  public AlphaBiLevelEffectModel build() {
    return new AlphaBiLevelEffectModel(this.thresh);
  }
}
