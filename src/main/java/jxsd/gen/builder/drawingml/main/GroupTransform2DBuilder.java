package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.GroupTransform2DModel;
import jxsd.gen.model.drawingml.main.Point2DModel;
import jxsd.gen.model.drawingml.main.PositiveSize2DModel;

/**
 * This is a generated sequence class.
 */
public class GroupTransform2DBuilder {
  private boolean flipV;

  private int rot;

  private boolean flipH;

  private Point2DModel off;

  private PositiveSize2DModel ext;

  private Point2DModel chOff;

  private PositiveSize2DModel chExt;

  public GroupTransform2DBuilder() {
  }

  public GroupTransform2DBuilder setFlipV(boolean flipV) {
    this.flipV = flipV;
    return this;
  }

  public GroupTransform2DBuilder setRot(int rot) {
    this.rot = rot;
    return this;
  }

  public GroupTransform2DBuilder setFlipH(boolean flipH) {
    this.flipH = flipH;
    return this;
  }

  public GroupTransform2DBuilder setOff(Point2DModel off) {
    this.off = off;
    return this;
  }

  public GroupTransform2DBuilder setExt(PositiveSize2DModel ext) {
    this.ext = ext;
    return this;
  }

  public GroupTransform2DBuilder setChOff(Point2DModel chOff) {
    this.chOff = chOff;
    return this;
  }

  public GroupTransform2DBuilder setChExt(PositiveSize2DModel chExt) {
    this.chExt = chExt;
    return this;
  }

  public GroupTransform2DBuilder from(GroupTransform2DModel value) {
    this.flipV = value.getFlipV();
    this.rot = value.getRot();
    this.flipH = value.getFlipH();
    this.off = value.getOff();
    this.ext = value.getExt();
    this.chOff = value.getChOff();
    this.chExt = value.getChExt();
    return this;
  }

  public GroupTransform2DModel build() {
    return new GroupTransform2DModel(this.flipV, this.rot, this.flipH, this.off, this.ext, this.chOff, this.chExt);
  }
}
