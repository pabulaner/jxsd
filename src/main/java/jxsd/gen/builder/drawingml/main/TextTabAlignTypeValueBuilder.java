package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextTabAlignTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextTabAlignTypeValueBuilder {
  private TextTabAlignTypeValueModel value;

  public TextTabAlignTypeValueBuilder() {
  }

  public TextTabAlignTypeValueBuilder setValue(TextTabAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextTabAlignTypeValueBuilder from(TextTabAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextTabAlignTypeValueModel build() {
    return this.value;
  }
}
