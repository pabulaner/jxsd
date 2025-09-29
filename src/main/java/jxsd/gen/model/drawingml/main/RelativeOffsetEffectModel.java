package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.RelativeOffsetEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class RelativeOffsetEffectModel {
  private final int ty;

  private final int tx;

  public RelativeOffsetEffectModel(int ty, int tx) {
    this.ty = ty;
    this.tx = tx;
  }

  public RelativeOffsetEffectBuilder builder() {
    return new RelativeOffsetEffectBuilder().from(this);
  }

  public int getTy() {
    return this.ty;
  }

  public int getTx() {
    return this.tx;
  }
}
