package com.scell.model.drawingml.main;

public class CT_Scale2DModel {
  private final CT_RatioModel sx;

  private final CT_RatioModel sy;

  public CT_Scale2DModel(CT_RatioModel sx, CT_RatioModel sy) {
    this.sx = sx;
    this.sy = sy;
  }

  public CT_RatioModel getSx() {
    return this.sx;
  }

  public CT_RatioModel getSy() {
    return this.sy;
  }
}
