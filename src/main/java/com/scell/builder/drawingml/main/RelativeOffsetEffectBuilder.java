package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.RelativeOffsetEffectModel;

public class RelativeOffsetEffectBuilder {
  private PercentageModel ty;

  private PercentageModel tx;

  public RelativeOffsetEffectBuilder() {
  }

  public RelativeOffsetEffectBuilder setTy(PercentageModel ty) {
    this.ty = ty;
    return this;
  }

  public RelativeOffsetEffectBuilder setTx(PercentageModel tx) {
    this.tx = tx;
    return this;
  }

  public RelativeOffsetEffectModel build() {
    return new RelativeOffsetEffectModel(this.ty, this.tx);
  }

  public RelativeOffsetEffectBuilder from(RelativeOffsetEffectModel value) {
    this.ty = value.getTy();
    this.tx = value.getTx();
    return this;
  }
}
