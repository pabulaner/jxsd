package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextFontAlignTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextFontAlignTypeValueBuilder {
  private TextFontAlignTypeValueModel value;

  public TextFontAlignTypeValueBuilder() {
  }

  public TextFontAlignTypeValueBuilder setValue(TextFontAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextFontAlignTypeValueBuilder from(TextFontAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextFontAlignTypeValueModel build() {
    return this.value;
  }
}
