package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PositiveSize2DBuilder;

/**
 * This is a generated sequence class.
 */
public class PositiveSize2DModel {
  private final long cy;

  private final long cx;

  public PositiveSize2DModel(long cy, long cx) {
    this.cy = cy;
    this.cx = cx;
  }

  public PositiveSize2DBuilder builder() {
    return new PositiveSize2DBuilder().from(this);
  }

  public long getCy() {
    return this.cy;
  }

  public long getCx() {
    return this.cx;
  }
}
