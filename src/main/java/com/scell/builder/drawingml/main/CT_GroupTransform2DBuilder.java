package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_GroupTransform2DModel;
import com.scell.model.drawingml.main.CT_Point2DModel;
import com.scell.model.drawingml.main.CT_PositiveSize2DModel;
import com.scell.model.drawingml.main.ST_AngleModel;

public class CT_GroupTransform2DBuilder {
  private BooleanModel flipV;

  private ST_AngleModel rot;

  private BooleanModel flipH;

  private CT_Point2DModel off;

  private CT_PositiveSize2DModel ext;

  private CT_Point2DModel chOff;

  private CT_PositiveSize2DModel chExt;

  public CT_GroupTransform2DBuilder() {
  }

  public CT_GroupTransform2DBuilder setFlipV(BooleanModel flipV) {
    this.flipV = flipV;
    return this;
  }

  public CT_GroupTransform2DBuilder setRot(ST_AngleModel rot) {
    this.rot = rot;
    return this;
  }

  public CT_GroupTransform2DBuilder setFlipH(BooleanModel flipH) {
    this.flipH = flipH;
    return this;
  }

  public CT_GroupTransform2DBuilder setOff(CT_Point2DModel off) {
    this.off = off;
    return this;
  }

  public CT_GroupTransform2DBuilder setExt(CT_PositiveSize2DModel ext) {
    this.ext = ext;
    return this;
  }

  public CT_GroupTransform2DBuilder setChOff(CT_Point2DModel chOff) {
    this.chOff = chOff;
    return this;
  }

  public CT_GroupTransform2DBuilder setChExt(CT_PositiveSize2DModel chExt) {
    this.chExt = chExt;
    return this;
  }

  public CT_GroupTransform2DModel build() {
    return new CT_GroupTransform2DModel(this.flipV, this.rot, this.flipH, this.off, this.ext, this.chOff, this.chExt);
  }

  public CT_GroupTransform2DBuilder from(CT_GroupTransform2DModel value) {
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
