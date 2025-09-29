package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ShapeTypeValueModel;

/**
 * This is a generated enum class.
 */
public class ShapeTypeValueBuilder {
  private ShapeTypeValueModel value;

  public ShapeTypeValueBuilder() {
  }

  public ShapeTypeValueBuilder setValue(ShapeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ShapeTypeValueBuilder from(ShapeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public ShapeTypeValueModel build() {
    return this.value;
  }
}
