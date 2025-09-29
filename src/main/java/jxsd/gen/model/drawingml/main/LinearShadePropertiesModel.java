package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LinearShadePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class LinearShadePropertiesModel {
  private final boolean scaled;

  private final int ang;

  public LinearShadePropertiesModel(boolean scaled, int ang) {
    this.scaled = scaled;
    this.ang = ang;
  }

  public LinearShadePropertiesBuilder builder() {
    return new LinearShadePropertiesBuilder().from(this);
  }

  public boolean getScaled() {
    return this.scaled;
  }

  public int getAng() {
    return this.ang;
  }
}
