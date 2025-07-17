package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_ReflectionEffectModel;
import com.scell.model.drawingml.main.ST_FixedAngleModel;
import com.scell.model.drawingml.main.ST_PercentageModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;
import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;
import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.ST_RectAlignmentModel;

public class CT_ReflectionEffectBuilder {
  private ST_PositiveCoordinateModel blurRad;

  private ST_PositiveFixedPercentageModel endPos;

  private ST_PercentageModel sy;

  private ST_FixedAngleModel kx;

  private ST_PositiveFixedPercentageModel stA;

  private ST_PositiveFixedPercentageModel stPos;

  private ST_RectAlignmentModel algn;

  private ST_PositiveCoordinateModel dist;

  private BooleanModel rotWithShape;

  private ST_FixedAngleModel ky;

  private ST_PositiveFixedAngleModel fadeDir;

  private ST_PercentageModel sx;

  private ST_PositiveFixedAngleModel dir;

  private ST_PositiveFixedPercentageModel endA;

  public CT_ReflectionEffectBuilder() {
  }

  public CT_ReflectionEffectBuilder setBlurRad(ST_PositiveCoordinateModel blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public CT_ReflectionEffectBuilder setEndPos(ST_PositiveFixedPercentageModel endPos) {
    this.endPos = endPos;
    return this;
  }

  public CT_ReflectionEffectBuilder setSy(ST_PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public CT_ReflectionEffectBuilder setKx(ST_FixedAngleModel kx) {
    this.kx = kx;
    return this;
  }

  public CT_ReflectionEffectBuilder setStA(ST_PositiveFixedPercentageModel stA) {
    this.stA = stA;
    return this;
  }

  public CT_ReflectionEffectBuilder setStPos(ST_PositiveFixedPercentageModel stPos) {
    this.stPos = stPos;
    return this;
  }

  public CT_ReflectionEffectBuilder setAlgn(ST_RectAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public CT_ReflectionEffectBuilder setDist(ST_PositiveCoordinateModel dist) {
    this.dist = dist;
    return this;
  }

  public CT_ReflectionEffectBuilder setRotWithShape(BooleanModel rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public CT_ReflectionEffectBuilder setKy(ST_FixedAngleModel ky) {
    this.ky = ky;
    return this;
  }

  public CT_ReflectionEffectBuilder setFadeDir(ST_PositiveFixedAngleModel fadeDir) {
    this.fadeDir = fadeDir;
    return this;
  }

  public CT_ReflectionEffectBuilder setSx(ST_PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public CT_ReflectionEffectBuilder setDir(ST_PositiveFixedAngleModel dir) {
    this.dir = dir;
    return this;
  }

  public CT_ReflectionEffectBuilder setEndA(ST_PositiveFixedPercentageModel endA) {
    this.endA = endA;
    return this;
  }

  public CT_ReflectionEffectModel build() {
    return new CT_ReflectionEffectModel(this.blurRad, this.endPos, this.sy, this.kx, this.stA, this.stPos, this.algn, this.dist, this.rotWithShape, this.ky, this.fadeDir, this.sx, this.dir, this.endA);
  }

  public CT_ReflectionEffectBuilder from(CT_ReflectionEffectModel value) {
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
