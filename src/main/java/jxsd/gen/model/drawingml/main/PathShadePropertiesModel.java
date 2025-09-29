package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PathShadePropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class PathShadePropertiesModel {
  private final PathShadeTypeValueModel path;

  private final RelativeRectModel fillToRect;

  public PathShadePropertiesModel(PathShadeTypeValueModel path, RelativeRectModel fillToRect) {
    this.path = path;
    this.fillToRect = fillToRect;
  }

  public PathShadePropertiesBuilder builder() {
    return new PathShadePropertiesBuilder().from(this);
  }

  public PathShadeTypeValueModel getPath() {
    return this.path;
  }

  public RelativeRectModel getFillToRect() {
    return this.fillToRect;
  }
}
