package com.scell.model.drawingml.main;

public class TransformEffectModel {
  private final PercentageModel sy;

  private final FixedAngleModel ky;

  private final PercentageModel sx;

  private final CoordinateModel ty;

  private final FixedAngleModel kx;

  private final CoordinateModel tx;

  public TransformEffectModel(PercentageModel sy, FixedAngleModel ky, PercentageModel sx,
      CoordinateModel ty, FixedAngleModel kx, CoordinateModel tx) {
    this.sy = sy;
    this.ky = ky;
    this.sx = sx;
    this.ty = ty;
    this.kx = kx;
    this.tx = tx;
  }

  public PercentageModel getSy() {
    return this.sy;
  }

  public FixedAngleModel getKy() {
    return this.ky;
  }

  public PercentageModel getSx() {
    return this.sx;
  }

  public CoordinateModel getTy() {
    return this.ty;
  }

  public FixedAngleModel getKx() {
    return this.kx;
  }

  public CoordinateModel getTx() {
    return this.tx;
  }
}
