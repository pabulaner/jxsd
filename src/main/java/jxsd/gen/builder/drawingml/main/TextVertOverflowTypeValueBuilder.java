package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextVertOverflowTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextVertOverflowTypeValueBuilder {
  private TextVertOverflowTypeValueModel value;

  public TextVertOverflowTypeValueBuilder() {
  }

  public TextVertOverflowTypeValueBuilder setValue(TextVertOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextVertOverflowTypeValueBuilder from(TextVertOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextVertOverflowTypeValueModel build() {
    return this.value;
  }
}
