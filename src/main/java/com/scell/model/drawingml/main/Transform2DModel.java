package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class Transform2DModel {
  private final BooleanModel flipV;

  private final AngleModel rot;

  private final BooleanModel flipH;

  private final Point2DModel off;

  private final PositiveSize2DModel ext;

  public Transform2DModel(BooleanModel flipV, AngleModel rot, BooleanModel flipH, Point2DModel off,
      PositiveSize2DModel ext) {
    this.flipV = flipV;
    this.rot = rot;
    this.flipH = flipH;
    this.off = off;
    this.ext = ext;
  }

  public BooleanModel getFlipV() {
    return this.flipV;
  }

  public AngleModel getRot() {
    return this.rot;
  }

  public BooleanModel getFlipH() {
    return this.flipH;
  }

  public Point2DModel getOff() {
    return this.off;
  }

  public PositiveSize2DModel getExt() {
    return this.ext;
  }
}
