package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextShapeTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextShapeTypeValueBuilder {
  private TextShapeTypeValueModel value;

  public TextShapeTypeValueBuilder() {
  }

  public TextShapeTypeValueBuilder setValue(TextShapeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextShapeTypeValueBuilder from(TextShapeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextShapeTypeValueModel build() {
    return this.value;
  }
}
