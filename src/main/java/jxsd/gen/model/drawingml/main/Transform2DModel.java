package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Transform2DBuilder;

/**
 * This is a generated sequence class.
 */
public class Transform2DModel {
  private final boolean flipV;

  private final int rot;

  private final boolean flipH;

  private final Point2DModel off;

  private final PositiveSize2DModel ext;

  public Transform2DModel(boolean flipV, int rot, boolean flipH, Point2DModel off,
      PositiveSize2DModel ext) {
    this.flipV = flipV;
    this.rot = rot;
    this.flipH = flipH;
    this.off = off;
    this.ext = ext;
  }

  public Transform2DBuilder builder() {
    return new Transform2DBuilder().from(this);
  }

  public boolean getFlipV() {
    return this.flipV;
  }

  public int getRot() {
    return this.rot;
  }

  public boolean getFlipH() {
    return this.flipH;
  }

  public Point2DModel getOff() {
    return this.off;
  }

  public PositiveSize2DModel getExt() {
    return this.ext;
  }
}
