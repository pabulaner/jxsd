package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextUnderlineTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextUnderlineTypeValueBuilder {
  private TextUnderlineTypeValueModel value;

  public TextUnderlineTypeValueBuilder() {
  }

  public TextUnderlineTypeValueBuilder setValue(TextUnderlineTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextUnderlineTypeValueBuilder from(TextUnderlineTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextUnderlineTypeValueModel build() {
    return this.value;
  }
}
