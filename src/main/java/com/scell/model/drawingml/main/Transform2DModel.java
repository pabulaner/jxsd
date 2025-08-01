package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class Transform2DModel {
  private final BooleanValueModel flipV;

  private final AngleValueModel rot;

  private final BooleanValueModel flipH;

  private final Point2DModel off;

  private final PositiveSize2DModel ext;

  public Transform2DModel(BooleanValueModel flipV, AngleValueModel rot, BooleanValueModel flipH,
      Point2DModel off, PositiveSize2DModel ext) {
    this.flipV = flipV;
    this.rot = rot;
    this.flipH = flipH;
    this.off = off;
    this.ext = ext;
  }

  public BooleanValueModel getFlipV() {
    return this.flipV;
  }

  public AngleValueModel getRot() {
    return this.rot;
  }

  public BooleanValueModel getFlipH() {
    return this.flipH;
  }

  public Point2DModel getOff() {
    return this.off;
  }

  public PositiveSize2DModel getExt() {
    return this.ext;
  }
}
