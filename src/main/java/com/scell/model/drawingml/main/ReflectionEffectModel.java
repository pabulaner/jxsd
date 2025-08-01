package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;

public class ReflectionEffectModel {
  private final PositiveCoordinateValueModel blurRad;

  private final PositiveFixedPercentageValueModel endPos;

  private final PercentageValueModel sy;

  private final FixedAngleValueModel kx;

  private final PositiveFixedPercentageValueModel stA;

  private final PositiveFixedPercentageValueModel stPos;

  private final RectAlignmentValueModel algn;

  private final PositiveCoordinateValueModel dist;

  private final BooleanValueModel rotWithShape;

  private final FixedAngleValueModel ky;

  private final PositiveFixedAngleValueModel fadeDir;

  private final PercentageValueModel sx;

  private final PositiveFixedAngleValueModel dir;

  private final PositiveFixedPercentageValueModel endA;

  public ReflectionEffectModel(PositiveCoordinateValueModel blurRad,
      PositiveFixedPercentageValueModel endPos, PercentageValueModel sy, FixedAngleValueModel kx,
      PositiveFixedPercentageValueModel stA, PositiveFixedPercentageValueModel stPos,
      RectAlignmentValueModel algn, PositiveCoordinateValueModel dist,
      BooleanValueModel rotWithShape, FixedAngleValueModel ky, PositiveFixedAngleValueModel fadeDir,
      PercentageValueModel sx, PositiveFixedAngleValueModel dir,
      PositiveFixedPercentageValueModel endA) {
    this.blurRad = blurRad;
    this.endPos = endPos;
    this.sy = sy;
    this.kx = kx;
    this.stA = stA;
    this.stPos = stPos;
    this.algn = algn;
    this.dist = dist;
    this.rotWithShape = rotWithShape;
    this.ky = ky;
    this.fadeDir = fadeDir;
    this.sx = sx;
    this.dir = dir;
    this.endA = endA;
  }

  public PositiveCoordinateValueModel getBlurRad() {
    return this.blurRad;
  }

  public PositiveFixedPercentageValueModel getEndPos() {
    return this.endPos;
  }

  public PercentageValueModel getSy() {
    return this.sy;
  }

  public FixedAngleValueModel getKx() {
    return this.kx;
  }

  public PositiveFixedPercentageValueModel getStA() {
    return this.stA;
  }

  public PositiveFixedPercentageValueModel getStPos() {
    return this.stPos;
  }

  public RectAlignmentValueModel getAlgn() {
    return this.algn;
  }

  public PositiveCoordinateValueModel getDist() {
    return this.dist;
  }

  public BooleanValueModel getRotWithShape() {
    return this.rotWithShape;
  }

  public FixedAngleValueModel getKy() {
    return this.ky;
  }

  public PositiveFixedAngleValueModel getFadeDir() {
    return this.fadeDir;
  }

  public PercentageValueModel getSx() {
    return this.sx;
  }

  public PositiveFixedAngleValueModel getDir() {
    return this.dir;
  }

  public PositiveFixedPercentageValueModel getEndA() {
    return this.endA;
  }
}
