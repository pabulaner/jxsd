package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.drawingml.main.CT_Point2DModel;
import com.scell.model.drawingml.main.CT_PositiveSize2DModel;
import com.scell.model.drawingml.main.CT_Transform2DModel;
import com.scell.model.drawingml.main.ST_AngleModel;

public class CT_Transform2DBuilder {
  private BooleanModel flipV;

  private ST_AngleModel rot;

  private BooleanModel flipH;

  private CT_Point2DModel off;

  private CT_PositiveSize2DModel ext;

  public CT_Transform2DBuilder() {
  }

  public CT_Transform2DBuilder setFlipV(BooleanModel flipV) {
    this.flipV = flipV;
    return this;
  }

  public CT_Transform2DBuilder setRot(ST_AngleModel rot) {
    this.rot = rot;
    return this;
  }

  public CT_Transform2DBuilder setFlipH(BooleanModel flipH) {
    this.flipH = flipH;
    return this;
  }

  public CT_Transform2DBuilder setOff(CT_Point2DModel off) {
    this.off = off;
    return this;
  }

  public CT_Transform2DBuilder setExt(CT_PositiveSize2DModel ext) {
    this.ext = ext;
    return this;
  }

  public CT_Transform2DModel build() {
    return new CT_Transform2DModel(this.flipV, this.rot, this.flipH, this.off, this.ext);
  }

  public CT_Transform2DBuilder from(CT_Transform2DModel value) {
    this.flipV = value.getFlipV();
    this.rot = value.getRot();
    this.flipH = value.getFlipH();
    this.off = value.getOff();
    this.ext = value.getExt();
    return this;
  }
}
