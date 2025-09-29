package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextHorzOverflowTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextHorzOverflowTypeValueBuilder {
  private TextHorzOverflowTypeValueModel value;

  public TextHorzOverflowTypeValueBuilder() {
  }

  public TextHorzOverflowTypeValueBuilder setValue(TextHorzOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextHorzOverflowTypeValueBuilder from(TextHorzOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextHorzOverflowTypeValueModel build() {
    return this.value;
  }
}
