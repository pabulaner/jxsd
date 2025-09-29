package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.CompoundLineValueModel;

/**
 * This is a generated enum class.
 */
public class CompoundLineValueBuilder {
  private CompoundLineValueModel value;

  public CompoundLineValueBuilder() {
  }

  public CompoundLineValueBuilder setValue(CompoundLineValueModel value) {
    this.value = value;
    return this;
  }

  public CompoundLineValueBuilder from(CompoundLineValueModel value) {
    this.value = value;
    return this;
  }

  public CompoundLineValueModel build() {
    return this.value;
  }
}
