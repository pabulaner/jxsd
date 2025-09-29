package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.GroupTransform2DBuilder;

/**
 * This is a generated sequence class.
 */
public class GroupTransform2DModel {
  private final boolean flipV;

  private final int rot;

  private final boolean flipH;

  private final Point2DModel off;

  private final PositiveSize2DModel ext;

  private final Point2DModel chOff;

  private final PositiveSize2DModel chExt;

  public GroupTransform2DModel(boolean flipV, int rot, boolean flipH, Point2DModel off,
      PositiveSize2DModel ext, Point2DModel chOff, PositiveSize2DModel chExt) {
    this.flipV = flipV;
    this.rot = rot;
    this.flipH = flipH;
    this.off = off;
    this.ext = ext;
    this.chOff = chOff;
    this.chExt = chExt;
  }

  public GroupTransform2DBuilder builder() {
    return new GroupTransform2DBuilder().from(this);
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

  public Point2DModel getChOff() {
    return this.chOff;
  }

  public PositiveSize2DModel getChExt() {
    return this.chExt;
  }
}
