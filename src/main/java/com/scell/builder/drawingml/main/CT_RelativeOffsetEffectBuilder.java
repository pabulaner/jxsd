package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_RelativeOffsetEffectModel;
import com.scell.model.drawingml.main.ST_PercentageModel;

public class CT_RelativeOffsetEffectBuilder {
  private ST_PercentageModel ty;

  private ST_PercentageModel tx;

  public CT_RelativeOffsetEffectBuilder() {
  }

  public CT_RelativeOffsetEffectBuilder setTy(ST_PercentageModel ty) {
    this.ty = ty;
    return this;
  }

  public CT_RelativeOffsetEffectBuilder setTx(ST_PercentageModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_RelativeOffsetEffectModel build() {
    return new CT_RelativeOffsetEffectModel(this.ty, this.tx);
  }

  public CT_RelativeOffsetEffectBuilder from(CT_RelativeOffsetEffectModel value) {
    this.ty = value.getTy();
    this.tx = value.getTx();
    return this;
  }
}
