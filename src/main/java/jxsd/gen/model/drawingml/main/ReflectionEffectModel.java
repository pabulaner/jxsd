package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ReflectionEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class ReflectionEffectModel {
  private final long blurRad;

  private final int endPos;

  private final int sy;

  private final int kx;

  private final int stA;

  private final int stPos;

  private final RectAlignmentValueModel algn;

  private final long dist;

  private final boolean rotWithShape;

  private final int ky;

  private final int fadeDir;

  private final int sx;

  private final int dir;

  private final int endA;

  public ReflectionEffectModel(long blurRad, int endPos, int sy, int kx, int stA, int stPos,
      RectAlignmentValueModel algn, long dist, boolean rotWithShape, int ky, int fadeDir, int sx,
      int dir, int endA) {
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

  public ReflectionEffectBuilder builder() {
    return new ReflectionEffectBuilder().from(this);
  }

  public long getBlurRad() {
    return this.blurRad;
  }

  public int getEndPos() {
    return this.endPos;
  }

  public int getSy() {
    return this.sy;
  }

  public int getKx() {
    return this.kx;
  }

  public int getStA() {
    return this.stA;
  }

  public int getStPos() {
    return this.stPos;
  }

  public RectAlignmentValueModel getAlgn() {
    return this.algn;
  }

  public long getDist() {
    return this.dist;
  }

  public boolean getRotWithShape() {
    return this.rotWithShape;
  }

  public int getKy() {
    return this.ky;
  }

  public int getFadeDir() {
    return this.fadeDir;
  }

  public int getSx() {
    return this.sx;
  }

  public int getDir() {
    return this.dir;
  }

  public int getEndA() {
    return this.endA;
  }
}
