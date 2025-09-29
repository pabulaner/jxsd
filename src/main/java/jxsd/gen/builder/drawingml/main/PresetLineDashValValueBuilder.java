package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetLineDashValValueModel;

/**
 * This is a generated enum class.
 */
public class PresetLineDashValValueBuilder {
  private PresetLineDashValValueModel value;

  public PresetLineDashValValueBuilder() {
  }

  public PresetLineDashValValueBuilder setValue(PresetLineDashValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetLineDashValValueBuilder from(PresetLineDashValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetLineDashValValueModel build() {
    return this.value;
  }
}
