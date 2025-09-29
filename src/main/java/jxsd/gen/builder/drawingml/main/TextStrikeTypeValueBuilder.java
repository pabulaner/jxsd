package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextStrikeTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextStrikeTypeValueBuilder {
  private TextStrikeTypeValueModel value;

  public TextStrikeTypeValueBuilder() {
  }

  public TextStrikeTypeValueBuilder setValue(TextStrikeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextStrikeTypeValueBuilder from(TextStrikeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextStrikeTypeValueModel build() {
    return this.value;
  }
}
