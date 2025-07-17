package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TransformEffectModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;
import com.scell.model.drawingml.main.ST_FixedAngleModel;
import com.scell.model.drawingml.main.ST_PercentageModel;

public class CT_TransformEffectBuilder {
  private ST_PercentageModel sy;

  private ST_FixedAngleModel ky;

  private ST_PercentageModel sx;

  private ST_CoordinateModel ty;

  private ST_FixedAngleModel kx;

  private ST_CoordinateModel tx;

  public CT_TransformEffectBuilder() {
  }

  public CT_TransformEffectBuilder setSy(ST_PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public CT_TransformEffectBuilder setKy(ST_FixedAngleModel ky) {
    this.ky = ky;
    return this;
  }

  public CT_TransformEffectBuilder setSx(ST_PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public CT_TransformEffectBuilder setTy(ST_CoordinateModel ty) {
    this.ty = ty;
    return this;
  }

  public CT_TransformEffectBuilder setKx(ST_FixedAngleModel kx) {
    this.kx = kx;
    return this;
  }

  public CT_TransformEffectBuilder setTx(ST_CoordinateModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_TransformEffectModel build() {
    return new CT_TransformEffectModel(this.sy, this.ky, this.sx, this.ty, this.kx, this.tx);
  }

  public CT_TransformEffectBuilder from(CT_TransformEffectModel value) {
    this.sy = value.getSy();
    this.ky = value.getKy();
    this.sx = value.getSx();
    this.ty = value.getTy();
    this.kx = value.getKx();
    this.tx = value.getTx();
    return this;
  }
}
