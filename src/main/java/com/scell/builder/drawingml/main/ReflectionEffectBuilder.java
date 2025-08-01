package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.FixedAngleValueModel;
import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.PositiveCoordinateValueModel;
import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;
import com.scell.model.drawingml.main.RectAlignmentValueModel;
import com.scell.model.drawingml.main.ReflectionEffectModel;

public class ReflectionEffectBuilder {
  private PositiveCoordinateValueModel blurRad;

  private PositiveFixedPercentageValueModel endPos;

  private PercentageValueModel sy;

  private FixedAngleValueModel kx;

  private PositiveFixedPercentageValueModel stA;

  private PositiveFixedPercentageValueModel stPos;

  private RectAlignmentValueModel algn;

  private PositiveCoordinateValueModel dist;

  private BooleanValueModel rotWithShape;

  private FixedAngleValueModel ky;

  private PositiveFixedAngleValueModel fadeDir;

  private PercentageValueModel sx;

  private PositiveFixedAngleValueModel dir;

  private PositiveFixedPercentageValueModel endA;

  public ReflectionEffectBuilder() {
  }

  public ReflectionEffectBuilder setBlurRad(PositiveCoordinateValueModel blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public ReflectionEffectBuilder setEndPos(PositiveFixedPercentageValueModel endPos) {
    this.endPos = endPos;
    return this;
  }

  public ReflectionEffectBuilder setSy(PercentageValueModel sy) {
    this.sy = sy;
    return this;
  }

  public ReflectionEffectBuilder setKx(FixedAngleValueModel kx) {
    this.kx = kx;
    return this;
  }

  public ReflectionEffectBuilder setStA(PositiveFixedPercentageValueModel stA) {
    this.stA = stA;
    return this;
  }

  public ReflectionEffectBuilder setStPos(PositiveFixedPercentageValueModel stPos) {
    this.stPos = stPos;
    return this;
  }

  public ReflectionEffectBuilder setAlgn(RectAlignmentValueModel algn) {
    this.algn = algn;
    return this;
  }

  public ReflectionEffectBuilder setDist(PositiveCoordinateValueModel dist) {
    this.dist = dist;
    return this;
  }

  public ReflectionEffectBuilder setRotWithShape(BooleanValueModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public ReflectionEffectBuilder setKy(FixedAngleValueModel ky) {
    this.ky = ky;
    return this;
  }

  public ReflectionEffectBuilder setFadeDir(PositiveFixedAngleValueModel fadeDir) {
    this.fadeDir = fadeDir;
    return this;
  }

  public ReflectionEffectBuilder setSx(PercentageValueModel sx) {
    this.sx = sx;
    return this;
  }

  public ReflectionEffectBuilder setDir(PositiveFixedAngleValueModel dir) {
    this.dir = dir;
    return this;
  }

  public ReflectionEffectBuilder setEndA(PositiveFixedPercentageValueModel endA) {
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
