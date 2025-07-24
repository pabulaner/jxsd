package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;
import com.scell.model.drawingml.main.FixedAngleModel;
import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.TransformEffectModel;

public class TransformEffectBuilder {
  private PercentageModel sy;

  private FixedAngleModel ky;

  private PercentageModel sx;

  private CoordinateModel ty;

  private FixedAngleModel kx;

  private CoordinateModel tx;

  public TransformEffectBuilder() {
  }

  public TransformEffectBuilder setSy(PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public TransformEffectBuilder setKy(FixedAngleModel ky) {
    this.ky = ky;
    return this;
  }

  public TransformEffectBuilder setSx(PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public TransformEffectBuilder setTy(CoordinateModel ty) {
    this.ty = ty;
    return this;
  }

  public TransformEffectBuilder setKx(FixedAngleModel kx) {
    this.kx = kx;
    return this;
  }

  public TransformEffectBuilder setTx(CoordinateModel tx) {
    this.tx = tx;
    return this;
  }

  public TransformEffectModel build() {
    return new TransformEffectModel(this.sy, this.ky, this.sx, this.ty, this.kx, this.tx);
  }

  public TransformEffectBuilder from(TransformEffectModel value) {
    this.sy = value.getSy();
    this.ky = value.getKy();
    this.sx = value.getSx();
    this.ty = value.getTy();
    this.kx = value.getKx();
    this.tx = value.getTx();
    return this;
  }
}
