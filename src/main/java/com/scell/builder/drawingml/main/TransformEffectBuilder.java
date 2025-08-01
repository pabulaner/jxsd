package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;
import com.scell.model.drawingml.main.FixedAngleValueModel;
import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.TransformEffectModel;

public class TransformEffectBuilder {
  private PercentageValueModel sy;

  private FixedAngleValueModel ky;

  private PercentageValueModel sx;

  private CoordinateValueModel ty;

  private FixedAngleValueModel kx;

  private CoordinateValueModel tx;

  public TransformEffectBuilder() {
  }

  public TransformEffectBuilder setSy(PercentageValueModel sy) {
    this.sy = sy;
    return this;
  }

  public TransformEffectBuilder setKy(FixedAngleValueModel ky) {
    this.ky = ky;
    return this;
  }

  public TransformEffectBuilder setSx(PercentageValueModel sx) {
    this.sx = sx;
    return this;
  }

  public TransformEffectBuilder setTy(CoordinateValueModel ty) {
    this.ty = ty;
    return this;
  }

  public TransformEffectBuilder setKx(FixedAngleValueModel kx) {
    this.kx = kx;
    return this;
  }

  public TransformEffectBuilder setTx(CoordinateValueModel tx) {
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
