package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TransformEffectModel;

/**
 * This is a generated sequence class.
 */
public class TransformEffectBuilder {
  private int sy;

  private int ky;

  private int sx;

  private long ty;

  private int kx;

  private long tx;

  public TransformEffectBuilder() {
  }

  public TransformEffectBuilder setSy(int sy) {
    this.sy = sy;
    return this;
  }

  public TransformEffectBuilder setKy(int ky) {
    this.ky = ky;
    return this;
  }

  public TransformEffectBuilder setSx(int sx) {
    this.sx = sx;
    return this;
  }

  public TransformEffectBuilder setTy(long ty) {
    this.ty = ty;
    return this;
  }

  public TransformEffectBuilder setKx(int kx) {
    this.kx = kx;
    return this;
  }

  public TransformEffectBuilder setTx(long tx) {
    this.tx = tx;
    return this;
  }

  public TransformEffectBuilder from(TransformEffectModel value) {
    this.sy = value.getSy();
    this.ky = value.getKy();
    this.sx = value.getSx();
    this.ty = value.getTy();
    this.kx = value.getKx();
    this.tx = value.getTx();
    return this;
  }

  public TransformEffectModel build() {
    return new TransformEffectModel(this.sy, this.ky, this.sx, this.ty, this.kx, this.tx);
  }
}
