package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_Point3DModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;

public class CT_Point3DBuilder {
  private ST_CoordinateModel y;

  private ST_CoordinateModel x;

  private ST_CoordinateModel z;

  public CT_Point3DBuilder() {
  }

  public CT_Point3DBuilder setY(ST_CoordinateModel y) {
    this.y = y;
    return this;
  }

  public CT_Point3DBuilder setX(ST_CoordinateModel x) {
    this.x = x;
    return this;
  }

  public CT_Point3DBuilder setZ(ST_CoordinateModel z) {
    this.z = z;
    return this;
  }

  public CT_Point3DModel build() {
    return new CT_Point3DModel(this.y, this.x, this.z);
  }

  public CT_Point3DBuilder from(CT_Point3DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    this.z = value.getZ();
    return this;
  }
}
