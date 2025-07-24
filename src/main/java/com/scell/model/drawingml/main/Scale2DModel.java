package com.scell.model.drawingml.main;

public class Scale2DModel {
  private final RatioModel sx;

  private final RatioModel sy;

  public Scale2DModel(RatioModel sx, RatioModel sy) {
    this.sx = sx;
    this.sy = sy;
  }

  public RatioModel getSx() {
    return this.sx;
  }

  public RatioModel getSy() {
    return this.sy;
  }
}
