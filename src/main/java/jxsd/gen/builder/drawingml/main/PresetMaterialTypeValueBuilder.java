package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetMaterialTypeValueModel;

/**
 * This is a generated enum class.
 */
public class PresetMaterialTypeValueBuilder {
  private PresetMaterialTypeValueModel value;

  public PresetMaterialTypeValueBuilder() {
  }

  public PresetMaterialTypeValueBuilder setValue(PresetMaterialTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PresetMaterialTypeValueBuilder from(PresetMaterialTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PresetMaterialTypeValueModel build() {
    return this.value;
  }
}
