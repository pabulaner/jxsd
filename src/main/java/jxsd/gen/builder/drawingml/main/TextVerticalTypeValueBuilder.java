package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextVerticalTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextVerticalTypeValueBuilder {
  private TextVerticalTypeValueModel value;

  public TextVerticalTypeValueBuilder() {
  }

  public TextVerticalTypeValueBuilder setValue(TextVerticalTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextVerticalTypeValueBuilder from(TextVerticalTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextVerticalTypeValueModel build() {
    return this.value;
  }
}
