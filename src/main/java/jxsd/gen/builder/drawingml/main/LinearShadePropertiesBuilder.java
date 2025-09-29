package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LinearShadePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class LinearShadePropertiesBuilder {
  private boolean scaled;

  private int ang;

  public LinearShadePropertiesBuilder() {
  }

  public LinearShadePropertiesBuilder setScaled(boolean scaled) {
    this.scaled = scaled;
    return this;
  }

  public LinearShadePropertiesBuilder setAng(int ang) {
    this.ang = ang;
    return this;
  }

  public LinearShadePropertiesBuilder from(LinearShadePropertiesModel value) {
    this.scaled = value.getScaled();
    this.ang = value.getAng();
    return this;
  }

  public LinearShadePropertiesModel build() {
    return new LinearShadePropertiesModel(this.scaled, this.ang);
  }
}
