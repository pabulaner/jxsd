package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAutonumberSchemeValueModel;

/**
 * This is a generated enum class.
 */
public class TextAutonumberSchemeValueBuilder {
  private TextAutonumberSchemeValueModel value;

  public TextAutonumberSchemeValueBuilder() {
  }

  public TextAutonumberSchemeValueBuilder setValue(TextAutonumberSchemeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAutonumberSchemeValueBuilder from(TextAutonumberSchemeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAutonumberSchemeValueModel build() {
    return this.value;
  }
}
