package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;

public class CT_ReflectionEffectModel {
  private final ST_PositiveCoordinateModel blurRad;

  private final ST_PositiveFixedPercentageModel endPos;

  private final ST_PercentageModel sy;

  private final ST_FixedAngleModel kx;

  private final ST_PositiveFixedPercentageModel stA;

  private final ST_PositiveFixedPercentageModel stPos;

  private final ST_RectAlignmentModel algn;

  private final ST_PositiveCoordinateModel dist;

  private final BooleanModel rotWithShape;

  private final ST_FixedAngleModel ky;

  private final ST_PositiveFixedAngleModel fadeDir;

  private final ST_PercentageModel sx;

  private final ST_PositiveFixedAngleModel dir;

  private final ST_PositiveFixedPercentageModel endA;

  public CT_ReflectionEffectModel(ST_PositiveCoordinateModel blurRad,
      ST_PositiveFixedPercentageModel endPos, ST_PercentageModel sy, ST_FixedAngleModel kx,
      ST_PositiveFixedPercentageModel stA, ST_PositiveFixedPercentageModel stPos,
      ST_RectAlignmentModel algn, ST_PositiveCoordinateModel dist, BooleanModel rotWithShape,
      ST_FixedAngleModel ky, ST_PositiveFixedAngleModel fadeDir, ST_PercentageModel sx,
      ST_PositiveFixedAngleModel dir, ST_PositiveFixedPercentageModel endA) {
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

  public ST_PositiveCoordinateModel getBlurRad() {
    return this.blurRad;
  }

  public ST_PositiveFixedPercentageModel getEndPos() {
    return this.endPos;
  }

  public ST_PercentageModel getSy() {
    return this.sy;
  }

  public ST_FixedAngleModel getKx() {
    return this.kx;
  }

  public ST_PositiveFixedPercentageModel getStA() {
    return this.stA;
  }

  public ST_PositiveFixedPercentageModel getStPos() {
    return this.stPos;
  }

  public ST_RectAlignmentModel getAlgn() {
    return this.algn;
  }

  public ST_PositiveCoordinateModel getDist() {
    return this.dist;
  }

  public BooleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public ST_FixedAngleModel getKy() {
    return this.ky;
  }

  public ST_PositiveFixedAngleModel getFadeDir() {
    return this.fadeDir;
  }

  public ST_PercentageModel getSx() {
    return this.sx;
  }

  public ST_PositiveFixedAngleModel getDir() {
    return this.dir;
  }

  public ST_PositiveFixedPercentageModel getEndA() {
    return this.endA;
  }
}
