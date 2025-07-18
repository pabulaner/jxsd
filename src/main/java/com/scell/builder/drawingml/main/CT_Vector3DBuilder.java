package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_Vector3DModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;

public class CT_Vector3DBuilder {
  private ST_CoordinateModel dz;

  private ST_CoordinateModel dy;

  private ST_CoordinateModel dx;

  public CT_Vector3DBuilder() {
  }

  public CT_Vector3DBuilder setDz(ST_CoordinateModel dz) {
    this.dz = dz;
    return this;
  }

  public CT_Vector3DBuilder setDy(ST_CoordinateModel dy) {
    this.dy = dy;
    return this;
  }

  public CT_Vector3DBuilder setDx(ST_CoordinateModel dx) {
    this.dx = dx;
    return this;
  }

  public CT_Vector3DModel build() {
    return new CT_Vector3DModel(this.dz, this.dy, this.dx);
  }

  public CT_Vector3DBuilder from(CT_Vector3DModel value) {
    this.dz = value.getDz();
    this.dy = value.getDy();
    this.dx = value.getDx();
    return this;
  }
}
