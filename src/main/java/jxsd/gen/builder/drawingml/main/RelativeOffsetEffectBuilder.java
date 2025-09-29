package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RelativeOffsetEffectModel;

/**
 * This is a generated sequence class.
 */
public class RelativeOffsetEffectBuilder {
  private int ty;

  private int tx;

  public RelativeOffsetEffectBuilder() {
  }

  public RelativeOffsetEffectBuilder setTy(int ty) {
    this.ty = ty;
    return this;
  }

  public RelativeOffsetEffectBuilder setTx(int tx) {
    this.tx = tx;
    return this;
  }

  public RelativeOffsetEffectBuilder from(RelativeOffsetEffectModel value) {
    this.ty = value.getTy();
    this.tx = value.getTx();
    return this;
  }

  public RelativeOffsetEffectModel build() {
    return new RelativeOffsetEffectModel(this.ty, this.tx);
  }
}
