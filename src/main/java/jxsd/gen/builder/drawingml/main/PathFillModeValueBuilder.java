package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PathFillModeValueModel;

/**
 * This is a generated enum class.
 */
public class PathFillModeValueBuilder {
  private PathFillModeValueModel value;

  public PathFillModeValueBuilder() {
  }

  public PathFillModeValueBuilder setValue(PathFillModeValueModel value) {
    this.value = value;
    return this;
  }

  public PathFillModeValueBuilder from(PathFillModeValueModel value) {
    this.value = value;
    return this;
  }

  public PathFillModeValueModel build() {
    return this.value;
  }
}
