package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RectAlignmentValueModel;
import jxsd.gen.model.drawingml.main.ReflectionEffectModel;

/**
 * This is a generated sequence class.
 */
public class ReflectionEffectBuilder {
  private long blurRad;

  private int endPos;

  private int sy;

  private int kx;

  private int stA;

  private int stPos;

  private RectAlignmentValueModel algn;

  private long dist;

  private boolean rotWithShape;

  private int ky;

  private int fadeDir;

  private int sx;

  private int dir;

  private int endA;

  public ReflectionEffectBuilder() {
  }

  public ReflectionEffectBuilder setBlurRad(long blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public ReflectionEffectBuilder setEndPos(int endPos) {
    this.endPos = endPos;
    return this;
  }

  public ReflectionEffectBuilder setSy(int sy) {
    this.sy = sy;
    return this;
  }

  public ReflectionEffectBuilder setKx(int kx) {
    this.kx = kx;
    return this;
  }

  public ReflectionEffectBuilder setStA(int stA) {
    this.stA = stA;
    return this;
  }

  public ReflectionEffectBuilder setStPos(int stPos) {
    this.stPos = stPos;
    return this;
  }

  public ReflectionEffectBuilder setAlgn(RectAlignmentValueModel algn) {
    this.algn = algn;
    return this;
  }

  public ReflectionEffectBuilder setDist(long dist) {
    this.dist = dist;
    return this;
  }

  public ReflectionEffectBuilder setRotWithShape(boolean rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public ReflectionEffectBuilder setKy(int ky) {
    this.ky = ky;
    return this;
  }

  public ReflectionEffectBuilder setFadeDir(int fadeDir) {
    this.fadeDir = fadeDir;
    return this;
  }

  public ReflectionEffectBuilder setSx(int sx) {
    this.sx = sx;
    return this;
  }

  public ReflectionEffectBuilder setDir(int dir) {
    this.dir = dir;
    return this;
  }

  public ReflectionEffectBuilder setEndA(int endA) {
    this.endA = endA;
    return this;
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

  public ReflectionEffectModel build() {
    return new ReflectionEffectModel(this.blurRad, this.endPos, this.sy, this.kx, this.stA, this.stPos, this.algn, this.dist, this.rotWithShape, this.ky, this.fadeDir, this.sx, this.dir, this.endA);
  }
}
