package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetPatternValValueModel;

/**
 * This is a generated enum class.
 */
public class PresetPatternValValueBuilder {
  private PresetPatternValValueModel value;

  public PresetPatternValValueBuilder() {
  }

  public PresetPatternValValueBuilder setValue(PresetPatternValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetPatternValValueBuilder from(PresetPatternValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetPatternValValueModel build() {
    return this.value;
  }
}
