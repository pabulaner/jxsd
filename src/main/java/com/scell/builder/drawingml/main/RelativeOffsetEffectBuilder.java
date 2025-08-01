package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.RelativeOffsetEffectModel;

public class RelativeOffsetEffectBuilder {
  private PercentageValueModel ty;

  private PercentageValueModel tx;

  public RelativeOffsetEffectBuilder() {
  }

  public RelativeOffsetEffectBuilder setTy(PercentageValueModel ty) {
    this.ty = ty;
    return this;
  }

  public RelativeOffsetEffectBuilder setTx(PercentageValueModel tx) {
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
