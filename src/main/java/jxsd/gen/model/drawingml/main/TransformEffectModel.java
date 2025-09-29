package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TransformEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class TransformEffectModel {
  private final int sy;

  private final int ky;

  private final int sx;

  private final long ty;

  private final int kx;

  private final long tx;

  public TransformEffectModel(int sy, int ky, int sx, long ty, int kx, long tx) {
    this.sy = sy;
    this.ky = ky;
    this.sx = sx;
    this.ty = ty;
    this.kx = kx;
    this.tx = tx;
  }

  public TransformEffectBuilder builder() {
    return new TransformEffectBuilder().from(this);
  }

  public int getSy() {
    return this.sy;
  }

  public int getKy() {
    return this.ky;
  }

  public int getSx() {
    return this.sx;
  }

  public long getTy() {
    return this.ty;
  }

  public int getKx() {
    return this.kx;
  }

  public long getTx() {
    return this.tx;
  }
}
