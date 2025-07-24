package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;
import com.scell.model.drawingml.main.Vector3DModel;

public class Vector3DBuilder {
  private CoordinateModel dz;

  private CoordinateModel dy;

  private CoordinateModel dx;

  public Vector3DBuilder() {
  }

  public Vector3DBuilder setDz(CoordinateModel dz) {
    this.dz = dz;
    return this;
  }

  public Vector3DBuilder setDy(CoordinateModel dy) {
    this.dy = dy;
    return this;
  }

  public Vector3DBuilder setDx(CoordinateModel dx) {
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
