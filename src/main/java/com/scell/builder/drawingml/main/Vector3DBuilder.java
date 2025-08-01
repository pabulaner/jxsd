package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;
import com.scell.model.drawingml.main.Vector3DModel;

public class Vector3DBuilder {
  private CoordinateValueModel dz;

  private CoordinateValueModel dy;

  private CoordinateValueModel dx;

  public Vector3DBuilder() {
  }

  public Vector3DBuilder setDz(CoordinateValueModel dz) {
    this.dz = dz;
    return this;
  }

  public Vector3DBuilder setDy(CoordinateValueModel dy) {
    this.dy = dy;
    return this;
  }

  public Vector3DBuilder setDx(CoordinateValueModel dx) {
    this.dx = dx;
    return this;
  }

  public Vector3DModel build() {
    return new Vector3DModel(this.dz, this.dy, this.dx);
  }

  public Vector3DBuilder from(Vector3DModel value) {
    this.dz = value.getDz();
    this.dy = value.getDy();
    this.dx = value.getDx();
    return this;
  }
}
