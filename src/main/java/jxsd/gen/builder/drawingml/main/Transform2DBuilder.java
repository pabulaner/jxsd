package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.Point2DModel;
import jxsd.gen.model.drawingml.main.PositiveSize2DModel;
import jxsd.gen.model.drawingml.main.Transform2DModel;

/**
 * This is a generated sequence class.
 */
public class Transform2DBuilder {
  private boolean flipV;

  private int rot;

  private boolean flipH;

  private Point2DModel off;

  private PositiveSize2DModel ext;

  public Transform2DBuilder() {
  }

  public Transform2DBuilder setFlipV(boolean flipV) {
    this.flipV = flipV;
    return this;
  }

  public Transform2DBuilder setRot(int rot) {
    this.rot = rot;
    return this;
  }

  public Transform2DBuilder setFlipH(boolean flipH) {
    this.flipH = flipH;
    return this;
  }

  public Transform2DBuilder setOff(Point2DModel off) {
    this.off = off;
    return this;
  }

  public Transform2DBuilder setExt(PositiveSize2DModel ext) {
    this.ext = ext;
    return this;
  }

  public Transform2DBuilder from(Transform2DModel value) {
    this.flipV = value.getFlipV();
    this.rot = value.getRot();
    this.flipH = value.getFlipH();
    this.off = value.getOff();
    this.ext = value.getExt();
    return this;
  }

  public Transform2DModel build() {
    return new Transform2DModel(this.flipV, this.rot, this.flipH, this.off, this.ext);
  }
}
