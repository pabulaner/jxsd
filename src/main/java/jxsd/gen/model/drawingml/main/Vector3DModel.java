package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Vector3DBuilder;

/**
 * This is a generated sequence class.
 */
public class Vector3DModel {
  private final long dz;

  private final long dy;

  private final long dx;

  public Vector3DModel(long dz, long dy, long dx) {
    this.dz = dz;
    this.dy = dy;
    this.dx = dx;
  }

  public Vector3DBuilder builder() {
    return new Vector3DBuilder().from(this);
  }

  public long getDz() {
    return this.dz;
  }

  public long getDy() {
    return this.dy;
  }

  public long getDx() {
    return this.dx;
  }
}
