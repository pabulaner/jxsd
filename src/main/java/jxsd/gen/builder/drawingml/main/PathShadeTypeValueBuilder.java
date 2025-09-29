package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PathShadeTypeValueModel;

/**
 * This is a generated enum class.
 */
public class PathShadeTypeValueBuilder {
  private PathShadeTypeValueModel value;

  public PathShadeTypeValueBuilder() {
  }

  public PathShadeTypeValueBuilder setValue(PathShadeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PathShadeTypeValueBuilder from(PathShadeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PathShadeTypeValueModel build() {
    return this.value;
  }
}
