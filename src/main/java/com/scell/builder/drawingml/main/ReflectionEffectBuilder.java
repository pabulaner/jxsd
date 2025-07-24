package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.FixedAngleModel;
import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.PositiveCoordinateModel;
import com.scell.model.drawingml.main.PositiveFixedAngleModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.RectAlignmentModel;
import com.scell.model.drawingml.main.ReflectionEffectModel;

public class ReflectionEffectBuilder {
  private PositiveCoordinateModel blurRad;

  private PositiveFixedPercentageModel endPos;

  private PercentageModel sy;

  private FixedAngleModel kx;

  private PositiveFixedPercentageModel stA;

  private PositiveFixedPercentageModel stPos;

  private RectAlignmentModel algn;

  private PositiveCoordinateModel dist;

  private BooleanModel rotWithShape;

  private FixedAngleModel ky;

  private PositiveFixedAngleModel fadeDir;

  private PercentageModel sx;

  private PositiveFixedAngleModel dir;

  private PositiveFixedPercentageModel endA;

  public ReflectionEffectBuilder() {
  }

  public ReflectionEffectBuilder setBlurRad(PositiveCoordinateModel blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public ReflectionEffectBuilder setEndPos(PositiveFixedPercentageModel endPos) {
    this.endPos = endPos;
    return this;
  }

  public ReflectionEffectBuilder setSy(PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public ReflectionEffectBuilder setKx(FixedAngleModel kx) {
    this.kx = kx;
    return this;
  }

  public ReflectionEffectBuilder setStA(PositiveFixedPercentageModel stA) {
    this.stA = stA;
    return this;
  }

  public ReflectionEffectBuilder setStPos(PositiveFixedPercentageModel stPos) {
    this.stPos = stPos;
    return this;
  }

  public ReflectionEffectBuilder setAlgn(RectAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public ReflectionEffectBuilder setDist(PositiveCoordinateModel dist) {
    this.dist = dist;
    return this;
  }

  public ReflectionEffectBuilder setRotWithShape(BooleanModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public ReflectionEffectBuilder setKy(FixedAngleModel ky) {
    this.ky = ky;
    return this;
  }

  public ReflectionEffectBuilder setFadeDir(PositiveFixedAngleModel fadeDir) {
    this.fadeDir = fadeDir;
    return this;
  }

  public ReflectionEffectBuilder setSx(PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public ReflectionEffectBuilder setDir(PositiveFixedAngleModel dir) {
    this.dir = dir;
    return this;
  }

  public ReflectionEffectBuilder setEndA(PositiveFixedPercentageModel endA) {
    this.endA = endA;
    return this;
  }

  public ReflectionEffectModel build() {
    return new ReflectionEffectModel(this.blurRad, this.endPos, this.sy, this.kx, this.stA, this.stPos, this.algn, this.dist, this.rotWithShape, this.ky, this.fadeDir, this.sx, this.dir, this.endA);
  }

  public ReflectionEffectBuilder from(ReflectionEffectModel value) {
    this.blurRad = value.getBlurRad();
    this.endPos = value.getEndPos();
    this.sy = value.getSy();
    this.kx = value.getKx();
    this.stA = value.getStA();
    this.stPos = value.getStPos();
    this.algn = value.getAlgn();
    this.dist = value.getDist();
    this.rotWithShape = value.getRotWithShape();
    this.ky = value.getKy();
    this.fadeDir = value.getFadeDir();
    this.sx = value.getSx();
    this.dir = value.getDir();
    this.endA = value.getEndA();
    return this;
  }
}
