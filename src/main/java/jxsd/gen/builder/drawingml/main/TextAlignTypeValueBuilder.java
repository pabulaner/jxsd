package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAlignTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextAlignTypeValueBuilder {
  private TextAlignTypeValueModel value;

  public TextAlignTypeValueBuilder() {
  }

  public TextAlignTypeValueBuilder setValue(TextAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAlignTypeValueBuilder from(TextAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAlignTypeValueModel build() {
    return this.value;
  }
}
