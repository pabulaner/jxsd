package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class ReflectionEffectModel {
  private final PositiveCoordinateModel blurRad;

  private final PositiveFixedPercentageModel endPos;

  private final PercentageModel sy;

  private final FixedAngleModel kx;

  private final PositiveFixedPercentageModel stA;

  private final PositiveFixedPercentageModel stPos;

  private final RectAlignmentModel algn;

  private final PositiveCoordinateModel dist;

  private final BooleanModel rotWithShape;

  private final FixedAngleModel ky;

  private final PositiveFixedAngleModel fadeDir;

  private final PercentageModel sx;

  private final PositiveFixedAngleModel dir;

  private final PositiveFixedPercentageModel endA;

  public ReflectionEffectModel(PositiveCoordinateModel blurRad, PositiveFixedPercentageModel endPos,
      PercentageModel sy, FixedAngleModel kx, PositiveFixedPercentageModel stA,
      PositiveFixedPercentageModel stPos, RectAlignmentModel algn, PositiveCoordinateModel dist,
      BooleanModel rotWithShape, FixedAngleModel ky, PositiveFixedAngleModel fadeDir,
      PercentageModel sx, PositiveFixedAngleModel dir, PositiveFixedPercentageModel endA) {
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

  public PositiveCoordinateModel getBlurRad() {
    return this.blurRad;
  }

  public PositiveFixedPercentageModel getEndPos() {
    return this.endPos;
  }

  public PercentageModel getSy() {
    return this.sy;
  }

  public FixedAngleModel getKx() {
    return this.kx;
  }

  public PositiveFixedPercentageModel getStA() {
    return this.stA;
  }

  public PositiveFixedPercentageModel getStPos() {
    return this.stPos;
  }

  public RectAlignmentModel getAlgn() {
    return this.algn;
  }

  public PositiveCoordinateModel getDist() {
    return this.dist;
  }

  public BooleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public FixedAngleModel getKy() {
    return this.ky;
  }

  public PositiveFixedAngleModel getFadeDir() {
    return this.fadeDir;
  }

  public PercentageModel getSx() {
    return this.sx;
  }

  public PositiveFixedAngleModel getDir() {
    return this.dir;
  }

  public PositiveFixedPercentageModel getEndA() {
    return this.endA;
  }
}
