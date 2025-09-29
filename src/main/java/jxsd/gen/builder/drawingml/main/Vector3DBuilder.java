package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.Vector3DModel;

/**
 * This is a generated sequence class.
 */
public class Vector3DBuilder {
  private long dz;

  private long dy;

  private long dx;

  public Vector3DBuilder() {
  }

  public Vector3DBuilder setDz(long dz) {
    this.dz = dz;
    return this;
  }

  public Vector3DBuilder setDy(long dy) {
    this.dy = dy;
    return this;
  }

  public Vector3DBuilder setDx(long dx) {
    this.dx = dx;
    return this;
  }

  public Vector3DBuilder from(Vector3DModel value) {
    this.dz = value.getDz();
    this.dy = value.getDy();
    this.dx = value.getDx();
    return this;
  }

  public Vector3DModel build() {
    return new Vector3DModel(this.dz, this.dy, this.dx);
  }
}
