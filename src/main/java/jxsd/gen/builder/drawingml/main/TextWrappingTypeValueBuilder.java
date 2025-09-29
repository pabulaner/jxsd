package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextWrappingTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextWrappingTypeValueBuilder {
  private TextWrappingTypeValueModel value;

  public TextWrappingTypeValueBuilder() {
  }

  public TextWrappingTypeValueBuilder setValue(TextWrappingTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextWrappingTypeValueBuilder from(TextWrappingTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextWrappingTypeValueModel build() {
    return this.value;
  }
}
