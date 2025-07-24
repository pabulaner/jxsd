package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.AngleModel;
import com.scell.model.drawingml.main.GroupTransform2DModel;
import com.scell.model.drawingml.main.Point2DModel;
import com.scell.model.drawingml.main.PositiveSize2DModel;

public class GroupTransform2DBuilder {
  private BooleanModel flipV;

  private AngleModel rot;

  private BooleanModel flipH;

  private Point2DModel off;

  private PositiveSize2DModel ext;

  private Point2DModel chOff;

  private PositiveSize2DModel chExt;

  public GroupTransform2DBuilder() {
  }

  public GroupTransform2DBuilder setFlipV(BooleanModel flipV) {
    this.flipV = flipV;
    return this;
  }

  public GroupTransform2DBuilder setRot(AngleModel rot) {
    this.rot = rot;
    return this;
  }

  public GroupTransform2DBuilder setFlipH(BooleanModel flipH) {
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

  public GroupTransform2DModel build() {
    return new GroupTransform2DModel(this.flipV, this.rot, this.flipH, this.off, this.ext, this.chOff, this.chExt);
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
}
