package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.SchemeColorValValueModel;

/**
 * This is a generated enum class.
 */
public class SchemeColorValValueBuilder {
  private SchemeColorValValueModel value;

  public SchemeColorValValueBuilder() {
  }

  public SchemeColorValValueBuilder setValue(SchemeColorValValueModel value) {
    this.value = value;
    return this;
  }

  public SchemeColorValValueBuilder from(SchemeColorValValueModel value) {
    this.value = value;
    return this;
  }

  public SchemeColorValValueModel build() {
    return this.value;
  }
}
