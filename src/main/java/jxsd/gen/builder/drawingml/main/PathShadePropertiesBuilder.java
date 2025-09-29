package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PathShadePropertiesModel;
import jxsd.gen.model.drawingml.main.PathShadeTypeValueModel;
import jxsd.gen.model.drawingml.main.RelativeRectModel;

/**
 * This is a generated sequence class.
 */
public class PathShadePropertiesBuilder {
  private PathShadeTypeValueModel path;

  private RelativeRectModel fillToRect;

  public PathShadePropertiesBuilder() {
  }

  public PathShadePropertiesBuilder setPath(PathShadeTypeValueModel path) {
    this.path = path;
    return this;
  }

  public PathShadePropertiesBuilder setFillToRect(RelativeRectModel fillToRect) {
    this.fillToRect = fillToRect;
    return this;
  }

  public PathShadePropertiesBuilder from(PathShadePropertiesModel value) {
    this.path = value.getPath();
    this.fillToRect = value.getFillToRect();
    return this;
  }

  public PathShadePropertiesModel build() {
    return new PathShadePropertiesModel(this.path, this.fillToRect);
  }
}
