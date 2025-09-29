package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetColorValValueModel;

/**
 * This is a generated enum class.
 */
public class PresetColorValValueBuilder {
  private PresetColorValValueModel value;

  public PresetColorValValueBuilder() {
  }

  public PresetColorValValueBuilder setValue(PresetColorValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetColorValValueBuilder from(PresetColorValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetColorValValueModel build() {
    return this.value;
  }
}
