package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetShadowValValueModel;

/**
 * This is a generated enum class.
 */
public class PresetShadowValValueBuilder {
  private PresetShadowValValueModel value;

  public PresetShadowValValueBuilder() {
  }

  public PresetShadowValValueBuilder setValue(PresetShadowValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetShadowValValueBuilder from(PresetShadowValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetShadowValValueModel build() {
    return this.value;
  }
}
