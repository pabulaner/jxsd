package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.drawingml.main.AngleValueModel;
import com.scell.model.drawingml.main.Point2DModel;
import com.scell.model.drawingml.main.PositiveSize2DModel;
import com.scell.model.drawingml.main.Transform2DModel;

public class Transform2DBuilder {
  private BooleanValueModel flipV;

  private AngleValueModel rot;

  private BooleanValueModel flipH;

  private Point2DModel off;

  private PositiveSize2DModel ext;

  public Transform2DBuilder() {
  }

  public Transform2DBuilder setFlipV(BooleanValueModel flipV) {
    this.flipV = flipV;
    return this;
  }

  public Transform2DBuilder setRot(AngleValueModel rot) {
    this.rot = rot;
    return this;
  }

  public Transform2DBuilder setFlipH(BooleanValueModel flipH) {
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

  public Transform2DModel build() {
    return new Transform2DModel(this.flipV, this.rot, this.flipH, this.off, this.ext);
  }

  public Transform2DBuilder from(Transform2DModel value) {
    this.flipV = value.getFlipV();
    this.rot = value.getRot();
    this.flipH = value.getFlipH();
    this.off = value.getOff();
    this.ext = value.getExt();
    return this;
  }
}
