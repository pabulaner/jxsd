package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAnchoringTypeValueModel;

/**
 * This is a generated enum class.
 */
public class TextAnchoringTypeValueBuilder {
  private TextAnchoringTypeValueModel value;

  public TextAnchoringTypeValueBuilder() {
  }

  public TextAnchoringTypeValueBuilder setValue(TextAnchoringTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAnchoringTypeValueBuilder from(TextAnchoringTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAnchoringTypeValueModel build() {
    return this.value;
  }
}
