package com.scell.model.drawingml.main;

public class TransformEffectModel {
  private final PercentageValueModel sy;

  private final FixedAngleValueModel ky;

  private final PercentageValueModel sx;

  private final CoordinateValueModel ty;

  private final FixedAngleValueModel kx;

  private final CoordinateValueModel tx;

  public TransformEffectModel(PercentageValueModel sy, FixedAngleValueModel ky,
      PercentageValueModel sx, CoordinateValueModel ty, FixedAngleValueModel kx,
      CoordinateValueModel tx) {
    this.sy = sy;
    this.ky = ky;
    this.sx = sx;
    this.ty = ty;
    this.kx = kx;
    this.tx = tx;
  }

  public PercentageValueModel getSy() {
    return this.sy;
  }

  public FixedAngleValueModel getKy() {
    return this.ky;
  }

  public PercentageValueModel getSx() {
    return this.sx;
  }

  public CoordinateValueModel getTy() {
    return this.ty;
  }

  public FixedAngleValueModel getKx() {
    return this.kx;
  }

  public CoordinateValueModel getTx() {
    return this.tx;
  }
}
