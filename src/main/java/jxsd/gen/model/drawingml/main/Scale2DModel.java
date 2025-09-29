package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Scale2DBuilder;

/**
 * This is a generated sequence class.
 */
public class Scale2DModel {
  private final RatioModel sx;

  private final RatioModel sy;

  public Scale2DModel(RatioModel sx, RatioModel sy) {
    this.sx = sx;
    this.sy = sy;
  }

  public Scale2DBuilder builder() {
    return new Scale2DBuilder().from(this);
  }

  public RatioModel getSx() {
    return this.sx;
  }

  public RatioModel getSy() {
    return this.sy;
  }
}
