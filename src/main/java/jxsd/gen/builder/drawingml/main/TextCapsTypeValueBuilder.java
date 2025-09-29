package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextCapsTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextCapsTypeValueBuilder {
  private TextCapsTypeValueModel value;

  public TextCapsTypeValueBuilder() {
  }

  public TextCapsTypeValueBuilder setValue(TextCapsTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextCapsTypeValueBuilder from(TextCapsTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextCapsTypeValueModel build() {
    return this.value;
  }
}
